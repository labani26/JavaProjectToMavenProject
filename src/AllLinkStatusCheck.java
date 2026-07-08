import java.net.HttpURLConnection;
import java.net.URI;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinkStatusCheck {

    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        // Get all footer links
        List<WebElement> links = driver.findElements(By.cssSelector("li.gf-li a"));

        // Check each link
        for (WebElement link : links) {

            String url = link.getAttribute("href");

            HttpURLConnection connection =
                    (HttpURLConnection) new URI(url).toURL().openConnection();

            connection.setRequestMethod("HEAD");
            connection.connect();

            int responseCode = connection.getResponseCode();

            if (responseCode >= 400) {
                System.out.println(link.getText() + " --> Broken Link (" + responseCode + ")");
            } else {
                System.out.println(link.getText() + " --> Working Link (" + responseCode + ")");
            }

            connection.disconnect();
        }

        driver.quit();
    }
}