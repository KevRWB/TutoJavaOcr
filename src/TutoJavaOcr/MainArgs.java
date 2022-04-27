package TutoJavaOcr;
import java.util.ArrayList;
public class MainArgs {
    //---------------MAIN-------------------------
    public static void main(String[] args) {

        if(args.length != 0 && args.length <=10){
            ArrayList<String> arguments = new ArrayList<>();
            for(String arg : args){
                arguments.add(arg);
            }
            System.out.println("Voici les arguments : " + arguments);
        } else {
            System.out.println("No arguments");
        }

    //-------------------------------------------METHODS

    }
}


