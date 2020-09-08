package com.huaxia.Joel;

public class Mouse {
	int numberOfButtons;
	String type;

	Mouse(int numberOfButtons, String type) {
		this.numberOfButtons = numberOfButtons;
		this.type = type;
	}

	public static void main(String[] args) {
		Mouse m = new Mouse(2, "wireless");
		System.out.println(m.type);
	}

}
