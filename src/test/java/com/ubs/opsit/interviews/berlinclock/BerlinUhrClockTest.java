package com.ubs.opsit.interviews.berlinclock;

import org.junit.Test;

import junit.framework.Assert;

public class BerlinUhrClockTest {

	private BerlinUhrClock berlinUhrClock;

	@Test
	public void testClockZeroHoursOutput() {
		
		berlinUhrClock = new BerlinUhrClock(00, 00, 00);
		String berlinClockTime = berlinUhrClock.getBerlinClockTime();
		
		Assert.assertEquals(berlinClockTime, "Y\r\nOOOO\r\nOOOO\r\nOOOOOOOOOOO\r\nOOOO");
	}
	
	@Test
	public void testClockValidOutput() {
		
		berlinUhrClock = new BerlinUhrClock(15, 15, 15);
		String berlinClockTime = berlinUhrClock.getBerlinClockTime();
		
		Assert.assertEquals(berlinClockTime, "O\r\nRRRO\r\nOOOO\r\nYYROOOOOOOO\r\nOOOO");
	}

	@Test
	public void testClock23_59_59Output() {
		
		berlinUhrClock = new BerlinUhrClock(23, 59, 59);
		String berlinClockTime = berlinUhrClock.getBerlinClockTime();
		
		Assert.assertEquals(berlinClockTime, "O\r\nRRRR\r\nRRRO\r\nYYRYYRYYRYY\r\nYYYY");
	}
	
	@Test
	public void testClock24hrsOutput() {
		
		berlinUhrClock = new BerlinUhrClock(24, 00, 00);
		String berlinClockTime = berlinUhrClock.getBerlinClockTime();
		
		Assert.assertEquals(berlinClockTime, "Y\r\nRRRR\r\nRRRR\r\nOOOOOOOOOOO\r\nOOOO");
	}
}
