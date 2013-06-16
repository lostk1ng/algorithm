package algorithm.test;

import algorithm.common.Fibonacci;

public class MainCommon {

	public static void main(String[] args) {
		Fibonacci fb = new Fibonacci();
		
		long start = System.currentTimeMillis();
		int result1 = fb.FibonacciUsingRecursion(40);
		long end = System.currentTimeMillis();
		System.out.println(result1 + " " + (end-start));
		
		start = System.currentTimeMillis();
		int result2 = fb.FibonacciUsingLoop(40);
		end = System.currentTimeMillis();
		System.out.println(result2 + " " + (end-start));
	}

}
