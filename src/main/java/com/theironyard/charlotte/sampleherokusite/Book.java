package com.theironyard.charlotte.sampleherokusite;

public class Book {

    private String isbn;
    private String title;
    private String author;
    private boolean checkedOut;
    private String genre;
    private boolean hardCover;
    private int numberOfPages;

    public Book() {
    }

    public Book(String isbn, String title, String author, boolean checkedOut, String genre, boolean hardCover, int numberOfPages) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.checkedOut = checkedOut;
        this.genre = genre;
        this.hardCover = hardCover;
        this.numberOfPages = numberOfPages;
    }


    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean isHardCover() {
        return hardCover;
    }

    public void setHardCover(boolean hardCover) {
        this.hardCover = hardCover;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}
