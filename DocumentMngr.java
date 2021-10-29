/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eduPort;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mrinal khemka
 */
import java.awt.Desktop;
import javax.swing.*;
import java.io.*;
import java.util.*;
public class DocumentMngr {
   private ArrayList<Document> info;
   //JFrame f;
  // File myFile=null;
  File pdfFile=null;
  static String documentFile;
  public static DocumentMngr inst;
  DocumentMngr()
   {
       init();
   }
//    public static DocumentMngr getObject()
//    {
//        if(inst==null)
//            inst=new DocumentMngr();
//        return inst;
//    }
   public boolean init(){
       info=new ArrayList<>();
       String line="";
       String splitBy=",";
       BufferedReader br=null;
       try{
           documentFile="documentInfo.csv";
          br=new BufferedReader(new FileReader(documentFile));
           line=br.readLine();
           int count=0;
           while((line=br.readLine())!=null)
           {
               String[] dInfo=line.split(splitBy);
               info.add(new Document(dInfo[0],dInfo[1],dInfo[2],dInfo[3],dInfo[4],dInfo[5]));

           }
           return true;
       }
       catch(IOException e){
               System.out.println(e);   
               return false;
       }
       finally
    {
        try {
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
   }
   public ArrayList getDocumentInfo(){
       return info;
   }
   public ArrayList getDocTODel(String userId){
       ArrayList<Document> temp=new ArrayList<>();
       for (int i = 0; i < info.size(); i++) {
        if ((info.get(i).getTitle().toLowerCase().equals(userId))){
            temp.add(info.get(i));
        }
       }
       return temp;
   }
   public ArrayList<Document> searchDoument(String title){
       ArrayList<Document> temp=new ArrayList<>();
       for (int i = 0; i < info.size(); i++) {
        if ((info.get(i).getTitle().toLowerCase().contains(title.toLowerCase()))) {
            temp.add(info.get(i));
        }
    }
    return temp;
   }
   public  String downloadDocument(String title,String authorName){
       String path=null;
    for(int i=1;i<info.size();i++){
         if(info.get(i).getTitle().equalsIgnoreCase(title)){
             if(info.get(i).getAuthorName().equalsIgnoreCase(authorName))
             {
                // System.out.println("World");
                 path=info.get(i).getFilePath();
                 break;
             }
         }
     }
    // System.out.println(path);
    //  f=new JFrame();
    //  if(path!=null)
    //  {
    //        try{
            
    //         pdfFile = new File(path);
    //         if(pdfFile.exists()) {
                
    //             if(Desktop.isDesktopSupported())
    //             {
    //                 Desktop.getDesktop().open(pdfFile);
    //                 System.out.println("file downloaded successfully!!");
    //             }
    //             else
    //             {
    //                 JOptionPane.showMessageDialog(f,"Not supported");
    //                // return false;
    //             }
    //         } else
    //         {
    //             JOptionPane.showMessageDialog(f, "File does not exsists");
    //           //  return false;
    //         }
    //     } catch (IOException e){
    //         JOptionPane.showMessageDialog(f,e);
    //        // return false;
    //     }

    //  }
    //  else
    //  {
    //     JOptionPane.showMessageDialog(f, "File does not exsists");
    //     //return false;
    //  }
     return path;
   }
   public boolean deleteDocument(String title,String authorName)
   {
       int index=-1;
    for(int i=0;i<info.size();i++){
       // System.out.println(info.get(i).getTitle());
        if(info.get(i).getTitle().equalsIgnoreCase(title)){
          //  System.out.println("HELLO");
            if(info.get(i).getAuthorName().equalsIgnoreCase(authorName))
            {
               // System.out.println("World");
                index=i;
                break;
            }
        }
    }
    boolean cnf=false;
  //  System.out.println(index);
    try{
    if(index!=-1){
        info.remove(index);
    }else{
        System.out.println("Invalid Index");
        return false;
    }
    clearFile(documentFile);
    //System.out.println(docList.size());
    Document head= new Document();
      head.setTitle("title");head.setAuthorName("authorName");
      head.setPublisherName("publisherName");
      head.setDescription("description");
      head.setCategory("category");
      head.setFilePath("filePath");
    cnf=uploadDocument(head,true);
    cnf=false;
    for(int i=0;i<info.size();i++){
        cnf=uploadDocument(info.get(i),true);
    }
} catch (Exception e) {
    e.printStackTrace();
} 
   return true;
   }
public static boolean clearFile(String dir){
    try {
        FileWriter fwrite = new FileWriter(dir,false); // true for qappending
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
public  boolean uploadDocument(Document docdata,Boolean condition){
    try {
        
        FileWriter fwrite = new FileWriter(documentFile,condition); // true for qappending
        BufferedWriter bwrite = new BufferedWriter(fwrite);
        PrintWriter pWriter = new PrintWriter(bwrite);
        pWriter.println(docdata.getTitle()+","+docdata.getAuthorName()+","+docdata.getPublisherName()+","+docdata.getDescription()+","+docdata.getCategory()+","+docdata.getFilePath());
        pWriter.flush();
        pWriter.close();
        return true;
    } catch (Exception e) {
        e.printStackTrace();
        return false;
    }
}
//    public static void main(String args[])
//    {
//      DocumentMngr dm=DocumentMngr.getObject();
//    // dm.init();
//     //System.out.println(dm.info.size());
//     /// ArrayList<Document> minfo=new ArrayList<>();
//     // minfo=dm.getDocumentInfo();
//     // assert(minfo.size()==7):"Size is "+minfo.size();
////           ArrayList<Document> searchresult=dm.searchDoument("pal");
////           assert(searchresult.size()==2):"Size is"+searchresult.size();
////           assert(dm.downloadDocument("PAL AND DAS MATHEMATICS VOLUME- 1( SEMESTER- 1)","Das and pal").equals("C:\\Users\\mrinal khemka\\OneDrive\\Desktop\\books\\daspal.pdf")):"download failed";  
////           assert(dm.deleteDocument("Fundamentals of Wavelets","Goswami")==true):"delete failed";
////           assert(dm.uploadDocument("Merchant of Venice","William Shakespeare","Pearson","loveStory","novel","C:\\Users\\mrinal khemka\\OneDrive\\Desktop\\assignments\\machine-learning-ex4\\ex4.pdf",documentFile,true)==true):"upload failed";
////    JFrame SearchUI = new SearchUI(dm);
////    // JFrame Download_viewUI = new Download_viewUI(dm);
////   //  JFrame DeleteUI = new DeleteUI(dm);
////      //JFrame UploadUI = new UploadUI(dm);
////      SearchUI.setVisible(true);
////      //Download_viewUI.setVisible(true);
//     // DeleteUI.setVisible(true);
//       //UploadUI.setVisible(true);
//     
//    }
}