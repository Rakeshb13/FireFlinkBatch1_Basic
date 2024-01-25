package WorkingWithSelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithMultiSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
		Thread.sleep(3000);
		
		WebElement dropDown = driver.findElement(By.xpath("//select[@id='multiselect1']"));
		
		Select select = new Select(dropDown);
		//To select by using index
		select.selectByIndex(3);
		Thread.sleep(2000);
		//To select by using value
		select.selectByValue("volvox");
		Thread.sleep(2000);
//		//To de select the option by using visible text
//		select.deselectByVisibleText("Audi");
//		Thread.sleep(2000);
//		//TO de select by using index
//		select.deselectByIndex(0);
		//To de select all the selected options
		select.deselectAll();
		Thread.sleep(2000);

		driver.close();
	}

}
