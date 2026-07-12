import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class PaginationAndGetPrice {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

        driver.findElement(By.xpath("//th[@role='columnheader'][1]"));

        List<WebElement> tableRows = driver.findElements(By.xpath("//tr/td[1]"));

        List<String> tableList = tableRows.stream()
                .map(check -> check.getText())
                .collect(Collectors.toList());

        System.out.println(tableList);

        List<String> sortedList = tableList.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(sortedList);

//        Assert.assertEquals(tableList, sortedList);

        List<String> getPrice = tableRows.stream()
                .filter(check -> check.getText().contains("Rice"))
                .map(check -> getPriceVeggies(check))
                .collect(Collectors.toList());

        getPrice.forEach(check->System.out.println(check));
//forEach() doesn't return a List. It returns nothing (void).
        driver.quit();
    }

    public static String getPriceVeggies(WebElement check) {
        return check.findElement(By.xpath("following-sibling::td[1]")).getText();
    }
}


//Simple comparison
//map() expression	               Input (check)	     Output
//check -> check.toUpperCase()	    String        	something string which is already declared String
//check -> getPriceVeggies(check)	WebElement	    Price String which needs to extract