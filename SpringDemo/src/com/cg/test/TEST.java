package com.cg.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.renderer.MessageRenderer;

public class TEST {

	public static void main(String[] args) {
			ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
			MessageRenderer renderer = (MessageRenderer) context.getBean("renderer");
			renderer.render();
	}
}
