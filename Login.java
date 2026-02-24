package janbasktestautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Login
{

    public static void main (String[] args){

        // Open the browser
        WebDriver driver = new ChromeDriver();
        // Enter the url
        driver.get("https://www.janbaskdemo.com");

        // Click on my Account icon
        WebElement myAccountIcon = driver.findElement(By.xpath("//i[@class='fa fa-user']"));
        myAccountIcon.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));

        // Click on login link
        WebElement loginLink = driver.findElement(By.xpath("//a[text()='Login']"));
        loginLink.click();

        // Enter correct email
        WebElement emailTextBox = driver.findElement(By.xpath("//input[@id='input-email']"));
        emailTextBox.sendKeys("jason.roger@janbask.com");

        // Enter correct password
        WebElement passwordTextBox=driver.findElement(By.xpath("//input[@id='input-password']"));
        passwordTextBox.sendKeys("test@1234");

        // Click on login button
       WebElement loginButton= driver.findElement(By.xpath("//input[@type='submit']"));
       loginButton.click();




    }
}
