package tests.projecttestcases;

import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import utils.BaseClass;
import utils.ExtentReportListener;
import pages.HomePage;

public class TestCases extends BaseClass {

    @Test
    public void verifyTestcases() throws InterruptedException {
        ExtentTest test = ExtentReportListener.getTest();

        HomePage homePage = new HomePage(driver);
        homePage.verifyTitle(test);
        homePage.clickToBigPageEithManyElementsLink(test);
        homePage.verifyTitleOfBigPage(test);
        homePage.verifyHeading(test);
    }
}

