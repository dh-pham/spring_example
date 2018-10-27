package com.example.relationship.service;

import com.example.relationship.model.Author;
import com.example.relationship.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    @Transactional
    public List<Author> getAllAuthors() {
        return (List<Author>) authorRepository.findAll();
    }
}
