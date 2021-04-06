package com.infinite.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        //using simple xml config
      //  ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        
        //using p schema
        ApplicationContext context= new ClassPathXmlApplicationContext("pschema-config.xml");
        Student student=context.getBean("student",Student.class);
        System.out.println(student);
    }
}
