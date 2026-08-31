import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class cwh_009_ActionsClass {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5)); // Explicit Wait
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //Implicit Wait
        Actions actions = new Actions(driver); //Actions class

        wait.until((ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='nav-link-accountList']"))));
        WebElement element =  driver.findElement(By.xpath("//div[@id='nav-link-accountList']"));

        actions.moveToElement(element).build().perform();
        actions.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("macbook").doubleClick().build().perform();
        actions.moveToElement( element).contextClick().build().perform();
    }
}
