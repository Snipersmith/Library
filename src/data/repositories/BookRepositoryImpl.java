package data.repositories;

import data.models.Book;

import java.util.ArrayList;

public class BookRepositoryImpl implements BookRepository {
    ArrayList<Book> books = new ArrayList<>();
    private int count;



    @Override
    public long count() {
        return (long) books.size();
    }


    @Override
    public Book save(Book book) {
        count++;
        book.setId(count);
        books.add(book);
        return book;

    }

}
