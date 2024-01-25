package PopUpHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithPrompt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		driver.switchTo().alert().sendKeys("Selenium is Boring");
		
		driver.switchTo().alert().accept();
		
		String finalResult=driver.findElement(By.id("result")).getText();
		System.out.println(finalResult);
		
		driver.close();
		
		

	}

}
