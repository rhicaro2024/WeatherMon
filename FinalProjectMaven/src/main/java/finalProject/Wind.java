package finalProject;

//JSON object

public class Wind {
    public double speed;
    public int deg;
    public double gust;
    
    public Wind(){
        this.speed = speed;
        this.deg = deg;
        this.gust = gust;
    }

    public double getSpeed(){ //returns the speed of the wind
        return this.speed;
    }
    public int getDeg(){
        return this.deg;
    }
    public double getGust(){
        return this.gust;
    }
}
