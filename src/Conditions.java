public class Conditions {

    public static void main(String[] args) {

        //SWITCH -------------------------------------------
        String animal = "Lion";
        animal= animal.toLowerCase();

        boolean isGoodAnswer;
        String defaultTxt;

        switch (animal){
            case "Lion" : isGoodAnswer= true;
            break;
            case "Tiger" : isGoodAnswer = false;
            break;
            default: defaultTxt = "No animal";
        }

        // ENUMERATION ----------------------------------
        enum Direction {
            north, south, east, west;
        }
        Direction goodDirection = Direction.north;

        switch (goodDirection){
            case north :
                System.out.println("You are heading north");
                break;
            default:
                System.out.println("You're lost !");
        }

    }
}
