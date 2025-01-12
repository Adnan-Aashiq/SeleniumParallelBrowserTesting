package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import com.aventstack.extentreports.ExtentTest;

public class HomePage {
	WebDriver driver;  

	By bigPageWithManyElementsLink = By.xpath("//a[@href='../complicated-page']");
	By headingofBigPage = By.xpath("//span[@id='Skills_Improved']");

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void verifyTitle(ExtentTest test) {
		String actualTitle = driver.getTitle();
		String expectedTitle = "Automation Practice - Ultimate QA";
		Assert.assertEquals(actualTitle, expectedTitle, "Page title does not match!");
		test.pass("Title of the HomePage is verified");
	}

	public void clickToBigPageEithManyElementsLink(ExtentTest test) {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	    wait.until(ExpectedConditions.elementToBeClickable(bigPageWithManyElementsLink)).click();
	    test.pass("User clicked the big page with many elements link");
	}

	public void verifyTitleOfBigPage(ExtentTest test) throws InterruptedException {
		Thread.sleep(20000);
		String actualTitle = driver.getTitle();
		String expectedTitle = "Complicated Page - Ultimate QA";
		Assert.assertEquals(actualTitle, expectedTitle, "Page title does not match!");
		test.pass("Title of the big page with many elements is verified");
	}

	public void verifyHeading(ExtentTest test) {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(headingofBigPage));
	    String actualText = driver.findElement(headingofBigPage).getText();
	    Assert.assertEquals(actualText, "Skills Improved:", "The text of the element does not match!");
	    test.pass("Heading 'Skills Improved:' is displayed.");
	}
}
