package algorithm.test;

import algorithm.designpattern.Singleton;

public class MainDesignPattern {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println(s1 == s2);
		System.out.println(s1.getName());
		System.out.println(s2.getName());
		s1.setName("newpresident");
		System.out.println(s1.getName());
		System.out.println(s2.getName());
	}

}
