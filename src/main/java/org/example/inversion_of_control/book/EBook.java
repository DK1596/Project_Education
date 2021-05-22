package org.example.inversion_of_control.book;

import java.util.ArrayList;
import java.util.List;

public class EBook {
    private List<Book> bookList = new ArrayList<>();

//    public EBook(List<Book> bookList) {
//        this.bookList = bookList;
//    }

    public List<Book> getBookList (){
        return bookList;
    }

    public void setBookList (List<Book> bookList){
        this.bookList = bookList;
    }

    public void showGenre(){
        for (Book book : bookList) {
            System.out.println("genre: " + book.getGenre());
        }
    }
}
