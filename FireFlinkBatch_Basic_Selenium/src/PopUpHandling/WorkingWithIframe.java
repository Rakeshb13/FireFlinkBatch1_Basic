package PopUpHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithIframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/iframe");
		
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@title='Rich Text Area']"));
		driver.switchTo().frame(frameElement);
		String message=driver.findElement(By.xpath("//p[text()='Your content goes here.']")).getText();
		System.out.println(message);
		
		driver.switchTo().parentFrame();
		//driver.switchTo().defaultContent();

		driver.findElement(By.xpath("//span[text()='Edit']")).click();
		
		//driver.close();

	}

}
