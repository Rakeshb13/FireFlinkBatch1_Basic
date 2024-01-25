package WorkingWithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithClassName {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.className("ico-login")).click();
		
		String loginPageTitle=driver.getTitle();
		
		if(loginPageTitle.equals("Demo Web Shop. Login"))
		{
			System.out.println("Pass..");
		}
		else
			System.out.println("Fail...");
		
		//Enter email, password and select the check box
		//click on login button
		//Verify home page is displayed or not

		Thread.sleep(3000);
		driver.close();		
	}

}
