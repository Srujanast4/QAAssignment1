package AmazonApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class loginpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.amazon.com/ap/signin?_encoding=UTF8&openid.assoc_handle=usflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_signin");
        driver.findElement(By.id("ap_email")).sendKeys("prathyusham0001@gmail.com");
        driver.findElement(By.id("ap_password")).sendKeys("1prathyushA");
        driver.findElement(By.id("signInSubmit")).click();
        Select s= new Select(driver.findElement(By.id("searchDropdownBox")));
        s.selectByVisibleText("Cell Phones & Accessories");
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("ipad");
driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input")).click();
driver.findElement(By.xpath(".//*[@id='result_0']/div/div/div/div[2]/div[2]/a/h2")).click();
driver.findElement(By.id("add-to-cart-button")).click();
driver.findElement(By.id("siNoCoverage-announce")).click();
driver.findElement(By.id("nav-cart")).click();
driver.findElement(By.xpath(".//*[@id='sc-buy-box-ptc-button']/span/input")).click();
	}

}
