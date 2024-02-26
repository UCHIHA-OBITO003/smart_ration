package control;

import java.sql.SQLException;
import java.util.Scanner;
import model.employeeDAO;

public class user_control {

     public static void add_Employee() throws SQLException
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the name");
         String name= sc.next();
         String ph_no="";
         boolean flag_ph_no=false;
         while (!flag_ph_no) {
             System.out.println("Enter the phone number");
             String temp_ph=sc.next();
             if(validator.isValidPhoneNumber(temp_ph))
             {
                 ph_no =temp_ph;
                 flag_ph_no=true;
             }
         }
         System.out.println("Enter email id");
         String email="";
         boolean email_flag=false;
         while(!email_flag)
         {
             String email_temp=sc.next();
             if(validator.isValidEmail(email_temp))
             {
                 email=email+email_temp;
                 email_flag=true;
             }
             else{
                 System.out.println("Wrong email");
             }

         }
         sc.nextLine();
         System.out.println("Enter address");
         String e_address=sc.nextLine();
         String pass="";
         boolean pass_flag=false;
         while(!pass_flag)
         {
             System.out.println("Enter Password");
             String pass_temp=sc.next();
             if(validator.isValidPassword(pass_temp))
             {
                 pass=pass+pass_temp;
                 pass_flag=true;
             }

         }

         employeeDAO emp_dao=new employeeDAO();
         String e_id = genrate_otp.generateEID();
         emp_dao.insert(e_id,name,ph_no,email,e_address,pass);
     }


}
