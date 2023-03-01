package finalProject;

//JSON objec

public class LocationList {
    private Location[] list;
    
    LocationList(Location[] list){
        this.list = list;
    }
    
    public Location[] getLocationList(){
        return this.list;
    }
}
