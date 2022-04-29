package StarShip;

public class Person {
    String name;
    int age;
    boolean isCrewMember;
    String job;

    public Person(String name, int age, boolean isCrewMember, String job) {
        this.name = name;
        this.age = age;
        this.isCrewMember = isCrewMember;
        this.job = job;
    }

    public String toString(){
        return "Name: " + this.name + ", Age: " + this.age + ", Crew Member: " + this.isCrewMember + ", job: " + this.job;
    }
}
