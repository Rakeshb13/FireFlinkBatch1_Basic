package LaunchingBrowsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingChromeBrowser {

	public static void main(String[] args) {
		//Key to launch the chrome browser
		String key="webdriver.chrome.driver";
		//Path of chromeDriver.exe file
		String path="./Drivers/chromedriver.exe";
		
		
	//	System.setProperty(key, path);
		//To launch the chrome browser
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https:www.google.co.in");
		
		
		
		
	}
	
	
}
