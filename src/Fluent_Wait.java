import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluent_Wait {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/dynamic_loading");

        // Click on Example 1
        driver.findElement(By.linkText("Example 1: Element on page that is hidden")).click();

        // Click Start button
        driver.findElement(By.cssSelector("#start button")).click();

        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(3))
                .ignoring(NoSuchElementException.class);

        WebElement result = wait.until(new Function<WebDriver, WebElement>() {

            @Override
            public WebElement apply(WebDriver driver) {

                WebElement element = driver.findElement(By.cssSelector("#finish h4"));

                if (element.isDisplayed()) {
                    return element;
                }

                return null;
            }
        });

        System.out.println("Text displayed: " + result.getText());

        driver.quit();
    }
}