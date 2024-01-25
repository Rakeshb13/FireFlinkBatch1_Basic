package PopUpHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithFileUploadPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com/");
	
		driver.findElement(By.id("register_Layer")).click();
		//To handle file upload pop-up by using sendKeys();
		//Check for type="file" Attribute
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\User\\Desktop\\Introduction To Selenium.pdf");
	}

}
