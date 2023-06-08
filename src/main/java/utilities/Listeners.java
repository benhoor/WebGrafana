package utilities;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;

public class Listeners extends CommonOps implements ITestListener {

    public void onStart(ITestContext execution){
        System.out.println("---------------Start Execution------------");
    }


    public void onFinish(ITestContext execution){
        System.out.println("---------------End Execution------------");
    }


    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
        // TODO Auto-generated method stub

    }


    public void onTestFailure(ITestResult test) {
        System.out.println("---------------Test: "+ test.getName()+ " Failed------------");
        if (!platform.equalsIgnoreCase("api")){
            try {
                MonteScreenRecorder.stopRecord();
            } catch (Exception e) {
                e.printStackTrace();
            }
            saveScreenshot();
        }

    }


    public void onTestSkipped(ITestResult test) {
        System.out.println("---------------Skip Test: "+ test.getName()+ "------------");

    }


    public void onTestStart(ITestResult test) {
        System.out.println("---------------Start Test: "+ test.getName()+ "------------");

    }


    public void onTestSuccess(ITestResult test) {
        System.out.println("---------------Test: "+ test.getName()+ " Passed------------");

        if (!platform.equalsIgnoreCase("api")){
            try {
                MonteScreenRecorder.stopRecord();
            } catch (Exception e) {
                e.printStackTrace();
            }
            File file = new File ("./test-recordings/"+test.getName()+".avi");
            if (file.delete())
                System.out.println("File deleted successfully");
            else
                System.out.println("File WASN'T deleted");
        }

    }

    @Attachment(value = "Page Screen-Shot", type = "image/png")
    public byte [] saveScreenshot(){
        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    }



}
