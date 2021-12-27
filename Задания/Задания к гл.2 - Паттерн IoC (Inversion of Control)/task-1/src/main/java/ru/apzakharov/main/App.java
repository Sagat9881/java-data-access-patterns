package ru.apzakharov.main;

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
        ApplicationContext context =
                new ClassPathXmlApplicationContext("newSpringXMLConfig.xml");
        NewYearGift h = (NewYearGift)context.getBean("gift1");
        h.print();
    }
}
