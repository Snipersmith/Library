package data.models;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import data.repositories.BookRepositoryImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.assertEquals;


class BookTest {
    BookRepositoryImpl bookRepository;


    @BeforeEach
    public void setUp() {
        bookRepository = new BookRepositoryImpl();
    }

    @Test
    public void newBookRepositories_IsEmptyTest() {
        assertEquals(0, bookRepository.count());
    }

    @Test
    public void saveBookCountIsOne_Test() {
        Book book = new Book();
        bookRepository.save(book);
        Assert.assertEquals(1L, bookRepository.count());


    }

    @Test
    public void saveBook_bookIdIsSetTest() {
        Book book = new Book();
        bookRepository.save(book);
        Assert.assertEquals(1, book.getId());
    }

    @Test

    public void saveBook_BookIsReturnedTest() {
        Book book = new Book();
        Assert.assertEquals(book, bookRepository.save(book));

    }
    @Test
    public void saveBook_FindBookByIdReturnBookTest() {
        Book book = new Book();
        bookRepository.save(book);
        Assert.assertEquals(book, bookRepository.findById(1));
    }

}