package WorkingWithActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testpages.eviltester.com/styled/drag-drop-javascript.html");
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		
		WebElement source = driver.findElement(By.xpath("//div[@id='draggable1']//p[text()='Drag me']"));
		WebElement target = driver.findElement(By.xpath("//p[text()='Drop here']"));
		
		//act.dragAndDrop(source, target).perform();
		
//		act.moveToElement(source).clickAndHold().build().perform();
//		act.moveToElement(target).release().build().perform();
		
		act.clickAndHold(source).release(target).perform();

	}

}
