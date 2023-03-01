package finalProject;

//JSON object

public class Main {
    private double temp;
    private double temp_min;
    private double temp_max;

    public Main(double temp, double temp_min, double temp_max){
        this.temp = temp;
        this.temp_min = temp_min;
        this.temp_max = temp_max;
    }
    public double getTemp(){ //returns the current temperature
        return this.temp;
    }   
    public double getTemp_min(){ //returns the min temperature
        return this.temp_min;
    }
    public double getTemp_max(){ //returns the max temperature
        return this.temp_max;
    }
}
