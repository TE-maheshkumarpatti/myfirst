package com.tyss.springcore.sampleexample;

import lombok.Data;

@Data
public class Customer {
	public Customer()
	{
		
	}
	private int id;
	private String name;
	private Account account;
	

}
