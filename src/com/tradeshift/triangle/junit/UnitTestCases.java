package com.tradeshift.triangle.junit;

import org.junit.Assert;
import org.junit.Test;

import com.tradeshift.triangle.impl.TriangleTypeImpl;
import com.tradeshift.triangle.impl.TriangleTypeImpl.TriangleType;


/*
 * Unit Test cases to determine type of triangle with assertions
 */
public class UnitTestCases {


	/*
	 * Test Equilateral Triangle
	 */
	@Test
	public void testEquilateral() {
		
		TriangleTypeImpl triType = new TriangleTypeImpl(4,4,4);
		TriangleType type = triType.determineTriangleType();
		Assert.assertEquals(TriangleType.EQUILATERAL, type);
		
	}
	
	/*
	 * Test Isoceles Triangle
	 */
	@Test
	public void testIsoceles() {
		
		TriangleTypeImpl triType = new TriangleTypeImpl(4,4,5);
		TriangleType type = triType.determineTriangleType();
		Assert.assertEquals(TriangleType.ISOSCELES, type);
		
	}
	
	/*
	 * Test Scalene Triangle
	 */
	@Test
	public void testScalene() {
		
		TriangleTypeImpl triType = new TriangleTypeImpl(4,5,6);
		TriangleType type = triType.determineTriangleType();
		Assert.assertEquals(TriangleType.SCALENE, type);
		
	}
	
	/*
	 * Test Error Triangle
	 */
	@Test
	public void testError() {
		
		TriangleTypeImpl triType = new TriangleTypeImpl(1,4,10);
		TriangleType type = triType.determineTriangleType();
		Assert.assertEquals(TriangleType.INVALID, type);
		
	}

}
