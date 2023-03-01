package finalProject;

//JSON object

public class Info { 
    private int dt;
    private Main main;
    private Weather[] weather;
    private Clouds clouds;
    private Wind wind;
    private int visibility;
    private double pop;
    private Sys sys;
    private String dt_txt;
    
    public Info(int dt, Main main, Weather[] weather, Clouds clouds, Wind wind, 
            int visibility, double pop, Sys sys, String dt_txt) {
        this.dt = dt;
        this.main = main;
        this.weather = weather;
        this.clouds = clouds;
        this.wind = wind;
        this.visibility = visibility;
        this.pop = pop;
        this.sys = sys;
        this.dt_txt = dt_txt;
    }
    public int getDt(){
        return this.dt;
    }
    public Main getMain(){
        return this.main;
    }
    public Weather[] getWeather(){
        return this.weather;
    }
    public Clouds getClouds(){
        return this.clouds;
    }
    public Wind getWind(){
        return this.wind;
    }    
    public int getVis(){
        return this.visibility;
    }
    public double getPop(){
        return this.pop;
    }
    public Sys getSys(){
        return this.sys;
    }
    public String getDt_Text(){
        return this.dt_txt;
    }
}
