import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover {

    public static void main(String[] args) {

        // Launch Chrome
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open Amazon
        driver.get("https://www.amazon.in/");

        // Create Actions object
        Actions actions = new Actions(driver);

        // Locate "Account & Lists" menu
        WebElement accountList = driver.findElement(By.id("nav-link-accountList-nav-line-1"));

        // Hover over "Account & Lists"
        actions.moveToElement(accountList).build().perform();

        // Locate search box
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));

        // Click the search box and type in uppercase
        actions.moveToElement(searchBox)
               .click()
               .keyDown(Keys.SHIFT)
               .sendKeys("hello kitty")
               .keyDown(Keys.CONTROL).sendKeys("a")
               .build()
               .perform();

        // Close the browser (optional)
         driver.quit();
    }
}