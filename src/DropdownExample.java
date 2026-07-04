//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        
        driver.findElement(By.id("autocomplete")).sendKeys("India");
        
//       Thread.sleep(3000);
//       List<WebElement> options = driver.findElements(By.cssSelector(".ui-menu-item-wrapper"));
//       
//       for(WebElement OtherOptions : options) {
//    	   
//    	   if(OtherOptions.getText().contains("India")) {
//    		   
//   		   OtherOptions.click();
//    		   System.out.println(OtherOptions.getAttribute("value"));
//   		   
//   	   }    	   
//      }
        
      driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);       
       driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);       
      System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
	}

}


//Complete the Assignment and post the working code here.
//
//import org.openqa.selenium.By;
//
//import org.openqa.selenium.Keys;
//
//import org.openqa.selenium.WebDriver;
//
//import org.openqa.selenium.WebElement;
//
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import org.openqa.selenium.support.ui.ExpectedConditions;
//
//import org.openqa.selenium.support.ui.Select;
//
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//public class Assignment {
//
//
//
//public static void main(String[] args) throws InterruptedException {
//
//// TODO Auto-generated method stub
//
//
//
//System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
//
//
//    WebDriver driver = new ChromeDriver();
//
//    driver.get("http://qaclickacademy.com/practice.php");
//
//    driver.findElement(By.id("autocomplete")).sendKeys("ind");
//
//    Thread.sleep(2000);
//
//    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
//
//    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
//
//   System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value")); 
//  
//
//}
//
//}