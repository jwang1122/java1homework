package com.huaxia.kaiser;

public class Math12023 {

	public static void main(String[] args) {
		
		System.out.println("01; 2020-20=" + (2020 - 20));
		System.out.println("02; 494+118=" + (494 + 118));
		System.out.println("03; I don't know.");
		String s = "1296";
		int index = s.length() - 2;	
		System.out.println("03; The tens digit of 1296 is " + s.charAt(index));
		String sf1 = String.format("03; The tens digit of %s is %s", s, s.charAt(index));
		System.out.println(sf1);
		System.out.println("04; 60/5=" + (60 / 5));
		System.out.println("05; 14*50=" + (14*50));
		System.out.println("06; 66/4=" +(66/4));
	}
}
