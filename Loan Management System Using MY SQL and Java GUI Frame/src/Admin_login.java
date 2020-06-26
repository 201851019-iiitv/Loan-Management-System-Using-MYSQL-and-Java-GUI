
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
import javax.swing.*;

import com.mysql.jdbc.PreparedStatement;
public class Admin_login{

   Admin_login(){
       JFrame f = new JFrame();
       JButton b1 = new JButton("PENDING NEW APPLICATION");
       JButton b2 = new JButton("PASSED NEW APPLICATION");
       JButton b3 = new JButton("SPECIFIC USER APPLICATION");
      // JButton b = new JButton("NEW APPLICATION");
       b1.setBounds(100,150,400,50);
        b2.setBounds(100,250,400,50);
         b3.setBounds(100,350,400,50);
       f.setSize(600,600);
       f.add(b1);
       f.add(b2);
       f.add(b3);
       f.setLayout(null);
       f.setVisible(true);
       
       
       
       b1.addActionListener(new ActionListener() {
       	public void actionPerformed(ActionEvent e) {
       		
       		try
   		    {  
       			Class.forName("com.mysql.jdbc.Driver");  
     		      Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/project","root","ambesh");
     		      
     		      
     		      //String query="select  name,gender,dob,amount,no_of_year,loan_type,status  from new_application  where username=? && password=?  ";
     		     Statement stmt=con.createStatement();
     		      ResultSet rs=stmt.executeQuery("select name,gender,dob,amount,no_of_year,loan_type,status\r\n" + 
     		      		"from new_application\r\n" + 
     		      		"where status=\"Pending\";");
     		     System.out.println("Name  "+" | "+"Gender "+" | "+"DOB "+" | "+"Amount "+" | "+"No of Year "+" | "+"Loan Type"+" | "+"Status ");
       			while(rs.next())
       			{
       				
       				System.out.println(rs.getString(1)+" | "+rs.getString(2)+" | "+rs.getString(3)+" | "+rs.getString(4)+" | "+rs.getString(5)+" | "+rs.getString(6)+" | "+rs.getString(7));
       				
       				       			
       				
       			}
       		
       		
       			con.close();  
   		    }  
   		     catch(Exception e1)
   		     { 
   			   System.out.println(e1);
   		     } 
   		
       		
       		
       	}
       });
       
     
       b2.addActionListener(new ActionListener() {
          	public void actionPerformed(ActionEvent e) {
          		
          		try
      		    {  
          			Class.forName("com.mysql.jdbc.Driver");  
        		      Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/project","root","ambesh");
        		      
        		      
        		      //String query="select  name,gender,dob,amount,no_of_year,loan_type,status  from new_application  where username=? && password=?  ";
        		     Statement stmt=con.createStatement();
        		      ResultSet rs=stmt.executeQuery("select name,gender,dob,amount,no_of_year,loan_type,status\r\n" + 
        		      		"from new_application\r\n" + 
        		      		"where status=\"Passed\";");
        		     System.out.println("Name  "+" | "+"Gender "+" | "+"DOB "+" | "+"Amount "+" | "+"No of Year "+" | "+"Loan Type"+" | "+"Status ");
          			while(rs.next())
          			{
          				
          				System.out.println(rs.getString(1)+" | "+rs.getString(2)+" | "+rs.getString(3)+" | "+rs.getString(4)+" | "+rs.getString(5)+" | "+rs.getString(6)+" | "+rs.getString(7));
          				
          				       			
          				
          			}
          		
          		
          			con.close();  
      		    }  
      		     catch(Exception e1)
      		     { 
      			   System.out.println(e1);
      		     } 
      		
          		
          		
          	}
          });
       
       b3.addActionListener(new ActionListener() {
          	public void actionPerformed(ActionEvent e) {
          		
          		Specific_User ob=new Specific_User();
          	}
          });
       
       
   }

}