package TestingSelenium;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.w3schools.com/");
		
		//driver.findElement(By.xpath(xpathExpression));
		//xpath
		//Start-with() ::: //input[@id(starts-with(),'search'
		//input[contains(@id,'search')]
	}

}
