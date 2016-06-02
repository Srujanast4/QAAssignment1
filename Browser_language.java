package basics;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;


public class Browser_language {

       public static void main(String[] args) {
              // TODO Auto-generated method stub
             
              FirefoxProfile profile=new FirefoxProfile();
              //Setting the browser language to de:germany
              profile.setPreference("intl.accept_languages","de");
              WebDriver driver;
              driver=new FirefoxDriver(profile);
              driver.get("http://www.google.com");

       }

}