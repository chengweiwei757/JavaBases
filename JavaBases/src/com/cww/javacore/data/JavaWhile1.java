package com.cww.javacore.data;

import java.util.Scanner;

public class JavaWhile1 {
	public static void forDemo(int num) {
		for (int i = 0; i < num; i++) {
			System.out.println("dota-"+i);
		}
	}

	public static void whileDemo(int num) {
		int j = 0;
		while (j < num) {
			System.out.println("dota--"+j);
			j++;
		}
	}

	public static void dowhileDemo(int num) {
		int f = 0;
		do {
			System.out.println("dota---"+f);
			f++;
		} while (f < num);
	}

	public static void foreachDemo() {
		String[] strs = { "aa", "bb", "cc" };
		for (String string : strs) {
			System.out.println("数组为" + string);
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入分数");
		int num = input.nextInt();
		// for
		forDemo(num);
		// while
		whileDemo(num);
		// do while
		dowhileDemo(num);
		// foreach loop
		foreachDemo();

	}

}
