package com.Spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        //Creating a IOC container...
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //GetObject by spring xml
        Bank bank = (Bank) context.getBean("c1");
        bank.chooseService();
    }
}
