/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eduPort;

/**
 *
 * @author SHIVAM
 */
public class Request {
    private String bookName;
    private String subject;
    private String authorName;
    
    public Request(){
        this.bookName="";
        this.subject="";
        this.authorName="";
    }
    
    public Request(String bName,String sub,String authName){
        this.bookName= bName;
        this.subject=sub;
        this.authorName=authName;
//        setBookName(bName);
//        setSubject(sub);
//        setAuthorName(authName);
    }

    void setBookName(String bookName){
        this.bookName = bookName;
    }
    void setSubject(String subject){
        this.subject = subject;
    } 
    void setAuthorName(String authorName){
        this.authorName = authorName;
    }
    String getBookName(){
        return this.bookName;
    }
    String getSubject(){
        return this.subject;
    }
    String getAuthorName(){
        return this.authorName;
    }
//    void setRequest(String bName, String sub, String authNmae){
//        this.bookName = getBookName();
//        
//    }
    @Override
    public String toString(){
        return this.bookName+","+this.subject+","+ this.authorName;
    }
    
}
