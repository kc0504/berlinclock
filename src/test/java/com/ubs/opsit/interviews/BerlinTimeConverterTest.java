package com.ubs.opsit.interviews;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.ubs.opsit.interviews.berlinclock.BerlinUhrClock;
import com.ubs.opsit.interviews.exceptions.InvalidInputException;

@RunWith(PowerMockRunner.class)
@PrepareForTest({BerlinTimeConverter.class, BerlinUhrClock.class})
public class BerlinTimeConverterTest {

	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	private BerlinTimeConverter timeConverter;
	
	@Before
	public void setup() throws Exception {
		
		timeConverter = new BerlinTimeConverter();
	}
	
	@Test(expected = InvalidInputException.class)
	public void testInvalidInputAsRandomString() throws InvalidInputException {
		
		timeConverter.convertTime("RandomString");
	}
	
	@Test
	public void testValidInputTime000000AndClockCreation() throws Exception {
		
		BerlinUhrClock mock = PowerMockito.mock(BerlinUhrClock.class);
		PowerMockito.whenNew(BerlinUhrClock.class).withAnyArguments().thenReturn(mock);
		
		try {
			
			timeConverter.convertTime("00:00:00");
			
		} catch (Exception e) { }
		
		PowerMockito.verifyNew(BerlinUhrClock.class).withArguments(Mockito.any(Integer.class), Mockito.any(Integer.class), Mockito.any(Integer.class));
	}
	
	@Test
	public void testValidInputTime240000AndClockCreation() throws Exception {
		
		BerlinUhrClock mock = PowerMockito.mock(BerlinUhrClock.class);
		PowerMockito.whenNew(BerlinUhrClock.class).withAnyArguments().thenReturn(mock);
		
		try {
			
			timeConverter.convertTime("24:00:00");
			
		} catch (Exception e) { }
		
		PowerMockito.verifyNew(BerlinUhrClock.class).withArguments(Mockito.any(Integer.class), Mockito.any(Integer.class), Mockito.any(Integer.class));
	}
	
	@Test(expected = InvalidInputException.class)
	public void testInvalidInputNegativeHours() throws InvalidInputException {
		
		timeConverter.convertTime("-1:2:2");
	}
	
	@Test(expected = InvalidInputException.class)
	public void testInvalidInputTimeMoreThan240000() throws InvalidInputException {
		
		timeConverter.convertTime("24:2:2");
	}

	@Test(expected = InvalidInputException.class)
	public void testInvalidInputNegativeMinutes() throws InvalidInputException {
		
		timeConverter.convertTime("00:-1:2");
	}
	
	@Test(expected = InvalidInputException.class)
	public void testInvalidInuputMinutesEqualsTo60() throws InvalidInputException {
		
		timeConverter.convertTime("2:60:2");
	}
	
	@Test(expected = InvalidInputException.class)
	public void testInvalidInuputMinutesMoreThan60() throws InvalidInputException {

		timeConverter.convertTime("2:61:2");
	}
	
	@Test(expected = InvalidInputException.class)
	public void testInvalidInputNegativeSeconds() throws InvalidInputException {
		
		timeConverter.convertTime("00:00:-1");
	}

	@Test(expected = InvalidInputException.class)
	public void testInvalidInputSecondsEqualsTo60() throws InvalidInputException {
		
		timeConverter.convertTime("2:59:60");
	}
	
	@Test(expected = InvalidInputException.class)
	public void testInvalidInputSecondsMoreThan60() throws InvalidInputException {
		
		timeConverter.convertTime("2:59:61");
	}
}
