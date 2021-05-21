package StepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchStep {
    public WebDriver driver;
    @Before
    public void setUp()
    {
        System.out.println("this is setup method");
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
    @After
    public void tearDown(){
        System.out.println("This is tear down method");
        driver.close();
    }

    @Given("user is on login page {string}")
    public void user_is_on_login_page(String weburl) {
        driver.get(weburl);
    }
    @When("user enter {string} and {string}")
    public void user_enter_and(String uname, String upsw) {
        driver.findElement(By.id("txtUsername")).sendKeys(uname);
        driver.findElement(By.id("txtPassword")).sendKeys(upsw);
    }
    @When("click on login button")
    public void click_on_login_button() {
        driver.findElement(By.id("btnLogin")).click();
    }
    @Then("user navigate to home page")
    public void user_navigate_to_home_page() {
        Boolean status=driver.findElement(By.xpath("//img[@alt='OrangeHRM']")).isDisplayed();
        Assert.assertEquals(status,true);
    }

    @When("user sucessfuly login into application")
    public void user_sucessfuly_login_into_application() {

    }

    @And("click on logout button")
    public void click_on_logout_button() {

    }

    @Then("user navigate to login page")
    public void user_navigate_to_login_page() {

    }

}
