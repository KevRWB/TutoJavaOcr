package TutoJavaOcr;
import java.util.*;

public class Array {

    public static void main(String[] args) {

        //---------------------------Array
        String[] colors = new String[]{"Red", "Blue", "Orange"};

        colors[0] = "Yellow";
        System.out.println(colors[1]);

        //------------------------2D Array
        int[][] twoDArray = new int[][]{{1, 3, 4}, {4, 8, 9}, {9, 0, 5}};
        int value = twoDArray[1][1]; // 8

            //-------------------Loop in 2D Arrays
                //---------------Row Major Order
                for(int i = 0; i < twoDArray.length; i++){
                    for(int j = 0; j < twoDArray[0].length; j++){
                        twoDArray[i][j] += 20;
                    }
                }
                //--------------Column Major Order
                int count;
                for(int i = 0; i < twoDArray[0].length; i++){
                    count = 0;
                    for(int j = 0; j < twoDArray.length; j++){
                        count += twoDArray[j][i];
                    }
                    System.out.println(count);
                }

        String arrayToString = Arrays.deepToString(twoDArray); //2D array in string
        System.out.println(arrayToString);

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

        //---------------------------MAP & HashMap
}
