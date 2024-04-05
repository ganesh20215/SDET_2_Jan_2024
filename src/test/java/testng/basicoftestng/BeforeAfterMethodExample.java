package testng.basicoftestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethodExample {

/*    public WebDriver driver;


    @BeforeMethod
    public void beforeMe(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();  //UpCasting
    }

    @Test
    public void demoOfTestNG_1() {
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
    }*/

    @Test(groups = {"smoke"})
    public void demoOfTestNG_2() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();  //UpCasting
        driver.get("https://testng.org/");
        driver.manage().window().maximize();
        driver.close();
    }

/*    @AfterMethod
    public void afterMe(){
        driver.close();
    }*/
}
