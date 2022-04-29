package TutoJavaOcr;

public class Parameters {

    public static void main(String[] args) {
        //Call add method
        int result1 = sum(1, 5); // 6

        //Create instances of Car class
        Car carOne = new Car("Fiesta", 2008);
        Car carTwo = carOne;
        //call change car name method
        carOne.changeCarName(carTwo, "Ferrari");
        System.out.println(carOne.name); // Ferrari --> carTwo is a reference to carOne --> method changes values of the reference
    }
    //Methods----------------------------------

    //Ad method
    public static int sum(int a, int b){
        int result = a + b;
        return result;
    }

}
//Car Class --------------------------
class Car{
    String name;
    int year;

    public Car(String name, int year){
        this.name = name;
        this.year = year;
    }
    //Change Car name method
    public static void changeCarName(Car car, String newName) {
        car.name = newName;
    }
}

