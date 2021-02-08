package stepDefinitions;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pageObjects.CostCheckerPage;

import java.util.Properties;

public class BaseClass {

    public WebDriver driver;
    public CostCheckerPage cp;


    public static Logger logger;

    public Properties configProp;
}
