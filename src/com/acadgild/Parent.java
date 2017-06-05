package com.acadgild;

/**
 * 
 * Parent class - having constructors calling another constructors
 *
 */
public class Parent {
	
	//Default constructor
	Parent() {
		this(5);
		System.out.println("You are in the parent class default constructor");
	}

	//Constructor with one parameter
	Parent(int a) {
		this(5,10);
		System.out.println("You are in the parent class one parameter constructor");
	}
	
	//Constructor with two parameters
	Parent(int a, int b) {
		System.out.println("You are in the parent class two parameters constructor");
	}
}
