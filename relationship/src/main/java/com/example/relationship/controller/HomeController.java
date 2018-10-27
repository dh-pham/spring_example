package com.example.relationship.controller;

import com.example.relationship.model.Author;
import com.example.relationship.model.Book;
import com.example.relationship.model.Library;
import com.example.relationship.repository.AuthorRepository;
import com.example.relationship.repository.BookRepository;
import com.example.relationship.service.AuthorService;
import com.example.relationship.service.BookService;
import com.example.relationship.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private BookService bookService;

    @Autowired
    private LibraryService libraryService;

    @Autowired
    private AuthorService authorService;

    @GetMapping(value = "/")
    public String index(Model model) {
        List<Library> libraries = libraryService.getAllLibraries();
        List<Author> authors = authorService.getAllAuthors();
        model.addAttribute("libraries", libraries);
        model.addAttribute("authors", authors);
        return "index";
    }

    @GetMapping(value = "/libraries/{id}/{author_id}")
    public String library_books(Model model, @PathVariable("id") long id,
                                @PathVariable("author_id") long author_id) {
//        Library library = libraryService.getLibraryById(id);
//        List<Book> books = libraryService.getAllBooksInLibrary(id);
        List<Book> books = bookService.getAllBooksByLibraryId(id, author_id);
        model.addAttribute("books", books);
        model.addAttribute("library_id", id);
        return "library_books";
    }
}
