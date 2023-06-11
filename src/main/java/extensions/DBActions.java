package extensions;

import com.mysql.cj.protocol.Resultset;
import io.qameta.allure.Step;
import utilities.CommonOps;

import java.sql.SQLException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;


public class DBActions extends CommonOps {

    @Step("Get credentials from database")
    public static List<String> getCredentials (String query){
        List <String> credentials = new ArrayList<String>();
        try {
            rs = stmt.executeQuery(query);
            rs.next();
            credentials.add(rs.getString(1));
            credentials.add(rs.getString(2));

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
return credentials;
    }
}
