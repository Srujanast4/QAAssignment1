package basics;



import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingPopups {
public static void main(String []args){
	
	WebDriver driver= new FirefoxDriver();
	driver.get("https://www.chase.com/");
	driver.manage().window().maximize();
String homepage=driver.getWindowHandle();
System.out.println(homepage);
driver.findElement(By.xpath(".//*[@id='DA_511841578661']/div[3]/div")).click();
String popuppage=driver.getWindowHandle();
System.out.println(popuppage);
Set<String>l=driver.getWindowHandles();
System.out.println(l.size());


}
}
