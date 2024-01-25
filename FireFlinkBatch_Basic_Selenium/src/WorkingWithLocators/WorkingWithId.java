package WorkingWithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithId {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("Rakesh@gmail.com");
		
		WebElement passwordTextFeild=driver.findElement(By.id("pass"));
		passwordTextFeild.sendKeys("Password@123");
		
		driver.findElement(By.id("u_0_5_5+")).click();
	}

}
