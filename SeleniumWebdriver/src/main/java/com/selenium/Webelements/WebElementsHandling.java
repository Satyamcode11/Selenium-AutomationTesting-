package com.selenium.Webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsHandling {
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





    }
}
