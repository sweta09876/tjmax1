/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Sweta
 */
public class LoginTest {

    private WebDriver driver;
    private String baseUrl;

    public LoginTest() {

        System.setProperty("webdriver.chrome.driver", "c:\\data2\\chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl = "https://www.google.com/";
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        driver.close();
    }

  @Test
    public void testUsernameTestCase() throws Exception {
        driver.get("https://www.google.com/search?gs_ssp=eJzj4tTP1TewNE8yLlZgNGB0YPBiK8nKTayoAABBwAYF&q=tjmaxx&oq=&aqs=chrome.0.46i39i199i362i465j46i39i175i199i362j35i39i362j46i39i199i362i465j35i39i362l4.323884510j0j15&sourceid=chrome&ie=UTF-8");
        driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div/div/div/div/a/h3")).click();
        driver.get("https://tjmaxx.tjx.com/store/index.jsp");
        driver.findElement(By.linkText("Account")).click();
        driver.findElement(By.id("login-id")).click();
        driver.findElement(By.id("login-id")).clear();
        driver.findElement(By.id("login-id")).sendKeys("sweta4807@hotmail.com");
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("loginSubmit")).click();
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("Super945");
       // driver.findElement(By.linkText("MY ACCOUNT")).click();
        driver.get("https://tjmaxx.tjx.com/store/account/profile.jsp");
    }
   //  @Test
    public void testUsernameTestCase1() throws Exception {
        driver.get("https://www.google.com/search?gs_ssp=eJzj4tTP1TewNE8yLlZgNGB0YPBiK8nKTayoAABBwAYF&q=tjmaxx&oq=&aqs=chrome.0.46i39i199i362i465j46i39i175i199i362j35i39i362j46i39i199i362i465j35i39i362l4.323884510j0j15&sourceid=chrome&ie=UTF-8");
        driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div/div/div/div/a/h3")).click();
        driver.get("https://tjmaxx.tjx.com/store/index.jsp");
        driver.findElement(By.linkText("Account")).click();
        driver.findElement(By.id("login-id")).click();
        driver.findElement(By.id("login-id")).clear();
        driver.findElement(By.id("login-id")).sendKeys("sweta4807@hotmail.com");
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("loginSubmit")).click();
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("Super");
       // driver.findElement(By.linkText("MY ACCOUNT")).click();
        driver.get("https://tjmaxx.tjx.com/store/account/profile.jsp");
    }
}
