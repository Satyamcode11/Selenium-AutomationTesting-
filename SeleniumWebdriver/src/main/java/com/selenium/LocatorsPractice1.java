package com.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class LocatorsPractice1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.findElement(By.id("inputUsername")).sendKeys("Satyam Moharana");
        driver.findElement(By.name("inputPassword")).sendKeys("1234567");
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.id("chkboxTwo")).click();
        driver.findElement(By.className("signInBtn")).click();
        System.out.println(driver.findElement(By.className("error")).getText());
        driver.findElement(By.className("forgot-pwd-container")).click();

        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Satyam Moharana");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("Satyammoharana000@gmail.com");
        driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("9876554789");
        driver.findElement(By.className("reset-pwd-btn")).click();
        System.out.println(driver.findElement(By.className("infoMsg")).getText());
        driver.findElement(By.className("go-to-login-btn")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("inputUsername")).sendKeys("Satyam Moharana");
        driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.id("chkboxTwo")).click();
        driver.findElement(By.className("signInBtn")).click();








    }
}
