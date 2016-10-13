package com.tradeshift.triangle.junit;

import java.util.Scanner;

import com.tradeshift.triangle.impl.TriangleTypeImpl;
import com.tradeshift.triangle.impl.TriangleTypeImpl.TriangleType;

//Test class
public class TestMain {

	// Main method to test the type of triangle using TriangleTypeImpl
	public static void main(String args[]) {

		// Taking the inputs from console - Start
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the sides of the triangle");
		
		double side1, side2, side3;

		System.out.println("Side 1: ");
		side1 = keyboard.nextDouble();

		System.out.println("Side 2: ");
		side2 = keyboard.nextDouble();

		System.out.println("Side 3: ");
		side3 = keyboard.nextDouble();

		keyboard.close();
		// Taking the inputs from console - End

		// Invoke the DetermineTriangle API with the sides
		TriangleTypeImpl triType = new TriangleTypeImpl(side1, side2, side3);
		TriangleType type = triType.determineTriangleType();
		
		System.out.println("The triangle is "+type);

	}

}