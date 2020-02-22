import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.*;

class GradeBookTester {
	
	private GradeBook A;
	private GradeBook B;
	
	@Before	//setup
	public void before() throws Exception	{
		System.out.println("Array list size set up");
	}

	@Test
	void testAddScore() throws Throwable {
		A=new GradeBook(5);
		A.addScore(60);
		A.addScore(70);
		A.addScore(80);
		
		B=new GradeBook(5);
		B.addScore(95);
		B.addScore(75);
		B.addScore(86);
		B.addScore(90);
		
		assertTrue(A.toString().equals("60.0 70.0 80.0 "));
		assertTrue(B.toString().equals("95.0 75.0 86.0 90.0 "));
		
		assertEquals(3, A.getScoreSize());
		assertEquals(4, B.getScoreSize());
	}
	
	@Test
	void testSum() {
		A=new GradeBook(5);
		A.addScore(60);
		A.addScore(70);
		A.addScore(80);
		
		B=new GradeBook(5);
		B.addScore(95);
		B.addScore(75);
		B.addScore(86);
		B.addScore(90);
		
		assertEquals(210.0, A.sum(), .0001);
		assertEquals(346.0, B.sum(), .0001);
	}
	
	@Test
	void testMin() {
		A=new GradeBook(5);
		A.addScore(60);
		A.addScore(70);
		A.addScore(80);
		
		B=new GradeBook(5);
		B.addScore(95);
		B.addScore(75);
		B.addScore(86);
		B.addScore(90);
		
		assertEquals(60.0, A.minimum());
		assertEquals(75.0, B.minimum());
	}
	
	@Test
	void testFinalScore() {
		A=new GradeBook(5);
		A.addScore(60);
		A.addScore(70);
		A.addScore(80);
		
		B=new GradeBook(5);
		B.addScore(95);
		B.addScore(75);
		B.addScore(86);
		B.addScore(90);
		
		assertEquals(150.0, A.finalScore());
		assertEquals(271.0, B.finalScore());
	}
	
	@Test
	void testScoreSize() {
		A=new GradeBook(5);
		A.addScore(60);
		A.addScore(70);
		A.addScore(80);
		
		B=new GradeBook(5);
		B.addScore(95);
		B.addScore(75);
		B.addScore(86);
		B.addScore(90);
		
		assertEquals(3, A.getScoreSize());
		assertEquals(4, B.getScoreSize());
	}
	
	@After	//tearDown
	public void after() throws Exception	{
		System.out.println("Tearing down array list");
		A=null;
		B=null;
	}
	
}
