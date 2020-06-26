import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.mysql.jdbc.PreparedStatement;

  class Specific_User  extends JFrame 
implements ActionListener {
	 private Container c;
	    private JLabel dob; 
	    private JComboBox date; 
	    private JComboBox month; 
	    private JComboBox year; 
	    private JLabel name; 
	    private JTextField tname; 	    
	    private JButton sub; 
	    
	    private JLabel title; 
	    
	    String Name,Dob;
	
	 private String dates[] 
		        = { "1", "2", "3", "4", "5", 
		            "6", "7", "8", "9", "10", 
		            "11", "12", "13", "14", "15", 
		            "16", "17", "18", "19", "20", 
		            "21", "22", "23", "24", "25", 
		            "26", "27", "28", "29", "30", 
		            "31" }; 
		    private String months[] 
		        = { "Jan", "feb", "Mar", "Apr", 
		            "May", "Jun", "July", "Aug", 
		            "Sup", "Oct", "Nov", "Dec" }; 
		    private String years[] 
		        = { "1995", "1996", "1997", "1998", 
		            "1999", "2000", "2001", "2002", 
		            "2003", "2004", "2005", "2006", 
		            "2007", "2008", "2009", "2010", 
		            "2011", "2012", "2013", "2014", 
		            "2015", "2016", "2017", "2018", 
		            "2019" }; 
		  
		
	public  Specific_User()
	{
		
		
		setTitle("Specific_User"); 
        setBounds(400, 90, 500,500); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setResizable(false);
		 c = getContentPane(); 
	        c.setLayout(null); 
        //JButton b1 = new JButton();
        //JButton b2 = new JButton();  
	        
	        

	        title = new JLabel("Specific User"); 
	        title.setFont(new Font("Arial", Font.PLAIN, 30)); 
	        title.setSize(300, 30); 
	        title.setLocation(200, 30); 
	        c.add(title); 
	        
	        
	        name = new JLabel("Name"); 
	        
	        name.setFont(new Font("Arial", Font.PLAIN, 20)); 
	        name.setSize(100, 20); 
	        name.setLocation(100, 100); 
	        c.add(name);
	        
	        
	        tname = new JTextField(); 
	        tname.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        tname.setSize(190, 20); 
	        tname.setLocation(200, 100); 
	        c.add(tname); 

	        
         
            dob = new JLabel("DOB"); 
	        dob.setFont(new Font("Arial", Font.PLAIN, 20)); 
	        dob.setSize(150, 20); 
	        dob.setLocation(100, 150); 
	        c.add(dob); 
           
            date = new JComboBox(dates); 
	        date.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        date.setSize(40, 20); 
	        date.setLocation(200, 150); 
	        c.add(date);   
	   
	        month = new JComboBox(months); 
	        month.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        month.setSize(60, 20); 
	        month.setLocation(250, 150); 
	        c.add(month); 
	  
	        year = new JComboBox(years); 
	        year.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        year.setSize(100, 20); 
	        year.setLocation(320, 150); 
	        c.add(year); 
		
	        
	        
	        sub = new JButton("Get data"); 
	        sub.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        sub.setSize(100, 20); 
	        sub.setLocation(250, 250); 
	        sub.addActionListener(this); 
	        c.add(sub); 
	        setVisible(true); 
	        
	        
	        Name=tname.getText();
	        
	         Dob=(String)date.getSelectedItem()+ "/" + (String)month.getSelectedItem() + "/" + (String)year.getSelectedItem(); 
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == sub) { 
			
			
			String  Name=tname.getText();
			String Dob=(String)date.getSelectedItem()+ "/" + (String)month.getSelectedItem() + "/" + (String)year.getSelectedItem(); 
			
			 String str="\""+Name+"\"";
     		 String str1="\""+Dob+"\"";
		try
	    {  
			Class.forName("com.mysql.jdbc.Driver");  
		      Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/project","root","ambesh");
		  
		      String sql="select name,gender,dob,amount,no_of_year,loan_type,status from new_application  where name= "+str +"and dob="+str1;
		      System.out.println(sql);
		      
		         Statement stmt=con.createStatement();
 			  ResultSet rs=stmt.executeQuery(sql); 
 			if(rs.next())
 			{
 				System.out.println("Name  "+" | "+"Gender "+" | "+"DOB "+" | "+"Amount "+" | "+"No of Year "+" | "+"Loan Type"+" | "+"Status ");
 				System.out.println(rs.getString(1)+" | "+rs.getString(2)+" | "+rs.getString(3)+" | "+rs.getString(4)+" | "+rs.getString(5)+" | "+rs.getString(6)+" | "+rs.getString(7));
 				
 				JOptionPane.showMessageDialog(sub, "Get data successfully!!");
 				
 				if(!rs.getString(7).contentEquals("Passed") && !rs.getString(7).contentEquals("passed") && !rs.getString(7).contentEquals("PASSED")  )
 				{
 				Scanner sc=new Scanner(System.in);
 				System.out.println("Update status(Passed/Rejected):" );
 				String res=sc.next();
 				
 				if(res.contentEquals("Rejected")||res.contentEquals("REJECTED")||res.contentEquals("rejected"))
 				{
 					
 					 String sql2="delete  from new_application where name= "+ str +"and dob= "+str1;	 
 					stmt.executeUpdate(sql2);
 					System.out.println("Deleted Succesfully");
 					
 				}
 				else if(res.contentEquals("Passed") || res.contentEquals("passed")|| res.contentEquals("PASSED"))
 				{
 				 String str3="\""+"Passed"+"\""; 
     		     String sql3="Update new_application  set status="+str3+" where name= "+str +"and dob="+str1;
     		    stmt.executeUpdate(sql3);
					System.out.println("Updated successfully");
     		     
 				}
 				}
 			
 				con.close();  
 			}
 			
 			
 			else
 				JOptionPane.showMessageDialog(sub, "Invalid Name or Date of Birth !!");
 				con.close();  
 		
 			
		    }  
 		catch ( Exception e1) {
             System.out.println(e1);
 		
 		}
 		
 	}
     		
		
		      	
			
	

		
	}
}
