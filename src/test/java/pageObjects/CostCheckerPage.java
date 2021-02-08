package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;



public class CostCheckerPage {

    public WebDriver ldriver;

    public CostCheckerPage (WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(ldriver, this);
    }


    By StartBtn=By.id("next-button");
    By England_Radio=By.id("label-england");
    By Scotland_Radio=By.id("label-scotland");
    By Wales_Radio=By.id("label-wales");
    By NothernIreland_Radio=By.id("label-nire");
    By NextBtn=By.id("next-button");
    By DayTxt=By.name("dateOfBirth.day");
    By MonthTxt=By.name("dateOfBirth.month");
    By YearTxt=By.name("dateOfBirth.year");
    By Yes_Radio=By.id("label-yes");
    By No_Radio=By.id("label-no");




    //Action methods


    public String getPageTitle()
    {
        return ldriver.getTitle();
    }




    public void clickOnStart()
    {
        ldriver.findElement(StartBtn).click();
    }

    public void setCountry (String country)
    {
        if (country.equals("Wales"))
        {
            ldriver.findElement(Wales_Radio).click();
        }

        else if (country.equals ("Scotland"))
        {
            ldriver.findElement(Scotland_Radio).click();
        }

        else if (country.equals ("England"))
        {
            ldriver.findElement(England_Radio).click();
        }

        else if (country.equals("NorthernIreland"))
        {
            ldriver.findElement(NothernIreland_Radio).click();
        }

        else
        {
            ldriver.findElement(Wales_Radio).click();
        }
    }


    public void ClickOnNext()
    {
        ldriver.findElement(NextBtn).click();
    }


    public void setDayTxt (String daytxt)
    {
        ldriver.findElement(DayTxt).sendKeys(daytxt);
    }


    public void setMonthTxt (String monthtxt)
    {
        ldriver.findElement(MonthTxt).sendKeys(monthtxt);
    }

    public void setYearTxt (String yeartxt)
    {
        ldriver.findElement(YearTxt).sendKeys(yeartxt);
    }


    public void ClickOnYes ()
    {
        ldriver.findElement(Yes_Radio).click();
    }

    public void ClickOnNo ()
    {
        ldriver.findElement(No_Radio).click();
    }






}
