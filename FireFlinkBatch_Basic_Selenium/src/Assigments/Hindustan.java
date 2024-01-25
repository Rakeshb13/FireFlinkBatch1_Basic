package Assigments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hindustan {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.hindustantimes.com/");
		
		driver.switchTo().frame("webpush-onsite");
		String message=driver.findElement(By.xpath("//div[@class='description']")).getText();
		System.out.println(message);
		driver.findElement(By.id("deny")).click();
		
		String a=driver.findElement(By.xpath("//div[@id='topnews']/section/div[2]/div[1]//h2[1]")).getText();
		System.out.println(a);
		
		driver.close();
	}
}
