package com.test;

import java.util.Scanner;

public class TestMain extends SampleTest {

	int id;
	String name;
	int age;

	// creating two arg over loading constructor 
	TestMain(int i, String n) {
		id = i;
		name = n;
	}

	// creating three over laoding arg constructor
	TestMain(int i, String n, int a) {
		id = i;
		name = n;
		age = a;
	}

	public TestMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		TestMain s1 = new TestMain(111, "Karan");
		TestMain s2 = new TestMain(222, "Aryan", 25);
		s1.display();
		s2.display();

	}

	private void display() {
		// TODO Auto-generated method stub
		System.out.println(id + " " + name + " " + age);
	}

}
