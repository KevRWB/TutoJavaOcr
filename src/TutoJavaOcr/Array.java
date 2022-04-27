package TutoJavaOcr;
import java.util.*;

public class Array {

    public static void main(String[] args) {
        String[] colors = new String[]{"Red", "Blue", "Orange"};

        colors[0] = "Yellow";
        System.out.println(colors[1]);

        //--------------------------ArrayList
        List<Integer> numberList = new ArrayList<>();

        numberList.add(2);  //[2]
        numberList.add(3);  //[2,3]
        numberList.add(1, 33); //[2, 33, 3]
        numberList.remove(0);   //[33, 3]
        numberList.set(0, 222); //[222, 3]
        int number = numberList.get(0); // 222

        int numberListSize = numberList.size(); // 2

        System.out.println(numberListSize);

        //---------------------------SET & HASHSET
        Set<String> mySet = new HashSet<>();

        mySet.add("Kevin");
        mySet.add("Coucou");
        mySet.add("Voiture");
        mySet.remove("Kevin");
        int mySetSize = mySet.size(); // 2

        System.out.println(mySet);
        }
}
