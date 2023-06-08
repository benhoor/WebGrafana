package pageobjects.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class MainPage {

    @FindBy(how = How.XPATH, using = "//*[@id=\"1\"]/section/div[2]/div/h1")
    public WebElement head_dashboard;

    @FindBy(how = How.XPATH, using = "//*[@class='css-awepoy']")
    public List<WebElement> list_progressSteps;


}
