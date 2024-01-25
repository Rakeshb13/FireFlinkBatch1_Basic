package WorkingWithWebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToUrl {

	public static void main(String[] args) throws InterruptedException {
		//To launch the browser
		WebDriver driver = new ChromeDriver();
		//To navigate to url
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.get("https://www.amazon.in/");
		
		

	}

}
