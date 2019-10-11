package by.epam.task2.parser;

import static by.epam.task2.constant.CommonConstants.*;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;

public class Parser {
	
	public static String getType(String typeAndParam) {
		Matcher typeMat = typePat.matcher(typeAndParam);
		return typeMat.find() ? typeMat.group() : "";
	}
	
	public static List<String> getParamList(String typeAndParam) {
		List<String> paramList = null;
		String type = getType(typeAndParam); 
		if (type != "") {
			paramList = new ArrayList<String>();
			switch (type) {
			
			case AIRLINER:
				setAirlinerParam(paramList, typeAndParam);
				break;
			case CARGO_PLANE:
				setCargoPlaneParam(paramList, typeAndParam);
				break;
			}
		}
		return paramList;
	}
	
	private static void setPlaneParam(List<String> paramList, String typeAndParam) {
		paramList.add(getName(typeAndParam));
		paramList.add(getCost(typeAndParam));
		paramList.add(getConsumption(typeAndParam));
	}
	
	private static void setAirlinerParam(List<String> paramList, String typeAndParam) {
		setPlaneParam(paramList, typeAndParam);
		paramList.add(getConveniences(typeAndParam));
		paramList.add(getSeatCapacity(typeAndParam));
	}
	
	private static void setCargoPlaneParam(List<String> paramList, String typeAndParam) {
		setPlaneParam(paramList, typeAndParam);
		paramList.add(getWeightCapacity(typeAndParam));
	}
	
	private static String getName(String param) {
		Matcher nameMat = namePat.matcher(param);
		return (nameMat.find()) ? nameMat.group().trim() : "";
	}
	
	private static String getCost(String param) {
		Matcher costMat = costPat.matcher(param);
		return (costMat.find()) ? costMat.group().trim() : "";
	}
	
	private static String getConsumption(String param) {
		Matcher consumptionMat = consumptionPat.matcher(param);
		return (consumptionMat.find()) ? consumptionMat.group().trim() : "";
	}
	
	private static String getConveniences(String param) {
		Matcher conveniencesMat = conveniencesPat.matcher(param);
		return (conveniencesMat.find()) ? conveniencesMat.group().trim() : "";
	}
	
	private static String getSeatCapacity(String param) {
		Matcher seatCapacityMat = seatCapacityPat.matcher(param);
		return (seatCapacityMat.find()) ? seatCapacityMat.group().trim() : "";
	}
	
	private static String getWeightCapacity(String param) {
		Matcher weightCapacityMat = weightCapacityPat.matcher(param);
		return (weightCapacityMat.find()) ? weightCapacityMat.group().trim() : "";
	}
	
}

