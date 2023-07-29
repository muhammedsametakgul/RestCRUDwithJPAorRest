package com.samet.restcrudjpa.service;

import com.samet.restcrudjpa.dao.BookRepository;
import com.samet.restcrudjpa.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service  public class BookServiceImpl implements BookService{

    BookRepository bookRepository;

    @Autowired
    public BookServiceImpl(BookRepository theBookRepository){
        bookRepository=theBookRepository;
    }


    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book findById(int id) {
        Optional<Book> result = bookRepository.findById(id);

        Book book=null;

        if(result.isPresent()){
        book=result.get();
        }else{

            throw new RuntimeException("Did not find book");
        }

        return book;
    }

    @Override
    public Book save(Book theBook) {
        return bookRepository.save(theBook);
    }

    @Override
    public void deleteById(int id) {

        bookRepository.deleteById(id);

    }
}
