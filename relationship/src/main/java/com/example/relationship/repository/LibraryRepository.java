package com.example.relationship.repository;

import com.example.relationship.model.Book;
import com.example.relationship.model.Library;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LibraryRepository extends CrudRepository<Library, Long> {


}


