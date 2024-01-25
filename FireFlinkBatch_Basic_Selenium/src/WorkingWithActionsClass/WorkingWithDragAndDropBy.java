package WorkingWithActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithDragAndDropBy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("Bags",Keys.ENTER);
		
		WebElement point1 = driver.findElement(By.xpath("//div[@class='_31Kbhn _28DFQy']//div[@class='_3FdLqY']"));
	
		Actions act = new Actions(driver);
		act.dragAndDropBy(point1, 50, 0).perform();
		WebElement point2 = driver.findElement(By.xpath("//div[@class='_31Kbhn WC_zGJ']//div[@class='_3FdLqY']"));
		act.dragAndDropBy(point2, -50, 0).perform();
		
		
	}

}
