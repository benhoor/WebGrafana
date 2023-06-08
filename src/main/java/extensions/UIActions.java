package extensions;

import com.google.common.util.concurrent.Uninterruptibles;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import utilities.CommonOps;

import java.util.concurrent.TimeUnit;

public class UIActions extends CommonOps {

    @Step("Click on element")
    public static void click(WebElement elem){
        wait.until(ExpectedConditions.elementToBeClickable(elem));
//        Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
        elem.click();
    }

    @Step("Update text in element")
    public static void updateText(WebElement elem, String text){
        wait.until(ExpectedConditions.visibilityOf(elem));
        elem.sendKeys(text);
    }

    @Step("Update text in element as human")
    public static void updateTextHuman(WebElement elem, String text){
        wait.until(ExpectedConditions.visibilityOf(elem));
        for (char ch: text.toCharArray()){
            Uninterruptibles.sleepUninterruptibly(300, TimeUnit.MILLISECONDS);
            elem.sendKeys(ch+"");
        }
    }

    @Step("Update dropdown element")
    public static void updateDropdown(WebElement elem, String text){
        wait.until(ExpectedConditions.visibilityOf(elem));
        Select dropDown = new Select(elem);
        dropDown.selectByVisibleText(text);
    }

    @Step("MouseHover element")
    public static void mouseHover (WebElement elem1, WebElement elem2)  {
        action.moveToElement(elem1).perform();
//        Uninterruptibles.sleepUninterruptibly(1, TimeUnit.SECONDS);
        action.moveToElement(elem1).perform();
        action.click().build().perform();

//        action.moveToElement(elem1).build().perform();
//        Uninterruptibles.sleepUninterruptibly(1, TimeUnit.SECONDS);
//        action.moveToElement(elem2).click().build().perform();
//        action.moveToElement(elem1).moveToElement();
//        action.moveToElement(elem2).build().perform();

        Uninterruptibles.sleepUninterruptibly(1, TimeUnit.SECONDS);
    }

    public static void mouseHoverFromUseres(WebElement elem1, WebElement elem2){
        action.moveToElement(elem1).moveToElement(elem2).click().build().perform();

    }

    public static void doubleClick(WebElement elem){
        action.doubleClick(elem);
    }

    public static void longClick(WebElement elem){
        action.clickAndHold(elem);
    }
}
