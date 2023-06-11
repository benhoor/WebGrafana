package pageobjects.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EditUserPage {

    @FindBy(how = How.CSS, using = "div>button[class='css-mk7eo3-button']>span[class='css-1mhnkuh']")
    public WebElement btn_delete_user;

    @FindBy(how = How.CSS, using = "/html/body/div[2]/div[2]/div[2]/div[2]/div/div[2]/button/span")
    public WebElement btn_confirmDelete;
}
