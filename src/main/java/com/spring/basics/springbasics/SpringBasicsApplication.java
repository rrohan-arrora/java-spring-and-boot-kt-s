package com.spring.basics.springbasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBasicsApplication {

	public static void main(String[] args) {
		BinarySeachImpl binarySearch = new BinarySeachImpl(new QuickSortAlgorithm());
		int result=binarySearch.binarySearch(new int[] {1, 2, 3}, 3);
		System.out.print(result);
		
//		SpringApplication.run(SpringBasicsApplication.class, args);
	}

}
