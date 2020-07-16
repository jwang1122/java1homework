package com.huaxia.test;

public class BookTest {

	public static void main(String[] args) {
		Book book=new Book("Java programming",10.99);
		System.out.println(book);
		book.read();
	}

}
