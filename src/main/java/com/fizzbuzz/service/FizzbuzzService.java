package com.fizzbuzz.service;

import org.springframework.stereotype.Service;

@Service
public class FizzbuzzService {


	public String inputNumber(int number) {
		
		String result = "";
		
		if(3 == number) {
			result = "buzz";
		} else {
			result = String.valueOf(number);
		}
		
		return result;
	}

	
	
}
