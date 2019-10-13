package by.epam.task2.reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.epam.task2.validator.Validator;

public class Reader {
	
	private static final Logger logger = LogManager.getLogger(Reader.class);
	
	public static List<String> getVallidStrings(String filePath) {
		logger.debug("Reader was called with this:" + filePath + " file path.");
		List<String> planes = null;
		try (BufferedReader in= new BufferedReader(new FileReader(filePath))) {
		
			String supposedPlane = null;
			boolean isPlanesInit = false;
			while ((supposedPlane = in.readLine()) != null) {
				if (Validator.isValid(supposedPlane)) {
					if (!isPlanesInit) {
						planes = new ArrayList<String>();
						isPlanesInit = true;
					}
					planes.add(supposedPlane);
				}
			}
		}
		//TODO log4j2
		catch (FileNotFoundException e1) {
			logger.error("your file path isn't valid, please check that" 
					+ " your file is exist and is file path is correct");
		}
		catch (IOException e2) {
			logger.error("Bad token is going though! Please send logs and file" 
					+ " that couses that error to support group: someref");
		}
		
		
		return planes;
	}
	
}
