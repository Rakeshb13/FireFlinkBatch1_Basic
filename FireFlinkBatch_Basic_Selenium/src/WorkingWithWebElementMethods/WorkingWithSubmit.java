package WorkingWithWebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithSubmit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		WebElement searchTextFeild = driver.findElement(By.name("q"));
		searchTextFeild.sendKeys("iphone");
		searchTextFeild.submit();
		
		
		String price =driver.findElement(By.xpath("//div[text()='APPLE iPhone 15 (Blue, 128 GB)']/../../div[2]/div[1]/div/div[1]")).getText();

		System.out.println(price);
		driver.close();
	}

}
