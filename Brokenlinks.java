package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Brokenlinks{
	public static void main(String []args){
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.chase.com");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("links"+links.size());
		for(WebElement link:links){
			System.out.println(link.getAttribute("href"));
		driver.close();
		driver.quit();
		}
	}
}