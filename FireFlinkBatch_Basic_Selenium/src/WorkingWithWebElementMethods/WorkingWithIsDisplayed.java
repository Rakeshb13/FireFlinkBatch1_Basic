package WorkingWithWebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithIsDisplayed {

public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	
	driver.findElement(By.className("ico-login")).click();
	driver.findElement(By.id("Email")).sendKeys("Rakesh@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("asdfghjk");
	
	WebElement checkBox = driver.findElement(By.id("RememberMe"));
	System.out.println("Displayed : "+checkBox.isDisplayed());
	System.out.println("Enabled : "+checkBox.isEnabled());
	System.out.println("Selected1 : "+checkBox.isSelected());
	checkBox.click();
	System.out.println("Selected2 : "+checkBox.isSelected());
	driver.close();
	
	
	
}
}
