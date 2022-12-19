package com.spring.basics.springbasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBasicsApplication {
	
	// THINGS REQUIRED BY THE SPRING:
	// 1. what are the beans required to manage by the spring
	// 2. what are the dependencies required by the beans
	// 3. where to search for the beans

	public static void main(String[] args) {
		BinarySeachImpl binarySearch = new BinarySeachImpl(new QuickSortAlgorithm());
		int result=binarySearch.binarySearch(new int[] {1, 2, 3}, 3);
		System.out.print(result);
		
//		SpringApplication.run(SpringBasicsApplication.class, args);
	}

}
