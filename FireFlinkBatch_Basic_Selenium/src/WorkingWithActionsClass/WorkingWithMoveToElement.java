package WorkingWithActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithMoveToElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.	sleep(5000);
		Actions act = new Actions(driver);
		
		WebElement electronics = driver.findElement(By.xpath("//span[text()='Electronics']"));
		
		act.moveToElement(electronics).perform();
		Thread.	sleep(3000);
		WebElement gaming = driver.findElement(By.xpath("//a[text()='Gaming']"));
		
		act.moveToElement(gaming).perform();
		Thread.sleep(3000);
		act.click().perform();
		
		act.click(gaming).perform();
		

	}

}
