package org.example.inversion_of_control.book;

public class FantasyBook implements Book{
    @Override
    public String getGenre() {
        return "fantasy";
    }
}
