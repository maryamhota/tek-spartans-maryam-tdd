package playground;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity1 {

        WebDriver driver;
        @BeforeMethod
       public void setupTest(){
            driver = new ChromeDriver();
            driver.get("https://www.facebook.com/");
        }
        @Test
    public void testFacebookTitle(){
            String applicationTitle = driver.getTitle();
            Assert.assertEquals(applicationTitle, "xFacebook - log in or sign up");
        }
        @AfterMethod
    public void runAfterEachTestMethod(){
            System.out.println("This is running after Each Test");
        }
    }

