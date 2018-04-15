package com.ubs.opsit.interviews.berlinclock;

import java.util.Arrays;

class MinutesIndicator {

	private static final char OFFLAMP = 'O';
	private static final char YELLOWLAMP = 'Y';
	private static final char REDLAMP = 'R';
	
	private final char[] firstRow = new char[11];
	private final char[] secondRow = new char[4];
	
	public MinutesIndicator(int minutes) {
		
		Arrays.fill(firstRow, OFFLAMP);
		Arrays.fill(secondRow, OFFLAMP);
		
		calculateFirstRow(minutes);
		calculateSecondRow(minutes);
	}

	private void calculateFirstRow(int minutes) {
		for(int i = 0; i < minutes / 5; i++) {
			firstRow[i] = (i+1) % 3 == 0 ? REDLAMP : YELLOWLAMP;
		}
	}

	private void calculateSecondRow(int minutes) {
		for(int i = 0; i < minutes % 5; i++) {
			secondRow[i] = YELLOWLAMP;
		}		
	}
	
	public char[] getFirstRow() {
		return firstRow;
	}
	
	public char[] getSecondRow() {
		return secondRow;
	}
}
