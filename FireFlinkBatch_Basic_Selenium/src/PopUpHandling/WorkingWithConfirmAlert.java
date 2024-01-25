package PopUpHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithConfirmAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		//To click on Cancel
		alt.dismiss();
		
		String finalResult=driver.findElement(By.id("result")).getText();
		System.out.println(finalResult);
		driver.close();
	}

}
