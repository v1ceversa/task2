package by.epam.task2.parser;

import static by.epam.task2.constant.CommonConstants.*;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;

public class Parser {
	
	public static List<String> parse(String typeAndParam) {
		List<String> paramList = new ArrayList<String>();
		
		Matcher tokenMat = tokenPat.matcher(typeAndParam);
		
		while (tokenMat.find()) {
			paramList.add(tokenMat.group());
		}
		
		return paramList;
	}
		
}

