package model;

import java.sql.SQLException;
import java.sql.Statement;

public class Family_MembersDAO {
    public My_Connection conn;
    public Statement st;
    Family_MembersDAO() {
        conn = My_Connection.getInstance();
        st = conn.st;
    }
    public void insert(int Ration_uid, String names) throws SQLException {
        String query = "INSERT INTO FAMILY_MEMBERS VALUES("+Ration_uid+",'"+names+"');";
        st.executeUpdate(query);
    }
}
