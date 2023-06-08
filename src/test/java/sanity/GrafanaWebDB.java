//package sanity;
//
//import extensions.Verifications;
//import io.qameta.allure.Description;
//import org.testng.annotations.Listeners;
//import org.testng.annotations.Test;
//import utilities.CommonOps;
//import workflows.WebFlows;
//
//import javax.activation.CommandInfo;
//
//@Listeners(utilities.Listeners.class)
//public class GrafanaWebDB extends CommonOps {
//
//    @Test
//    @Description("login with DB cred")
//    public void test01_LoginWithDBCred(){
//        WebFlows.loginDB();
////        Uninterruptibles.sleepUninterruptibly(2,TimeUnit.SECONDS);
//        Verifications.verifyTextInElement(grafanaMain.head_dashboard,"Welcome to Grafana");
//    }
//}
