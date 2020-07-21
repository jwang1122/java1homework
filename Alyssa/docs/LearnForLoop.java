package com.huaxia.test;

public class LearnForLoop {

	public static void main(String[] args) {
		for (int i = 1; i < 5; i++) {
			for (int k = 5; k > i; k--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();

		}
		for (int i = 3; i > 0; i--) {
			for (int k = 5; k > i; k--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
