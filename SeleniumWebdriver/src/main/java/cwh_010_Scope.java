import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class cwh_010_Scope{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        //Find aLL the links present in a mention page
        System.out.println(driver.findElements(By.tagName("a")).size());// Here is the main driver for entire page

        // We want to know only footer section links
        WebElement footerDriver = driver.findElement(By.id("gf-BIG")); // Here i create a mini driver for only footer section
        System.out.println(footerDriver.findElements(By.tagName("a")).size());

        //We want to know how many links are in a particular column of the footer section
        WebElement columnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        System.out.println(columnDriver.findElements(By.tagName("a")).size()); // here I create a only chromeDriver of the footerDriver to get the particular column

        //click each an every links that are present in that particular column and navigate each and every tab and get the title
        for (int i = 1; i < columnDriver.findElements(By.tagName("a")).size(); i++) {

           String keys =  Keys.chord(Keys.CONTROL,Keys.ENTER);
            columnDriver.findElements(By.tagName("a")).get(i).sendKeys(keys);
            Thread.sleep(4000L);
        }
        Set<String> windowsHandles = driver.getWindowHandles();
        Iterator<String> iterator = windowsHandles.iterator();
        while(iterator.hasNext()){
            driver.switchTo().window(iterator.next());
            System.out.println(driver.getTitle());
        }
    }
}
