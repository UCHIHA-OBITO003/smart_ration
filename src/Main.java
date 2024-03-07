package src;

import control.Admin_Control;
import control.get_otp;
import model.My_Connection;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.SortedMap;



public class Main {
    public static void main(String[] args) throws SQLException {
        My_Connection conn = My_Connection.getInstance();
        String Admin_name="root";
        String Admin_pass="0000";

        while(true)
        {
            Scanner in=new Scanner(System.in);
            int crude_choice =0;
            System.out.println("Press 1 for Admin login");
            System.out.println("Press 2 for Employee login");
            System.out.println("Press 3 for User login");
            System.out.println("press 4 for exit");

             try {
                 crude_choice = in.nextInt();
             }catch (Exception e)
             {
                 System.out.println("please enter a valid number");
             }
             if(crude_choice==1)
             {
                 while(true)
                 {
                     System.out.println("enter the Admin name");
                     String admin_temp=in.next();
                     if(admin_temp.equals(Admin_name))
                     {
                         System.out.println("enter the password");
                         String pass_temp=in.next();
                         if(pass_temp.equals(Admin_pass))
                         {
                               Admin_Control.options();
                          }
                     }
                 }
             }

        }

      //  get_otp.sendOTP("9042641209","567432");


    }
}
