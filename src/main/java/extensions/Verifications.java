package extensions;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.sikuli.script.FindFailed;
import utilities.CommonOps;

import java.util.List;

import static org.apache.tools.ant.taskdefs.SetPermissions.NonPosixMode.fail;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class Verifications extends CommonOps {

    @Step("Verify text in element")
    public static void verifyTextInElement(WebElement elem, String expected){
        wait.until(ExpectedConditions.visibilityOf(elem));
        assertEquals (elem.getText(), expected);
    }

    @Step("Get number of elements")
    public static void numberOfElements (List<WebElement> elems, int expected){
        wait.until(ExpectedConditions.visibilityOf(elems.get(elems.size()-1)));
        assertEquals(elems.size(), expected);
    }

    @Step("Verify visibility of elements")
    public static void visibilityOfElements (List<WebElement> elems){
        for (WebElement elem: elems){
            softAssert.assertTrue(elem.isDisplayed(), "sorry" + elem.getText()+ "is not displayed");
        }

        softAssert.assertAll("Some elements are not displayed");
    }
    @Step("verify elements displayed")
    public static void existanceOfElement(List<WebElement> elements){
        assertTrue(elements.size()>0);
    }


    @Step("verify elements are not displayed")
    public static void nonExistanceOfElement(List<WebElement> elements){
        assertFalse(elements.size()>0);
    }

    @Step("verify 2 texts")
    public static void verifyText (String actual, String expected){
        assertEquals(actual, expected);
    }


//    @Step("Verify Element Visually")
//    public static void visualElement(String expectedImageName){
//        try {
//            screen.find(getData("ImageRepos"+expectedImageName+".png"));
//        } catch (FindFailed findFailed) {
//            System.out.println("Error Comparing Image file"+findFailed);
//            fail("Error Comparing Image file"+findFailed);
//        }
//    }
}
