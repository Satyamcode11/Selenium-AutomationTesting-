import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cwh_06_AlertHandle {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        String text = "Satyam";
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys(text);
        driver.findElement(By.id("alertbtn")).click();
        System.out.println( driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        driver.findElement(By.id("confirmbtn")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();

    }
}
