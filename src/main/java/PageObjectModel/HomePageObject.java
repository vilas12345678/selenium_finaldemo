package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObject {
	public WebDriver driver;
By signin=By.xpath("//button[@class='btn btn-primary'] [2]");

public HomePageObject(WebDriver driver2) { // useed constructor
	// TODO Auto-generated constructor stub
	this.driver=driver2;
}

public WebElement clicksignin() {
	return driver.findElement(signin);
	
}

}
// whatevr xpath those writing in page objects

// whenevr we use page object then we havce tto use constructor