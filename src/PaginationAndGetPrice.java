import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;

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

        List<String> getPrice;

        //do...while loop means: Run the code first, then check the condition. If the condition is true, run it again.
        //A while loop checks the condition before running.
//        With do...while:
//
//        	Search the current page.
//        	Create getPrice.
//        	Check whether it was found.
//        	If not found, go to the next page and repeat.
        do {

            // Refresh the table rows after every page load
            tableRows = driver.findElements(By.xpath("//tr/td[1]"));

            getPrice = tableRows.stream()
                    .filter(check -> check.getText().contains("Rice"))
                    .map(check -> getPriceVeggies(check))
                    .collect(Collectors.toList());

            getPrice.forEach(check -> System.out.println(check));
 
//while (getPrice.size() < 1) - Continue looping only while no Rice was found.
            	
//If size() is 0 → Rice not found → go to the next page.
//If size() is 1 or 2 or 3 → Rice found → stop.

//That's why the condition is < 1 (or equivalently isEmpty()), not == 2.Continue looping only while no Rice was found."

//If size() is 0 → Rice not found → go to the next page.
//If size() is 1 or 2 or 3 → Rice found → stop.

//That's why the condition is < 1 (or equivalently isEmpty()), not == 2.
            if (getPrice.size() < 1)
            {

                driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
            }

        } while (getPrice.size() < 1);

    }

    public static String getPriceVeggies(WebElement check) {
        return check.findElement(By.xpath("following-sibling::td[1]")).getText();
    }
}