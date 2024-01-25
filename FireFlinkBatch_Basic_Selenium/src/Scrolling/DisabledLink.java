package Scrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledLink {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.oracle.com/java/technologies/downloads/");
		
		WebElement link = driver.findElement(By.xpath("//a[text()='jdk-8u391-linux-aarch64.rpm']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", link);
		Thread.sleep(2000);
		link.click();
		Thread.sleep(2000);
		WebElement disabledLink = driver.findElement(By.xpath("//a[text()='Download jdk-8u391-linux-aarch64.rpm']"));
		
		js.executeScript("arguments[0].click();", disabledLink);

	}

}
