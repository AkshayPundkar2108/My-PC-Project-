package Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReoprtNG {

	public static ExtentReports getReportObject()
	{
		String path=System.getProperty("user.dir")+"\\reports\\indext.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setReportName("WebAutomation Report");
		reporter.config().setDocumentTitle("Test Result");
		
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Yogesh Tayde   ");
		return extent;
		
	}
}
