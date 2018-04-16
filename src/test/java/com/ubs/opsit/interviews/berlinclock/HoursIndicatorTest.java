package com.ubs.opsit.interviews.berlinclock;

import org.junit.Assert;
import org.junit.Test;

import com.ubs.opsit.interviews.berlinclock.BerlinUhrClock.HoursIndicator;

public class HoursIndicatorTest {
	
	@Test
	public void testBerlinHour1() {
		
		HoursIndicator hours = new HoursIndicator(1);
		assertSecondAndThirdRow(hours, "OOOO", "ROOO");	
	}
	
	@Test
	public void testBerlinHour2() {
		
		HoursIndicator hours = new HoursIndicator(2);
		assertSecondAndThirdRow(hours, "OOOO", "RROO");	
	}
	
	@Test
	public void testBerlinHour3() {
		
		HoursIndicator hours = new HoursIndicator(3);
		assertSecondAndThirdRow(hours, "OOOO", "RRRO");	
	}
	
	@Test
	public void testBerlinHour4() {
		
		HoursIndicator hours = new HoursIndicator(4);
		assertSecondAndThirdRow(hours, "OOOO", "RRRR");	
	}
	
	@Test
	public void testBerlinHour5() {
		
		HoursIndicator hours = new HoursIndicator(5);
		assertSecondAndThirdRow(hours, "ROOO", "OOOO");
	}
	
	@Test
	public void testBerlinHour6() {
		
		assertSecondAndThirdRow(new HoursIndicator(6), "ROOO", "ROOO");
	}
	
	@Test
	public void testBerlinHour7() {
		
		assertSecondAndThirdRow(new HoursIndicator(7), "ROOO", "RROO");
	}
	
	@Test
	public void testBerlinHour8() {
		
		assertSecondAndThirdRow(new HoursIndicator(8), "ROOO", "RRRO");
	}

	@Test
	public void testBerlinHour9() {
		
		assertSecondAndThirdRow(new HoursIndicator(9), "ROOO", "RRRR");
	}

	@Test
	public void testBerlinHour10() {
		
		assertSecondAndThirdRow(new HoursIndicator(10), "RROO", "OOOO");
	}
	
	@Test
	public void testBerlinHour11() {
		
		assertSecondAndThirdRow(new HoursIndicator(11), "RROO", "ROOO");
	}
	
	@Test
	public void testBerlinHour12() {
		
		assertSecondAndThirdRow(new HoursIndicator(12), "RROO", "RROO");
	}
	
	@Test
	public void testBerlinHour13() {
		
		assertSecondAndThirdRow(new HoursIndicator(13), "RROO", "RRRO");
	}
	
	@Test
	public void testBerlinHour14() {
		
		assertSecondAndThirdRow(new HoursIndicator(14), "RROO", "RRRR");
	}
	
	@Test
	public void testBerlinHour15() {
		
		assertSecondAndThirdRow(new HoursIndicator(15), "RRRO", "OOOO");
	}
	
	@Test
	public void testBerlinHour16() {
		
		assertSecondAndThirdRow(new HoursIndicator(16), "RRRO", "ROOO");
	}
	
	@Test
	public void testBerlinHour17() {
		
		assertSecondAndThirdRow(new HoursIndicator(17), "RRRO", "RROO");
	}
	
	@Test
	public void testBerlinHour18() {
		
		assertSecondAndThirdRow(new HoursIndicator(18), "RRRO", "RRRO");
	}
	
	@Test
	public void testBerlinHour19() {
		
		assertSecondAndThirdRow(new HoursIndicator(19), "RRRO", "RRRR");
	}
	
	@Test
	public void testBerlinHour20() {
		
		assertSecondAndThirdRow(new HoursIndicator(20), "RRRR", "OOOO");
	}
	
	@Test
	public void testBerlinHour21() {
		
		assertSecondAndThirdRow(new HoursIndicator(21), "RRRR", "ROOO");
	}
	
	@Test
	public void testBerlinHour22() {
		
		assertSecondAndThirdRow(new HoursIndicator(22), "RRRR", "RROO");
	}
	
	@Test
	public void testBerlinHour23() {
		
		assertSecondAndThirdRow(new HoursIndicator(23), "RRRR", "RRRO");
	}
	
	@Test
	public void testBerlinHour24() {
		
		assertSecondAndThirdRow(new HoursIndicator(24), "RRRR", "RRRR");
	}
		
	private void assertSecondAndThirdRow(HoursIndicator hours, String expectedSecondRow, String expectedThirdRow) {
		
		Assert.assertEquals("First Row Did not match", expectedSecondRow, String.valueOf(hours.secondRowLamps));
		Assert.assertEquals("Second Row Did not match", expectedThirdRow, String.valueOf(hours.thirdRowLamps));
	}
}
