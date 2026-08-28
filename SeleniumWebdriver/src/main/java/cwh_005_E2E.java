import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class cwh_005_E2E {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        driver.findElement(By.id("autosuggest")).sendKeys("ind");
        Thread.sleep(1000L);
        List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item'] //a"));

        for (WebElement option : options) {
            if (option.getText().equalsIgnoreCase("India")) {
                option.click();
                break;
            }
        }
        Thread.sleep(2000L);
        //click round to one trip
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        Thread.sleep(2000L);
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();

        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//div[@id=\"glsctl00_mainContent_ddl_destinationStation1_CTNR\"] //a[@value=\"DEL\"]")).click();
        driver.findElement(By.xpath("//a[@class=\"ui-state-default ui-state-active\" and text() = \"5\"]")).click();
        Thread.sleep(2000L);
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000L);

        int i = 1;
        while (i <= 3) {
            driver.findElement(By.id("hrefIncAdt")).click();
            i++;
        }

        int x = 1;
        while (x <= 2) {
            driver.findElement(By.id("hrefIncChd")).click();
            x++;
        }
        Thread.sleep(2000L);
        driver.findElement(By.id("btnclosepaxoption")).click();
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        Thread.sleep(2000L);
        WebElement element = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select selectdropdown = new Select(element);

        selectdropdown.selectByVisibleText("USD");
        selectdropdown.selectByVisibleText("INR");
        Thread.sleep(1000L);
        driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click();
        Thread.sleep(1000L);
        driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

    }
}
