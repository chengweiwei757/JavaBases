package com.cww.javacore.data;

public class JavaNum {

	public static void main(String[] args) {
		// 求1到100之间数的总和
		/*
		 * int num=0; for(int i = 0;i<=100;i++){ num=num+i;
		 * 
		 * } System.out.println("1到100之间数的和为："+num);
		 */
		// 求1,7,13。。。100之间的数的和
		/*
		 * int nums=0; for(int f=0;f<=100;f+=6){ nums=nums+f; }
		 * System.out.println("nums的和为："+nums);
		 */
		// 输出一个等腰三角形

		for (int d = 0; d < 4; d++) {
			for (int e = 0; e < d; e++) {
				System.out.print(d);
			}
			for (int f = 0; f <= 2 * d; f++) {
				System.out.print(f);
			}
			System.out.println(" ");
		}
		
		
	}

}
