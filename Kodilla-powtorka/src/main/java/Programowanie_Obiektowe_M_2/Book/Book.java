package Programowanie_Obiektowe_M_2.Book;

public class Book {
    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public static Book of(String author, String title) {
        System.out.println(author + " " + title);
        return new Book(author, title);
    }
}
