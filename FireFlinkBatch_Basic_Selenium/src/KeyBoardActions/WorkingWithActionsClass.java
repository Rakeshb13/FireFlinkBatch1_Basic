package KeyBoardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithActionsClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/webhp");
		Thread.sleep(2000);
		driver.findElement(By.id("APjFqb")).click();
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		act.keyDown(Keys.SHIFT).sendKeys("selenium").perform();
		act.keyUp(Keys.SHIFT).perform();
		
		

	}

}
