import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class MenuTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "/Users/pauladabrowska/Documents/kurs_tester/automation_tester/Webdrivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://localhost:3000/pl");

        WebElement elementMainPage = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/nav/a[1]"));
        WebElement elementBlog = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/nav/a[2]"));
        WebElement elementSupport = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/nav/a[3]"));
        String textMainPage = elementMainPage.getText();
        String textBlog = elementBlog.getText();
        String textSupport = elementSupport.getText();

        if (textMainPage.contains("Strona")) {
            System.out.println("Pierwszy element menu - ok");
        } else {
            System.out.println("Pierwszy element menu nie zawiera odpowiedniego słowa");
        }

        if (textBlog.contains("Blog")) {
            System.out.println("Drugi element menu - ok");
        } else {
            System.out.println("Drugi element menu nie zawiera odpowiedniego słowa");
        }

        if (textSupport.contains("Wsparcie")) {
            System.out.println("Trzeci element menu - ok");
        } else {
            System.out.println("Trzeci element menu nie zawiera odpowiedniego słowa");
        }

        if (elementMainPage.isEnabled()) {
            System.out.println("Przycisk Strona główna jest nieaktywny - ok");
        }

       if (elementBlog.isEnabled()) {
           System.out.println("Przycisk Blog jest aktywny - ok");
       }

       if (elementSupport.isEnabled()) {
           System.out.println("Przycisk Wsparcie jest aktywny - ok");
       }

       WebElement elementGithub = driver.findElement(By.cssSelector("#__next > div.bg-pattern.min-h-full.overflow-x-hidden > div.mx-auto.flex.max-w-7xl.items-center.py-8.px-8 > nav > a:nth-child(4) > svg"));
       if (elementGithub.isEnabled()) {
           System.out.println("Przycisk Githubu jest aktywny - ok");
       }

       elementBlog.click();
       String currentUrl = driver.getCurrentUrl();
       if (currentUrl.equals("https://rallly.co/pl/blog")) {
           System.out.println("Przycisk Blog przenosi na odpowiedni adres url - ok");
       }

        driver.quit();


    }}