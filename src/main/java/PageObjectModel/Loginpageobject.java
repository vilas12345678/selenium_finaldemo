package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpageobject {
	public WebDriver driver;
	By username=By.xpath("//input[@id='email']");
	
	By password=By.xpath("//input[@id='password']");
	By login=By.xpath("//input[@value='Log in']");
	
	public Loginpageobject(WebDriver driver2) {
		this.driver=driver2;
		
	}
	
	public WebElement enterusername() {
		return driver.findElement(username);
	
	}
	public WebElement enterpassword() {
		
		return driver.findElement(password);
	}
public WebElement enterloginbutton() {
		
		return driver.findElement(login);
	}

}
