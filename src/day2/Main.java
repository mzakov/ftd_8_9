package day2;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		System.out.println("Good morning!");
		/*
		ArrayList<String> arrList = new ArrayList<>();
		
		arrList.add(0,"Hey0");
		arrList.add("Hey1");
		arrList.add(2,"Hey2");
		arrList.add(2,"Hey3");
		arrList.add("Hey4");
		
		System.out.println(arrList.get(2));
		
		
		HashMap<String, String> week = new HashMap<>();
		
		week.put("Monday", "Good morning, I am sorry!");
		week.put("Tuesday", "Good morning!");
		week.put("Wednesday", "Good morning!");
		week.put("Thursday", "Good morning!");
		week.put("Friday", "Good morning, for the last time I promise!");
		week.put("Saturday", "Good afternoon!");
		week.put("Sunday", "Good afternoon!");
		
		System.out.println(week);
		*/
		
		ArrayList<Pet> msSusansPets = new ArrayList<>();
		msSusansPets.add(new Dog());
		msSusansPets.add(new Cat(null));
		msSusansPets.add(new Dog());
		msSusansPets.add(new Cat(null));
		msSusansPets.add(new Dog());
		
		
		
		
		
	}
}
