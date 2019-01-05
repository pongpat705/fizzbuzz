package com.fizzbuzz.service;

import org.springframework.stereotype.Service;

@Service
public class FizzbuzzService {

	public String inputNumber(int i) {
		// TODO Auto-generated method stub
		if( i%3 == 0) {
			return "fizz";
		}else {
			return String.valueOf(i);
		}
//		return String.valueOf(2);
	}

	

	
	
}
