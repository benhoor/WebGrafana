package pageobjects.grafana;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddNewUserPage {

    @FindBy(how = How.XPATH, using = "//*[@id=\"reactRoot\"]/div[1]/main/div[3]/div/div[1]/div/div[2]/form/div[1]/div[2]/div")
    public WebElement txt_name;

    @FindBy(how = How.ID, using = "name-input")
    public WebElement insert_txt_name;

    @FindBy(how = How.XPATH, using = "//*[@id=\"email-input\"]")
    public WebElement txt_email;

    @FindBy(how = How.ID, using = "username-input")
    public WebElement txt_userName;

    @FindBy(how = How.ID, using = "password-input")
    public WebElement txt_password;

    @FindBy(how = How.CLASS_NAME, using = "css-1sara2j-button")
    public WebElement btn_create;


}
