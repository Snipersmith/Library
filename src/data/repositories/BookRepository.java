package data.repositories;

import data.models.Book;

public interface BookRepository {
    long count();
    Book save(Book book);
}
