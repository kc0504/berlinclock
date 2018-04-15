package com.ubs.opsit.interviews.berlinclock;

import java.util.Arrays;

public final class BerlinUhrClock {

	private static final char OFFLAMP = 'O';
	private static final char REDLAMP = 'R';
	private static final char YELLOWLAMP = 'Y';
	
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
		
		sb.append(secondsIndiator.firstRow);
		sb.append("\r\n");
		sb.append(hoursIndicator.secondRow);
		sb.append("\r\n");
		sb.append(hoursIndicator.thirdRow);
		sb.append("\r\n");
		sb.append(minutesIndicator.fourthRow);
		sb.append("\r\n");
		sb.append(minutesIndicator.fifthRow);
		
		return sb.toString();
	}
		
	static class SecondsIndicator {
		
		final char firstRow;
		
		public SecondsIndicator(Integer seconds) {
			
			firstRow = seconds % 2 == 0 ? YELLOWLAMP : OFFLAMP;
		}
	}
	
	static class HoursIndicator {
		
		final char[] secondRow = new char[4];
		final char[] thirdRow = new char[4];
		
		public HoursIndicator(int hours) {
			
			//init lamps with off values
			Arrays.fill(secondRow, OFFLAMP);
			Arrays.fill(thirdRow, OFFLAMP);
			
			//switch on the required lamps as per input
			switchOnSecondRowLamps(hours);
			switchOnThirdRowLamps(hours);
		}

		private void switchOnSecondRowLamps(int hours) {

			for(int i = 0; i < hours / 5; i++) {
				secondRow[i] = REDLAMP;
			}
		}
		
		private void switchOnThirdRowLamps(int hours) {
			
			for(int i = 0; i < hours % 5; i++) {
				thirdRow[i] = REDLAMP;
			}
		}
	}
	
	static class MinutesIndicator {
		
		final char[] fourthRow = new char[11];
		final char[] fifthRow = new char[4];
		
		public MinutesIndicator(int minutes) {
			
			//init lamps with off values
			Arrays.fill(fourthRow, OFFLAMP);
			Arrays.fill(fifthRow, OFFLAMP);
			
			//switch on the required lamps as per input
			switchOnFourthRowLamps(minutes);
			switchOnFifthRowLamps(minutes);
		}

		private void switchOnFourthRowLamps(int minutes) {
			
			for(int i = 0; i < minutes / 5; i++) {
				fourthRow[i] = (i+1) % 3 == 0 ? REDLAMP : YELLOWLAMP;
			}
		}

		private void switchOnFifthRowLamps(int minutes) {
			
			for(int i = 0; i < minutes % 5; i++) {
				fifthRow[i] = YELLOWLAMP;
			}		
		}
	}
}
