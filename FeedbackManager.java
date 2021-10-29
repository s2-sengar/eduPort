package eduPort;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Manish
 */
public class FeedbackManager {
    
    
    
    private List<Feedback> feedList;
    //private List<Passenger> paxList;
    
    /**
     * Populates attribute flightList 
     * @param filename
     * @return false if data not initialized (exception thrown)
     */
    public boolean init(String filename) {
        
        boolean result = false;
       // this.feedList.add(new Feedback1("aiiii", "SIN", "0930"," yo"));
       // this.feedList.add(new Feedback1("6E222", "CCU", "1800","yo"));
        result = true;
        return result;
    }
    
    public FeedbackManager() {
        this.feedList = new ArrayList<Feedback>();
        //this.init("");    
    }
    
    /**
     * Returns read-only copy of underlying flightList
     * @return 
     */
    public List<Feedback> getFeeds() {
        List<Feedback> result = null;
        
        result = Collections.unmodifiableList(this.feedList);
        return result;
    }
    
    public boolean addFeeds(Feedback newFeed) {
        
        boolean result = false;
        
        this.feedList.add(newFeed);
       // System.out.println("added " + newFeed.toString());
        System.out.println("Info: " + newFeed.getInfo() + 
                ", Experience: " + newFeed.getExp() +
                ", Recommendation: "+ newFeed.getRecommendation()+
                ", Suggestions: " + newFeed.getSuggestion());
        result = true;
        
        return result;
    }
    
    /**
     * Last stop before program terminates
     * Flush data to file, release file handles
     * @return 
     */
    public boolean doHousekeeping() throws IOException {
        try{
        FileWriter fw = new FileWriter("FeedData.csv",true);
        try (BufferedWriter wr = new BufferedWriter(fw)) {
            int n = feedList.size();
            for(int i=0;i<n;i++){
                wr.write(feedList.get(i).toString()+"\n");
            }
            wr.close();
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"I cannot create the file!");
        }
        
        return true;
    }
    
//    public static void main(String[] args) {
//        
//        // instantiate Manager
//        FeedbackManager mgr = new FeedbackManager();
//        
//        // initialise
//        mgr.init("feedData.csv");
//        
//        // unit tests
//       // assert(mgr.getFlights().size()==2);
//       // assert(mgr.getFlights().get(0).getFlightNum().equals("AI111"));
//        
//        // create screens
////      JFrame FeedbackUI = new FeedbackUi(mgr);
////     // JFrame addFlightUI = new FeedbackUi(mgr);
////        
////      FeedbackUI.setVisible(true);
//     // addFlightUI.setVisible(true);
//    }
}
