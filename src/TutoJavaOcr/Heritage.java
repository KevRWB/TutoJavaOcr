package TutoJavaOcr;

public class Heritage {
    public static void main(String[] args) {
        Vehicule bateau = new Vehicule("Mon bateau", "grey");
        bateau.start();

        Voiture myCar = new Voiture("206", "grey", 2004);
        myCar.start();

    }
}
class Vehicule{  //MOTHER CLASS----------------------------
    String name;
    String color;

    public Vehicule(String name, String color){
        this.name = name;
        this.color = color;
    }

    protected void start(){
        System.out.println("Ca Demarre !");
    }
}

class Voiture extends Vehicule{         //------------------Child class
    int year;
    public Voiture(String name, String color, int year){

        super("Voiture", "White");
        this.year = year;
    }
    @Override                       //Override annotation for overriding Method from mother class
    protected void start(){
        super.start();
        System.out.println("En voiture Simone !");
    }
}
