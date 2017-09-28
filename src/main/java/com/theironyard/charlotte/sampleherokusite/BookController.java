package com.theironyard.charlotte.sampleherokusite;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
public class BookController {

    List<Book> books = new ArrayList<>();

    @CrossOrigin
    @RequestMapping(path = "/books", method = RequestMethod.GET)
    public List<Book> getBooks() {
//        Book greenEggsAndHam = new Book("1234","Green Eggs And Ham",
//                                        "Dr. Seuss!", true,
//                            "Awesome", true, 67 );
//        books.add(greenEggsAndHam);
        return books;
    }
    // {"isbn":"12345","title":"The Great Gatsomething","author":"yamama"}

    //    @CrossOrigin(origins = {"http://thegoogs.com", "yahoo.com", "idk.com"})
    @CrossOrigin
    @RequestMapping(path = "/books", method = RequestMethod.POST)
    public void addBook(@RequestBody Book book) {
        books.add(book);
    }

    @CrossOrigin
    @RequestMapping(path = "/checkedIn", method = RequestMethod.PATCH)
    public void checkedIn(@RequestBody Book bookHere) {
        bookHere.setCheckedOut(false);
        System.out.println("RRREEEAAADDD!");
    }

    @CrossOrigin
    @RequestMapping(path = "/checkedOut", method = RequestMethod.PATCH)
    public void checkedOut(@RequestBody Book bookHere) {
        bookHere.setCheckedOut(true);
        System.out.println("No book! Yay binge watching!");
    }
}
