import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Relativelocator {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://selectorshub.com/xpath-practice-page/");

        // Debug information
        System.out.println("Title : " + driver.getTitle());
        System.out.println("URL   : " + driver.getCurrentUrl());
        System.out.println("Contains shub86 : " + driver.getPageSource().contains("shub86"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        // Wait until the Email textbox is visible
        WebElement test = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("shub86")));

        // Label above the Email textbox
        WebElement label = driver.findElement(
                with(By.tagName("label")).above(test));

        System.out.println("Label above Email : " + label.getText());

        driver.quit();
    }
}