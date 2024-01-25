package Assigments;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://selenium08.blogspot.com/2019/11/selenium-iframe.html");
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div[@class='td-header-sp-recs']//a[text()='Free Mock Tests']")).click();
		
		Set<String> allIds = driver.getWindowHandles();
		
		for(String id : allIds)
		{
			driver.switchTo().window(id);
			if(driver.getTitle().equals("FreshersNow Test Series | 100% Free Mock Tests"))
			{
				break;
			}
			else
				driver.close();
		}
		
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-right']//a[text()=' Create Account']")).click();
		
		
		
	}

}
