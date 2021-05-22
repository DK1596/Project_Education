package org.example.inversion_of_control.tv;

public class RemoteControl {
    private TV tv;
    private String name;
    private int number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public RemoteControl(TV tv){
        this.tv = tv;
    }

    public RemoteControl(){}

    public void setTv (TV tv){
        this.tv = tv;
    }

    public void turnChannel(){
        System.out.println("Channel: " + tv.getChannel());
    }
}
