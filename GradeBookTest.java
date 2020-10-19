package fall;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	private GradeBook grade1, grade2;
	
	@BeforeEach
	void setUp() throws Exception {
		grade1 = new GradeBook(5);
		grade2 = new GradeBook(5);
		
		grade1.addScore(45.0);
		grade2.addScore(35.0);
		
		grade1.addScore(13.0);
		grade2.addScore(15.0);
		
		grade1.addScore(30.0);
		grade2.addScore(30.0);
		
		grade1.addScore(22.0);
		grade2.addScore(18.0);
		
		grade1.addScore(50.0);
		grade2.addScore(50.0);
	}

	@AfterEach
	void tearDown() throws Exception {
		grade1 = null;
		grade2 = null;
	}

	@Test
	void testAddScore() {
		assertTrue(grade1.toString().equals("45.0 13.0 30.0 22.0 50.0 "));
		assertTrue(grade2.toString().equals("35.0 15.0 30.0 18.0 50.0 "));
		assertEquals(grade1.getScoreSize(), 5);
		assertEquals(grade2.getScoreSize(), 5);
	}

	@Test
	void testSum() {
		assertEquals(grade1.sum(), 45+13+30+22+50);
		assertEquals(grade2.sum(), 35+15+30+18+50);
	}

	@Test
	void testMinimum() {
		assertEquals(grade1.minimum(), 13.0);
		assertEquals(grade2.minimum(), 15.0);
	}

	@Test
	void testFinalScore() {
		assertEquals(grade1.finalScore(), 45+30+22+50);
		assertEquals(grade2.finalScore(), 35+30+18+50);
	}

	@Test
	void testGetScoreSize() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

}
