package WorkingWithWebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithClose {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		//To close the browser
		//driver.close();
		driver.quit();
		
	}

}
