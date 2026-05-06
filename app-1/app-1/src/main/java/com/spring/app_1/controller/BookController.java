package com.spring.app_1.controller;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.app_1.model.Book;
import com.spring.app_1.respository.*;



@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class BookController {

    @Autowired
    BookRepository repo;

    @GetMapping("/books")
    public List<Book> getBooks() {
        return repo.findAll();
    }

    // ✅ This was missing — edit form needs it
    @GetMapping("/books/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Integer id) {
        return repo.findById(id)
                   .map(ResponseEntity::ok)
                   .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/books")
    public Book addBook(@RequestBody Map<String, String> body) {
        Book book = new Book(body.get("name"), body.get("author"), body.get("status"));
        return repo.save(book);
    }

    @PutMapping("/books/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable Integer id, @RequestBody Book bookDetails) {
        return repo.findById(id).map(book -> {
            book.setName(bookDetails.getName());
            book.setAuthor(bookDetails.getAuthor());
            book.setStatus(bookDetails.getStatus());
            return ResponseEntity.ok(repo.save(book));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/books/{id}")
    public String deleteBookById(@PathVariable Integer id) {
        repo.deleteById(id);
        return "Book " + id + " is deleted";
    }
}