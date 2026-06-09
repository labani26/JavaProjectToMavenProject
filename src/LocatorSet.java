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

        // Maximize the browser
        driver.manage().window().maximize();

        // Open the website
        driver.get("https://courses.rahulshettyacademy.com/");

        // Create an explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Click the signup/login button
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//*[@id=\"hamburger-menu\"]/li[7]/a")))
                .click();

        // Wait until the Name field is visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));


        // Enter Email
        driver.findElement(By.id("email"))
                .sendKeys("mail2labanisardar@gmail.com");

        // Click OTP button
        driver.findElement(By.id("otp-login-btn")).click();

        driver.get("https://mail.google.com/mail/u/0/#inbox");
        
        driver.manage().window().maximize();
        
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        driver.findElement(By.className("class=\"J-Ke n0\"")).click();
        
        
        // Close browser (optional)
        // driver.quit();
    }
}