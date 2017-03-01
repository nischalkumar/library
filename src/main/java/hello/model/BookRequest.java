package hello.model;

/**
 * Created by hari_om on 1/3/17.
 */
public class BookRequest {
    String title;
    String auhtor;

    public String getTitle() {
        return title;
    }

    public String getAuhtor() {
        return auhtor;
    }

    public BookRequest(String title, String auhtor) {
        this.title = title;
        this.auhtor = auhtor;
    }
}
