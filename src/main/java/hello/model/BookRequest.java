package hello.model;

/**
 * Created by hari_om on 1/3/17.
 */
public class BookRequest {
    String id;
    String title;
    String author;

    public BookRequest() {
    }

    public BookRequest(String id, String title, String auhtor) {
        this.id = id;
        this.title = title;
        this.author = auhtor;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
