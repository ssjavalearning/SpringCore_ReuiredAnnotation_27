package com.suraj.spring.test;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.suraj.spring.beans.Laptop;

public class AnnotationTest {

	public static void main(String[] args) {
		ApplicationContext context = null;
		try {
			context = new ClassPathXmlApplicationContext("spring.xml");
			Laptop laptop = context.getBean("laptop", Laptop.class);
			System.out.println(laptop.getModelId()+"\t"+laptop.getModelName());
		}catch(BeansException e) {
			e.printStackTrace();
		}finally {
			((AbstractApplicationContext) context).close();
		}
	}

}
