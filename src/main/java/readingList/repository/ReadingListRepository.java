package readingList.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import readingList.entity.Book;
import readingList.entity.Reader;

import java.util.List;

public interface ReadingListRepository extends JpaRepository<Book, Long>{

    Book findFirstById(long id);
    List<Book> findByReader(Reader reader);
    List<Book> findBookByAuthor(String author);
}
