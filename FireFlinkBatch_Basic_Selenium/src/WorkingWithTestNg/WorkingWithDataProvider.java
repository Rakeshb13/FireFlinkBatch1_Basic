package WorkingWithTestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WorkingWithDataProvider {
	
	@Test(dataProvider = "loginData")
	public void testCase(String email, String password) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");

		// Step 3 : Clicking on Login button
		driver.findElement(By.linkText("Log in")).click();

		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		Thread.sleep(3000);
		driver.close();
	}
	
	
	@DataProvider(name="loginData")
	public Object[][] dataSupply()
	{
		Object [][] arr = new Object [4][2];
		arr[0][0]="Rakesh@gmail.com";
		arr[0][1]="Password";
		arr[1][0]="Chethan@gmail.com";
		arr[1][1]="Password";
		arr[2][0]="Keerthi@gmail.com";
		arr[2][1]="Password";
		arr[3][0]="Nuthan@gmail.com";
		arr[3][1]="Password";
		return arr;
	}
}