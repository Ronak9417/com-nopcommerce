package nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTest {

    static String browser = "Edge";

    static String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2";

    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser name");
        }
        //Maximise the Browser
        driver.manage().window().maximize();
        driver.get(baseUrl);
        System.out.println(driver.getTitle());

        //Find the Email Field Element
        WebElement emailField = driver.findElement(By.id("Email"));
        // Type the Email address to email field element
        emailField.sendKeys("prime123@gmail.com");


        driver.findElement(By.name("Password")).sendKeys("Prime123");

    }
}
