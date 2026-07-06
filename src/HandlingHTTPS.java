import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HandlingHTTPS {

    public static void main(String[] args) throws InterruptedException {

        // Chrome Options
        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);
        //Selenium ignores the SSL warning and opens the website.

        // Proxy (Optional)
        Proxy proxy = new Proxy();
        //A proxy server sits between your computer and the internet.

        //Instead of:
        //Your Computer
       //      ↓
       //Website

      //it becomes:
      //Your Computer
     //      ↓
     //Proxy Server
    //      ↓
    //Website
        
//        Many companies use proxies to:
//
//        	Monitor internet usage.
//        	Block certain websites.
//        	Hide users' IP addresses.
//        	Access internal applications.
        
        proxy.setHttpProxy("ipaddress:4444"); // Replace with actual proxy
        //"Whenever you access a website, first connect to the proxy server at ipaddress:4444."
        
        options.setProxy(proxy);
        //This tells Chrome to use the proxy settings you just created.

        // Download Directory (Optional)
        Map<String, Object> prefs = new HashMap<>();
        //A Map stores key-value pairs.
        
        prefs.put("download.default_directory", "C:\\Downloads");
        //prefs - Put a setting into prefs.
        //"download.default_directory" - means "Download Folder".
        //"C:\\Downloads"- means "Set the download folder to C:\Downloads."
        
        options.setExperimentalOption("prefs", prefs);
        //Here are your preferences. Use them when you start.

        // Firefox Options
        FirefoxOptions options1 = new FirefoxOptions();
        options1.setAcceptInsecureCerts(true);

        // Edge Options
        EdgeOptions options2 = new EdgeOptions();
        options2.setAcceptInsecureCerts(true);

        // Chrome
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://expired.badssl.com/");
        System.out.println("Chrome Title : " + driver.getTitle());

        Thread.sleep(2000);

        // Firefox
        WebDriver driver2 = new FirefoxDriver(options1);
        driver2.manage().window().maximize();
        driver2.get("https://expired.badssl.com/");
        System.out.println("Firefox Title : " + driver2.getTitle());

        Thread.sleep(2000);

        // Edge
        WebDriver driver3 = new EdgeDriver(options2);
        driver3.manage().window().maximize();
        driver3.get("https://expired.badssl.com/");
        System.out.println("Edge Title : " + driver3.getTitle());

        Thread.sleep(2000);

        driver.quit();
        driver2.quit();
        driver3.quit();
    }
}