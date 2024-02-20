package model;

import java.sql.SQLException;
import java.sql.Statement;

public class RationCardDAO {
    public My_Connection conn;
    public Statement st;
    RationCardDAO() {
        conn = My_Connection.getInstance();
        st = conn.st;
    }

    public void insert(int id, String head, String address, String p_no, int balance, String type) throws SQLException {
        String query = "INSERT INTO RATION_CARD VALUES("+id+",'"+head+"','"+address+"','"+p_no+"',"+balance+",'"+type+"');";
        st.executeUpdate(query);
    }

    public void delete(int id) throws SQLException{
        String query = "DELETE FROM RATION_CARD WHRE RATION_UID = "+id;
        st.executeUpdate(query);
    }
}
