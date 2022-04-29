package StarShip;

import java.util.ArrayList;
import java.util.List;

public class Voyage {
    public static void main(String[] args) {

        Voyage voyageOne = new Voyage();

        //Init Persons
        voyageOne.initPersons();



    }

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
}
