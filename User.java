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
public class User {
    private String name;
    private String emailID;
    private String password;
    
    public User(){
        this.name="";
        this.emailID="";
        this.password="";
    }
    
    public User(String name,String emailID,String password){
        this.name=name;
        this.emailID=emailID;
        this.password=password;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setEmail(String email){
        this.emailID=email;
    }

    public void setPassword(String password){
        this.password=password;
    }

    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.emailID;
    }
    public String getPassword(){
        return this.password;
    }
    public boolean save(){
        return true;
    }
    
}
