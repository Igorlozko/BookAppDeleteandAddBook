package ie.atu.bookappmoremicroservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public boolean bookExistsByBookId(String bookId) {
        return bookRepository.existsByBookId(bookId);
    }
    public void deleteBookByBookId(String bookId) {
        if (bookExistsByBookId(bookId)) {
            bookRepository.deleteByBookId(bookId);
        }
    }

    public Book addBook(Book book) {
        return bookRepository.save(book);
    }
}