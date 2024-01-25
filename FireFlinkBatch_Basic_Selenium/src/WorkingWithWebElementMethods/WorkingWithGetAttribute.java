package WorkingWithWebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetAttribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		
		WebElement emailTF = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));

		emailTF.sendKeys("myemailid@gmail.com");
		
		System.out.println(emailTF.getAttribute("value"));
		System.out.println(emailTF.getAttribute("class"));
		
		if(emailTF.getAttribute("value").equals("myemailid@gmail.com"))
		{
			System.out.println("pass..");
		}
		else
			System.out.println("fail...");
		
		driver.close();
		
	}

}
