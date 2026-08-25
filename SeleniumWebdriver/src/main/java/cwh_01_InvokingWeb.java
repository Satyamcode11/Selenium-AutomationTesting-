

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cwh_01_InvokingWeb {
    public static void main(String[] args) {

        //? Invoking Browser
          WebDriver driver = new ChromeDriver();
          driver.get("https://www.rahulshettyacademy.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
       driver.close();
       driver.quit();





    }
}