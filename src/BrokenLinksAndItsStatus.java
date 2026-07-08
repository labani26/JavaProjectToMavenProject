import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import jdk.internal.org.commonmark.node.Link;

public class BrokenLinksAndItsStatus {

	public static void main(String[] args) throws MalformedURLException, IOException, URISyntaxException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        
       //broken links
        //step - 1 ; to get all urls tied upto the links using selenium
        //java methods will call the urls and get you the status code
        //if status code > 400 then that urls is not working > links which tied to url is broken
        
        WebElement link = driver.findElement(By.cssSelector("a[href*='brokenlink']"));
        //- for particular brokenLink
        //getText() reads what the user sees.
        //getAttribute() reads the value of an HTML attribute.
        
        String url = link.getAttribute("href");
        
        HttpURLConnection connection = (HttpURLConnection)new URI(url).toURL().openConnection();
        //new URI(url)- Creates a URI object from the URL string.
        //.toURL() - Converts the URI object into a URL object.
        //.openConnection() - This opens a connection to the website,It does not send the request yet,It only prepares the connection.
//Imagine:
//
//Your Java Program
//        |
//        |  openConnection()
//        |
//Website (https://www.google.com)
        
        //HttpURLConnection - Since the URL is an HTTP/HTTPS website, we convert (cast) it to a more specific class:
        //HttpURLConnection has extra methods like
//setRequestMethod()
//getResponseCode()
//disconnect()
//that URLConnection doesn't provide, so HttpURLConnection is needed
        //HEAD - Get only headers
//        Method	Purpose
//        GET	Get webpage/data
//        POST	Send data
//        PUT	Update data
//        DELETE	Delete data
//        HEAD	Get only headers
        
        
        connection.setRequestMethod("HEAD");
        connection.connect();
        int resCode = connection.getResponseCode();
        System.out.println("Link Name - "+link.getText()+", Code : "+resCode);
        
        driver.quit();
	}

}
