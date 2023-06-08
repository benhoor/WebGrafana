package pageobjects.grafana;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;

import javax.xml.xpath.XPath;
import java.util.List;

public class LeftMenuPage {

    @FindBy(how = How.XPATH, using = "//*[@id=\"reactRoot\"]/div[1]/div/nav/div[4]/div[1]/div[2]/ul/li[7]/div")
    public WebElement server_admin;

    @FindBy(how = How.XPATH, using = "//*[@id=\"react-aria3682350737-19\"]")
    public WebElement server_admin_from_create_user;

    @FindBy(how = How.XPATH, using = "//*[@id='reactRoot']/div/div/nav/div[3]/a/div")
    public WebElement btn_grafana_home;


}


