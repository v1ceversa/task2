package by.epam.task2.constant;

import java.util.regex.Pattern;

public class CommonConstants {
	
	//constant for plane class
	public static final String TYPE_OF_PLANE 	= "(Airliner|CargoPlane)";
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
	public static final String INT_REGEX = "\\d+[Ll]?";
	public static final String TOKEN = "(?<=\\s+|^).+?(?=\\s+|$)";
	public static final String VALID_AIRLINER = AIRLINER + "\\s+.+?(\\s+\\d+[Ll]?){2}\\s+.+?\\s+\\d+[lL]?$";
	public static final String VALID_CARGO_PLANE = CARGO_PLANE + "\\s+.+?(\\s+\\d+[lL]?){3}$";
	public static final String VALID_PLANE = "(" + VALID_AIRLINER + ")|(" + VALID_CARGO_PLANE+")";
	public static final String SEARCH_START		= "(?<=";
	public static final String SEARCH_END		= ").+?(?=([\\w_]+?:)|$)";
	
	
	public static final Pattern tokenPat = Pattern.compile(TOKEN);
	
}
