package pl.adiks.springmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import pl.adiks.springmongodb.model.Book;

public interface BookRepository extends MongoRepository<Book, Integer> {
}
