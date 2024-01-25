package WorkingWithWebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFetchTheSourceCode {

	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		//To fetch the source code of web page
		String pageSource=driver.getPageSource();
		System.out.println(pageSource);
	}
}
