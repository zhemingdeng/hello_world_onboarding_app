package com.coveros.hello_world;

import java.util.Random;

public class EvenNumberGenerator {
	public static int generateRandomEven(){
		Random randomGenerator = new Random();
		int result = randomGenerator.nextInt();
		if (result%2!=0){
			result++;
		}
		return result;
	}
	public static int generateRandomOdd(){
		Random randomGenerator = new Random();
		int result = randomGenerator.nextInt();
		
		if (result%2!=0){
			result++;
		}
		return result;
	}
	//adding some new staff
	public void printSomething() {
		System.out.println("This is hello world");
	}
}
