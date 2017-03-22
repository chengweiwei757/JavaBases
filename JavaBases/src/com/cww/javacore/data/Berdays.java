package com.cww.javacore.data;

public class Berdays {
		
			  private int day;
			  private int month;
			  private int year;
			  public static void display(int year,int month,int day){
				  day = 11;month = 11;year = 2014;
				  System.out.println(year+"-"+month+"-"+day);
			  }
				  
	   public void display(Berdays berdays){
				berdays.year = 2012;
				berdays.month = 10;
				berdays.day = 10;
				System.out.println(berdays.year+"-"+berdays.month+"-"+berdays.day);
			}	  
			  
		public static void testValue1() {
				Berdays berdays = new Berdays();
				int day = 12, month = 12,year = 2016;
				System.out.println(year+"-"+month+"-"+day);
				berdays.display(year,month,day);
				System.out.println(year+"-"+month+"-"+day);
			}
		public static void testValue2() {
			Berdays berdays = new Berdays();
			berdays.year = 2020;
			berdays.month = 9;
			berdays.day = 9;
			System.out.println(berdays.year+"-"+berdays.month+"-"+berdays.day);
			berdays.display(berdays);
			System.out.println(berdays.year+"-"+berdays.month+"-"+berdays.day);
		}
		public static void main(String[] args){
			testValue1();
			testValue2();
		}
			

			  }


