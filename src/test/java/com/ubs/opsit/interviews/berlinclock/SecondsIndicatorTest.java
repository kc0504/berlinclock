package com.ubs.opsit.interviews.berlinclock;

import org.junit.Assert;
import org.junit.Test;

public class SecondsIndicatorTest {

	@Test
	public void testEvenSeconds() {
		
		for(int i = 0; i < 60; i = i + 2)
			Assert.assertEquals("Indicator did not match for " + i + " secs", "Y", String.valueOf(new SecondsIndicator(i).getRow()));
	}
	
	@Test
	public void testOddSeconds() {
		
		for(int i = 1; i < 60; i = i + 2)
			Assert.assertEquals("Indicator did not match for " + i + " secs", "O", String.valueOf(new SecondsIndicator(i).getRow()));
	}

}
