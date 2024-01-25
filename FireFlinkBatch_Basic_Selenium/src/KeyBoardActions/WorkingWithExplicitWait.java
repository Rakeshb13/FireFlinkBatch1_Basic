package KeyBoardActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkingWithExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.shoppersstack.com/products_page/7");
		
		driver.findElement(By.id("Check Delivery")).sendKeys("560037");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("Check")));
		//wait.until(ExpectedConditions.));
		driver.findElement(By.id("Check")).click();
		
////		FluentWait fluentWait = new FluentWait(driver);
//		fluentWait.withTimeout(Duration.ofSeconds(10));
//		fluentWait.pollingEvery(Duration.ofSeconds(1));
//		fluentWait.ignoring(NoSuchElementException.class);
//		fluentWait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("asdfghj"))));
		

	}

}
