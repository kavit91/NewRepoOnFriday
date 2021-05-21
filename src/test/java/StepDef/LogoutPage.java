package StepDef;

import io.cucumber.java.After;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogoutPage {
    public WebDriver driver;
    @After
    public void TearDown(){
        driver.close();
    }

    @Given("user is in home page")
    public void user_is_in_home_page() {
        System.out.println("this is setup method");
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();
    }
    @When("user click on logout button")
    public void user_click_on_logout_button() {
        driver.findElement(By.id("welcome")).click();
        driver.findElement(By.linkText("Logout")).click();
    }
    @Then("user successfully Logout")
    public void user_successfully_logout() {
        Boolean status=driver.findElement(By.xpath("//div[@id='divLogo']")).isDisplayed();
        Assert.assertEquals(status,true);
    }

}
