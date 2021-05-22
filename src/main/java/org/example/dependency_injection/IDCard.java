package org.example.dependency_injection;

import java.util.ArrayList;
import java.util.List;

public class IDCard {
    private List<Info> infoList = new ArrayList<>();
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setInfoList(List<Info> infoList){
        this.infoList = infoList;
    }

    public void getName(){
        for (Info info : infoList){
            System.out.println("Name of ID card: "+info.getInfo());
        }
    }
}
