package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//some chnages need to be done for git only
public class Baseclass {
	public WebDriver driver;
	
	public WebDriver initialisedriver() throws IOException {
		// here declared webdriver publically 
		
	Properties prop = new Properties();
	
	FileInputStream fis= new FileInputStream(
			"C:\\Users\\sachin\\eclipse-workspace\\finaldemo\\src\\main\\java\\Resources\\Data.properties");
			
prop.load(fis);

prop.getProperty("Browser");

String Browsername=prop.getProperty("Browser");

if (Browsername.equals("chrome")) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sachin\\Desktop\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	 driver=new ChromeDriver();
}
else if (Browsername.equals("firefox")) {
	// firefox code paste here if chrome is not 
}
else {
	// internal external code
      }
return driver;
}
}