package org.example.inversion_of_control.tv;

public class Discovery implements TV{
    @Override
    public String getChannel() {
        return "Discovery";
    }
}
