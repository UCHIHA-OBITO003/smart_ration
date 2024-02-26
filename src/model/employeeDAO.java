package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



    public class employeeDAO {
        public My_Connection conn;
        public Statement st;
        public employeeDAO() {
            conn = My_Connection.getInstance();
            st = conn.st;
        }

        public void insert( String e_id,String e_name, String p_no,String e_mail ,String address, String pass) throws SQLException {
            String query = "INSERT INTO EMPLOYEE VALUES('"+e_id+"','"+e_name+"','"+p_no+"','"+e_mail+"','"+address+"','"+pass+"');";
            st.executeUpdate(query);
        }

        public int getId() throws SQLException {
            String q = "SELECT * FROM EMPLOYEE;";
            ResultSet rs = st.executeQuery(q);
            int id = 0;
            while(rs.next()){
                id = rs.getInt(1);
            }

            return id;
        }

        public String getEID(String p_no) throws SQLException {
            String q = "SELECT E_ID FROM EMPLOYEE WHERE E_PHNO ="+p_no+";";
            ResultSet rs = st.executeQuery(q);
            rs.next();
            return rs.getString(1);
        }

        public boolean removeID(String e_id) {
            try {
                String q = "DELETE FROM EMPLOYEE WHERE E_ID = '" + e_id + "';";
                st.executeUpdate(q);
                return true;
            }
            catch (Exception ex){
                return false;
            }
        }

    }


