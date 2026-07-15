import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RealRellativeLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://rahulshettyacademy.com/angularpractice/");
        
        WebElement nameEditBox = driver.findElement(By.cssSelector("[name='name']"));
        
        nameEditBox.sendKeys("Labani Sardar");
        
      WebElement Above = driver.findElement(with(By.tagName("label")).above(nameEditBox));
      
      System.out.println(Above.getText());
      
     //String text = Above.getText();
      //System.out.println(text);
      
      WebElement DateOfBirth = driver.findElement(By.cssSelector("[for='dateofBirth']"));
      
      driver.findElement(with(By.tagName("input")).below(DateOfBirth)).click();
      
      WebElement iceCreamLabel = driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
      
      driver.findElement(with(By.tagName("input")).toLeftOf(iceCreamLabel)).click();

      WebElement RadioButton = driver.findElement(By.id("inlineRadio1"));

      System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(RadioButton)).getText());
      
      driver.quit();
      
	}

}
