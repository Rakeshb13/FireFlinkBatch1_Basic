package WorkingWithWebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.udemy.com/");
		
		
//		Dimension searchTF = driver.findElement(By.name("q")).getSize();
//		System.out.println(searchTF);
//		System.out.println("Height : "+searchTF.getHeight());
//		System.out.println("Width : "+searchTF.getWidth());
		
		Point searchTF = driver.findElement(By.name("q")).getLocation();
		System.out.println(searchTF);
		System.out.println("X : " +searchTF.getX());
		System.out.println("Y : " +searchTF.getY());
		
		Rectangle searchTF1 = driver.findElement(By.name("q")).getRect();
		System.out.println("=============================");
		System.out.println(searchTF1.getX());
		System.out.println(searchTF1.getY());
		System.out.println(searchTF1.getHeight());
		System.out.println(searchTF1.getWidth());
		
		driver.close();

	}

}
