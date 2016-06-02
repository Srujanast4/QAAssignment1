package basics;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowSwitchDemo {
@Test
	public void SwitchChildWindow() throws InterruptedException{
		
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F");
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		String parent=	driver.getWindowHandle();
		System.out.println("before switching"+driver.getTitle());
		driver.findElement(By.xpath(".//*[@id='TosLink']")).click();
	Set<String>s1=	driver.getWindowHandles();
	s1.iterator();
	Iterator<String>i1=s1.iterator();
while(i1.hasNext()){
	String child=i1.next();
if(!parent.equalsIgnoreCase(child)){
	driver.switchTo().window(child);
	Thread.sleep(10000);	
System.out.println(driver.getTitle());	
}
}
driver.switchTo().window(parent);
System.out.println("After switching"+driver.getTitle());

}
			
	}


