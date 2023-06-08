package utilities;

import org.openqa.selenium.support.PageFactory;
import pageobjects.grafana.AddNewUserPage;
import pageobjects.grafana.EditUserPage;
import pageobjects.grafana.ServerAdminMainPage;
import pageobjects.grafana.ServerAdminMenuPage;

public class ManagePages extends Base {

    public static void initGrafana(){
    grafanaLogin = PageFactory.initElements(driver, pageobjects.grafana.LoginPage.class);
    grafanaMain = PageFactory.initElements(driver,pageobjects.grafana.MainPage.class);
    grafanaLeftMenu = PageFactory.initElements(driver,pageobjects.grafana.LeftMenuPage.class);
    grafanaServer = PageFactory.initElements(driver, ServerAdminMenuPage.class);
    grafanaServerAdminMain = PageFactory.initElements(driver, ServerAdminMainPage.class);
    grafanaAddNewUSer = PageFactory.initElements(driver, AddNewUserPage.class);
    grafanaEditUser = PageFactory.initElements(driver, EditUserPage.class);
    }

    public static void initMuvizu(){
//        muvizuLogin = PageFactory.initElements(driver, pageobjects.muvizu.LoginPage.class);
    }
}
