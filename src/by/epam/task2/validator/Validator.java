package by.epam.task2.validator;

import static by.epam.task2.constant.CommonConstants.*;

import java.util.regex.Matcher;

public class Validator {
	
	public static boolean isValid(String typeAndParam) {
		Matcher typeMat = typePat.matcher(typeAndParam);
		if (typeMat.find()) {
			switch (typeMat.group()) {
			
			case AIRLINER:
				return isAirlinerParamValid(typeAndParam);
			case CARGO_PLANE:
				return isCargoPlaneParamValid(typeAndParam);
				
			}
		}
		return false;
	}
	
	private static boolean isPlaneParamValid(String typeAndParam) {
		return isNameValid(typeAndParam) 
				&& isCostValid(typeAndParam) 
				&& isConsumptionValid(typeAndParam);
	}
	
	private static boolean isAirlinerParamValid(String typeAndParam) {
		return isPlaneParamValid(typeAndParam) 
				&& isSeatCapacityValid(typeAndParam) 
				&& isConveniencesValid(typeAndParam);
	}
	
	private static boolean isCargoPlaneParamValid(String typeAndParam) {
		return isPlaneParamValid(typeAndParam) 
				&& isWeightCapacityValid(typeAndParam);
	}
	
	private static boolean isStringValid(String param) {
		param = param.trim();
		return param != null && param != "";
	}
	
	private static boolean isInteger(String param) {
		param = param.trim();
		return param.matches(INTEGER_REGEX);
	}
	
	private static boolean isNameValid(String param) {
		Matcher nameMat = namePat.matcher(param);
		return (nameMat.find()) ? isStringValid(nameMat.group()) : false;
	}
	
	private static boolean isCostValid(String param) {
		Matcher costMat = costPat.matcher(param);
		return (costMat.find()) ? isInteger(costMat.group()) : false;
	}
	
	private static boolean isConsumptionValid(String param) {
		Matcher consumptionMat = consumptionPat.matcher(param);
		return (consumptionMat.find()) ? isInteger(consumptionMat.group()) : false;
	}
	
	private static boolean isConveniencesValid(String param) {
		Matcher conveniencesMat = conveniencesPat.matcher(param);
		return (conveniencesMat.find()) ? isStringValid(conveniencesMat.group()) : false;
	}
	
	private static boolean isSeatCapacityValid(String param) {
		Matcher seatCapacityMat = seatCapacityPat.matcher(param);
		return (seatCapacityMat.find()) ? isInteger(seatCapacityMat.group()) : false;
	}
	
	private static boolean isWeightCapacityValid(String param) {
		Matcher weightCapacityMat = weightCapacityPat.matcher(param);
		return (weightCapacityMat.find()) ? isInteger(weightCapacityMat.group()) : false;
	}
	
}
