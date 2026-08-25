

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cwh_03_BrowserNav {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.navigate().to("https://github.com/");
        Thread.sleep(4000);
        driver.navigate().back();
//        driver.navigate().forward();
    }
}
