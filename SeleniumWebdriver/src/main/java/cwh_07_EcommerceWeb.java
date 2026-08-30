import org.jspecify.annotations.NonNull;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class cwh_07_EcommerceWeb {
    public static void main(String[] args) throws InterruptedException{


        //Invoking the browser
        WebDriver driver = new ChromeDriver();
        //Get the URL
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //Implicit Wait
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5)); //Explicit Wait


        //Mentioning the Veggies
        String[] veggies = {"Brocolli", "Tomato", "Cauliflower", "Cucumber", "Carrot"};
        addItems(driver,veggies);
        driver.findElement(By.xpath("//img[@alt=\"Cart\"]")).click();
        driver.findElement(By.xpath("//button[normalize-space()='PROCEED TO CHECKOUT']")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter promo code']")));
        driver.findElement(By.xpath("//input[@placeholder='Enter promo code']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.xpath("//button[normalize-space()='Apply']")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));
        System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());



    }
    public static void addItems( WebDriver driver, String[] veggies){
        int j = 0; // to control the iteration

        //I use findElements so the return type is WebElement and it is a list of items so,Here List  is use
        List<WebElement> productsName = driver.findElements(By.xpath("//h4[@class='product-name']"));

        //Iterate the size of the products that i choose in the xpath
        for (int i = 0; i < productsName.size(); i++) {

            //Here use split() because I have a text = Cucumber - 1 kg (Cucumber is now 0 index & 1 kg is 1 index)
            String[] name = productsName.get(i).getText().split("-");

            //Here I just trim the extra spaces (Cucumber - 1 kg)
            String item = name[0].trim();

            //Convert the array(Veggies) to an Arraylist because array list have contains() and it easy to find elements.
            List<String> li = new ArrayList<>(Arrays.asList(veggies));

            //if statement is use here - If items contains that item then enter in it otherwise not.
            if (li.contains(item)) {
                j++; // Increases the value of j

                //Click the add to cart box
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
                if (j == veggies.length) {
                    break; //After the j value is equal to the veggies of length then break and exit from the for loop
                }

            }

        }
    }
}
