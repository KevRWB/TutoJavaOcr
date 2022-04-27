package TutoJavaOcr;

public class Boucles {

    static int[] myArray = new int[]{1,2,3,5,6};

    public static void main(String[] args) {
        repeatTxt("Kevin");

        int count = addValues(myArray);
        System.out.println(count);

        timeLeft();
        doTimeLeft();
    }
    //-------------METHODS-----------------------
    //For LOOP
    private static void repeatTxt(String txt){
        for(int i = 0; i <= 10; i++){
           System.out.println(txt);
        }
    }

    //FOR EACH LOOP
    private static int addValues(int[] array){
        int count = 0;
        for(int value : array){
            count += value;
        }
        return count;
    }

    //WHILE LOOP
    static int timeLeft = 10;
    private static void timeLeft(){
        int i = timeLeft;
        while(i >= 0){
            System.out.println("Il reste " + i);
            i--;
            if(i==5){
                continue;           //Stop la boucle et reprends la suivante
            }
            if(i==6){
                System.out.println("J'ai trouvé " + i);
                break;              //Strop la boucle
            }
        }
    }
    //Do WHILE LOOP
    private static void doTimeLeft(){
        int i = timeLeft;
        do {
            System.out.println("Il reste " + i);
            i--;
        } while (i >= 0);
    }
}
