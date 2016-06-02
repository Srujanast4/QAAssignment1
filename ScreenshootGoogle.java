package basics;
 import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.firefox.FirefoxDriver;;
public class ScreenshootGoogle {
 public static void main(String []args) throws IOException{
	WebDriver driver= new FirefoxDriver();

    driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

	driver.get("https://www.google.com");
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("E:\\DOCUMENTS\\new\\snap.png"));
	driver.close();
}
}