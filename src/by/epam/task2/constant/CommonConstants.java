package by.epam.task2.constant;

import java.util.regex.Pattern;

public class CommonConstants {
	
	//constant for plane class
	public static final String TYPE_OF_PLANE 	= "(Airliner)|(CargoPlane)";
	public static final String NAME 			= "name:";
	public static final String COST				= "cost:";
	public static final String CONSUMPTION		= "consumption:";
	
	//constant for airliner
	public static final String AIRLINER			= "Airliner";
	public static final String CONVENIENCES		= "conveniences:";
	public static final String SEAT_CAPACITY	= "seat_capacity:";
	
	//constant for cargo plane
	public static final String CARGO_PLANE		= "CargoPlane";
	public static final String WEIGHT_CAPACITY	= "weight_capacity:";
	
	//finding constants
	public static final String SEARCH_START		= "(?<=";
	public static final String SEARCH_END		= ").+?(?=([\\w_]+?:)|$)";
	public static final String INTEGER_REGEX		= "\\d+[Ll]?";
	
	public static final Pattern typePat = Pattern.compile(TYPE_OF_PLANE);
	
	public static final Pattern namePat = Pattern.compile(SEARCH_START + NAME + SEARCH_END);

	public static final Pattern costPat = Pattern.compile(SEARCH_START + COST + SEARCH_END);

	public static final Pattern consumptionPat = Pattern.compile(SEARCH_START + CONSUMPTION + SEARCH_END);

	public static final Pattern seatCapacityPat = Pattern.compile(SEARCH_START + SEAT_CAPACITY + SEARCH_END);

	public static final Pattern conveniencesPat = Pattern.compile(SEARCH_START + CONVENIENCES + SEARCH_END);

	public static final Pattern weightCapacityPat = Pattern.compile(SEARCH_START + WEIGHT_CAPACITY + SEARCH_END);
	
	public static final Pattern integerPat = Pattern.compile(INTEGER_REGEX);
	
	
}
