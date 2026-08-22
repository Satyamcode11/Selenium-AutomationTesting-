package com.selenium.Webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElementsPrac {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        WebElement selectdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdown = new Select(selectdropdown);
        dropdown.selectByValue("USD");
        System.out.println(dropdown.getFirstSelectedOption().getText());
       Thread.sleep(2000);
       driver.findElement(By.id("divpaxinfo")).click();
       Thread.sleep(2000);
       int i =1;
       while(i<5) {
           driver.findElement(By.id("hrefIncAdt")).click();
           i++;
       }
       int x=0;
       while(x<3){
           driver.findElement(By.id("hrefIncChd")).click();
           x++;
       }
        int y=0;
        while(y<1){
            driver.findElement(By.id("hrefIncInf")).click();
            y++;
        }
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

       driver.findElement(By.id("btnclosepaxoption")).click();

       driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
       driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='HYD']")).click();
        System.out.println("The Original Station " + driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='HYD']")).getText());
       Thread.sleep(2000L);
       driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='STV']")).click();
        System.out.println("The Destination: " + driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='STV']")).getText());
Thread.sleep(2000L);
        //date part
        driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
        Thread.sleep(1000L);
 driver.findElement(By.xpath("(/a[@href='#'][normalize-space()='10'])[2]")).click();
        System.out.println( driver.findElement(By.xpath("(/a[@href='#'][normalize-space()='10'])[2]")).getText());
    }
}
