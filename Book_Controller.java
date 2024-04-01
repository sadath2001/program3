package com.example.restful_demo;
//imports
@RestController
@RequestMapping("/api/books")
public class BookController {
    private final List<Book> books = new ArrayList<Book>();
    @GetMapping
    public List<Book> getAllBooks() {
        return books;
    }



    @PostMapping
    public Book addBook(@RequestBody Book book) {
        books.add(book);
        return book;
    }
}
