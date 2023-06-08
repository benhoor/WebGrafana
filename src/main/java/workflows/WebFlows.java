package workflows;
import com.google.common.util.concurrent.Uninterruptibles;
import extensions.DBActions;
import extensions.UIActions;
import extensions.Verifications;
import io.qameta.allure.Step;
import utilities.CommonOps;

import java.util.List;
import java.util.concurrent.TimeUnit;
public class WebFlows extends CommonOps {

    @Step("Business flow: login")
    public static void login(String user, String password) {
//        Uninterruptibles.sleepUninterruptibly(2000, TimeUnit.MILLISECONDS);
        UIActions.updateText(grafanaLogin.txt_username, user);
//        Uninterruptibles.sleepUninterruptibly(2000, TimeUnit.MILLISECONDS);
        UIActions.updateText(grafanaLogin.txt_password, password);
//        Uninterruptibles.sleepUninterruptibly(2000, TimeUnit.MILLISECONDS);
        UIActions.click(grafanaLogin.btn_login);
        UIActions.click(grafanaLogin.btn_skip);
//        Uninterruptibles.sleepUninterruptibly(10,TimeUnit.SECONDS);

    }

    @Step("Business flow: create new user")
    public static void addUser(String name, String email, String userName, String pass) {
        UIActions.click(grafanaServerAdminMain.btn_newUser);
        UIActions.click(grafanaAddNewUSer.txt_name);
        UIActions.updateText(grafanaAddNewUSer.insert_txt_name, name);
        UIActions.updateText(grafanaAddNewUSer.txt_email, email);
        UIActions.updateText(grafanaAddNewUSer.txt_userName, userName);
        UIActions.updateText(grafanaAddNewUSer.txt_password, pass);
        UIActions.click(grafanaAddNewUSer.btn_create);
        Uninterruptibles.sleepUninterruptibly(1, TimeUnit.SECONDS);
    }

    @Step("Business flow: delete last user")
    public static void deleteLastUser() {
        UIActions.click(grafanaServerAdminMain.rows.get(grafanaServerAdminMain.rows.size() - 1));
        UIActions.click(grafanaServerAdminMain.delete_buttons.get(grafanaServerAdminMain.delete_buttons.size() - 1));
//        UIActions.click(grafanaEditUser.btn_delete_user);
        UIActions.click(grafanaEditUser.btn_confirmDelete);


    }

    @Step("Business flow: search and verify user")
    public static void searchAndVerifyUser(String user, String shouldExist) {
        UIActions.updateTextHuman(grafanaServerAdminMain.txt_search, user);
        if (shouldExist.equalsIgnoreCase("exist"))
            Verifications.existanceOfElement(grafanaServerAdminMain.rows);
        else if (shouldExist.equalsIgnoreCase("not-exist"))
            Verifications.nonExistanceOfElement(grafanaServerAdminMain.rows);
        else
            throw new RuntimeException("invalid expected output - should be exist or not-exist");


    }

    @Step("Business flow: login to Grafana with DB credentials")
    public static void loginDB() {
        String query = "SELECT name, password FROM Employees WHERE id = '3'";
        List<String> cred = DBActions.getCredentials(query);
        UIActions.updateText(grafanaLogin.txt_username, cred.get(0));
        UIActions.updateText(grafanaLogin.txt_password, cred.get(1));
        UIActions.click(grafanaLogin.btn_login);
        UIActions.click(grafanaLogin.btn_skip);
    }

}

