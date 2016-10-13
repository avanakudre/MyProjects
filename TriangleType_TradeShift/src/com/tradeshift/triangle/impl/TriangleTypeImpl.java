package com.tradeshift.triangle.impl;

/*
 * This implementation class to determine the type of triangle for given sides
 * 
 */

public class TriangleTypeImpl {

	// Declaring enum constants for different types of triangle
	public enum TriangleType {

		ISOSCELES, EQUILATERAL, SCALENE, INVALID;

	}

	/*
	 * 1. Assuming sides of the triangle are in decimal using double data type
	 * 2. Can use float data type as well if memory is a constraint and
	 * precision is not that important 3. Encapsulating the fields by making
	 * them privat3
	 */
	private double side1, side2, side3;

	// providing access to the fields via public constructor
	public TriangleTypeImpl(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;

	}

	// Method which determines the type of triangle based on the sides
	public TriangleType determineTriangleType() {

		// This checks whether the given triangle is valid
		if (inValid()) {
			return TriangleType.INVALID;
		}

		// Checking if equilateral
		else if (equilateral()) {
			return TriangleType.EQUILATERAL;
		}

		// Checking if isoceles
		else if (isosceles()) {
			return TriangleType.ISOSCELES;
		}

		// checking if scalene
		else if (scalene()) {
			return TriangleType.SCALENE;
		}

		else {
			return TriangleType.INVALID;
		}

	}

	/*
	 * Checks whether the triangle is valid and possible returns true if invalid
	 */
	private boolean inValid() {

		// Checking if any of the side length is 0 or negative
		if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
			System.out.println("Sides cannot be 0 or negative");
			return true;
		}

		//checking if triangle is possible - Triangle Inequality
		else if (side1 > side2 + side3 || side2 > side1 + side3
				|| side3 > side1 + side2) {
			System.out.println("Triangle is not possible");
			return true;
		}

		return false;
	}

	/*
	 * Checks if Equilateral returns true if Equilateral
	 */
	private boolean equilateral() {

		if (side1 == side2 && side2 == side3) {
			return true;
		}

		return false;
	}

	/*
	 * Checks if Isoceles returns true if Isoceles
	 */
	private boolean isosceles() {

		if (side1 == side2 || side2 == side3 || side3 == side1) {
			return true;
		}
		return false;
	}

	/*
	 * Checks if Scalene returns true if Scalene
	 */
	private boolean scalene() {
		if (side1 != side2 && side2 != side3 && side3 != side1) {
			return true;
		}

		return false;
	}

}
