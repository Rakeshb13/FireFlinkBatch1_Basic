package WorkingWithWebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithNavigate {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		//To perform back
		driver.navigate().back();
		Thread.sleep(3000);
		System.out.println("FlipKart :"+driver.getTitle());
		//To perform forward
		driver.navigate().forward();
		Thread.sleep(3000);
		System.out.println("amazon :"+driver.getTitle());
		//To perform refresh
		driver.navigate().refresh();
		
		

	}

}
