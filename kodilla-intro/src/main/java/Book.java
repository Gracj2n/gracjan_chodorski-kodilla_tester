public class Book {
    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public static String of(String author, String title) {
        System.out.println(author + " " + title);
        return author + title;
    }
}
