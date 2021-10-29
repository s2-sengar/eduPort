package eduPort;
public class Document {
    private String title;
    private String authorName;
    private String publisherName;
    private String description;
    private String category;
    private String filePath;

    public Document(){
        this.title="";
        this.authorName="";
        this.publisherName="";
        this.description="";
        this.category="";
        this.filePath="";
    }

    public Document(String title,String authorName,String publisherName,String description,String category,String filePath){
        this.title=title;
        this.authorName=authorName;
        this.publisherName=publisherName;
        this.description=description;
        this.category=category;
        this.filePath=filePath;
    }

    public String getTitle(){
        return this.title;
    }
    public String getFilePath(){
        return this.filePath;
    }
    public String getAuthorName(){
        return this.authorName;
    }
    public String getPublisherName(){
        return this.publisherName;
    }
    public String getDescription(){
        return this.description;
    }
    public String getCategory(){
        return this.category;
    }

    
    public void setTitle(String title){
        this.title=title;
    }
    public void setFilePath(String filePath){
        this.filePath=filePath;
    }
    public void setAuthorName(String authorName){
        this.authorName=authorName;
    }
    public void setPublisherName(String publisherName)
    {
        this.publisherName=publisherName;
    }
    public void setDescription(String description){
        this.description=description;
    }
    public void setCategory(String category){
        this.category=category;
    }
}
