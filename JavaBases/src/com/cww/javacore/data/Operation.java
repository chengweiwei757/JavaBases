package com.cww.javacore.data;

public class Operation {

	public static void main(String[] args) {
		int a = 3;
		int b = 192;
		int c = 0;
		c = a >> 1;
		System.out.println("c的结果为："+ c);
		System.out.println(Integer.toBinaryString(c));
	    c = b << 1;
	    System.out.println("c的结果为："+ c);
	    System.out.println(Integer.toBinaryString(c));
	}
	

}
