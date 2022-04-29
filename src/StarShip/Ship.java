package StarShip;

import java.util.ArrayList;
import java.util.List;

public class Ship {

    String name;
    String role;
    String destination;
    int fuelCapacity;
    int speed;

    public Ship(String name, String role, String destination, int fuelCapacity, int speed) {
        this.name = name;
        this.role = role;
        this.destination = destination;
        this.fuelCapacity = fuelCapacity;
        this.speed = speed;
    }
    //--------------CREW
    List<Person> crewMembersList = new ArrayList<>();
    //--------------PASSENGERS
    List<Person> passengersList = new ArrayList<>();

    //--------------takeOf METHOD
    boolean isFlying = false;

    protected void takeOf(){
        if(isFlying == true){
            System.out.println("This ship is already flying");
        } else {
            System.out.println("Let's go for take of !!!!!");
            isFlying = true;
        }
    }


}
