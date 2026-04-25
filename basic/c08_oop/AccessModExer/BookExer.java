package basic.c08_oop.AccessModExer;

public class BookExer {
    private String title;
    private String author;

    public BookExer(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
