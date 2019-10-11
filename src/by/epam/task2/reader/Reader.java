package by.epam.task2.reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import by.epam.task2.validator.Validator;

public class Reader {
	
	public List<String> getVallidStrings(String filePath) {
		List<String> planes = new ArrayList<String>();
		try (BufferedReader in= new BufferedReader(new FileReader(filePath))){
		
			String supposedPlane = null;
			while ((supposedPlane = in.readLine()) != null) {
				if (Validator.isValid(supposedPlane)) {
					planes.add(supposedPlane);
				}
			}
		}
		//TODO log4j2
		catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		catch (IOException e2) {
			System.err.println("");
			e2.printStackTrace();
		}
		
		
		return planes;
	}
	
}
