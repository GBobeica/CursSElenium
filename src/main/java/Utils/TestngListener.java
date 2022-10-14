package Utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestngListener implements ITestListener{

	public void onTestStart(ITestResult result) {
		Log.info("++++++++++++++++++++++++++++++++++");
		Log.info("+++++ Start method :" + result.getName());
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		Log.info("Start time : " + timeStamp);
		Log.info("++++++++++++++++++++++++++++++++++");
		
	}
	

	public void onTestSuccess(ITestResult result) {
		Log.info("++++++++++++++++++++++++++++++++++");
		Log.info("+++++ Passed  method :" + result.getName());
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		Log.info("End  time : " + timeStamp);
		Log.info("++++++++++++++++++++++++++++++++++");
	}

	

	public void onTestFailure(ITestResult result) {
	
		Log.info("++++++++++++++++++++++++++++++++++");
		Log.info("+++++ Failed method :" + result.getName());
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		Log.info("Fail time : " + timeStamp);
		Log.info("++++++++++++++++++++++++++++++++++");
	Log.error(result.getThrowable());

}
}