package com.ubs.opsit.interviews;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ubs.opsit.interviews.berlinclock.BerlinUhrClock;
import com.ubs.opsit.interviews.exceptions.InvalidInputException;

public class BerlinTimeConverter implements TimeConverter {

	private static Logger LOG = LoggerFactory.getLogger(BerlinTimeConverter.class);
	private static final String EXCEPTION_MSG = "Please provide input in HH:mm:ss format with valid values";

	@Override
	public String convertTime(String aTime) throws InvalidInputException {

		try {

			String[] datePart = aTime.split(":");
			
			if(datePart.length != 3) throw new InvalidInputException(EXCEPTION_MSG);
			
			Integer hours = Integer.parseInt(datePart[0]);
			Integer minutes = Integer.parseInt(datePart[1]);
			Integer seconds = Integer.parseInt(datePart[2]);
			
			if(LOG.isDebugEnabled()) {
				
				LOG.debug("Parsed date input parts are Hours: {}, Minutes: {}, Seconds: {}", hours, minutes, seconds);
			}
			
			validateInput(hours, minutes, seconds);
						
			return new BerlinUhrClock(hours, minutes, seconds).getBerlinClockTime();
						
		} catch (Exception e) {
			
			LOG.error(EXCEPTION_MSG + ", " + e.getMessage(), e);
			throw e;
		}
	}

	private void validateInput(Integer hours, Integer minutes, Integer seconds) throws InvalidInputException {
		
		if(checkTimeIsMoreThan240000(hours, minutes, seconds)) 
			throw new InvalidInputException(EXCEPTION_MSG + ", time can't be more than 24:00:00");
		
		if(hours != 24 && (hours < 0 || hours > 23 || minutes < 0 || minutes > 59 || seconds < 0 || seconds > 59))
			throw new InvalidInputException(EXCEPTION_MSG + ", invalid time");
	}

	private boolean checkTimeIsMoreThan240000(Integer hours, Integer minutes, Integer seconds) {
		return hours == 24 && minutes > 0 && seconds > 0;
	}
}
