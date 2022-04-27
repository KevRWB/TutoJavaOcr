package TutoJavaOcr;

public class Book {
    //////----------------------
    public static void main(String[] args) {
        Publisher editeur = new Publisher("Editor", "Chanteloup");
        Book myBook = new Book("Le titre du livre", "kevin", 200, editeur);

        System.out.println(myBook.publisher.city);
    }
    //----------------------------
    String title;
    String author;
    int numberOfPages;
    Publisher publisher;

    public Book(String title, String author, int numberOfPages, Publisher publisher){
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.publisher = publisher;
    }
}
//-------------------------------
class Publisher{
    String name;
    String city;

    public Publisher(String name, String city){
        this.name = name;
        this.city = city;
    }
}
