package finaldemo;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjectModel.HomePageObject;
import PageObjectModel.Loginpageobject;
import Resources.Baseclass;

public class Logintestcase extends Baseclass {
	@Test (dataProvider="getData")
	public void basepagenavigation(String username, String Passwords) throws IOException {

		driver = initialisedriver(); // we used methodname of base class
		driver.get("https://www.rahulshettyacademy.com/");

		HomePageObject HPO = new HomePageObject(driver);
		HPO.clicksignin().click();

		Loginpageobject LPO = new Loginpageobject(driver);

		LPO.enterusername().sendKeys(username);
		LPO.enterpassword().sendKeys(Passwords);
		LPO.enterloginbutton().click(); 

	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[2][2]; // 2row 2 colmn
		data[0][0] = "test@1";
		data[0][1] = "vilas123";
		data[1][0] = "test@2";
		data[1][1] = "villz123";
		return data;
	}
}
