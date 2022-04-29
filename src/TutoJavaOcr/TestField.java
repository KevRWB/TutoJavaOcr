package TutoJavaOcr;

import java.util.*;
public class TestField {

    public static void main(String[] args) {
        Livre livre1 = new Livre("Livre 1", "horror", 200);
        Livre livre2 = new Livre("Livre 2", "horror",300);
        Livre livre3 = new Livre("Livre 3", "love",150);
        Livre livre4 = new Livre("Livre 4", "love", 350);

        System.out.println(livre1);
    }


}

class Library{
    String name;
    BookCaterorie categorie;
    public Library(String name, BookCaterorie categorie){
        this.name = name;
        this.categorie = categorie;
    }
}

class BookCaterorie{

}

class Livre{
    String name;
    String categorie;
    int pages;
    public Livre(String name, String categorie, int pages){
        this.name = name;
        this.categorie = categorie;
        this.pages = pages;


        List<Livre> horrorList = new ArrayList<>();
        List<Livre> loveList = new ArrayList<>();
        List<Livre> otherList = new ArrayList<>();

        switch (categorie){
            case "horror" : horrorList.add(this);
            break;
            case "love" : loveList.add(this);
            break;
            default: otherList.add(this);
        }
    }
}
