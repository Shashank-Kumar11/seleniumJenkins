package test;


import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.*;

public class BasicValidation extends BaseTest{
	

	@Test
	
	public void urlValidation() {
		String expectedUrl="https://www.facebook.com/";
		String actualUrl = driver.getCurrentUrl();
		assertTrue(expectedUrl.equals(actualUrl),"Mismatch in the page Url,");
	}

	

}
