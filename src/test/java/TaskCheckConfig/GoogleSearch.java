package TaskCheckConfig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "/Users/pauladabrowska/Documents/kurs_tester/automation_tester/Webdrivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:3000/pl");

        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.equals("http://localhost:3000/pl")) {
            System.out.println("Adres URL jest poprawny");
        }

        driver.quit();

    }

}