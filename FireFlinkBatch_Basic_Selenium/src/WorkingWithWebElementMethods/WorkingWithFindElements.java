package WorkingWithWebElementMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithFindElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
//		driver.findElement(By.partialLinkText("Computers")).click();
//		
//		driver.findElement(By.xpath("//h2[@class='title']//a[@title='Show products in category Desktops']")).click();
//		
//		
//		List<WebElement> allProductsName = driver.findElements(By.xpath("//h2[@class='product-title']/a"));
//		
//		
//		for(WebElement productName : allProductsName)
//		{
//			System.out.println(productName.getText());
//		}
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		
		System.out.println(allLinks.size());
		
		for(WebElement link : allLinks)
		{
//			System.out.println(link.getText());
			if(link.getText().length()!=0)
			{
				System.out.println(link.getText());
			}
		}
		
		
		driver.close();

	}

}
