package WorkingWithWebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetCssValue {

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
		String font=driver.findElement(By.xpath("//div[@class='validation-summary-errors']")).getCssValue("font");
		System.out.println("font : "+font);
		String color=driver.findElement(By.xpath("//div[@class='validation-summary-errors']")).getCssValue("color");
		System.out.println("color : "+color);
		driver.close();
	}

}
