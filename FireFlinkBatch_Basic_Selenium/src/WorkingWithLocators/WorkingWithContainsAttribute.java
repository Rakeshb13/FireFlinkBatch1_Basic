package WorkingWithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithContainsAttribute {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys("Rakesh@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("asdfghjk");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		Thread.sleep(3000);
		
		//String message=driver.findElement(By.xpath("//div[contains(@class,'va')]")).getText();
		
		String a = driver.findElement(By.xpath("//span[contains(text(),'unsuccessful')]")).getText();
		
		System.out.println(a);
		
		driver.close();
		

	}

}
