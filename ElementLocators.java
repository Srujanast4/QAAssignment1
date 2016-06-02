package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver= new FirefoxDriver();
driver.get("https://accounts.google.com/AddSession?sacu=1&continue=https%3A%2F%2Fwww.google.com%2Fsearch%3Fq%3Dg%26ie%3Dutf-8%26oe%3Dutf-8&hl=en#identifier");
/*WebElement Email = driver.findElement(By.id("Email"));
Email.sendKeys("london");
Email.clear();*/
driver.findElement(By.id("Email")).sendKeys("USA");
driver.findElement(By.id("Email")).clear();

	}

}
