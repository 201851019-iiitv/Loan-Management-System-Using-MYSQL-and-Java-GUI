import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
import javax.swing.*;

import com.mysql.jdbc.PreparedStatement;
public class Clined_Details{

   Clined_Details(String user,String pass,String amount1){
       JFrame f = new JFrame();
       JButton b1 = new JButton("Pay The Installment");
       JButton b2 = new JButton("Calculate Emi");
       JButton b3 = new JButton("Check Remaining Balance");
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
       		Scanner sc=new Scanner(System.in);
       		System.out.println("Enter the amount whatever to pay !!");
       		String  bal=sc.next();
       		
       		try
   		    {  
       			Class.forName("com.mysql.jdbc.Driver");  
     		      Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/project","root","ambesh");
     		      
     		   String res=String.valueOf(Integer.parseInt(amount1)-Integer.parseInt(bal));
     		  String str3="\""+res+"\"";
     		     String sql="Update new_application  set amount="+str3+" where username= "+user +"and password ="+pass;
  		         Statement stmt=con.createStatement();
    			 stmt.executeUpdate(sql); 
    			 System.out.println("Update Succesfully");
    			 String sql1="select amount from new_application  where username= "+user +"and password ="+pass;
    			 ResultSet rs=stmt.executeQuery(sql1); 
     			if(rs.next())
     			{  		
     				System.out.println("Remaining balance  is:");
       				System.out.println(rs.getString(1));
       				
       				       			
       				
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
          		
          		Loans obj=new Loans();
          		obj.createAndShowGUI(amount1);
          		
          		
          		
          	}
          });
       
       b3.addActionListener(new ActionListener() {
          	public void actionPerformed(ActionEvent e) {
          		System.out.println("Remaining amount is :"+amount1);
          	}
          });
       
       
   }

}