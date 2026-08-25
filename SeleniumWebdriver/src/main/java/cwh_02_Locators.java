import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import java.time.Duration;

public class cwh_02_Locators {
    public static void main(String[] args) throws InterruptedException {
        String name = "Satyam";
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        //get elements by ID
        driver.findElement(By.id("inputUsername")).sendKeys("satyam@gmail.com");

        //get elements by name
        driver.findElement(By.name("inputPassword")).sendKeys("123456");

        //get elements by class name
        driver.findElement(By.className("submit")).click();

        //get elements by CSS selector
        System.out.println(driver.findElement(By.cssSelector(".error")).getText());

        //Here we get an error
        // becz of timeout issue that's why we add a method
        // called implicit wait  after web driver section (Line - 15)

       //get elements by link text
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(3000);

        //get elements by xpath
        driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("Satyam");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("Satyammoharana@gmail.com");

        //get elements by css selectors
        driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("9348842230");

        driver.findElement(By.className("reset-pwd-btn")).click();
        System.out.println(driver.findElement(By.className("infoMsg")).getText());
        driver.findElement(By.className("go-to-login-btn")).click();
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Satyam");
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");

        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.id("chkboxTwo")).click();
        driver.findElement(By.className("submit")).click();


        driver.findElement(By.id("inputUsername")).sendKeys(name);
        driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.id("chkboxTwo")).click();
        driver.findElement(By.className("signInBtn")).click();

        Thread.sleep(2000);
        System.out.println(driver.findElement(By.tagName("p")).getText());
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
        Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");
        driver.findElement(By.xpath("//*[text()='Log Out']")).click();
        Thread.sleep(2000);
        driver.close();
    }
}
