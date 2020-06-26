
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;
import java.awt.im.InputContext; 


class Registration   extends JFrame 
implements ActionListener {	  
	  
	
	  
	// Driver Code 
	
		 // Components of the Form 
	    private Container c; 
	    private JLabel title; 
	    private JLabel name; 
	    private JTextField tname; 
	    private JLabel mno; 
	    private JTextField tmno; 
	    private JLabel gender; 
	    private JRadioButton male; 
	    private JRadioButton female; 
	    private JRadioButton Other; 
	    private ButtonGroup gengp; 
	    private JLabel dob; 
	    private JComboBox date; 
	    private JComboBox month; 
	    private JComboBox year; 
	    private JLabel add; 
	    private JTextArea tadd; 
	    private JCheckBox term; 
	    private JButton sub; 
	    private JButton reset; 
	    private JTextArea tout; 
	    private JLabel res; 
	    private JTextArea resadd;
	    private Choice c1;
	    private Choice c2;
	    private JTextField t1;
	    private  JLabel l3;
	  private  JLabel l1;
	   private JTextField t2 ;
	 private  JPasswordField p;
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
	            "Sep", "Oct", "Nov", "Dec" }; 
	    private String years[] 
	        = { "1995", "1996", "1997", "1998", 
	            "1999", "2000", "2001", "2002", 
	            "2003", "2004", "2005", "2006", 
	            "2007", "2008", "2009", "2010", 
	            "2011", "2012", "2013", "2014", 
	            "2015", "2016", "2017", "2018", 
	            "2019" }; 
	  
	    // constructor, to initialize the components 
	    // with default values. 
	    public Registration() 
	    { 
	    	
	         setTitle("Registration Form"); 
	        setBounds(300, 90, 850,850); 
	        setDefaultCloseOperation(EXIT_ON_CLOSE); 
	        setResizable(false); 
	  
	        c = getContentPane(); 
	        c.setLayout(null); 
	  
	        title = new JLabel("Registration Form"); 
	        title.setFont(new Font("Arial", Font.PLAIN, 30)); 
	        title.setSize(300, 30); 
	        title.setLocation(300, 30); 
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
	  
	        mno = new JLabel("Mobile"); 
	        mno.setFont(new Font("Arial", Font.PLAIN, 20)); 
	        mno.setSize(100, 20); 
	        mno.setLocation(100, 150); 
	        c.add(mno); 
	  
	        tmno = new JTextField(); 
	        tmno.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        tmno.setSize(150, 20); 
	        tmno.setLocation(200, 150); 
	        c.add(tmno); 
	  
	        gender = new JLabel("Gender"); 
	        gender.setFont(new Font("Arial", Font.PLAIN, 20)); 
	        gender.setSize(100, 20); 
	        gender.setLocation(100, 200); 
	        c.add(gender); 
	  
	        male = new JRadioButton("Male"); 
	        male.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        male.setSelected(true); 
	        male.setSize(75, 20); 
	        male.setLocation(200, 200); 
	        c.add(male); 
	  
	        female = new JRadioButton("Female"); 
	        female.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        female.setSelected(false); 
	        female.setSize(80, 20); 
	        female.setLocation(275, 200); 
	        c.add(female); 
	       Other = new JRadioButton("Other"); 
	        Other.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        Other.setSelected(false); 
	        Other.setSize(80, 20); 
	        Other.setLocation(350, 200); 
	        c.add(Other); 
	  
	        gengp = new ButtonGroup(); 
	        gengp.add(male); 
	        gengp.add(female); 
	        gengp.add(Other); 
	  
	        dob = new JLabel("DOB"); 
	        dob.setFont(new Font("Arial", Font.PLAIN, 20)); 
	        dob.setSize(100, 20); 
	        dob.setLocation(100, 250); 
	        c.add(dob); 
	  
	        date = new JComboBox(dates); 
	        date.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        date.setSize(50, 20); 
	        date.setLocation(200, 250); 
	        c.add(date); 
	  
	        month = new JComboBox(months); 
	        month.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        month.setSize(60, 20); 
	        month.setLocation(250, 250); 
	        c.add(month); 
	  
	        year = new JComboBox(years); 
	        year.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        year.setSize(60, 20); 
	        year.setLocation(320, 250); 
	        c.add(year); 
	  
	        add = new JLabel("Address"); 
	        add.setFont(new Font("Arial", Font.PLAIN, 20)); 
	        add.setSize(100, 20); 
	        add.setLocation(100, 300); 
	        c.add(add); 
	  
	        tadd = new JTextArea(); 
	        tadd.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        tadd.setSize(200, 75); 
	        tadd.setLocation(200, 300); 
	        tadd.setLineWrap(true); 
	        c.add(tadd); 
	  
	        term = new JCheckBox("Accept Terms And Conditions."); 
	        term.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        term.setSize(250, 20); 
	        term.setLocation(150, 700); 
	        c.add(term); 
	  
	        sub = new JButton("Submit"); 
	        sub.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        sub.setSize(100, 20); 
	        sub.setLocation(150, 750); 
	        sub.addActionListener(this); 
	        c.add(sub); 
	  
	        reset = new JButton("Reset"); 
	        reset.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        reset.setSize(100, 20); 
	        reset.setLocation(270, 750); 
	        reset.addActionListener(this); 
	        c.add(reset); 
	        
	        
	        
	        
	       
	        c1 = new Choice();
	        c1.setBounds(200,400,100,40);
	         c2 = new Choice();
	        c2.setBounds(200,450,100,40);
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        JLabel l5 = new JLabel("Loan type");
	          l5.setBounds(100,400,100,50);  
	        c.add(l5);
	        
	        c1.add("loan types");
            c1.add("Home loan");
            c1.add("personal loan");
            c1.add("education loan");
            c1.add("Agriculture loan");
            c.add(c1);
	 
	        
	        
	       
	      t1 = new JTextField();
	      t1.setBounds(200,500,100,50);
	      c.add(t1);
	      //  c1.add(t1);
	        
	        
	          JLabel l7 = new JLabel("year");
	          
	          l7.setBounds(100,450,100,40);
	          c.add(l7);
	          
	        
	           c2.add("select no. of years");c2.add("1");c2.add("2");c2.add("3");c2.add("4");c2.add("5");
	          
	          
		     //  JTextField t1 = new JTextField();
		      
		        
		       
		       
		       
		        
		        c.add(c2);
	 
	        
	          
	        
	          
	          
	          
	          JLabel l8 = new JLabel("amount");
	          l8.setBounds(100,500,100,50);
	        
	            c.add(l8);
	            
	 	   //    JTextField t1 = new JTextField();
	 	      // t1.setBounds();
	 	        
	 	        c.add(t1);
	 	        
	 	        
	 	        
	 	         l1 = new JLabel("username");
	 	        l1.setBounds(100,550,100,50);
	 	        c.add(l1);
	 	         t2 = new JTextField();
	 	        t2.setBounds(200,550,100,50);
	 	        c.add(t2);
	 	        
	 	        
	 	        l3 = new JLabel("password");
	 	        l3.setBounds(100,600,100,50);
	 	        c.add(l3);
	 	         p = new JPasswordField();
	 	        p.setBounds(200,600,100,50);
	 	        c.add(p);
	 	        
	 	        
	 	        
	 	        
	 	        
	 	        
	        
	        
	 
	        tout = new JTextArea(); 
	        tout.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        tout.setSize(300, 400); 
	        tout.setLocation(500, 100); 
	        tout.setLineWrap(true); 
	        tout.setEditable(false); 
	        c.add(tout); 
	  
	        res = new JLabel(""); 
	        res.setFont(new Font("Arial", Font.PLAIN, 20)); 
	        res.setSize(500, 25); 
	        res.setLocation(100, 650); 
	        c.add(res); 
	  
	        resadd = new JTextArea(); 
	        resadd.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        resadd.setSize(200, 75); 
	        resadd.setLocation(580, 175); 
	        resadd.setLineWrap(true); 
	        c.add(resadd); 
	  
	        setVisible(true); 
	    } 
	  
	    String Gender,Dob,loanamount,no_ofyear,loantype;
	    // method actionPerformed() 
	    // to get the action performed 
	    // by the user and act accordingly 
	    public void actionPerformed(ActionEvent e) 
	    { 
	        if (e.getSource() == sub) { 
	            if (term.isSelected()) { 
	                String data1,data4,data5; 
	                String data 
	                    = "Name : "
	                      + tname.getText() + "\n"
	                      + "Mobile : "
	                      + tmno.getText() + "\n"; 
	                if (male.isSelected())
	                {
	                    data1 = "Gender : Male" + "\n"; 
	                    Gender = "Male";
	                }
	                else if(female.isSelected())
	                {
	                    data1 = "Gender : Female" + "\n"; 
	                           
	                    Gender=  "Female";
	                }
	                else
	                {
	                	data1 = "Gender : Other" + "\n"; 
	                            
	                	 Gender="Other";
	                }
	                
	                String data2 
	                    = "DOB : "
	                      + (String)date.getSelectedItem() 
	                      + "/" + (String)month.getSelectedItem() 
	                      + "/" + (String)year.getSelectedItem() 
	                      + "\n";
	                Dob=(String)date.getSelectedItem()+ "/" + (String)month.getSelectedItem() + "/" + (String)year.getSelectedItem(); 
	                
	    	         data4="loan Amount :"+t1.getText() +"\n";
	    	         loanamount=t1.getText();
	    	        	 data5="number of year :"+c2.getItem(c2.getSelectedIndex())+"\n";
	    	        	 no_ofyear=c2.getItem(c2.getSelectedIndex());
	    	        	String  data6="Loan Type :"+c1.getItem(c1.getSelectedIndex())+"\n"; 
	    	        	loantype=c1.getItem(c1.getSelectedIndex());
	                String data3 = "Address : " + tadd.getText()+"\n"; 
	                tout.setText(data + data1 + data2 + data3+data4+data5+data6); 
	                tout.setEditable(false); 
	                res.setText("Registration Successfully.."); 
	                
	            } 
	            else { 
	                tout.setText(""); 
	                resadd.setText(""); 
	                res.setText("Please accept the"
	                            + " terms & conditions.."); 
	            }
	            
	            char c[]=p.getPassword();
	            String password=String.copyValueOf(c);
	            
	        NewReg  ob=  new  NewReg(tname.getText(),tmno.getText(),tadd.getText(),Gender,Dob,loanamount,no_ofyear,loantype,t2.getText(),password);
	        } 
	  
	        else if (e.getSource() == reset) { 
	            String def = ""; 
	            tname.setText(def); 
	            tadd.setText(def); 
	            tmno.setText(def); 
	            res.setText(def); 
	            tout.setText(def); 
	            term.setSelected(false); 
	            date.setSelectedIndex(0); 
	            month.setSelectedIndex(0); 
	            year.setSelectedIndex(0); 
	            resadd.setText(def); 
	            t1.setText(def);
	            c1.getItem(0);
	            c2.getItem(0);
	        } 
	    } 

	  /*
	    public static void main(String[] args) throws Exception 
	    { 
	  Registration f = new Registration() ; 
	    }   */
	} 