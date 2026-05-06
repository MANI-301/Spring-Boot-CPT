package com.spring.app_1.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.app_1.model.Book;


@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{

}

