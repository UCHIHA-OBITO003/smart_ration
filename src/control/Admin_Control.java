package control;

import java.sql.SQLException;
import java.util.Scanner;

public class Admin_Control {

    public static void options() throws SQLException
    {
        while(true) {
            int Ad_num=0;
            Scanner Ad_sc=new Scanner(System.in);
            System.out.println("Press 1 for user control");
            System.out.println("Press 2 for shop control");
            try {
                Ad_num = Ad_sc.nextInt();
            }catch (Exception ex)
            {
                System.out.println("Enter a valid number");
            }

            if(Ad_num==1)
            {
                    user_control.add_Employee();

            }
        }
    }
}
