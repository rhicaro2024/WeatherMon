package finalProject;

//JSON object

public class Sys {
    public String pod;
        
    public Sys(String pod){
        this.pod = pod;
    }
    
    public String getPod(){ //returns the part of the day (day [d], night [n])
        return this.pod;
    }
}
