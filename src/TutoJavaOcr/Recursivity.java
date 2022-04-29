package TutoJavaOcr;

public class Recursivity {

    public static void main(String[] args) {
        //Call method
        int result1 = factorial(3);
        System.out.println(result1);

    }
    public static int factorial(int n){
        if(n == 1) return 1;
        else return n * factorial(n - 1);
    }
}


