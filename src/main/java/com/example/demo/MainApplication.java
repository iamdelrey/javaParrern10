package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApplication {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide the name of the bean as an argument.");
            System.exit(1);
        }

        String beanName = args[0];
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Printer printer = context.getBean(beanName, Printer.class);
        printer.doPrint();
        context.close();
    }
}
