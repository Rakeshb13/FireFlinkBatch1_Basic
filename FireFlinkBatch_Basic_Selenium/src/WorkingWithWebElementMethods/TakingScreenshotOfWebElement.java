package WorkingWithWebElementMethods;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakingScreenshotOfWebElement {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		
		WebElement textFeild = driver.findElement(By.id("location"));
		//To take the screenshot of web element
		File src=textFeild.getScreenshotAs(OutputType.FILE);
		File trg = new File("./ScreenShot/swiggy.png");
		FileHandler.copy(src, trg);
		
		driver.close();

	}
}