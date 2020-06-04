package com.luv2code.aopdemo;

import com.luv2code.aopdemo.dao.AccountDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDemoApp {

    public static void main(String[] args) {

        // read spring configuration java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

        // get the bean from the bean container
        AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);

        // call the business methods
        theAccountDAO.addAccount();

        // do it again!
        System.out.println("\n let's call it again! \n");

        // call the business method again
        theAccountDAO.addAccount();

        // close the context
        context.close();

    }
}