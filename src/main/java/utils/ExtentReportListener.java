package utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportListener implements ITestListener {
    public static ExtentReports extent;
    public static ExtentTest test;

    @Override
    public void onStart(ITestContext context) {
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter("extentReports.html");
        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);
    }

    @Override
    public void onTestStart(ITestResult result) {
        String testName = result.getMethod().getMethodName();
        String browser = result.getTestContext().getCurrentXmlTest().getParameter("browser");
        
        System.out.println("Initializing ExtentTest for: " + testName + " on " + browser);
        test = extent.createTest(testName + " [" + browser + "]");
        test.assignCategory(browser); // Assign the browser as a category for filtering
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        if (test != null) {
            test.pass("Test Passed");
        }
    }

    @Override
    public void onTestFailure(ITestResult result) {
        if (test != null) {
            test.fail(result.getThrowable());
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        if (test != null) {
            test.skip("Test Skipped");
        } else {
            System.out.println("ExtentTest object is null. Unable to log skip status.");
        }
    }

    @Override
    public void onFinish(ITestContext context) {
        if (extent != null) {
            extent.flush();
        }
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // No specific implementation needed for now
    }
}
