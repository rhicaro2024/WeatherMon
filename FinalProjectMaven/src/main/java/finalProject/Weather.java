package finalProject;

//JSON object

public class Weather {
    private int id;
    private String main;
    private String description;
    private String icon;

    public Weather(int id, String main, String description, String icon){
        this.id = id;
        this.main = main;
        this.description = description;
        this.icon = icon;
    }
    
    public int getId(){
        return this.id;
    }
    public String getMain(){
        return this.main;
    }
    public String getDescription(){ //returns a description of the current weater
        return this.description;
    }
    public String getIcon(){ //returns an icon of the weather probablt through url
        return this.icon;
    }
    public static void main(String[] args){
        
    }
}
