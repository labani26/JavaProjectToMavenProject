import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsSwitching {

    public static void main(String[] args) throws InterruptedException {

        // Launch Chrome
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Open website
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");

        // Click the blinking text (opens new window)
        driver.findElement(By.cssSelector(".blinkingText")).click();

        // Get all window IDs
        Set<String> windows = driver.getWindowHandles();

        // Create Iterator
      //Iterator helps us go through the Set one item at a time.
        Iterator<String> it = windows.iterator();

        // Parent and Child window IDs
        String parentId = it.next();
        String childId = it.next();

        // Switch to Child Window
        driver.switchTo().window(childId);

        // Get the paragraph text
        String text = driver.findElement(By.cssSelector(".im-para.red")).getText();

        System.out.println("Full Text: "+text);

        // Extract email
        String email = text.split("at")[1].trim().split(" ")[0];

        System.out.println("Extracted Email: " + email);

        // Switch back to Parent Window
        driver.switchTo().window(parentId);

        // Enter email in Username field
        driver.findElement(By.id("username")).sendKeys(email);

        // Wait for 3 seconds so you can see the result
        Thread.sleep(3000);

        // Close browser
        driver.quit();
    }
}

//Code download
//package demo;
//import java.util.Iterator;
//import java.util.Set;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class WIndowHandles {
//
//public static void main(String[] args) {
//
//// TODO Auto-generated method stub
//
//System.setProperty("webdriver.chrome.driver", "/Users/rahulshetty/Downloads/chromedriver");
//
//WebDriver driver = new ChromeDriver();
//
//driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
//
//driver.findElement(By.cssSelector(".blinkingText")).click();
//
//Set<String> windows = driver.getWindowHandles(); //[parentid,childid,subchildId]
//
//Iterator<String>it = windows.iterator();
//
//String parentId = it.next();
//
//String childId = it.next();
//
//driver.switchTo().window(childId);
//
//System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
//
//driver.findElement(By.cssSelector(".im-para.red")).getText();
//
//String emailId= driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
//
//driver.switchTo().window(parentId);
//
//driver.findElement(By.id("username")).sendKeys(emailId);
//
//
//}
//
//}
//
