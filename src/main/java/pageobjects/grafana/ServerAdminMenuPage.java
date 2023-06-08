package pageobjects.grafana;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ServerAdminMenuPage {
    @FindBy(how = How.XPATH, using = "//*[@id=\"react-aria7694796292-20\"]/div/div[1]/div[2]/li[4]/div/a")
    public WebElement link_users;

    //*[@data-key='global-users.csv']

    @FindBy(how = How.XPATH, using = "//*[@id=\"react-aria3816310501-19\"]")
    public WebElement try_element;




}
