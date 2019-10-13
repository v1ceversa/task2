package by.epam.task2.validator;

import static by.epam.task2.constant.CommonConstants.*;

public class Validator {
	
	public static boolean isValid(String typeAndParam) {
		return typeAndParam.matches(VALID_PLANE);
	}
	
}
