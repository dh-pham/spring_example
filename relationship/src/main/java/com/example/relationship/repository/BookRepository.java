package com.example.relationship.repository;

import com.example.relationship.model.Book;
import com.example.relationship.model.Author;
import com.example.relationship.model.Library;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends CrudRepository<Book, Long> {
    @Query("SELECT b FROM Book b INNER JOIN b.authors a " +
            "WHERE b.library.id=:lib_id AND a.id=:author_id")
    List<Book> findAllByLibraryId(@Param("lib_id") long lib_id,
                                  @Param("author_id") long author_id);
}
