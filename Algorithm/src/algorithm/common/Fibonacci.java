package algorithm.common;

public class Fibonacci {
	public int FibonacciUsingRecursion(int n) {
		if(n == 0) return 0;
		else if(n == 1) return 1;
		else return FibonacciUsingRecursion(n-2) + FibonacciUsingRecursion(n-1);
	}
	
	public int FibonacciUsingLoop(int n) {
		int fnMinusTwo = 0;
		int fnMinusOne = 1;
		int fn = 0;
		if(n == 0) return fnMinusTwo;
		if(n == 1) return fnMinusOne;
		for (int i = 2; i <= n; i++) {
			fn = fnMinusTwo + fnMinusOne;
			fnMinusTwo = fnMinusOne;
			fnMinusOne = fn;
		}
		return fn;
	}
}
