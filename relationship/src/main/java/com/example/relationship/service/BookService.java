package com.example.relationship.service;

import com.example.relationship.model.Author;
import com.example.relationship.model.Book;
import com.example.relationship.model.Library;
import com.example.relationship.repository.AuthorRepository;
import com.example.relationship.repository.BookRepository;
import com.example.relationship.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private LibraryRepository libraryRepository;

    @Autowired
    private AuthorRepository authorRepository;

    @Transactional
    public List<Book> getAll() {
        return (List<Book>) bookRepository.findAll();
    }

    @Transactional
    public List<Book> getAllBooksByLibraryId(long lib_id, long author_id) {
        return bookRepository.findAllByLibraryId(lib_id, author_id);
    }
}
