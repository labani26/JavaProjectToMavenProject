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



//Code Download
//import org.openqa.selenium.By;
//
//import org.openqa.selenium.WebDriver;
//
//import org.openqa.selenium.WebElement;
//
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import static org.openqa.selenium.support.locators.RelativeLocator.*;
//
//public class RelativeLoc {
//
//public static void main(String[] args) {
//
//// TODO Auto-generated method stub
//
//System.setProperty("webdriver.chrome.driver", "/Users/rahulshetty/Documents/chromedriver");
//
//WebDriver driver=new ChromeDriver();
//
//driver.get("https://rahulshettyacademy.com/angularpractice/");
//
//WebElement nameEditBox =driver.findElement(By.cssSelector("[name='name']"));
//
//System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText());
//
//WebElement dateofBirth = driver.findElement(By.cssSelector("[for='dateofBirth']"));
//
//driver.findElement(with(By.tagName("input")).below(dateofBirth)).click();
//
//WebElement iceCreamLabel =driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
//
//driver.findElement(with(By.tagName("input")).toLeftOf(iceCreamLabel)).click();
//
//WebElement rdb = driver.findElement(By.id("inlineRadio1"));
//
//System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(rdb)).getText());
//
//
//}
//
//}
//
