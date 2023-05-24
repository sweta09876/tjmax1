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
public class TjmaxTest {

    private WebDriver driver;
    private String baseUrl;

    public TjmaxTest() {
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

    // @Test
    public void testUntitledTestCase() throws Exception {
        driver.get(baseUrl + "chrome://newtab/");
        driver.get("https://www.google.com/search?gs_ssp=eJzj4tTP1TewNE8yLlZgNGB0YPBiK8nKTayoAABBwAYF&q=tjmaxx&oq=&aqs=chrome.0.46i39i199i362i465j46i39i175i199i362j35i39i362l6.151764504j0j15&sourceid=chrome&ie=UTF-8");
        driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div/div/div/div/a/h3")).click();
        driver.get("https://tjmaxx.tjx.com/store/index.jsp");
        driver.findElement(By.linkText("WOMEN")).click();
        driver.get("https://tjmaxx.tjx.com/store/shop/womens-summer-fashion/_/N-3993642300+0?icid=5.16.23:TJMaxx:Homepage_Desktop::Summer_MustHaves_Hero_All");
        driver.findElement(By.xpath("//div[@id='style-1000739685']/div/div/a/img[2]")).click();
        driver.get("https://tjmaxx.tjx.com/store/jump/product/women-shops-summer-fashion/Made-In-Italy-Linen-Fringe-Tank/1000739685?colorId=NS1003608&pos=1:11&N=3993642300+0");
        driver.findElement(By.xpath("//div[@id='product-1000739685']/section/div[2]/form/div[3]/div/div[2]/ul/li/a/span")).click();
        driver.findElement(By.id("addItemToOrder")).click();
        driver.findElement(By.linkText("VIEW BAG")).click();
        driver.get("https://tjmaxx.tjx.com/store/checkout/cart.jsp");
        driver.findElement(By.xpath("//div[@id='stickyArea']/section/form/input[7]")).click();
    }

  // @Test
    public void testLoginTestCase() throws Exception {
        driver.get(baseUrl + "chrome://newtab/");
        driver.get("https://www.google.com/search?gs_ssp=eJzj4tTP1TewNE8yLlZgNGB0YPBiK8nKTayoAABBwAYF&q=tjmaxx&oq=&aqs=chrome.0.46i39i199i362i465j46i39i175i199i362j35i39i362l6.151764504j0j15&sourceid=chrome&ie=UTF-8");
        //   driver.get("https://www.google.com/search?gs_ssp=eJzj4tTP1TewNE8yLlZgNGB0YPBiK8nKTayoAABBwAYF&q=tjmaxx&oq=&aqs=chrome.0.46i39i199i362i465j46i39i175i199i362j35i39i362l6.152149381j0j15&sourceid=chrome&ie=UTF-8");
        driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div/div/div/div/a/h3")).click();
        driver.get("https://tjmaxx.tjx.com/store/index.jsp");
         driver.findElement(By.linkText("WOMEN")).click();
        driver.get("https://tjmaxx.tjx.com/store/shop/womens-summer-fashion/_/N-3993642300+0?icid=5.16.23:TJMaxx:Homepage_Desktop::Summer_MustHaves_Hero_All");
        driver.findElement(By.xpath("//div[@id='style-1000739685']/div/div/a/img[2]")).click();
        driver.get("https://tjmaxx.tjx.com/store/jump/product/women-shops-summer-fashion/Made-In-Italy-Linen-Fringe-Tank/1000739685?colorId=NS1003608&pos=1:11&N=3993642300+0");
        driver.findElement(By.xpath("//div[@id='product-1000739685']/section/div[2]/form/div[3]/div/div[2]/ul/li/a/span")).click();
        driver.findElement(By.id("addItemToOrder")).click();
        driver.findElement(By.linkText("VIEW BAG")).click();
        driver.get("https://tjmaxx.tjx.com/store/checkout/cart.jsp");
        driver.findElement(By.xpath("//div[@id='stickyArea']/section/form/input[7]")).click();
//        driver.findElement(By.id("cart-total")).click();
//        driver.findElement(By.linkText("My Bag")).click();
//        driver.get("https://tjmaxx.tjx.com/store/checkout/cart.jsp");
//        driver.findElement(By.linkText("Edit")).click();
//        driver.findElement(By.id("quantity")).click();
//        driver.findElement(By.id("quantity")).sendKeys("1");
//        driver.findElement(By.name("removeAndAddItemToOrder")).click(); name="moveToPurchaseInfo"
        driver.findElement(By.name("moveToPurchaseInfo")).click();
        driver.findElement(By.id("guestCheckoutBtn")).click();
        driver.get("https://tjmaxx.tjx.com/store/checkout/checkout.jsp?_requestid=998286");
        driver.findElement(By.id("shippingfirstNameInput")).click();
        driver.findElement(By.id("shippingfirstNameInput")).clear();
        driver.findElement(By.id("shippingfirstNameInput")).sendKeys("Sweta");
        driver.findElement(By.id("shippingstreetAddress1Input")).clear();
        driver.findElement(By.id("shippingstreetAddress1Input")).sendKeys("3 boxwood lane");
        driver.findElement(By.id("shippingpostalCodeInput")).clear();
        driver.findElement(By.id("shippingpostalCodeInput")).sendKeys("02747");
        driver.findElement(By.id("shippingcityInput")).clear();
        driver.findElement(By.id("shippingcityInput")).sendKeys("dartmouth");
        //  driver.findElement(By.id("stateSelect")).selectByVisibleText("Massachusetts");
        driver.findElement(By.id("stateSelect")).sendKeys("Massachusetts");

        driver.findElement(By.id("shippingtelephoneInput1")).clear();
        driver.findElement(By.id("shippingtelephoneInput1")).sendKeys("(201)682-1123");
        driver.findElement(By.id("contact-email")).clear();
        driver.findElement(By.id("contact-email")).sendKeys("sweta4807@hotmail.com");
        driver.findElement(By.id("shippingtelephoneInput1")).clear();
        driver.findElement(By.id("shippingtelephoneInput1")).sendKeys("(201)682-1123");
        driver.findElement(By.id("shippinglastNameInput")).click();
        driver.findElement(By.id("shippinglastNameInput")).clear();
        driver.findElement(By.id("shippinglastNameInput")).sendKeys("Patel");
        driver.findElement(By.id("shippingstreetAddress1Input")).click();
        driver.findElement(By.id("shippingtelephoneInput1")).click();
        driver.findElement(By.id("shippingtelephoneInput1")).clear();
        driver.findElement(By.id("shippingtelephoneInput1")).sendKeys("(201)682-1123");
        driver.findElement(By.id("shippingtelephoneInput1")).clear();
        driver.findElement(By.id("shippingtelephoneInput1")).sendKeys("(201)682-1123");
        driver.findElement(By.id("shipping-details")).click();
    }
    
  //   @Test
  public void testLoginTestCase1() throws Exception {
    driver.get(baseUrl + "chrome://newtab/");
    driver.get("https://www.google.com/search?gs_ssp=eJzj4tTP1TewNE8yLlZgNGB0YPBiK8nKTayoAABBwAYF&q=tjmaxx&oq=&aqs=chrome.0.46i39i199i362i465j46i39i175i199i362j35i39i362l6.158676061j0j15&sourceid=chrome&ie=UTF-8");
    driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div/div/div/div/a/h3")).click();
    driver.get("https://tjmaxx.tjx.com/store/index.jsp");
    driver.findElement(By.linkText("WOMEN")).click();
    driver.get("https://tjmaxx.tjx.com/store/shop/womens-summer-fashion/_/N-3993642300+0?icid=5.16.23:TJMaxx:Homepage_Desktop::Summer_MustHaves_Hero_All");
  driver.findElement(By.id("page-top")).click();
   // driver.findElement(By.xpath("//div[@id='style-1000764517']/div/div/a/img[2]")).click();
    driver.get("https://tjmaxx.tjx.com/store/jump/product/women-shops-summer-fashion/Suede-Sandals/1000764517?colorId=NS1003426&pos=1:4&N=3993642300+0");
    driver.findElement(By.id("addItemToOrder")).click();
    driver.findElement(By.linkText("VIEW BAG")).click();
    driver.get("https://tjmaxx.tjx.com/store/checkout/cart.jsp");
    driver.findElement(By.id("checkout")).click();
//driver.findElement(By.id("guestCheckoutBtn")).click();
//    driver.get("https://tjmaxx.tjx.com/store/checkout/checkout.jsp?_requestid=1033511");
//    driver.findElement(By.id("shippingfirstNameInput")).click();
//    driver.findElement(By.id("shippingfirstNameInput")).clear();
//    driver.findElement(By.id("shippingfirstNameInput")).sendKeys("Sweta");
//    driver.findElement(By.id("shippingstreetAddress1Input")).clear();
//    driver.findElement(By.id("shippingstreetAddress1Input")).sendKeys("3 boxwood lane");
//    driver.findElement(By.id("shippingpostalCodeInput")).clear();
//    driver.findElement(By.id("shippingpostalCodeInput")).sendKeys("02747");
//    driver.findElement(By.id("shippingcityInput")).clear();
//    driver.findElement(By.id("shippingcityInput")).sendKeys("dartmouth");
//   // new Select(driver.findElement(By.id("stateSelect"))).selectByVisibleText("Massachusetts");
//    driver.findElement(By.id("shippingtelephoneInput1")).clear();
//    driver.findElement(By.id("shippingtelephoneInput1")).sendKeys("(201)682-1123");
//    driver.findElement(By.id("contact-email")).clear();
//    driver.findElement(By.id("contact-email")).sendKeys("sweta4807@hotmail.com");
//    driver.findElement(By.id("shippingtelephoneInput1")).clear();
//    driver.findElement(By.id("shippingtelephoneInput1")).sendKeys("(201)682-1123");
//    driver.findElement(By.id("shippinglastNameInput")).click();
//    driver.findElement(By.id("shippinglastNameInput")).clear();
//    driver.findElement(By.id("shippinglastNameInput")).sendKeys("Patel");
//    driver.findElement(By.id("shippingtelephoneInput1")).click();
//    driver.findElement(By.id("shippingtelephoneInput1")).clear();
//    driver.findElement(By.id("shippingtelephoneInput1")).sendKeys("(201)682-1123");
//    driver.findElement(By.id("shippingtelephoneInput1")).clear();
//    driver.findElement(By.id("shippingtelephoneInput1")).sendKeys("(201)682-1123");
//    driver.findElement(By.id("shipping-details")).click();
  }
  
    @Test
  public void testPerTestCase() throws Exception {
    driver.get("https://www.google.com/search?gs_ssp=eJzj4tTP1TewNE8yLlZgNGB0YPBiK8nKTayoAABBwAYF&q=tjmaxx&oq=&aqs=chrome.0.46i39i199i362i465j46i39i175i199i362j35i39i362j46i39i199i362i465j35i39i362l4.317757163j0j15&sourceid=chrome&ie=UTF-8");
    driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div/div/div/div/a/h3")).click();
    driver.get("https://tjmaxx.tjx.com/store/index.jsp");
    driver.findElement(By.linkText("WOMEN")).click();
    driver.get("https://tjmaxx.tjx.com/store/shop/womens-summer-fashion/_/N-3993642300+0?icid=5.16.23:TJMaxx:Homepage_Desktop::Summer_MustHaves_Hero_All");
    driver.get("https://www.google.com/search?gs_ssp=eJzj4tTP1TewNE8yLlZgNGB0YPBiK8nKTayoAABBwAYF&q=tjmaxx&oq=&aqs=chrome.0.46i39i199i362i465j46i39i175i199i362j35i39i362j46i39i199i362i465j35i39i362l4.317795753j0j15&sourceid=chrome&ie=UTF-8");
    driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div/div/div/div/a/h3")).click();
    driver.get("https://tjmaxx.tjx.com/store/index.jsp");
    driver.findElement(By.linkText("WOMEN")).click();
    driver.get("https://tjmaxx.tjx.com/store/shop/womens-summer-fashion/_/N-3993642300+0?icid=5.16.23:TJMaxx:Homepage_Desktop::Summer_MustHaves_Hero_All");
    driver.findElement(By.xpath("//div[@id='style-1000774527']/div/div/a/img[2]")).click();
    driver.get("https://tjmaxx.tjx.com/store/jump/product/women-shops-summer-fashion/Linen-Sleeveless-Embroidered-V-neck-Dress/1000774527?colorId=NS1217940&pos=1:2&N=3993642300+0");
    driver.findElement(By.xpath("//div[@id='product-1000774527']/section/div[2]/form/div[3]/div/div[2]/ul/li[2]/a/span")).click();
    driver.findElement(By.id("addItemToOrder")).click();
    driver.findElement(By.linkText("VIEW BAG")).click();
    driver.get("https://tjmaxx.tjx.com/store/checkout/cart.jsp");
    driver.findElement(By.id("checkout")).click();
   // driver.findElement(By.id("guestCheckoutBtn")).click();
    driver.get("https://tjmaxx.tjx.com/store/checkout/checkout.jsp?_requestid=174792");
    driver.findElement(By.id("shippingfirstNameInput")).click();
    driver.findElement(By.id("shippingfirstNameInput")).clear();
    driver.findElement(By.id("shippingfirstNameInput")).sendKeys("Sweta");
    driver.findElement(By.id("shippingstreetAddress1Input")).clear();
    driver.findElement(By.id("shippingstreetAddress1Input")).sendKeys("3 boxwood lane");
    driver.findElement(By.id("shippingpostalCodeInput")).clear();
    driver.findElement(By.id("shippingpostalCodeInput")).sendKeys("02747");
    driver.findElement(By.id("shippingcityInput")).clear();
    driver.findElement(By.id("shippingcityInput")).sendKeys("dartmouth");
    //driver.findElement(By.id("stateSelect"))).selectByVisibleText("Massachusetts");
    driver.findElement(By.id("shippingtelephoneInput1")).clear();
    driver.findElement(By.id("shippingtelephoneInput1")).sendKeys("(201)682-1123");
    driver.findElement(By.id("contact-email")).clear();
    driver.findElement(By.id("contact-email")).sendKeys("sweta4807@hotmail.com");
    driver.findElement(By.id("shippingtelephoneInput1")).clear();
    driver.findElement(By.id("shippingtelephoneInput1")).sendKeys("(201)682-1123");
    driver.findElement(By.id("shippinglastNameInput")).click();
    driver.findElement(By.id("shippinglastNameInput")).clear();
    driver.findElement(By.id("shippinglastNameInput")).sendKeys("Patel");
    driver.findElement(By.id("shippingtelephoneInput1")).click();
    driver.findElement(By.id("shippingtelephoneInput1")).clear();
    driver.findElement(By.id("shippingtelephoneInput1")).sendKeys("(201)682-1123");
    driver.findElement(By.id("shippingtelephoneInput1")).clear();
    driver.findElement(By.id("shippingtelephoneInput1")).sendKeys("(201)682-1123");
    driver.findElement(By.id("shipping-details")).click();
  }



}
