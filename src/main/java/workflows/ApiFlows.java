package workflows;

import extensions.ApiActions;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import utilities.CommonOps;

public class ApiFlows extends CommonOps {

    @Step("Business flow: get team property")
    @Description("This test verifies team property")
    public static String getTeamProperty(String jPath){
        response = ApiActions.get("/api/teams/search");
        return ApiActions.extractFromJSON(response, jPath);
    }

    @Step("Business flow: create new team")
    @Description("This test creates a new team")
    public static void postTeam(String name, String email){
        params.put("name", name);
        params.put("email", email);
        ApiActions.post(params, "/api/teams");
    }

    @Step("Business flow: update team")
    @Description("This test updates a team's property")
    public static void updateTeam(String name, String email, String id){
        params.put("name", name);
        params.put("email", email);
        ApiActions.put(params, "/api/teams/"+id);
    }

    @Step("Business flow: delete team")
    @Description("This test deletes a team")
    public static void deleteTeam(String id){

        ApiActions.delete(id);
    }
}
