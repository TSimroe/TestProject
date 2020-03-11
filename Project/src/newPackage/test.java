package newPackage;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
//import org.openqa.selenium.firefox.FirefoxDriver;
import newPackage.objects;
public class test {
    public static void main(String[] args) 
    {	String baseUrl = "http://the-internet.herokuapp.com/";
    	String expectedTitle = "Welcome to the-internet";
    	String actualTitle = "";
    	WebElement obj;

        System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
        System.setProperty("webdriver.chrome.silentOutput", "true");
        WebDriver driver = new ChromeDriver();
    	//System.setProperty("webdriver.gecko.driver", "F:\\geckodriver.exe");
    	//FirefoxDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
        obj = driver.findElement(By.xpath(objects.titleXpath));
        actualTitle = obj.getText();
     

       
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
      
        driver.close();
        System.exit(0);
    }
}