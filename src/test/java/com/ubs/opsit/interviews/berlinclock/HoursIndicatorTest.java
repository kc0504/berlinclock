package com.ubs.opsit.interviews.berlinclock;

import org.junit.Assert;
import org.junit.Test;

import com.ubs.opsit.interviews.berlinclock.BerlinUhrClock.HoursIndicator;

public class HoursIndicatorTest {
	
	@Test
	public void testBerlinHour1() {
		
		HoursIndicator hours = new HoursIndicator(1);
		assertFirstAndSecondRow(hours, "OOOO", "ROOO");	
	}
	
	@Test
	public void testBerlinHour2() {
		
		HoursIndicator hours = new HoursIndicator(2);
		assertFirstAndSecondRow(hours, "OOOO", "RROO");	
	}
	
	@Test
	public void testBerlinHour3() {
		
		HoursIndicator hours = new HoursIndicator(3);
		assertFirstAndSecondRow(hours, "OOOO", "RRRO");	
	}
	
	@Test
	public void testBerlinHour4() {
		
		HoursIndicator hours = new HoursIndicator(4);
		assertFirstAndSecondRow(hours, "OOOO", "RRRR");	
	}
	
	@Test
	public void testBerlinHour5() {
		
		HoursIndicator hours = new HoursIndicator(5);
		assertFirstAndSecondRow(hours, "ROOO", "OOOO");
	}
	
	@Test
	public void testBerlinHour6() {
		
		assertFirstAndSecondRow(new HoursIndicator(6), "ROOO", "ROOO");
	}
	
	@Test
	public void testBerlinHour7() {
		
		assertFirstAndSecondRow(new HoursIndicator(7), "ROOO", "RROO");
	}
	
	@Test
	public void testBerlinHour8() {
		
		assertFirstAndSecondRow(new HoursIndicator(8), "ROOO", "RRRO");
	}

	@Test
	public void testBerlinHour9() {
		
		assertFirstAndSecondRow(new HoursIndicator(9), "ROOO", "RRRR");
	}

	@Test
	public void testBerlinHour10() {
		
		assertFirstAndSecondRow(new HoursIndicator(10), "RROO", "OOOO");
	}
	
	@Test
	public void testBerlinHour11() {
		
		assertFirstAndSecondRow(new HoursIndicator(11), "RROO", "ROOO");
	}
	
	@Test
	public void testBerlinHour12() {
		
		assertFirstAndSecondRow(new HoursIndicator(12), "RROO", "RROO");
	}
	
	@Test
	public void testBerlinHour13() {
		
		assertFirstAndSecondRow(new HoursIndicator(13), "RROO", "RRRO");
	}
	
	@Test
	public void testBerlinHour14() {
		
		assertFirstAndSecondRow(new HoursIndicator(14), "RROO", "RRRR");
	}
	
	@Test
	public void testBerlinHour15() {
		
		assertFirstAndSecondRow(new HoursIndicator(15), "RRRO", "OOOO");
	}
	
	@Test
	public void testBerlinHour16() {
		
		assertFirstAndSecondRow(new HoursIndicator(16), "RRRO", "ROOO");
	}
	
	@Test
	public void testBerlinHour17() {
		
		assertFirstAndSecondRow(new HoursIndicator(17), "RRRO", "RROO");
	}
	
	@Test
	public void testBerlinHour18() {
		
		assertFirstAndSecondRow(new HoursIndicator(18), "RRRO", "RRRO");
	}
	
	@Test
	public void testBerlinHour19() {
		
		assertFirstAndSecondRow(new HoursIndicator(19), "RRRO", "RRRR");
	}
	
	@Test
	public void testBerlinHour20() {
		
		assertFirstAndSecondRow(new HoursIndicator(20), "RRRR", "OOOO");
	}
	
	@Test
	public void testBerlinHour21() {
		
		assertFirstAndSecondRow(new HoursIndicator(21), "RRRR", "ROOO");
	}
	
	@Test
	public void testBerlinHour22() {
		
		assertFirstAndSecondRow(new HoursIndicator(22), "RRRR", "RROO");
	}
	
	@Test
	public void testBerlinHour23() {
		
		assertFirstAndSecondRow(new HoursIndicator(23), "RRRR", "RRRO");
	}
	
	@Test
	public void testBerlinHour24() {
		
		assertFirstAndSecondRow(new HoursIndicator(24), "RRRR", "RRRR");
	}
		
	private void assertFirstAndSecondRow(HoursIndicator hours, String expectedFirstRow, String expectedSecondRow) {
		
		Assert.assertEquals("First Row Did not match", expectedFirstRow, String.valueOf(hours.secondRowLamps));
		Assert.assertEquals("Second Row Did not match", expectedSecondRow, String.valueOf(hours.thirdRowLamps));
	}
}
