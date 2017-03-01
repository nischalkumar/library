package hello.model;

/**
 * Created by hari_om on 1/3/17.
 */
public class BookDto {
    int id;
    String title;
    String author;

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public BookDto(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }
}
