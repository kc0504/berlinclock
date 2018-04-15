package com.ubs.opsit.interviews.berlinclock;

import org.junit.Assert;
import org.junit.Test;

import com.ubs.opsit.interviews.berlinclock.BerlinUhrClock.MinutesIndicator;

public class MinutesIndicatorTest {

	@Test
	public void testMinutes1() {
		
		assertFirstAndSecondRow(new MinutesIndicator(1), "OOOOOOOOOOO", "YOOO");
	}
	
	@Test
	public void testMinutes2() {
		
		assertFirstAndSecondRow(new MinutesIndicator(2), "OOOOOOOOOOO", "YYOO");
	}
	
	@Test
	public void testMinutes3() {
		
		assertFirstAndSecondRow(new MinutesIndicator(3), "OOOOOOOOOOO", "YYYO");
	}

	@Test
	public void testMinutes4() {
		
		assertFirstAndSecondRow(new MinutesIndicator(4), "OOOOOOOOOOO", "YYYY");
	}
	
	@Test
	public void testMinutes5() {
		
		assertFirstAndSecondRow(new MinutesIndicator(5), "YOOOOOOOOOO", "OOOO");
	}
	
	@Test
	public void testMinutes6() {
		
		assertFirstAndSecondRow(new MinutesIndicator(6), "YOOOOOOOOOO", "YOOO");
	}
	
	@Test
	public void testMinutes7() {
		
		assertFirstAndSecondRow(new MinutesIndicator(7), "YOOOOOOOOOO", "YYOO");
	}
	
	@Test
	public void testMinutes8() {
		
		assertFirstAndSecondRow(new MinutesIndicator(8), "YOOOOOOOOOO", "YYYO");
	}
	
	@Test
	public void testMinutes9() {
		
		assertFirstAndSecondRow(new MinutesIndicator(9), "YOOOOOOOOOO", "YYYY");
	}
	
	@Test
	public void testMinutes10() {
		
		assertFirstAndSecondRow(new MinutesIndicator(10), "YYOOOOOOOOO", "OOOO");
	}
	
	@Test
	public void testMinutes11() {
		
		assertFirstAndSecondRow(new MinutesIndicator(11), "YYOOOOOOOOO", "YOOO");
	}
	
	@Test
	public void testMinutes12() {
		
		assertFirstAndSecondRow(new MinutesIndicator(12), "YYOOOOOOOOO", "YYOO");
	}

	@Test
	public void testMinutes13() {
		
		assertFirstAndSecondRow(new MinutesIndicator(13), "YYOOOOOOOOO", "YYYO");
	}

	@Test
	public void testMinutes14() {
		
		assertFirstAndSecondRow(new MinutesIndicator(14), "YYOOOOOOOOO", "YYYY");
	}

	@Test
	public void testMinutes15() {
		
		assertFirstAndSecondRow(new MinutesIndicator(15), "YYROOOOOOOO", "OOOO");
	}
	

	@Test
	public void testMinutes16() {
		
		assertFirstAndSecondRow(new MinutesIndicator(16), "YYROOOOOOOO", "YOOO");
	}
	
	@Test
	public void testMinutes59() {
		
		assertFirstAndSecondRow(new MinutesIndicator(59), "YYRYYRYYRYY", "YYYY");
	}
	
	private void assertFirstAndSecondRow(MinutesIndicator berlinMinutes, String firstRow, String secondRow) {
		
		Assert.assertEquals("First Row did not match", firstRow, String.valueOf(berlinMinutes.fourthRow));
		Assert.assertEquals("Second Row did not match", secondRow, String.valueOf(berlinMinutes.fifthRow));
	}
}
