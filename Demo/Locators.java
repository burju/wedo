package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rucha\\OneDrive\\Documents\\SYNTAX Docs\\chromedriver.exe");

        WebDriver driver= new ChromeDriver();
        driver.get("http://facebook.com");//URL in the browser
        //now find emailbox through locator: ID
        //after finding element send info.
        driver.findElement(By.id("email")).sendKeys("bkanyilmaz@myfirstcode.com");
        //find element password through locator name:
        driver.findElement(By.name("pass")).sendKeys("deneme123");
        driver.findElement(By.name("login")).click();

    }
}
