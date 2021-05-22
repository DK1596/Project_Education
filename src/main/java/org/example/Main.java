package org.example;

import org.example.dependency_injection.IDCard;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext.xml");


        IDCard idCard = context.getBean("idCard", IDCard.class);
        idCard.getName();
        System.out.println(idCard.getAge());

        context.close();
    }
}
