package hello;

import hello.Repository.BookDao;
import hello.model.BookDto;
import hello.model.BookRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;


@RestController("/v1/book")
public class BookController {
    @Autowired
    BookDao bookDao;

    @RequestMapping(method = RequestMethod.GET)
    public List<BookRequest> getAllBook() {
//        return new ABCD(1,"fadfa");
        return Arrays.asList(new BookRequest());
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public  BookRequest getBook(@RequestParam(value = "id") String id) {
        System.out.println(id);
        return new BookRequest();
    }


    @RequestMapping(method = RequestMethod.POST)
    public String persistBook(@RequestBody BookRequest bookRequest) {
        BookDto bookDto = new BookDto(0, bookRequest.getTitle(), bookRequest.getAuhtor());
        bookDao.persist(bookDto);
        return bookDto.getTitle();
    }


}
