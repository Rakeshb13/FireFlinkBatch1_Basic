package WorkingWithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithForwardtraversing {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//ul[@class='top-menu']//a[contains(text(),'Books')]")).click();
	
		WebElement dropdown = driver.findElement(By.id("products-orderby"));
		
		Select s = new Select(dropdown);
		
		for(int i =0;i<=6;i++)
		{
			s.selectByIndex(i);
			Thread.sleep(2000);
			dropdown = driver.findElement(By.id("products-orderby"));
			s = new Select(dropdown);
			
		}
	
	}

}
