package com.library.LibraryManagement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.service.BookService;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext con = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookserv = (BookService)con.getBean("bookserv");
        System.out.println(bookserv);
    }
}
