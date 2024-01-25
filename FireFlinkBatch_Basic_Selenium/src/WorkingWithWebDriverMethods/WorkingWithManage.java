package WorkingWithWebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithManage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		//To maximize the browser
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		//To full screen browser
		driver.manage().window().fullscreen();
		//To minimize the browser
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}

}
