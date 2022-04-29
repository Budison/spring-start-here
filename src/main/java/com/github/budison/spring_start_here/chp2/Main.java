package com.github.budison.spring_start_here.chp2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        // Creates an instance of the Spring context
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // Get a reference of a bean of type Parrot from the Spring context
        Parrot p = context.getBean(Parrot.class);

        System.out.println(p);
        System.out.println(p.getName());

        context.close();

        System.out.println(p.getName());
        
    }

}	
