package TutoJavaOcr;

public class StringMethods {

    public static void main(String[] args) {
        String exemple = "Exemple";

        exemple = exemple.toLowerCase(); // --> exemple
        exemple = exemple.toUpperCase(); // --> EXEMPLE

        exemple = exemple.replace("EX", "ZZ"); // (texte à remplacer , texte qui remplace)

        int exempleLength = exemple.length();   // longueur du String --> 7
        int exempleIndexP = exemple.indexOf("P"); // index du premier "p" --> 4 (index commence à O)
        char letter = exemple.charAt(0); // char (caractère) à l'index 0;
        boolean contientZ = exemple.contains("Z"); // exemple contient Z --> true
        boolean equal = exemple.equals("ZZEXEMPLE"); // n'est pas égal --> False
        boolean equalIgnoreCase = exemple.equalsIgnoreCase("ZZemple"); // est égal, sans compter les majuscules --> true
        int compare = exemple.compareTo("Zexemple"); //compare Lexicographicallement
                                                    // 0 = equal; -1 ou plus = avant "alphabet"; +1 = après. Maj avant Min.
        int compareIgnoreCose = exemple.compareToIgnoreCase("ZZEMple"); // --> O

        String substring = exemple.substring(2); // text à partir d'index 2 inclue --> "EMPLE"
        String substring2 = exemple.substring(1,3); //text entre index 1(inclu) et 3(exclu) --> "ZE"
        String concat = exemple.concat("concat"); // --> "ZZEMPLEconcat"

        System.out.println(concat);
    }
}
