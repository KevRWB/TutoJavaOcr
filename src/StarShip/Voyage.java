package StarShip;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Voyage {
    public static void main(String[] args) {
        Voyage voyageOne = new Voyage();
        Scanner input = new Scanner(System.in);

        Ship Emu1 = new Ship("Emu1", "Transport", "Jupiter", "Earth",120, 70);

        //Init Persons, Crew members & passengers & planets
        voyageOne.initPersons();
        voyageOne.initCrewMembers(Emu1, voyageOne.personsList);
        voyageOne.initPlanets();
        //PROGRAM
        //Presentation
        System.out.println("Hello, welcome for this journey.");
        System.out.println("You're now boarding in the " + Emu1.name+".");
        System.out.println("Where do you want to travel ?");
        voyageOne.showPlanets(voyageOne.planetList);

        //Destination Choice
        System.out.println("You're choice : ");
        voyageOne.answer = input.next();
        voyageOne.destinationChoice(voyageOne.answer, Emu1, voyageOne.planetList);

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
            System.out.println((planetsList.indexOf(planet)) + 1 + "/ " + planet.name + ". Distance from Earth : " + planet.distanceFromEarth + " milles kilometres.");
        }
    }
    //Destination CHoice method
    String destination;
    protected void destinationChoice(String answer, Ship ship, List<Planet> planetList){
        boolean goOn = false;
        int intAnswer = Integer.parseInt(answer);
        Planet planet;
        Scanner keyboard = new Scanner(System.in);

        while(goOn == false){
            if(intAnswer != 1 && intAnswer !=2 && intAnswer !=3){
                System.out.println("Veuillez faire un choix valide");
            }else {
                planet = planetList.get(intAnswer - 1);
                ship.destination = planet.name;
                goOn = true;
                System.out.println("Destination set : " + planet.name);
            }
        }
    }

    //Time do destination method

}
