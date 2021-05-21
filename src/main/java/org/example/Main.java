package org.example;

import org.example.inversion_of_control.book.Book;
import org.example.inversion_of_control.book.EBook;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        Book book = context.getBean("bookBean", Book.class);

        EBook eBook = new EBook(book);

        eBook.showGenre();

        context.close();
    }
}
