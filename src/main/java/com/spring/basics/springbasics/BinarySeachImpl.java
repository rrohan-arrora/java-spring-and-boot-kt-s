package com.spring.basics.springbasics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySeachImpl {
	
	@Autowired
	SortAlgorithm sortAlgorithm;
	
//	public BinarySeachImpl(SortAlgorithm sortAlgorithm) {
//		// TODO Auto-generated constructor stub
//		this.sortAlgorithm=sortAlgorithm;
//	}
	
	public int binarySearch(int[] numbers, int search) {
		
		// IMPLEMENTING BUBBLE SORTING LOGIC
		
		//tightly coupled for now
//		BubbleSortAlgorithm algo = new BubbleSortAlgorithm();
//		int[] sortedNUmbers = algo.sortNumbers(numbers);
		
		int[] sortedNumbers = sortAlgorithm.sortNumbers(numbers);
		System.out.println(sortAlgorithm);
		
		// SEARCH THE ARRAY
		
		return 3;
	}

}
