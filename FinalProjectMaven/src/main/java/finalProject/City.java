
package finalProject;
//JSON object
public class City {
    private int id;
    private String name;
    private String country;
    private int population;
    private int timezone;
    private Coord coord;

    public City(int id, String name, String country, int population, int timezone, Coord coord){ //Have to make parameters that "this." refers to
        this.id = id;
        this.name = name;
        this.country = country;
        this.population = population;
        this.timezone = timezone;
        this.coord = coord;
    }
    public String getName(){ //returns the name of the city
        return this.name;
    }
    public String getCountry(){ //returns the country
        return this.country;
    }
    public int getPopulation(){
        return this.population;
    }
    public int getTime(){   //returns the time zone of the coordinates
        return this.timezone;
    }
}
