package WorkingWithWebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithQuit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Selenium%20class%20files/Demo%20WebPage/Multiple%20Windows.html");
		
		driver.findElement(By.id("open-windows-button")).click();
		//Will close only main window
		driver.close();
		//Quit will close all the opened tabs and windows
		driver.quit();
	}

}
