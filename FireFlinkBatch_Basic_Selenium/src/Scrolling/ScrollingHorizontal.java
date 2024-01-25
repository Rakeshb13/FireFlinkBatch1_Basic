package Scrolling;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingHorizontal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(500,0);");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(500,0);");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(-500,0);");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(-500,0);");
		Thread.sleep(2000);
		driver.close();

	}

}
