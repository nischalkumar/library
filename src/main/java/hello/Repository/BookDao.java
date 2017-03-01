package hello.Repository;

import hello.model.BookDto;

/**
 * Created by hari_om on 1/3/17.
 */
@Transactional
public class BookDao extends CrudRepository<BookDto, Long> {
}
