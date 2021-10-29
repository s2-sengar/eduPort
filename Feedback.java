package eduPort;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Manish
 */
public class Feedback {
    
    private String info;
    private String experience;
    private String recommendation;
    private String suggestions;

    public String getInfo() {
        return info;
    }

    public String getExp() {
        return experience;
    }

    public String getSuggestion() {
        return suggestions;
    }
    
    public String getRecommendation() {
        return recommendation;
    }
    
    public Feedback(String info, String experience,String recommendation, String suggestions) {
        this.info = info;
        this.experience = experience;
        this.suggestions = suggestions;
        this.recommendation = recommendation;
    }
    
    public String toString() {
        // stringify Flight class
//        return "Info: " + this.getInfo() + 
//                ", Experience: " + this.getExp() +
//                ", Recommendation: "+ this.getRecommendation()+
//                ", Suggestions: " + this.getSuggestion();
//          return  ".       "+ this.getInfo() + 
//                 ".        "+this.getExp() +
//                 ".        "+this.getRecommendation()+
//                ".        "+this.getSuggestion();
        return  this.getInfo() + ","+this.getExp() +","+this.getRecommendation()+","+this.getSuggestion();
    
}
}