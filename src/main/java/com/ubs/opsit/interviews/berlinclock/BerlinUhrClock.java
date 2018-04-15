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
		
		sb.append(secondsIndiator.firstRowLamp);
		sb.append("\r\n");
		sb.append(hoursIndicator.secondRowLamps);
		sb.append("\r\n");
		sb.append(hoursIndicator.thirdRowLamps);
		sb.append("\r\n");
		sb.append(minutesIndicator.fourthRowLamps);
		sb.append("\r\n");
		sb.append(minutesIndicator.fifthRowLamps);
		
		return sb.toString();
	}
		
	static class SecondsIndicator {
		
		final char firstRowLamp;
		
		public SecondsIndicator(Integer seconds) {
			
			firstRowLamp = seconds % 2 == 0 ? YELLOWLAMP : OFFLAMP;
		}
	}
	
	static class HoursIndicator {
		
		final char[] secondRowLamps = new char[4];
		final char[] thirdRowLamps = new char[4];
		
		public HoursIndicator(int hours) {
			
			//init lamps with off values
			Arrays.fill(secondRowLamps, OFFLAMP);
			Arrays.fill(thirdRowLamps, OFFLAMP);
			
			//switch on the required lamps as per input
			switchOnSecondRowLamps(hours);
			switchOnThirdRowLamps(hours);
		}

		private void switchOnSecondRowLamps(int hours) {

			for(int i = 0; i < hours / 5; i++) {
				secondRowLamps[i] = REDLAMP;
			}
		}
		
		private void switchOnThirdRowLamps(int hours) {
			
			for(int i = 0; i < hours % 5; i++) {
				thirdRowLamps[i] = REDLAMP;
			}
		}
	}
	
	static class MinutesIndicator {
		
		final char[] fourthRowLamps = new char[11];
		final char[] fifthRowLamps = new char[4];
		
		public MinutesIndicator(int minutes) {
			
			//init lamps with off values
			Arrays.fill(fourthRowLamps, OFFLAMP);
			Arrays.fill(fifthRowLamps, OFFLAMP);
			
			//switch on the required lamps as per input
			switchOnFourthRowLamps(minutes);
			switchOnFifthRowLamps(minutes);
		}

		private void switchOnFourthRowLamps(int minutes) {
			
			for(int i = 0; i < minutes / 5; i++) {
				fourthRowLamps[i] = (i+1) % 3 == 0 ? REDLAMP : YELLOWLAMP;
			}
		}

		private void switchOnFifthRowLamps(int minutes) {
			
			for(int i = 0; i < minutes % 5; i++) {
				fifthRowLamps[i] = YELLOWLAMP;
			}		
		}
	}
}
