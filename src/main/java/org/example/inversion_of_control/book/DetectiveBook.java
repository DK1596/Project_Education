package org.example.inversion_of_control.book;

public class DetectiveBook implements Book{
    @Override
    public String getGenre() {
        return "detective";
    }
}
