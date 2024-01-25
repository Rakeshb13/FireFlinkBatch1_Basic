package WorkingWithWebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class ToFetchTheTitle {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.meesho.com/");
		//To fetch the title of the webPage.
		String title=driver.getTitle();
		System.out.println("title : "+title);
		//To fetch the url of the webpage.
		System.out.println("url : "+driver.getCurrentUrl());
		

	}

}
