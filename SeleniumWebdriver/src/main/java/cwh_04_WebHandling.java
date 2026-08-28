

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class cwh_04_WebHandling {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//        WebElement selectdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
//        Select dropdown = new Select(selectdropdown);
//        dropdown.selectByIndex(2);
//        System.out.println(dropdown.getFirstSelectedOption().getText());
//        dropdown.selectByVisibleText("INR");
//        System.out.println(dropdown.getFirstSelectedOption().getText());
//        dropdown.selectByValue("USD");
//        System.out.println(dropdown.getFirstSelectedOption().getText());
//
//        Thread.sleep(2000);
//
//
//        driver.findElement(By.id("divpaxinfo")).click();
//        Thread.sleep(2000);
//
//        //Using While loop
//        int i=1;
//        while(i<5){
//            driver.findElement(By.id("hrefIncAdt")).click();
//            i++;
//        }
//          //Using for loop
//        for(int x= 1; x<3;x++){
//            driver.findElement(By.id("hrefIncChd")).click();
//        }
//
//
//        driver.findElement(By.id("btnclosepaxoption")).click();
//        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='CCU']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='GOI']")).click();
        Thread.sleep(2000l);
        //Calender UI testing
        driver.findElement(By.className("ui-state-default")).click();
        Thread.sleep(2000L);

        driver.findElement(By.id("autosuggest")).sendKeys("ar");
        Thread.sleep(2000L);
        List<WebElement> options = driver.findElements(By.cssSelector("li.ui-menu-item a"));

        for (WebElement option : options) {
            if (option.getText().equalsIgnoreCase("Argentina")) {
                option.click();
                break;
            }
        }


        System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
        driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
        System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox'")).size());


    }
}
