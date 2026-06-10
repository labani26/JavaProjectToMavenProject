import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocatorSet {

    public static void main(String[] args) {

        // Launch Chrome
        WebDriver driver = new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
        // Maximize the browser
        driver.manage().window().maximize();

        // Open the website
        driver.get("https://www.facebook.com/");

        // Create an explicit wait
        

        // Click the signup/login button
//        wait.until(ExpectedConditions.elementToBeClickable(
//                By.xpath("//*[@id=\"hamburger-menu\"]/li[7]/a")))
//                .click();

        // Wait until the Name field is visible
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));


        // Enter Email
        driver.findElement(By.name("email"))
                .sendKeys("mail2labanisardar@gmail.com");

        
        driver.findElement(By.name("pass")).sendKeys("123456");
        
        driver.findElement(By.className("html-div")).click();
        
        System.out.println(driver.findElement(By.linkText("The password you've entered is incorrect")).getText());
        
        driver.findElement(By.linkText("Forgotten password?")).click();
        
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mail2labanisardar@gmail.com");
        
        driver.findElement(By.className("x78zum5")).click();
        

        
        // Close browser (optional)
        // driver.quit();
    }
}