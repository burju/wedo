package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Introduction {
    public static void main(String[] args) {
        //invoke .exe file first:
        System.setProperty("webdriver.chrome.driver","C:\\Users\\rucha\\OneDrive\\Documents\\SYNTAX Docs\\chromedriver.exe" );
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.com");
//making changes
//again..
//making an another change
        //we want to know title of the page
        String title= driver.getTitle();
        System.out.println(title);
        //as testers test whether the developer page and the home page title are the same.


    }
}
