package model;

import java.sql.SQLException;
import java.sql.Statement;

public class RationCardDAO {
    public My_Connection conn;
    public Statement st;
    public RationCardDAO() {
        conn = My_Connection.getInstance();
        st = conn.st;
    }

    public void insert(int id, String head, String address, String p_no, int balance, String type,String mail) throws SQLException {
        String query = "INSERT INTO RATION_CARD VALUES("+id+",'"+head+"','"+address+"','"+p_no+"',"+balance+",'"+type+"','"+mail+"');";
        st.executeUpdate(query);
    }

    public void delete(int id) throws SQLException{
        String query = "DELETE FROM RATION_CARD WHERE RATION_UID = "+id;
        st.executeUpdate(query);
    }
    public void update_head(int Ration_uid, String head) throws SQLException {
        String query = "UPDATE RATION_CARD SET FAMILY_HEAD  = " + head + "WHERE RATION_UID=" + Ration_uid + ");";
        st.executeUpdate(query);
    }
    public void update_address(int Ration_uid, String address) throws SQLException {
        String query = "UPDATE RATION_CARD SET address  = " + address + "WHERE RATION_UID=" + Ration_uid + ");";
        st.executeUpdate(query);
    }
    public void update_phno(int Ration_uid, String ph_no) throws SQLException {
        String query = "UPDATE RATION_CARD SET ph_no  = " + ph_no + "WHERE RATION_UID=" + Ration_uid + ");";
        st.executeUpdate(query);
    }
    public void update_balance(int Ration_uid, int balance) throws SQLException {
        String query = "UPDATE RATION_CARD SET balance  = " + balance + "WHERE RATION_UID=" + Ration_uid + ");";
        st.executeUpdate(query);
    }
    public void card_type(int Ration_uid, String card_type) throws SQLException {
        String query = "UPDATE RATION_CARD SET ph_no  = " + card_type+ "WHERE RATION_UID=" + Ration_uid + ");";
        st.executeUpdate(query);
    }

    public void user_mail(int Ration_uid, String usermail) throws SQLException {
        String query = "UPDATE RATION_CARD SET user_mail  = " + usermail+ "WHERE RATION_UID=" + Ration_uid + ");";
        st.executeUpdate(query);
    }

}
