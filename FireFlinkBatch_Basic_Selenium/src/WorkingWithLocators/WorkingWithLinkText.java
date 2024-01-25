package WorkingWithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithLinkText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//Locating the web element by using link text locator
		driver.findElement(By.linkText("Register")).click();
		
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.close();
		
	}

}
