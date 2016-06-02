package basics;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;

public class Desiredcapabilities {

		// TODO Auto-generated method stub
	@BeforeTest
public void setup() throws MalformedURLException{
		{
			DesiredCapabilities d=DesiredCapabilities.firefox();
			d.setCapability("version", "5");
			d.setCapability("version","XP");
			
			
		WebDriver driver=new RemoteWebDriver(new URL("http://www.helloselenium.com/2013/10/what-is-desired-capabilities.html"),d);
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		}
	
	}

}
