package hello.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by hari_om on 1/3/17.
 */
@Entity
@Table(name = "book")
public class BookDto {
    @Id
    @Column(length = 150)
    String id;
    @Column
    String title;
    @Column
    String author;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getId() {
        return id;
    }

    public BookDto() {
    }

    public BookDto(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }
}
