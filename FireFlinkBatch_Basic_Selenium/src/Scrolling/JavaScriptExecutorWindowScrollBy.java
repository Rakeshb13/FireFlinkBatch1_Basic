package Scrolling;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorWindowScrollBy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.selenium.dev/");
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//down
		js.executeScript("window.scrollBy(0,500);");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,500);");
		Thread.sleep(3000);
		//up
		js.executeScript("window.scrollBy(0,-500);");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-500);");
		Thread.sleep(3000);
		driver.close();
		
		

	}

}
