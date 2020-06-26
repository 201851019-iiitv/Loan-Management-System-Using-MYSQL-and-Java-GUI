import java.awt.Container;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.mysql.jdbc.PreparedStatement;
import javax.swing.JOptionPane;

public class exist_cusstomer {
   private  JLabel l3;
	  private  JLabel l1;
	   private JTextField t2 ;
	 private  JPasswordField p;
	 private Container c; 
	 private JButton b;
	 private JLabel l4; 
	
	exist_cusstomer(){
	JFrame f = new JFrame("exist customer");
	
		   l1 = new JLabel("username");
	        l1.setBounds(100,100,100,40);
	        f.add(l1);
	         t2 = new JTextField();
	        t2.setBounds(220,100,100,40);
	        f.add(t2);
	        
	        
	        l3 = new JLabel("password");
	        l3.setBounds(100,150,100,40);
	        f.add(l3);
	         p = new JPasswordField();
	        p.setBounds(220,150,100,40);
	        f.add(p);
	        
		
	        b = new JButton("Login");
	        b.setBounds(155,240,80,30);
	        f.add(b);
	        
	        l4 = new JLabel();
	        l4.setBounds(140,280,150,30);
	        f.add(l4);
	        
	      	       
	       f.setSize(600,600);
			f.setLayout(null);
			f.setVisible(true);
	        
	        b.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {	        		
	        		
	        		String user=t2.getText();
	     	       String pass=p.getText();
	        		
	        		 //System.out.println(user +" "+pass);
	        		
	        		 String str="\""+user+"\"";
	        		 String str1="\""+pass+"\"";
	        		 
	        		 
	      		      //System.out.println(str1+" "+str);
	        		try
	    		    {  
	        			Class.forName("com.mysql.jdbc.Driver");  
	      		      Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/project","root","ambesh");
	      		    
	      		      String sql="select name,gender,dob,amount,no_of_year,loan_type,status from new_application  where username= "+str +"and password ="+str1;
	      		         Statement stmt=con.createStatement();
	        			  ResultSet rs=stmt.executeQuery(sql); 
	        			if(rs.next())
	        			{
	        				System.out.println("Name  "+" | "+"Gender "+" | "+"DOB "+" | "+"Amount "+" | "+"No of Year "+" | "+"Loan Type"+" | "+"Status ");
	        				System.out.println(rs.getString(1)+" | "+rs.getString(2)+" | "+rs.getString(3)+" | "+rs.getString(4)+" | "+rs.getString(5)+" | "+rs.getString(6)+" | "+rs.getString(7));
	        				
	        				JOptionPane.showMessageDialog(b, "You have successfully logged in");
	        				String s3=rs.getString(7);
	        				//System.out.println(s3);
	        				if(s3.contentEquals("Passed")|| s3.contentEquals("PASSED") ||s3.contentEquals("passed"))
	        				{
	        					
	        				Clined_Details ob=new Clined_Details(str,str1,rs.getString(4));
	        					
	        				}
	        				
	        				
	        				
	        				con.close();  
	        					
	        
	        			}
	        			else
	        				JOptionPane.showMessageDialog(b, "Wrong Username & Password or Appliccation rejected");
	        				con.close();  
	        		
	        			
	    		    }  
	        		catch ( Exception e1) {
	                    System.out.println(e1);
	        		
	        		}
	        		
	        	}
	        });
	        
	        
	        
		
		
				
 }
	
}
