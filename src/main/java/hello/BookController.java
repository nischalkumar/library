package hello;

import hello.Repository.BookDao;
import hello.model.BookDto;
import hello.model.BookRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


@RestController
@RequestMapping("/v1/book")
public class BookController {
    @Autowired
    BookDao bookDao;

    @RequestMapping(method = RequestMethod.GET)
    public List<BookRequest> getAllBook() {
        Iterator<BookDto> iterator= bookDao.findAll().iterator();
        List<BookRequest> bookRequests = new ArrayList<>();
        while (iterator.hasNext()) {
            BookDto bookDto = iterator.next();
            bookRequests.add(new BookRequest(bookDto.getId(), bookDto.getTitle(), bookDto.getAuthor()));
        }
            return bookRequests;
    }

    @RequestMapping(method = RequestMethod.GET, value = "{id}")
    public  BookRequest getBook(@PathVariable(value = "id") String id) {
        System.out.println(id);
        BookDto bookDto = bookDao.findOne(id);
        return new BookRequest(bookDto.getId(), bookDto.getTitle(), bookDto.getAuthor());
    }


    @RequestMapping(method = RequestMethod.POST)
    public String persistBook(@RequestBody BookRequest bookRequest) {
        String id = bookRequest.getTitle().replaceAll("\\s+","");
        BookDto bookDto = new BookDto(id, bookRequest.getTitle(), bookRequest.getAuthor());
        bookDao.save(bookDto);
        return bookDto.getTitle();
    }


}
