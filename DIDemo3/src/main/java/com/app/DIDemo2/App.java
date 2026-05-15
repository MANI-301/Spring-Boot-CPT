package com.app.DIDemo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
    public static void main(String[] args) {
    	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Human human = (Human) context.getBean("human");
		human.pumping();
       
    }
}
