import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.function.Function;

public class FluentWait_ {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

        driver.findElement(By.xpath("//div[@id='start']/button[text()='Start']")).click();

       Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchFieldError.class);

        WebElement web = wait.until(new Function<>() {
            @Override
            public WebElement apply(WebDriver driver) {
                if (driver.findElement(By.xpath("//div[@id='finish']/h4[text()='Hello World!']")).isDisplayed()) {
                    return driver.findElement(By.xpath("//div[@id='finish']/h4[text()='Hello World!']"));

                } else {
                    return null;
                }
            }
        });
        System.out.println(driver.findElement(By.xpath("//div[@id='finish']/h4[text()='Hello World!']")).getText());
    }
}
