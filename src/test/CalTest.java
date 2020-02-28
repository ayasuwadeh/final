package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import code.Calculator;

public class CalTest {
	public static Calculator temp ;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		temp=new Calculator();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	 public void test_positive_positive_positive() {
		
		int a=4;
		int b=8;
		int result=temp.sum(a, b);
		
		assertTrue(result==12);
	}
	
	@Test
	public void test_positive_negative_negative() {
		int a=-4;
		int b=8;
		int result=temp.sum(a, b);
		
		assertTrue(result==4);
	}
	
	@Test
	public void test_positive_negative_positive() {
		int a=4;
		int b=-8;
		int result=temp.sum(a, b);
		
		assertTrue(result==-4);
	}
	
	@Test
	public void test_negative_negative_negative() {
		int a=-4;
		int b=-8;
		int result=temp.sum(a, b);
		
		assertTrue(result==-12);
	}
	
	@Test
	public void test_equals() {
		int a=-4;
		int b=4;
		int result=temp.sum(a, b);
		
		assertTrue(result==0);
	}

}
