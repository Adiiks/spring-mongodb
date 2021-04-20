package pl.adiks.springmongodb.controller;

import org.springframework.web.bind.annotation.*;
import pl.adiks.springmongodb.model.Book;
import pl.adiks.springmongodb.repository.BookRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/book")
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @PostMapping
    public String saveBook(@RequestBody Book book) {
        bookRepository.save(book);
        return "Created book";
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @GetMapping("/{bookId}")
    public Optional<Book> getBookById(@PathVariable int bookId) {
        return bookRepository.findById(bookId);
    }

    @DeleteMapping("/{bookId}")
    public String deleteBookById(@PathVariable int bookId) {
        bookRepository.deleteById(bookId);
        return "Book deleted";
    }
}
