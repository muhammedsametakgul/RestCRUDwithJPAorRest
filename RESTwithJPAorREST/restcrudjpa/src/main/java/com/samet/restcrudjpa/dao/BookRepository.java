package com.samet.restcrudjpa.dao;

import com.samet.restcrudjpa.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepository extends JpaRepository<Book,Integer> {
}
