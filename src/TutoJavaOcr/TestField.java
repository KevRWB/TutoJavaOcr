package TutoJavaOcr;

import java.util.*;
import java.util.HashSet;
import java.util.Set;

public class TestField {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,6,8,9);
        System.out.println(list);

        Set<Integer> numberlist = new HashSet<>(Arrays.asList(2,5,8,6,3));
        System.out.println(numberlist);
        // /!\ Fix This !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        for(int number : numberlist){
            if(number == 2){
                number++;
            }
        }
        System.out.println(numberlist);
    }
}
