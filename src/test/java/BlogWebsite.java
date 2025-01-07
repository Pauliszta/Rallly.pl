import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlogWebsite {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "/Users/pauladabrowska/Documents/kurs_tester/automation_tester/Webdrivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://rallly.co/pl/blog");

        WebElement elementLoginIn = driver.findElement(By.cssSelector("body > div > header > div.flex.items-center.gap-4.sm\\:gap-8 > a.hover\\:text-primary.text-muted-foreground.hidden.rounded.text-sm.font-medium.hover\\:no-underline.hover\\:underline-offset-2.lg\\:inline-flex"));
        System.out.println(elementLoginIn);

        if (elementLoginIn.isEnabled()) {
            System.out.println("Przycisk Logowanie jest aktywny - ok");
        }

        WebElement elementGoToApp = driver.findElement(By.xpath("/html/body/div/header/div[2]/a[2]"));
        if (elementGoToApp.isEnabled()) {
            System.out.println("Przycisk Przekierowania do apliakcji jest aktywny - ok");
        }

        WebElement elementUpdateMoreInfo = driver.findElement(By.cssSelector("body > div > section > div > div > div > section > div > article:nth-child(1) > div.grow > h3 > a"));
        if (elementUpdateMoreInfo.isEnabled()) {
            System.out.println("Przycisk Więcej informacji o aktualizacji jest aktywny - ok");
        }
        String updateTitleOnList = elementUpdateMoreInfo.getText();
        System.out.println(updateTitleOnList);


//        elementUpdateMoreInfo.click();
        System.out.println(driver.getCurrentUrl());

//        WebElement updateTitle = driver.findElement(By.xpath("/html/body/div/section/div/div/div/div[1]/article/header/h1"));
//        System.out.println(updateTitle.getText());
//        if (updateTitleOnList.contains(updateTitle.getText())) {
//            System.out.println("Tytuł na liście i tytuł na stronie szczegółu aktulizacji są zgodne - ok");
//        }




        driver.quit();


    }
}
