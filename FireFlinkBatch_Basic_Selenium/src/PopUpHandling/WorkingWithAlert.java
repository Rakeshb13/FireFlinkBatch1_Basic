package PopUpHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithAlert {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		//TO change the driver focus to alert pop-up
		Alert alert = driver.switchTo().alert();
		//TO fetch the alert message
		String message=alert.getText();
		System.out.println(message);
		//TO click on OK button
		alert.accept();
		
	}

}
