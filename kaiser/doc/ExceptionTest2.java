package com.huaxia.john;

import java.util.Scanner;

public class ExceptionTest2 {
	public static void main(String[] args) {
		ExceptionTest2 test = new ExceptionTest2();
//	test.uncheckedArrayUsage();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a radius: ");
		float answer = input.nextFloat();
//	test.tryCatchTest();
//		try {
//		System.out.println(test.area(-1.0f));
//			System.out.println(test.area(answer));
//		} catch (Exception e1) {
//			System.out.println("Error: " + e1.getMessage());
//		e1.printStackTrace();
//		}
//		System.out.print("Enter a radius: ");
//		answer = input.nextFloat();
//
//		try {
//
//			System.out.println(test.area(answer));
//			// System.out.println(test.area(-2.0f));
//		} catch (Exception e2) {
//			System.out.println("Error: " + e2.getMessage());
//		e.printStackTrace();
//		}
//		System.out.print("Enter a radius: ");
//		answer = input.nextFloat();

		try {
//			float area = test.area(2.3f);
			float area = test.area(answer);
			System.out.printf("Area of circle with radius %4.2f is %5.2f.\n", answer, area);
		} catch (Exception err) {
			System.out.println("Error: " + err);
		}
		System.out.println("Done.");

	}

	void tryCatchTest() {
		try {
			uncheckedArrayUsage();
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}

	}

	/**
	 * add throw Exception
	 * 
	 * @param radius
	 * @return
	 * @throws Exception
	 * @throws InvalidValueException
	 */
	float area(float radius) throws Exception {
		if (radius < 0) {
			throw new Exception("Circle radius cannot be negative. it is " + radius);
		}
		return (float) (Math.PI * radius * radius);
	}

	void uncheckedArrayUsage() {
		int[] numbers = { 1, 2, 3, 4, 5 };
		System.out.println(numbers[10]);
	}

}
