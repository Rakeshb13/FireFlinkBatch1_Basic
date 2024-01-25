package WorkingWithActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithContextClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/webhp");
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		WebElement rightClickButton = driver.findElement(By.id("APjFqb"));
		
		act.moveToElement(rightClickButton).contextClick().perform();
		

	}

}
