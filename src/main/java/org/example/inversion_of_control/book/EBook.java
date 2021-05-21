package org.example.inversion_of_control.book;

public class EBook {
    private Book book;

    public EBook(Book book) {
        this.book = book;
    }

    public void showGenre(){
        System.out.println("genre: "+book.getGenre());
    }
}
