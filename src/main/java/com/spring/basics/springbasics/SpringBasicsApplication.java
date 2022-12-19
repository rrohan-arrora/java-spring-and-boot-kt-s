package com.spring.basics.springbasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBasicsApplication {
	
	// THINGS REQUIRED BY THE SPRING:
	// 1. what are the beans required to manage by the spring
	// 2. what are the dependencies required by the beans
	// 3. where to search for the beans: This is managed by the spring boot application itself
	// since beans and the spring base application java file are in same package. So, no need to do anything.

	public static void main(String[] args) {
		// BinarySeachImpl binarySearch = new BinarySeachImpl(new QuickSortAlgorithm());
		
		// Since Spring is managing beans, therefore, we need not to explicitely instantiate BinarySearchImpl beans.
		// APPLICATION CONTEXT manages all the beans create by the spring framework.
		// therefore, we are not creating instances by ourselves but spring is doing it for us.
		
		
		ApplicationContext applicationContext = SpringApplication.run(SpringBasicsApplication.class, args);
		BinarySeachImpl binarySearch = applicationContext.getBean(BinarySeachImpl.class);
		
		int result=binarySearch.binarySearch(new int[] {1, 2, 3}, 3);
		System.out.print(result);
		
	}

}
