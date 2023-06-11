package utilities;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.sikuli.script.Screen;
import org.testng.asserts.SoftAssert;
import pageobjects.grafana.AddNewUserPage;
import pageobjects.grafana.EditUserPage;
import pageobjects.grafana.ServerAdminMainPage;
import pageobjects.grafana.ServerAdminMenuPage;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;


public class Base {

    protected static WebDriver driver;
    protected static WebDriverWait wait;
    protected static Actions action;
    protected static SoftAssert softAssert;



    //page objects - Web
    protected static pageobjects.grafana.LoginPage grafanaLogin;
    protected static pageobjects.grafana.MainPage grafanaMain;
    protected static pageobjects.grafana.LeftMenuPage grafanaLeftMenu;
    protected static ServerAdminMenuPage grafanaServer;
    protected static ServerAdminMainPage grafanaServerAdminMain;
    protected static AddNewUserPage grafanaAddNewUSer;
    protected static EditUserPage grafanaEditUser;
    protected static String platform;
    //    protected static pageobjects.muvizu.LoginPage muvizuLogin;

//Rest API
    protected static RequestSpecification httpRequest;
    protected static Response response;
    protected static JSONObject params = new JSONObject();
    protected static JsonPath jp;

//  Database

    protected static Connection con;
    protected static Statement stmt;
    protected static ResultSet rs;
}
