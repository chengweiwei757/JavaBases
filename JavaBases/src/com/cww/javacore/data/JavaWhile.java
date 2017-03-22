package com.cww.javacore.data;

import java.util.Scanner;

public class JavaWhile {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入分数");
		int num = input.nextInt();
		//for
		for (int i= 0;i<num;i++){
			System.out.println("dota");
		}
		//while
		int j = 0;
		while (j < num){
			System.out.println("dota");
			j++;
		}
		//do while
		int f = 0;
		do{
		  System.out.println("dota");
		  f++;
		  System.out.println(f);
		}while (f<num);
		//foreach loop
		String[] strs = {"aa","bb","cc"};
		for (String string : strs){
			System.out.println("数组为"+string);
		}
		
	}

}
