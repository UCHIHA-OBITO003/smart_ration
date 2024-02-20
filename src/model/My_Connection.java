package model;

import java.sql.*;

public class My_Connection {
    private static My_Connection instance;
    public Connection con;
    public Statement st;
    public static My_Connection getInstance() {
            // If the instance is null, create a new instance
        if (instance == null) {
            instance = new My_Connection();
        }
        return instance;
        }

    private My_Connection(){
        try {
            String url = "jdbc:mysql://localhost:3306/Smart_Ration";

            String username = "root";
            String pasword = "1515";

            con = DriverManager.getConnection(url, username, pasword);
            st = con.createStatement();


        }catch(Exception ex)
        {
            System.out.println("exception");
        }
    }
}

