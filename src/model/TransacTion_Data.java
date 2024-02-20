package model;

import java.sql.SQLException;
import java.sql.Statement;

public class Transaction_Data {

    public My_Connection conn;
    public Statement st;
    TransacTion_Data() {
        conn = My_Connection.getInstance();
        st = conn.st;
    }
    public void insert(int r_id, int c_id,int quantity,int amount ) throws SQLException {
        String query = "INSERT INTO RATION_CARD VALUES("+r_id+",'"+c_id+"','"+quantity+"','"+amount+"');";
        st.executeUpdate(query);
    }
}
