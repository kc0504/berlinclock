package com.ubs.opsit.interviews.berlinclock;

import java.util.Arrays;

class HoursIndicator {

	private static final char OFFLAMP = 'O';
	private static final char REDLAMP = 'R';
	
	private final char[] firstRow = new char[4];
	private final char[] secondRow = new char[4];
	
	public HoursIndicator(int hours) {
		
		//init lamp with off values
		Arrays.fill(firstRow, OFFLAMP);
		Arrays.fill(secondRow, OFFLAMP);
		
		//switch on the required lamps as per input
		switchOnFirstRowLamps(hours);
		switchOnSecondRowLamps(hours);
	}

	private void switchOnFirstRowLamps(int hours) {
		for(int i = 0; i < hours / 5; i++) {
			firstRow[i] = REDLAMP;
		}
	}
	
	private void switchOnSecondRowLamps(int hours) {
		for(int i = 0; i < hours % 5; i++) {
			secondRow[i] = REDLAMP;
		}
	}
	
	public char[] getFirstRow() {
		return firstRow;
	}
	
	public char[] getSecondRow() {
		return secondRow;
	}
}
