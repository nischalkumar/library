package hello.Repository;

import hello.model.BookDto;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * Created by hari_om on 1/3/17.
 */
@Transactional
public interface BookDao extends CrudRepository<BookDto, String> {
}
