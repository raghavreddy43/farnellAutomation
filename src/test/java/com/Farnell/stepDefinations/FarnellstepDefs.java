package com.Farnell.stepDefinations;

import com.Farnell.util.BasePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.*;

public class FarnellstepDefs extends BasePage {

    @Given("^user navigate to Farnell Home page$")
    public void user_navigate_to_Farnell_Home_page() {
        // throw new cucumber.api.PendingException();
        BasePage.initialization();
    }

    @When("^user clicked on cookie accept button$")
    public void user_clicked_on_cookie_accept_button() {
        // Write code here that turns the phrase above into concrete actions
        WebElement RunBtn =
                driver.findElement(By.id("mktg_Cookie_button"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", RunBtn);
    }

    @Then("validate Farnell Logo")
    public void validate_Farnell_Logo() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(3000);
        String expectedText = "Hello World";
        String actualText = driver.findElement(By.id("storeLogosEu")).getText();
        Thread.sleep(3000);
        Assert.assertTrue("Farnell", expectedText.equals(actualText));
    }

    @Given("I clicked on register option")
    public void i_clicked_on_register_option() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        WebElement RunBtn =
                driver.findElement(By.xpath("//a[normalize-space()='Register']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", RunBtn);

    }

    @When("I enter username and password")
    public void i_enter_username_and_password() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        WebElement usr = driver.findElement(By.xpath("//div[@id='logon']"));
        usr.sendKeys("UsernameFarnell");
        Thread.sleep(5000);
        WebElement  pwd= driver.findElement(By.xpath("//input[@id='logonPassword']"));
        pwd.sendKeys("P@ssw0rd123");

    }

        @When("I enter full name")
        public void i_enter_full_name() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        WebElement fN = driver.findElement(By.xpath("//input[@id='firstName']"));
        fN.sendKeys("AutoTest");
        Thread.sleep(5000);
    }
    @When("I enter email address")
    public void i_enter_email_address() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        WebElement Ea = driver.findElement(By.xpath("//input[@id='email1']"));
        Ea.sendKeys("AutoTest@gmail.com");
        Thread.sleep(5000);
    }

    @When("I click on remember me checkbox")
    public void i_click_on_remember_me_checkbox() {
        // Write code here that turns the phrase above into concrete actions
        WebElement unCheck =
                driver.findElement(By.xpath("///span[normalize-space()='Remember me']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", unCheck);
        js.executeScript("arguments[0].click();", unCheck);

    }
    @When("user clicked on register button")
    public void user_clicked_on_register_button() {
        // Write code here that turns the phrase above into concrete actions
        WebElement rButton =
                driver.findElement(By.xpath("//input[@id='registerValidate']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", rButton);
    }

    @Then("assert user registered successfully as firstName loggedIn")
    public void assert_user_registered_successfully_as_firstName_loggedIn() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(1000);
        String expectedText = "Registration Successful";
        String actualText = driver.findElement(By.xpath("//span[@class='userFirstNameLoggedInn']")).getText();
        Thread.sleep(1000);
        Assert.assertTrue("Registration Successful", expectedText.equals(actualText));
        Thread.sleep(3000);
    }
    @After
    @Then("^Close the browser$")
    public void close_the_browser() {
        driver.quit();
    }
}
