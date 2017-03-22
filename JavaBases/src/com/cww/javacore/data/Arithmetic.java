package com.cww.javacore.data;

public class Arithmetic {

	public static void main(String[] args) {
		int i = 5, j = 6;
		String result = i > j ? "i>j" : "i<j";
		System.out.println(result);

		boolean bo1 = true;
		boolean bo2 = false;
		System.out.println(bo1 && bo2);
		System.out.println(bo1 || bo2);
		System.out.println(!bo1);
		System.out.println((1 < 2) && (3 < 5));

		int a = 6;
		int b = 8;
		b = ++a;
		System.out.println("a的更改值为：" + a);
		System.out.println("b的更改值为：" + b);
		
		char g ='a';
		//String f = "abc";
		short c;
		c= (short) g;
		System.out.println("c的初始值为：" + c);
	}

}
