package pageobjects.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class ServerAdminMainPage {

    @FindBy(how = How.XPATH, using = "//a[@class='css-10i9w80']")
    public List<WebElement> rows;

    @FindBy(how = How.XPATH, using = "//button[@class='css-1wzt38u-button']")
    public List<WebElement> delete_buttons;

    @FindBy(how = How.CLASS_NAME, using = "css-1mhnkuh")
    public WebElement btn_newUser;

    @FindBy(how = How.CSS, using = "input[placeholder='Search user by login, email, or name.']")
    public WebElement txt_search;



}
