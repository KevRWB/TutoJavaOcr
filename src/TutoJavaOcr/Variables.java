package TutoJavaOcr;
//Beginning of tuto -- VARIABLES
public class Variables {

    public static void main(String[] args) {

        //Types de variables///////////////////////////////

        String chaineCaractere = "Coucou";      // String = Object
        char caractere = 'A';                   //Caractère simple avec '' simple quotes
        short nombreEntierCourt = 12222;        // Integer court (5 chiffres, 2 octets
        int nombreEntier = 1222222222;          //Integer (10 chiffres 4 octets)
        long nombreEntierLong = 1236455555;     // Long Integer (10 chiffres)
        double nombreVirgule = 33.657657;       // Reel Number double (8 octets)
        boolean logicValue = true;              //true
        boolean invertLogicValue = !true;       // false --> ! = inverse

        final int CONSTANTE = 12;      // Variable constante (MAJ) ne peut pas être réaffectée. Programme plus rapide

        int number; // Déclaration vide

        caractere = 'B'; //Réaffecter valeur

        //Conversion value
        double x = 9.33;
        int n = (int) x; // n = 9 , valeur Integer

        //Opérations arithmétiques + ; - ; * ; / ; % ;    += ; -= ; *= ; /= ; %=
        nombreEntier = (nombreEntier + 3) / 2;
        nombreEntier += 12;

        //Mélanger variables
        int a = 5;
        int b = 2;
        int c = a / b; // = 2 --> Integer a =int b =int
        float d = (float) a / b; // = 2.5 --> Double  Avec le CAST (type) avant variable --> a = type float

        //Concatenation String
        String name = "Kevin";
        short age = 35;
        String phrase = "Je m'appelle " + name + " et j'ai " + age + " ans\n";  //  \n --> Saut de ligne

        //Print
        System.out.print(phrase);  // Print à la suite
        System.out.println(d);     // Print une ligne
    }
}
