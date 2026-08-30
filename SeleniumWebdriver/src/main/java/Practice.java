import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice {
    public static void main(String[] args) throws InterruptedException {
        //Invoking the browser
        WebDriver driver = new EdgeDriver();

        //maximize the browser
        driver.manage().window().maximize();

        //get into the website
//        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

//        //For static dropdown
////        WebElement selectelement=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
////        Select CurrencyDropdown = new Select(selectelement);
////
////        //find the element by his index
////        CurrencyDropdown.selectByIndex(2);
////        System.out.println(CurrencyDropdown.getFirstSelectedOption().getText());
////
////        //Find the element by his value
////        CurrencyDropdown.selectByValue("USD");
////        System.out.println(CurrencyDropdown.getFirstSelectedOption().getText());
////
////        //Find the element by the visible text
////        CurrencyDropdown.selectByVisibleText("INR");
////        System.out.println(CurrencyDropdown.getFirstSelectedOption().getText());
////
////        Thread.sleep(2000L);
////
////        //Passengers Section
////        driver.findElement(By.id("divpaxinfo")).click();
////        Thread.sleep(2000L);
////
////        //Adult section
////        int i = 1;
////        while(i<=2){
////            driver.findElement(By.id("hrefIncAdt")).click();
////            i++;
////        }
////
////        //Child Section
////        int x = 0;
////        while(x<3){
////            driver.findElement(By.id("hrefIncChd")).click();
////            x++;
////        }
////        driver.findElement(By.id("btnclosepaxoption")).click();//done button
////        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());//Print the passenger box
////
////        //Departure & Arrival Section
////        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
////        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']")).click();//Bengaluru as a origin station
////        Thread.sleep(2000L);
////        driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@text='Thiruvananthapuram (TRV)']")).click();//Thiruvananthapuram as a destination
////
////        //country section
////        driver.findElement(By.id("autosuggest")).sendKeys("ar");
////        Thread.sleep(2000L);
////        List<WebElement> options = driver.findElements(By.cssSelector("li.ui-menu-item a"));
////
////        for (WebElement option : options) {
////            if (option.getText().equalsIgnoreCase("Argentina")) {
////                option.click();
////                break;
////            }
////        }
////
////        //checkboxes
////        System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected());//false
////        driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).click();
////        System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected());//true
////        //Want to know the size
////        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox'")).size());
//
//        //! Alert Handling.......................................
//
//        String text = "Satyam";
//        driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys(text);
//
//        driver.findElement(By.xpath("//input[@id=\"alertbtn\"]")).click();
//        System.out.println(driver.switchTo().alert().getText());
//        driver.switchTo().alert().accept();
//
//        driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
//        System.out.println(driver.switchTo().alert().getText());
//        driver.switchTo().alert().dismiss();
//
//
                 int j =0;
        String []veggies = {"Brocolli","Tomato","Cucumber","Beetroot","Pumpkin"};

        List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
                for (int i = 0; i< products.size();i++){
                    String [] name = products.get(i).getText().split("-");
                    String items = name[0].trim();


                    List<String> li = new  ArrayList<>(Arrays.asList(veggies));

                    if (li.contains(items)){
                        j++;
                        driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
                        if (j==veggies.length){
                            break;
                        }
                    }
                }
    }
}
