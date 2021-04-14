package andrej.p.com.selenium;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Main {
    public static void main(String[] args) {
        final int sleepTime = 3000;

        // Open chrome browser
        System.setProperty("webdriver.chrome.driver", "D://Selenium_jars_and_drivers/drivers/chrome/chromedriver.exe");
//        SearchContext chromeDriver = new ChromeDriver();
//        RemoteWebDriver chromeDriver = new ChromeDriver();
//        ChromeDriver chromeDriver = new ChromeDriver();
        WebDriver chromeDriver = new ChromeDriver();

        // Navigate to url
        chromeDriver.get("https://google.com");


        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close browser
        chromeDriver.close();

        // --------------------------------------------------
        System.setProperty("webdriver.gecko.driver", "D:/Selenium_jars_and_drivers/drivers/firefox/geckodriver.exe");
//        FirefoxDriver firefoxDriver = new FirefoxDriver();
        WebDriver firefoxDriver = new FirefoxDriver();

        firefoxDriver.get("https:google.com");

        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        firefoxDriver.close();

    }
}
