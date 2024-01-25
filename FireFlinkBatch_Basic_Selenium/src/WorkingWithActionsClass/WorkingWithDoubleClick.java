package WorkingWithActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithDoubleClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/product.php?product=doc");
		Thread.sleep(2000);
		Actions act  = new Actions(driver);
		WebElement target = driver.findElement(By.id("add"));
		act.doubleClick(target).perform();
		Thread.sleep(2000);
		act.doubleClick(target).perform();
		Thread.sleep(2000);
		act.doubleClick(target).perform();
		Thread.sleep(2000);
		
		WebElement minus = driver.findElement(By.id("minus"));
		act.doubleClick(minus).perform();
		Thread.sleep(2000);
		act.doubleClick(minus).perform();
		Thread.sleep(2000);
		act.doubleClick(minus).perform();
	}

}
