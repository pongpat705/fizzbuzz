package com.fizzbuzz;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.fizzbuzz.service.FizzbuzzService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FizzbuzzApplicationTests {

	
	@Autowired
	FizzbuzzService fizzbuzzService;
	
	@Test
	public void inputOneShouldbeOutputOne() {
		String result = fizzbuzzService.inputNumber(1);
		if(result.equals("1")) {
			System.out.println("pass");
		}else {
			System.out.println("false");
		}
		
	}
	
	@Test
	public void inputTwoShouldbeOutputTwo() {
		String result = fizzbuzzService.inputNumber(2);
		if(result.equals("2")) {
			System.out.println("pass");
		}else {
			System.out.println("false");
		}
		
	}
	
	@Test
	public void inputThreeShouldbeOutputBuzz() {
		String result = fizzbuzzService.inputNumber(3);
		if(result.equals("buzz")) {
			System.out.println("pass");
		}else {
			System.out.println("false");
		}
		
	}
	
		

}

