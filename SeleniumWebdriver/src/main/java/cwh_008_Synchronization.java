import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class cwh_008_Synchronization {
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        String userName = "rahulshettyacademy";
        String password = "Learning@830$3mK2";

        String[] items = {"iphone", "Samsung", "Blackberry"};

        WebElement element = driver.findElement(By.xpath("//select[@class='form-control']"));


        loginPage(driver, userName, password, wait, element, items);
    }

    public static void loginPage(WebDriver driver, String userName, String password, WebDriverWait wait, WebElement element, String[] items) {
        int j = 0;
        driver.findElement(By.id("username")).sendKeys(userName);
        driver.findElement(By.id("password")).sendKeys(password);

        driver.findElement(By.xpath("//label[2]//span[2]")).click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("okayBtn"))));
        driver.findElement(By.id("okayBtn")).click();

        Select dropdown = new Select(element);
        dropdown.selectByVisibleText("Consultant");

        driver.findElement(By.id("terms")).click();
        driver.findElement(By.id("signInBtn")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[@class='card-title']")));

        List<WebElement> products = driver.findElements(By.xpath("//h4[@class='card-title']"));
        for (int i = 0; i < products.size(); i++) {
            String[] name = products.get(i).getText().split(" ");
            String phone = name[0].trim();

            List<String> convert = new ArrayList<>(Arrays.asList(items));

            if (convert.contains(phone)) {

                j++;
                driver.findElements(By.xpath("//div[@class='card-footer']/button")).get(i).click();
                if (j == items.length) {
                    break;
                }
            }

        }


        driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn btn-success']")));
        driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("country")));
        driver.findElement(By.id("country")).sendKeys("ind");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='suggestions']//a[text()='India']")));

        List<WebElement> country = driver.findElements(By.xpath("//div[@class='suggestions']//a[text()='India']"));

        for (WebElement options : country) {
            if (options.getText().equalsIgnoreCase("India")) {
                options.click();
                break;
            }
        }

        driver.findElement(By.xpath("//div[@class='checkbox checkbox-primary']")).click();
        driver.findElement(By.xpath("//input[@value='Purchase']")).click();
        System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());


    }
}
