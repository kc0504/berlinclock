package com.ubs.opsit.interviews.berlinclock;

class SecondsIndicator {
	
	private static final char OFFLAMP = 'O';
	private static final char YELLOWLAMP = 'Y';
	private final char row;
	
	public SecondsIndicator(Integer seconds) {
	
		row = seconds % 2 == 0 ? YELLOWLAMP : OFFLAMP;
	}
	
	public char getRow() {
		return row;
	}
}
