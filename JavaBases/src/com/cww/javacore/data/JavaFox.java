package com.cww.javacore.data;

import java.util.Scanner;

public class JavaFox {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入分数");
		int score = input.nextInt();

		if (score == 100) {
			System.out.println("奖励一辆车");
		} else if (score >= 90) {
			System.out.println("奖励一台电脑");
		} else if (score >= 60) {
			System.out.println("奖励一部手机");
		} else if (score < 60) {
			System.out.println("没有奖励");
		} else if (score < 30) {
			System.out.println("奖励30大板");
		}
		switch (score) {
		case 100:
			System.out.println("一辆车");
			break;
		case 60:
			System.out.println("不讲理");
			
			break;
		default:
			System.out.println("打一顿");
			break;
		
		}
      
	}

}
