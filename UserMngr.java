package eduPort;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sengar
 */
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import static java.time.Clock.system;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class UserMngr {
    
    private ArrayList<User> userInfoList;
    private String userInfoFilePath/*= "userInfo.csv"*/ ;
    
    public UserMngr(){
        initialize();
    }

    public boolean initialize(){
        userInfoList = new ArrayList<User>(); //ArrayList<User>();
        userInfoFilePath = "userInfo.csv";
        BufferedReader reader = null;
        String line = "";
        String [] info = null;
        try {
            reader = new BufferedReader(new FileReader(userInfoFilePath));
            while ((line = reader.readLine()) != null) {
                info = line.split(",");
                userInfoList.add(new User(info[0], info[1], info[2]));
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return false;
        }
    }
    
    public static boolean saveInfo(String name, String emailID, String password, String filePath, Boolean method) {
        try {
            FileWriter fwrite = new FileWriter(filePath, method); // true for qappending
            BufferedWriter bwrite = new BufferedWriter(fwrite);
            PrintWriter pWriter = new PrintWriter(bwrite);

            pWriter.println(name + "," + emailID + "," + password);
            pWriter.flush();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public int searchUser(String id) {
        ArrayList<User> users = userInfoList;
        int flag=-1;
        for (int i = 1; i < users.size(); i++) {
            if (users.get(i).getEmail().equals(id)) {
                flag=i;
                break;
            }
        }
        return flag;
    }

    public boolean passwordValidator(String pass) {
        String exp = "^(?=\\S+$)+.{6,20}$";
        Pattern p = Pattern.compile(exp);
        if (pass == null) {
            return false;
        }
        Matcher m = p.matcher(pass);
        return m.matches();

    }

    public boolean emailValidator(String email) {
        String exp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
        Pattern p = Pattern.compile(exp);
        if (email == null) {
            return false;
        }
        Matcher m = p.matcher(email);
        return m.matches();
    }

    public boolean verifyUser(ArrayList<User> users, String id, String pass) {
        int index = searchUser(id);
        if (index != -1) {
            if (users.get(index).getPassword().equals(pass)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static boolean clearInfo(String dir) {
        try {
            FileWriter fwrite = new FileWriter(dir, false); // true for appending
            BufferedWriter bwrite = new BufferedWriter(fwrite);
            PrintWriter pWriter = new PrintWriter(bwrite);
            // pWriter.println();
            pWriter.flush();
            pWriter.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean deleteUser(String userID) {
        ArrayList<User> userInfo = userInfoList; 
        String dir=userInfoFilePath;
        int index = searchUser(userID);
        if (index > -1) {
            userInfo.remove(index);
            clearInfo(dir);
            for (int i = 0; i < userInfo.size(); i++) {
                saveInfo(userInfo.get(i).getName(), userInfo.get(i).getEmail(), userInfo.get(i).getPassword(), dir,
                        true);
            }
            return true;            
        }else{
            return false;
        }
    }

    public boolean signUp(String name,String emailID,String password){
        if(!name.equals("") && emailValidator(emailID) && passwordValidator(password)){
            if(searchUser(emailID)<0){
                userInfoList.add(new User(name,emailID,password));
                saveInfo(name, emailID, password, userInfoFilePath,true);
                System.out.println("working");
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    public boolean logIn(String email,String password){
        if(verifyUser(userInfoList, email, password)){
            return true;
        }else{
            return false;
        }
    }

    public ArrayList<User> getUserList(){
        return this.userInfoList;
    }
    // public static boolean confirmation(){

    //}
//    public static void main(String[] args) {
//        UserMngr userMngr=new UserMngr();
//        //SignUP
//        // userMngr.signUp("sudhanshu","sudhanshu.iem2k18@gmail.com","828245");
//        // assert(userMngr.signUp("sudhanshu","sudhanshu.iem2k18@gmail.com","828245")==true):"SignUp error";
//        // assert(userMngr.signUp("shivam","shivam2007@gmail.com","sam1234")==true):"SignUp error";        
////        assert(userMngr.getUserList().size()==1):"Size is "+userMngr.getUserList().size();
////        //LogIn
////        assert(userMngr.logIn("shivam","shivam2007@gmail.com","sam1234")==true):"Login error";
////        assert(userMngr.logIn("shivam","shivam2007@gmail.com","sam3234")==true):"Login error";
////        //Delete account
////        assert(userMngr.deleteUser("sudhanshu.iem2k18@gmail.com")):"Delete unsuccessful";
////        assert(userMngr.getUserList().size()==3):"Size is "+userMngr.getUserList().size();
////        JFrame manageSignUp = new SignUpUi(userMngr);
////        JFrame manageLogInUi = new LogInUi(userMngr);
////        manageSignUp.setVisible(true);
////        manageLogInUi.setVisible(true);
//    }
}
