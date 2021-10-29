/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eduPort;

import java.io.*;
import java.util.*;
import java.io.IOException;
import javax.swing.JFrame;

/**
 *
 * @author SHIVAM
 */
public class RequestMngr {

    /**
     * @param args the command line arguments
     */
    public static RequestMngr instance ;
    RequestMngr(){}
    public ArrayList<Request>requestList = new ArrayList<Request>();
    public static RequestMngr getInstanceOfRequestMngr(){
        if(instance == null){
            instance = new RequestMngr();
        }
        return instance;
    }
    
    public boolean storeToList(){
        try{
            FileReader fr = new FileReader("ReqtData.csv");
            BufferedReader br = new BufferedReader(fr);
            String line;
            String[] info;
            boolean lineNo = false;
            while((line = br.readLine()) != null){
                if(lineNo == false){
                    lineNo = true;
                    continue;
                }
                else{
                    info = line.split(",");
                    requestList.add(new Request(info[0],info[1],info[2]));    
                }
            }
            
            br.close();
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return true;
        
    }
    
    public boolean pushToFile(String bName, String sub, String authName){     
        try{
            boolean flag = false;
            FileWriter fw = new FileWriter("ReqtData.csv",true);
            BufferedWriter wr = new BufferedWriter(fw);
            Request rq = new Request(bName,sub,authName);
              for(Request r : requestList){
                  if((r.getBookName().equals(rq.getBookName())) || (r.getSubject().equals(rq.getSubject())) || (r.getAuthorName().equals(rq.getAuthorName()))){
                      flag = true;
                      break;
                  }
              }
              if(flag == true){
                  System.out.println("Request Submitted");
              }
              else{
                  wr.write(rq.toString());
//                  wr.write(rq.getBookName()+", "+rq.getSubject()+", "+rq.getAuthorName());
                  wr.newLine();
                  requestList.add(rq);
                  System.out.println("Request Has Been Submitted");
              } 
            wr.flush();
            wr.close();
            
        }
        catch(IOException e){
            e.printStackTrace();     
        } 
        return true;
        
    }
    
    public boolean retrieveData(){
        try{
            FileReader fr = new FileReader("ReqtData.csv");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) != null){
                String[] row = line.split(",");
                for(String data : row){
                    System.out.print(data+",");
                }
                System.out.println();
            }  
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return true;
    }
    
    public void requestHouseKeep(RequestMngr rmh){
        // rmh.pushToFile(bName, sub, authName)
       // rmh.pushToFile("Data Structure And Algorithm", "Algorithm", "Narshimha");
      //  rmh.pushToFile("software Engineering", "software ", "ee-kian wong");
        rmh.retrieveData();
    }
    
    public void init(RequestMngr rm1){
//        RequestMngr rm1 = getInstanceOfRequestMngr();
        rm1.storeToList();

    }
   
//    public static void main(String[] args){
//        // TODO code application logic here
//        RequestMngr rm = RequestMngr.getInstanceOfRequestMngr();
////        rm1.storeToList();
////        rm1.pushToFile("Data Structure And Algorithm", "Algorithm", "Narshimha");
////        rm1.pushToFile("software Engineering", "software ", "ee-kian wong");
////        rm1.retrieveData();
//          rm.init(rm);
//       //   rm.requestHouseKeep(rm);   
//       //   assert(rm.requestList.size()==2): "List size is: "+rm.requestList.size();
//        //  assert(rm.requestList.get(0).getBookName()).equals("Data Structure And Algorithm"): "should be:"+rm.requestList.get(0).getBookName();
//          //crerate screens
//          JFrame requestui = new RequestUI(rm);
//          requestui.setVisible(true);
//
//         
//   
//    }

}
