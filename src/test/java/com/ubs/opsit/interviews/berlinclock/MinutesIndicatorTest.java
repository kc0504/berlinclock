package com.ubs.opsit.interviews.berlinclock;

import org.junit.Assert;
import org.junit.Test;

import com.ubs.opsit.interviews.berlinclock.BerlinUhrClock.MinutesIndicator;

public class MinutesIndicatorTest {

	@Test
	public void testMinutes1() {
		
		assertFourthAndFifth(new MinutesIndicator(1), "OOOOOOOOOOO", "YOOO");
	}
	
	@Test
	public void testMinutes2() {
		
		assertFourthAndFifth(new MinutesIndicator(2), "OOOOOOOOOOO", "YYOO");
	}
	
	@Test
	public void testMinutes3() {
		
		assertFourthAndFifth(new MinutesIndicator(3), "OOOOOOOOOOO", "YYYO");
	}

	@Test
	public void testMinutes4() {
		
		assertFourthAndFifth(new MinutesIndicator(4), "OOOOOOOOOOO", "YYYY");
	}
	
	@Test
	public void testMinutes5() {
		
		assertFourthAndFifth(new MinutesIndicator(5), "YOOOOOOOOOO", "OOOO");
	}
	
	@Test
	public void testMinutes6() {
		
		assertFourthAndFifth(new MinutesIndicator(6), "YOOOOOOOOOO", "YOOO");
	}
	
	@Test
	public void testMinutes7() {
		
		assertFourthAndFifth(new MinutesIndicator(7), "YOOOOOOOOOO", "YYOO");
	}
	
	@Test
	public void testMinutes8() {
		
		assertFourthAndFifth(new MinutesIndicator(8), "YOOOOOOOOOO", "YYYO");
	}
	
	@Test
	public void testMinutes9() {
		
		assertFourthAndFifth(new MinutesIndicator(9), "YOOOOOOOOOO", "YYYY");
	}
	
	@Test
	public void testMinutes10() {
		
		assertFourthAndFifth(new MinutesIndicator(10), "YYOOOOOOOOO", "OOOO");
	}
	
	@Test
	public void testMinutes11() {
		
		assertFourthAndFifth(new MinutesIndicator(11), "YYOOOOOOOOO", "YOOO");
	}
	
	@Test
	public void testMinutes12() {
		
		assertFourthAndFifth(new MinutesIndicator(12), "YYOOOOOOOOO", "YYOO");
	}

	@Test
	public void testMinutes13() {
		
		assertFourthAndFifth(new MinutesIndicator(13), "YYOOOOOOOOO", "YYYO");
	}

	@Test
	public void testMinutes14() {
		
		assertFourthAndFifth(new MinutesIndicator(14), "YYOOOOOOOOO", "YYYY");
	}

	@Test
	public void testMinutes15() {
		
		assertFourthAndFifth(new MinutesIndicator(15), "YYROOOOOOOO", "OOOO");
	}
	

	@Test
	public void testMinutes16() {
		
		assertFourthAndFifth(new MinutesIndicator(16), "YYROOOOOOOO", "YOOO");
	}
	
	@Test
	public void testMinutes59() {
		
		assertFourthAndFifth(new MinutesIndicator(59), "YYRYYRYYRYY", "YYYY");
	}
	
	private void assertFourthAndFifth(MinutesIndicator berlinMinutes, String expectedFourthRow, String expectedFifthRow) {
		
		Assert.assertEquals("First Row did not match", expectedFourthRow, String.valueOf(berlinMinutes.fourthRowLamps));
		Assert.assertEquals("Second Row did not match", expectedFifthRow, String.valueOf(berlinMinutes.fifthRowLamps));
	}
}
