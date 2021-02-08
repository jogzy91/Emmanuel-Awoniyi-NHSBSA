package stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageObjects.CostCheckerPage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Steps extends BaseClass {

    @Before
    public void setup() throws IOException {


        logger = Logger.getLogger("NHSCheckerTool");    //Added logger
        PropertyConfigurator.configure("log4j.properties");  //added logger

        //Reading properties
        configProp = new Properties();
        FileInputStream configPropfile = new FileInputStream("config.properties");  //reading data from the file
        configProp.load(configPropfile);   //loads config.properties file


        String br = configProp.getProperty("browser");

        if (br.equals("chrome"))
        {
            System.setProperty("webdriver.chrome.driver",configProp.getProperty("chromepath"));
            driver = new ChromeDriver();
        }
        else if (br.equals("firefox")) {

            System.setProperty("webdriver.gecko.driver",configProp.getProperty("firefoxpath"));
            driver = new FirefoxDriver();
        }
    }





    @Given("User Launches chrome browser")
    public void user_launches_chrome_browser() {
        logger.info("************ Launching Browser ****************");







        cp=new CostCheckerPage(driver);

    }

    @When("User opens URL {string}")
    public void user_opens_url(String url) {
        logger.info("************ Opening URL****************");
        driver.get(url);
        driver.manage().window().maximize();

    }

    @When("User click the start button")
    public void user_click_the_start_button() throws InterruptedException {
        logger.info("************ Click on start button ****************");
        cp.clickOnStart();
        Thread.sleep(2000);


    }

    @Then("page title should be Which country do you live in?")
    public void page_title_should_be_which_country_do_you_live_in() {
        logger.info("************ Verifying Page Title ****************");

        cp=new CostCheckerPage(driver);

        Assert.assertEquals("Which country do you live in?", cp.getPageTitle());

    }

    @When("user select Wales and click on the Next button")
    public void user_select_wales_and_click_on_the_next_button() throws InterruptedException {
        logger.info("************ Selecting Wales and click on next button ****************");
        Thread.sleep(2000);
        cp.setCountry("Wales");

        Thread.sleep(2000);
        cp.ClickOnNext();

    }

    @Then("page title should be What is your date of birth?")
    public void page_title_should_be_what_is_your_date_of_birth() {
        logger.info("************ Verifying Page Title ****************");

        Assert.assertEquals("What is your date of birth?", cp.getPageTitle());

    }

    @When("user enters date of birth and click on Next")
    public void user_enters_date_of_birth_and_click_on_next() throws InterruptedException {
        logger.info("************ Entering Date of Birth ****************");

        cp.setDayTxt("01");
        cp.setMonthTxt("05");
        cp.setYearTxt("1989");

        cp.ClickOnNext();
        Thread.sleep(2000);

    }

    @Then("page title should be Do you live with a partner?")
    public void page_title_should_be_do_you_live_with_a_partner() {
        logger.info("************ Verifying Page Title ****************");

        Assert.assertEquals("Do you live with a partner?", cp.getPageTitle());

    }

    @When("user select No and click on Next")
    public void user_select_no_and_click_on_next() throws InterruptedException {
        logger.info("************ Selecting No and Clicking Next button ****************");
        cp.ClickOnNo();

        cp.ClickOnNext();
        Thread.sleep(2000);

    }

    @Then("page title should be Do you claim any benefits or tax credits?")
    public void page_title_should_be_do_you_claim_any_benefits_or_tax_credits() {
        logger.info("************ Verifying Page Title ****************");

        Assert.assertEquals("Do you claim any benefits or tax credits?", cp.getPageTitle());



    }

    @When("user select No and user click next")
    public void user_select_no_and_user_click_next() throws InterruptedException {
        logger.info("************ Selecting No and Clicking Next button ****************");

        cp.ClickOnNo();

        cp.ClickOnNext();
        Thread.sleep(2000);

    }

    @Then("page title should be Are you pregnant or have you given birth in the last {int} months?")
    public void page_title_should_be_are_you_pregnant_or_have_you_given_birth_in_the_last_months(Integer int1) {
        logger.info("************ Verifying Page Title ****************");

        Assert.assertEquals("Are you pregnant or have you given birth in the last 12 months?", cp.getPageTitle());


    }

    @When("User select No and the user clicks Next")
    public void user_select_no_and_the_user_clicks_next() throws InterruptedException {
        logger.info("************ Selecting No and Clicking Next button ****************");

        cp.ClickOnNo();

        cp.ClickOnNext();
        Thread.sleep(2000);

    }

    @Then("page title should be Do you have an injury or illness caused by serving in the armed forces")
    public void page_title_should_be_do_you_have_an_injury_or_illness_caused_by_serving_in_the_armed_forces() {
        logger.info("************ Verifying Page Title ****************");

        Assert.assertEquals("Do you have an injury or illness caused by serving in the armed forces?", cp.getPageTitle());

    }








    @Then("User select No and click Yes")
    public void user_select_no_and_click_yes() throws InterruptedException {
        logger.info("************ Selecting No and Clicking Yes ****************");

        cp.ClickOnNo();

        cp.ClickOnNext();
        Thread.sleep(2000);

    }

    @Then("page title should be Do you have diabetes?")
    public void page_title_should_be_do_you_have_diabetes() {
        logger.info("************ Verifying Page Title ****************");

        Assert.assertEquals("Do you have diabetes?", cp.getPageTitle());


    }

    @When("the user clicks No and user clicks next button")
    public void the_user_clicks_no_and_user_clicks_next_button() throws InterruptedException {
        logger.info("************ Selecting No and Clicking Next button ****************");

        cp.ClickOnNo();

        cp.ClickOnNext();
        Thread.sleep(2000);

    }

    @Then("page title should be Do you have glaucoma?")
    public void page_title_should_be_do_you_have_glaucoma() {
        logger.info("************ Verifying Page Title ****************");

        Assert.assertEquals("Do you have glaucoma?", cp.getPageTitle());



    }

    @When("user clicks No and also click Next")
    public void user_clicks_no_and_also_click_next() throws InterruptedException {
        logger.info("************ Selecting No and Clicking Next button ****************");

        cp.ClickOnNo();

        cp.ClickOnNext();
        Thread.sleep(2000);

    }

    @Then("page title should be Do you live permanently in a care home?")
    public void page_title_should_be_do_you_live_permanently_in_a_care_home() {
        logger.info("************ Verifying Page Title ****************");

        Assert.assertEquals("Do you live permanently in a care home?", cp.getPageTitle());

    }

    @When("the user selects no and click Next")
    public void the_user_selects_no_and_click_next() throws InterruptedException {
        logger.info("************ Selecting No and Clicking Next button ****************");
        cp.ClickOnNo();

        cp.ClickOnNext();
        Thread.sleep(2000);



    }

    @Then("page should contain Do you have more")
    public void page_should_contain_do_you_have_more() {

        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"question-heading\"]/span")).getText().contains("Do you have more"));

    }

    @When("the user select No and click next")
    public void the_user_select_no_and_click_next() throws InterruptedException {
        logger.info("************ Selecting No and Clicking Next button ****************");

        cp.ClickOnNo();

        cp.ClickOnNext();
        Thread.sleep(2000);

    }

    @Then("user can view the message {string}")
    public void user_can_view_the_message(String msg) {
        logger.info("************ Verifying the characters the page contains ****************");
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"result-heading\"]/span")).getText().contains("Based on what you've told us"));


    }

    @Then("close browser")
    public void close_browser() {
        logger.info("************ Closing browser ****************");
        driver.quit();

    }




}
