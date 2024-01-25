package WorkingWithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		//Locating the Webelement by using name locator
		driver.findElement(By.name("Gender")).click();
		
		driver.findElement(By.name("FirstName")).sendKeys("Rakesh");

	}

}
