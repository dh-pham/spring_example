package com.example.relationship.service;

import com.example.relationship.model.Book;
import com.example.relationship.model.Library;
import com.example.relationship.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class LibraryService {

    @Autowired
    private LibraryRepository libraryRepository;

    @Transactional
    public List<Library> getAllLibraries() {
        return (List<Library>) libraryRepository.findAll();
    }

    @Transactional
    public Library getLibraryById(long id) {
        return libraryRepository.findById(id).orElse(null);
    }
}
