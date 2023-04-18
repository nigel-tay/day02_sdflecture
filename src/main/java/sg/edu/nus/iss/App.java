package sg.edu.nus.iss;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MountainBike mountainBike = new MountainBike(5, 10, 20);
        MountainBike mountainBike2 = new MountainBike(6, 11, 203);
        MountainBike mountainBike3 = new MountainBike(7, 12, 201);

        RoadBike roadBike = new RoadBike(15, 30, 25);

        List<Bicycle> bicycles = new ArrayList<Bicycle>();
        bicycles.add(mountainBike);
        bicycles.add(mountainBike2);
        bicycles.add(mountainBike3);
        bicycles.add(roadBike);

        // instanceof allows us to see what kind of class instance is the object, and not just show which parent it is from
        // Not all bicycles are roadbikes, but all roadbikes and mountainbikes are bicycles
        for (Bicycle bicycle: bicycles) {
            if (bicycle instanceof MountainBike) System.out.println(bicycle.hashCode() + " is a Mountain Bike");
            else if (bicycle instanceof RoadBike) System.out.println(bicycle.hashCode() + " is a Road Bike");
        }
    }
}
