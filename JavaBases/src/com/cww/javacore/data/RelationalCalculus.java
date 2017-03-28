package com.cww.javacore.data;

import java.util.Scanner;

public class RelationalCalculus {

	public static void main(String[] args) {
		System.out.println("请输入语文分数");
		Scanner input = new Scanner(System.in);
		
		int score = input.nextInt();
		System.out.println("请输入数学分数");
		Scanner input1 = new Scanner(System.in);
		
		int score1 = input1.nextInt();
		if ((score >= 90) && (score1 >= 80) ||
				(score >= 80) && (score1 >= 90)) {
			System.out.println("奖励一个大红花");
		} else {
			System.out.println("什么都没有");
	     
		}

	}
	

}
