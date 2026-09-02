import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Login_Test {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }

    @Test
    public void validLogin() {
        String name = "Satyam";
        String password = "Satyam@1111";
        driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys(name);
        driver.findElement(By.cssSelector("input[Placeholder='Password']")).sendKeys(password);
        driver.findElement(By.className("submit")).click();
        System.out.println(driver.findElement(By.className("error")).getText());
        Assert.assertEquals(driver.findElement(By.className("error")).getText(), "* Incorrect username or password");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }


}
