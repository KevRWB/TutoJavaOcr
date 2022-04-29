package StarShip;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Voyage {
    public static void main(String[] args) {
        Voyage voyageOne = new Voyage();
        Scanner input = new Scanner(System.in);

        Ship Emu1 = new Ship("Emu1", "Transport", "", "Earth",120, 70);

        //Init Persons, Crew members & passengers & planets
        voyageOne.initPersons();
        voyageOne.initCrewMembers(Emu1, voyageOne.personsList);
        voyageOne.initPlanets();
        //PROGRAM
        //Presentation
        System.out.println("Hello, welcome for this journey.\n");
        System.out.println("You're now boarding in this awesome interstellar ship, the " + Emu1.name+".\n");
        System.out.println("Where do you want to travel ?\n");
        voyageOne.showPlanets(voyageOne.planetList);

        //Destination Choice
        voyageOne.destinationChoice(Emu1, voyageOne.planetList); // arguments : Ship, List<Person>
        voyageOne.timeToDestination(Emu1); // Print time to destination depending of the precedent user choice
        voyageOne.crewPresentation(Emu1);   //Print the composition of the crew


    }
    //Variables
    String answer;

    //init Persons method
    List<Person> personsList = new ArrayList<>();
    protected void initPersons(){
        Person roger = new Person("Roger", 66, true, "Captain");
        personsList.add(roger);
        Person nadine = new Person("Nadine", 54, true, "medic");
        personsList.add(nadine);
        Person joe = new Person("Joe", 22, true, "Mecano");
        personsList.add(joe);
        Person tatiana = new Person("Tatiana", 25, false, "Star");
        personsList.add(tatiana);
        Person jeanEude = new Person("Jean-Eude", 44, false, "Trader");
        personsList.add(jeanEude);
    }

    //init Crew Members & passengers
    protected void initCrewMembers(Ship ship, List<Person> persons){
        if(persons != null) {
            for (Person person : persons) {
                if (person.isCrewMember == true) {
                    ship.crewMembersList.add(person);
                } else {
                    ship.passengersList.add(person);
                }
            }
        }
    }

    //init Planet List
    List<Planet> planetList = new ArrayList<>();
    protected void initPlanets(){
        Planet mars = new Planet("Mars", 62000);
        planetList.add(mars);
        Planet moon = new Planet("Moon", 400);
        planetList.add(moon);
        Planet jupiter = new Planet("Jupiter", 680000);
        planetList.add(jupiter);
    }
    //Show Planets Method
    protected void showPlanets(List<Planet> planetsList){
        for(Planet planet : planetsList){
            System.out.println((planetsList.indexOf(planet)) + 1 + "/ " + planet.name + ". Distance from Earth : " + planet.distanceFromEarth + " milles kilometres.\n");
        }
    }
    //Destination Choice method
    String destination;
    protected void destinationChoice(Ship ship, List<Planet> planetList){

        boolean goOn = false; //while false, ask question again
        Planet planet;  // set planet an Instance of the Planet argument from the planetList


        while(goOn == false){ //While false, ask question again
            Scanner keyboard = new Scanner(System.in);  // set new scanner
            System.out.println("You're choice : ");
            answer = keyboard.next();                   //input from user

            int intAnswer = Integer.parseInt(answer);   //parse as an Integer the input from user

            if(intAnswer != 1 && intAnswer !=2 && intAnswer !=3){   //Condition to validate choice
                System.out.println("Veuillez faire un choix valide");
            }else {
                planet = planetList.get(intAnswer - 1); //Select the planet from the list function to user input
                ship.destination = planet.name;         //set Ship destination to the planet selected
                goOn = true;                            //Activate condition to continue the programme
                System.out.println("Destination set : " + planet.name);     //Print statement
            }
        }
    }

    //Crew Presentation Method-----------------------
    protected void crewPresentation(Ship ship){
        System.out.println("We're happy to present you your crew for this journey to " + ship.destination + ".");
        for (Person person: ship.crewMembersList){
            System.out.println("Your " + person.job + ", " + person.name + ", aged " + person.age);
        }
        System.out.println("");
    }
    //Time to Destination Method----------------
    int timeToDestination = 0;
    protected int timeToDestination(Ship ship) {
        String location = ship.localisation;
        String destination = ship.destination;

        if (location == "Earth") {
            switch (destination) {
                case "Moon":
                    timeToDestination = (int) (Distances.earthMoonDistance / ship.speed);
                    break;
                case "Mars":
                    timeToDestination = (int) (Distances.earthMarsDistance / ship.speed);
                    break;
                case "Jupiter":
                    timeToDestination = (int) (Distances.earthJupiterDistance / ship.speed);
                    break;
                default: timeToDestination =0;
            }
        }
        System.out.println("You're journey will dure : " + timeToDestination + " hours.\n");
        return timeToDestination;
    }
}
