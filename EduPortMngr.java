/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eduPort;

/**
 *
 * @author Sengar
 */
public class EduPortMngr {
    //
    private String currUser="";
    boolean flag=false;
    //Managers
    private UserMngr userMngr;
    private FeedbackManager feedbackMngr;
    private DocumentMngr documentMngr;
    private RequestMngr requestMngr;
    
    //Screens
    private LogInUi logInUi;
    private SignUpUi signUpUi;
    private FeedbackUi feedbackUi;
    private SearchUI searchUi;
    private Download_viewUI downloadViewUi;
    private UploadUI uploadUi;
    private RequestUI requestUi;
    
    public boolean init(){
        boolean result=false;
        userMngr=new UserMngr();
        result=userMngr.initialize();
        feedbackMngr= new FeedbackManager();
        result=feedbackMngr.init("feedData.csv");
        documentMngr=new DocumentMngr();
        result=documentMngr.init();
        requestMngr=new RequestMngr();
        
        return result;
    }
    
    //creating screens
    public void createScreen(){
        logInUi= new LogInUi(this);
        signUpUi= new SignUpUi(this);
        feedbackUi = new FeedbackUi(this);
        searchUi= new SearchUI(this);
        downloadViewUi=new Download_viewUI(this);
        uploadUi=new UploadUI(this);
        requestUi=new RequestUI(this);
    }
    
    public boolean addFeedback(Feedback newFeed){
        flag=feedbackMngr.addFeeds(newFeed);
        return flag;
    }
    public boolean logIn(String email,String password){
        flag=userMngr.logIn(email, password);
        if(flag){
            currUser=email;
        }
        return flag;
    }
    public boolean signUp(String name,String emailID,String password){
        flag=userMngr.signUp(name,emailID,password);
                if(flag){
            currUser=emailID;
        }
        return flag;
    }
    public String getCurrUser(){
        return this.currUser;
    }
    public UserMngr getUserMngr(){
        return this.userMngr;
    }
    public DocumentMngr getDocumentMngr(){
        return this.documentMngr;
    }
    public RequestMngr getRequestMngr(){
        return this.requestMngr;
    }
    //Screen Controller
    public void signUpScreen(){
        signUpUi.setVisible(true);
        logInUi.setVisible(false);
        feedbackUi.setVisible(false);
        searchUi.setVisible(false);
        downloadViewUi.setVisible(false);
        uploadUi.setVisible(false);
        requestUi.setVisible(false);
    }
    public void logInScreen(){
        signUpUi.setVisible(false);
        logInUi.setVisible(true);
        feedbackUi.setVisible(false);
        downloadViewUi.setVisible(false);
        uploadUi.setVisible(false);
        searchUi.setVisible(false);
        requestUi.setVisible(false);
    }
    public void feedbackScreen(){
        signUpUi.setVisible(false);
        logInUi.setVisible(false);
        feedbackUi.setVisible(true);
        downloadViewUi.setVisible(false);
        uploadUi.setVisible(false);
        searchUi.setVisible(false);
        requestUi.setVisible(false);
    }
    public void searchScreen(){
        signUpUi.setVisible(false);
        logInUi.setVisible(false);
        feedbackUi.setVisible(false);
        uploadUi.setVisible(false);
        searchUi.setVisible(true);
        requestUi.setVisible(false);
        downloadViewUi.setVisible(false);
    }    
    public void downloadViewScreen(){
        signUpUi.setVisible(false);
        logInUi.setVisible(false);
        feedbackUi.setVisible(false);
        searchUi.setVisible(false);
        downloadViewUi.setVisible(true);
        uploadUi.setVisible(false);
        requestUi.setVisible(false);
    }    
    public void uploadScreen(){
        signUpUi.setVisible(false);
        logInUi.setVisible(false);
        feedbackUi.setVisible(false);
        searchUi.setVisible(false);
        downloadViewUi.setVisible(false);
        uploadUi.setVisible(true);
        requestUi.setVisible(false);
    }
    public void requestScreen(){
        signUpUi.setVisible(false);
        logInUi.setVisible(false);
        feedbackUi.setVisible(false);
        searchUi.setVisible(false);
        downloadViewUi.setVisible(false);
        uploadUi.setVisible(false);
        requestUi.setVisible(true);
    }

    //main
    public static void main(String args[]){
        EduPortMngr mngr=new EduPortMngr();
        mngr.init();
        mngr.createScreen();
//        mngr.signUpScreen();
        mngr.logInScreen();
//        mngr.feedbackScreen();
    } 
}
