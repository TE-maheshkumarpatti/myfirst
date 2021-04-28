package com.tyss.springcore.sampleexample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=null;
		context=new ClassPathXmlApplicationContext("configuration.xml");
		Customer customer=(Customer)context.getBean("mahesh");
		System.out.println(customer.getId());
		System.out.println(customer.getName());
		System.out.println(customer.getAccount().getAcno());
		System.out.println(customer.getAccount().getBranch());
		System.out.println(customer.getAccount().getBank());
		System.out.println(customer.getAccount().getAmt());
		}

}
