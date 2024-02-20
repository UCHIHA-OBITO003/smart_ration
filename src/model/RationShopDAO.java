package model;
import java.sql.SQLException;
import java.sql.Statement;

public class RationShopDAO {
    public My_Connection conn;
    public Statement st;
    RationShopDAO() {
        conn = My_Connection.getInstance();
        st = conn.st;
    }

    public void insert(int c_id, String category, int quantity) throws SQLException {
        String query = "INSERT INTO RATION_SHOP VALUES("+c_id+",'"+category+"',"+quantity+");";
        st.executeUpdate(query); 
    }
}
