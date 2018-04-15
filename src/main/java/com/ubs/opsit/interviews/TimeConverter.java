package com.ubs.opsit.interviews;

import com.ubs.opsit.interviews.exceptions.InvalidInputException;

public interface TimeConverter {

    String convertTime(String aTime) throws InvalidInputException;

}
