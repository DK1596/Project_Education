package org.example.inversion_of_control.tv;

public class RemoteControl {
    private TV tv;

    public RemoteControl(TV tv){
        this.tv = tv;
    }

    public void turnChannel(){
        System.out.println("Channel: " + tv.getChannel());
    }
}
