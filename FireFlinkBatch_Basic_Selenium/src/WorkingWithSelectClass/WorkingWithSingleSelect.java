package WorkingWithSelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithSingleSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
		Thread.sleep(3000);
		WebElement dropDown = driver.findElement(By.id("drop1"));
		
		Select select = new Select(dropDown);
		//Selecting the option by using index number
		select.selectByIndex(3);//doc 3
		Thread.sleep(3000);
		//Selecting the options by using value
		select.selectByValue("abc");//older new letter
		Thread.sleep(3000);
		//Selecting the option by using visible text
		select.selectByVisibleText("doc 4");//doc 4
		
		//To fetch all the options from Drop down
		List<WebElement> allOptions = select.getOptions();
		
		for(WebElement option : allOptions)
		{
			System.out.println(option.getText());
		}
		
		
	}

}
