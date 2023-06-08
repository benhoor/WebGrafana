package sanity;

import com.google.common.util.concurrent.Uninterruptibles;
import extensions.UIActions;
import extensions.Verifications;
import io.qameta.allure.Description;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.WebFlows;
import java.util.concurrent.TimeUnit;

@Listeners(utilities.Listeners.class)
public class GrafanaWeb extends CommonOps {


//    @Test(description = "login")
    @Test
    @Description("login")
    public void test01_verifyHeader(){
        WebFlows.login("admin", "admin");
        Uninterruptibles.sleepUninterruptibly(2,TimeUnit.SECONDS);
        Verifications.verifyTextInElement(grafanaMain.head_dashboard,"Welcome to Grafana");
    }

    @Test (description = "Test02 - Verify Default Users")
    @Description("This test verifies Users")
    public void test02_verifyDefaultUsers(){
//        WebFlows.login("admin", "admin");
//        Uninterruptibles.sleepUninterruptibly(4, TimeUnit.SECONDS);
        UIActions.mouseHover(grafanaLeftMenu.server_admin, grafanaServer.link_users);
        Uninterruptibles.sleepUninterruptibly(4, TimeUnit.SECONDS);
        Verifications.numberOfElements(grafanaServerAdminMain.rows, 1);

    }

    @Test (description = "Test03 - Verify new users.csv")
    @Description("This test verifies New Users")
    public void test03_verifyNewUser(){
        UIActions.mouseHover(grafanaLeftMenu.server_admin, grafanaServer.link_users);
        WebFlows.addUser("efrat", "a@gmail.com", "efratb", "12345");
//        UIActions.click(grafanaLeftMenu.btn_grafana_home);
//        Uninterruptibles.sleepUninterruptibly(1, TimeUnit.SECONDS);
        UIActions.click(grafanaLeftMenu.server_admin);
        Verifications.numberOfElements(grafanaServerAdminMain.rows,2);

    }

    @Test (description = "Test03 - Delete User")
    @Description("This test verifies delete Users")
    public void test04_verifyDeleteUser(){
        UIActions.mouseHover(grafanaLeftMenu.server_admin, grafanaServer.link_users);
        WebFlows.deleteLastUser();
//        Verifications.numberOfElements(grafanaServerAdminMain.rows,1);

    }

    @Test (description = "Test05 - Verify list")
    @Description("This test verifies list")
    public void test05_verifyProgressSteps(){
        Verifications.visibilityOfElements(grafanaMain.list_progressSteps);
    }



    @Test (description = "Test06 - Search Users", dataProvider = "data-provider-users", dataProviderClass = utilities.ManangeDDT.class)
    @Description("This test searches Users in a table using DDT")
    public void test06_searchUsers(String user, String shouldExist){
        UIActions.mouseHover(grafanaLeftMenu.server_admin, grafanaServer.link_users);
        WebFlows.searchAndVerifyUser(user, shouldExist);
    }
//    @Test (description = "Test06 - Verify avatar")
//    @Description("This test verifies avatar icon")
//    public void test06_verifyAvatarIcon(){
//        Verifications.visualElement("Grafana-Avatar");
//    }
}
