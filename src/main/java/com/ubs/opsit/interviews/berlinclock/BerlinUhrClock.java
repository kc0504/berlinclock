package com.ubs.opsit.interviews.berlinclock;

public final class BerlinUhrClock {
	
	private final SecondsIndicator secondsIndiator;
	private final HoursIndicator hoursIndicator;
	private final MinutesIndicator minutesIndicator;
	
	public BerlinUhrClock(int hours, int minutes, int seconds) {
		
		secondsIndiator = new SecondsIndicator(seconds);
		hoursIndicator = new HoursIndicator(hours);
		minutesIndicator = new MinutesIndicator(minutes);
	}
	
	public String getBerlinClockTime() {
		
		StringBuffer sb = new StringBuffer();
		sb.append(secondsIndiator.getRow());
		sb.append("\r\n");
		sb.append(hoursIndicator.getFirstRow());
		sb.append("\r\n");
		sb.append(hoursIndicator.getSecondRow());
		sb.append("\r\n");
		sb.append(minutesIndicator.getFirstRow());
		sb.append("\r\n");
		sb.append(minutesIndicator.getSecondRow());
		
		return sb.toString();
	}
}
