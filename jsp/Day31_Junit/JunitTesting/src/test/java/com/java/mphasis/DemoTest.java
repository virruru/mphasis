package com.java.mphasis;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DemoTest {

	static Demo obj;
	static int count;
	
	@BeforeClass
	public static void setUp() {
		obj = new Demo();
		count=0;
	}
	
	@AfterClass 
	public static void cleanUp() {
		obj = null;
	}
	
	@Before
	public void beginTest() {
		count++;
		System.out.println("Test Case Started "+count);
	}
	
	@After
	public void endTest() {
		System.out.println("Test Case Ended...");
	}
	@Test
	public void testNull() {
		Demo obj1 = null;
		assertNull(obj1);
		Demo obj2 = new Demo();
		assertNotNull(obj2);
	}
	@Test
	public void testArray() {
		int[] a= {-3,66,23,77,32,67};
		int[] b= {-3,66,23,77,32,67};
		assertArrayEquals(a, b);
	}
	
	@Test
	public void testCheck() {
		//Demo obj = new Demo();
		assertTrue(obj.check(4));
		assertFalse(obj.check(-4));
	}
	@Test
	public void testMinArray() {
		int[] a= {-3,66,23,77,32,67};
	//	Demo obj = new Demo();
		assertEquals(-3, obj.minArray(a));
	}
	@Test
	public void testMax3() {
	//	Demo obj = new Demo();
		assertEquals(5, obj.max3(5, 3, 2));
		assertEquals(5, obj.max3(2, 5, 3));
		assertEquals(5, obj.max3(2, 3, 5));
		
		
	}
	@Test
	public void testSum() {
	//	Demo obj = new Demo();
		assertEquals(5, obj.sum(3, 2));
	}
	
	@Test
	public void testSayHello() {
	//	Demo obj = new Demo();
		assertEquals("Welcome to Junit...", obj.sayHello());
	}

}
