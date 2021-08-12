package restAssuredTests;

import org.apache.commons.lang3.RandomStringUtils;

public class RestUtils {

	public static String getFirstName() {
		String generetedString = RandomStringUtils.randomAlphabetic(1);
		return("Jim"+generetedString);
		
	}
	
	public static String getLastName() {
		String generetedString = RandomStringUtils.randomAlphabetic(1);
		return("Brown"+generetedString);
		
	}
	
	
}
