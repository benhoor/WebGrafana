package sanity;

import extensions.ApiActions;
import extensions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.ApiFlows;

public class GrafanaAPI extends CommonOps {

    @Test(description = "Test01: Get team's property")
    @Description("this test verifies team's property")
    public void test01_VerifyTeam(){
        Verifications.verifyText(ApiFlows.getTeamProperty("teams[0].name"), "Teamtam");
    }

    @Test(description = "Test02: Add team and verify")
    @Description("this test adds a team and verifies it")
    public void test02_AddTeamAndVerify(){
        ApiFlows.postTeam("EfiTeam", "efi@gmail.com");
        Verifications.verifyText(ApiFlows.getTeamProperty("teams[0].name"), "EfiTeam");
    }

    @Test(description = "Test03: Update team and verify")
    @Description("this test updates a team and verifies it")
    public void test03_UpdateTeamAndVerify(){
        String id = ApiFlows.getTeamProperty("teams[0].id");
        ApiFlows.updateTeam("EfiTeam", "efi@team.com", id);
        Verifications.verifyText(ApiFlows.getTeamProperty("teams[0].email"), "efi@team.com");
    }

    @Test(description = "Test04: Delete team")
    @Description("this test deletes a team and verifies it")
    public void test04_DeleteTeamAndVerify(){
        String id = ApiFlows.getTeamProperty("teams[0].id");
        ApiFlows.deleteTeam(id);
        Verifications.verifyText(ApiFlows.getTeamProperty("totalCount"), "1");
    }
}
