package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{

       public static void main( String[] args )    {

           ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
           AutoFactory autoFactory = ctx.getBean("autoFactory", AutoFactory.class);
           AutoFactory autoFactory1 = ctx.getBean("autoFactory1", AutoFactory.class);
           autoFactory.run();
           autoFactory1.run();
           System.out.println("Num cars:" + autoFactory.getNumCars());
           System.out.println("Num cars:" + autoFactory1.getNumCars());
    }


}
