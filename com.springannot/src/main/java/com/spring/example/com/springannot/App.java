package com.spring.example.com.springannot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext con= new AnnotationConfigApplicationContext(StudentConfi.class);
    	
    	
    	Student s=(Student)con.getBean("s1");
        System.out.print(s.toString() );
        
        //Student ss=(Student)con.getBean("s2");
        //System.out.print(ss.toString() );
        Collage c=(Collage)con.getBean("c1");
        System.out.println(c.toString() );
    }
}
