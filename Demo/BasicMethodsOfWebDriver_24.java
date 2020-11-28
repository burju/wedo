package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicMethodsOfWebDriver_24 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\rucha\\OneDrive\\Documents\\SYNTAX Docs\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("http://google.com");
        System.out.println(driver.getTitle());

        //if the website is hacked you 're usually redirected to a new page. To see if you're redirected
        //validate if you're landed on correct URL
        System.out.println(driver.getCurrentUrl());

        //somewebsites does not let you rightclick you can print the pagesourse(another way to inspect elements)
        //System.out.println(driver.getPageSource());

        driver.get("http://yahoo.com");
        //driver.navigate().back();
        //driver.navigate().forward();
        driver.close();//closes the current tab
        //driver.quit();//closes all the browsers opened by Selenium



    }
}
