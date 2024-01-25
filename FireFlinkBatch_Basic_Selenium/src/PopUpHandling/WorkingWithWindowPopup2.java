package PopUpHandling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithWindowPopup2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///D:/Selenium%20class%20files/Demo%20WebPage/Multiple%20Windows.html");
		
		driver.findElement(By.id("open-windows-button")).click();
		//To get the session id of all the opened tabs or windows
		Set<String> allIds = driver.getWindowHandles();
		
//		for(String id : allIds)
//		{
//			driver.switchTo().window(id);
//			driver.manage().window().maximize();
//			System.out.println(driver.getTitle());
//			Thread.sleep(3000);
//		}
		
		for(String id : allIds)
		{
			driver.switchTo().window(id);
			
			if(driver.getCurrentUrl().equals("https://www.apple.com/"))
			{
				driver.manage().window().maximize();
			}
			else
			{
				driver.close();
			}
			Thread.sleep(3000);
		}
		
	}
}
