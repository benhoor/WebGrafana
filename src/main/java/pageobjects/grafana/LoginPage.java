package pageobjects.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

    @FindBy(how = How.NAME, using = "user")
    public WebElement txt_username;

    @FindBy(how = How.ID, using = "current-password")
    public WebElement txt_password;

    @FindBy(how = How.XPATH, using = "//*[@id=\"reactRoot\"]/div[1]/main/div[3]/div/div[2]/div/div/form/button")
    public WebElement btn_login;

    @FindBy(how = How.XPATH, using = "//*[@id=\"reactRoot\"]/div/main/div[3]/div/div[2]/div/form/div[3]/div[2]/button/span")
    public WebElement btn_skip;

}
