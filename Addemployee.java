package hotelmanagement;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Addemployee extends JFrame implements ActionListener{
    
    JTextField tfname, tfphone , tfemail,tfage, tfsalary; 
    JRadioButton rbmale , rbfemale;
    JButton Submit;
    JComboBox cbjob;
            
    Addemployee(){
        setLayout(null);
                
        tfname = new JTextField();
        tfname.setBounds(200,30,150,30);
        add(tfname);
        
        JLabel lblname = new JLabel("Name");
        lblname.setFont(new Font("tahoma",Font.PLAIN,17));
         lblname.setBounds(60,30,120,30);
      
        add(lblname);

        JLabel lblage= new JLabel("AGE");
        lblage.setBounds(60,80,120,30);
        lblage.setFont(new Font("tahoma",Font.PLAIN,17));
        add(lblage);
        
        tfage = new JTextField();
        tfage.setBounds(200,80,150,30);
        add(tfage);
        
        
        JLabel lblgender = new JLabel("GENDER");
        lblgender.setFont(new Font("tahoma",Font.PLAIN,17));
        lblgender.setBounds(60,130,120,30);
        add(lblgender);
         
        rbmale = new JRadioButton("Male");
        rbmale.setBounds(200, 130, 70, 30);
        rbmale.setFont(new Font("tahoma",Font.PLAIN,14));
        rbmale.setBackground(Color.WHITE);
        add(rbmale);
        
        rbfemale = new JRadioButton("Female");
        rbfemale.setBounds(280, 130, 70, 30);
        rbfemale.setFont(new Font("tahoma",Font.PLAIN,14));
        rbfemale.setBackground(Color.WHITE);
        add(rbfemale);
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(rbmale);
        bg.add(rbfemale);
        
        JLabel lbljob = new JLabel("job");
        lbljob.setFont(new Font("tahoma",Font.PLAIN,17));
        lbljob.setBounds(60,180,120,30);
        add(lbljob);
        
        String str[]= {"front desk clerks", "porters","house", "roon service", "chefs","waiter", "accountant"};
        cbjob = new JComboBox(str);
        cbjob.setBounds(200,180,150,30);
        cbjob.setBackground(Color.WHITE);
        add(cbjob);
        
        JLabel lblsalary= new JLabel("Salary");
        lblsalary.setBounds(60,230,120,30);
        lblsalary.setFont(new Font("tahoma",Font.PLAIN,17));
        add(lblsalary);
        
        tfsalary = new JTextField();
        tfsalary.setBounds(200,230,150,30);
        add(tfsalary);
        
        
        JLabel lblphone= new JLabel("Phone");
        lblphone.setBounds(60,280,120,30);
        lblphone.setFont(new Font("tahoma",Font.PLAIN,17));
        add(lblphone);
        
        tfphone = new JTextField();
        tfphone.setBounds(200,280 ,150,30);
        add(tfphone);
        
        JLabel lblemail= new JLabel("Email");
        lblemail.setBounds(60,330,120,30);
        lblemail.setFont(new Font("tahoma",Font.PLAIN,17));
        add(lblemail);
        
        tfemail = new JTextField();
        tfemail.setBounds(200,330,150,30);
        add(tfemail);
        
        getContentPane().setBackground(Color.WHITE);
        setBounds(350, 200 ,850 , 540);  
        setVisible(true);
        
        Submit = new JButton("SUBMIT");
        Submit.setBackground(Color.BLACK);
        Submit.setForeground(Color.WHITE);
        Submit.setBounds(200,430,150,30);
        Submit.addActionListener(this);
        add(Submit);
    
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/tenth.jpg"));
        Image i2 = i1.getImage().getScaledInstance(450,450,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(380,60,450,370);
        add(image);
       
    
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        String name = tfname.getText();
        String age = tfage.getText();
        String Salary = tfsalary.getText();
        String phone = tfphone.getText();
        String email = tfemail.getText();
        
        String gender = null;
        
        if (name.equals("")){
            JOptionPane.showMessageDialog(null,"name should not be empty ");
            return;
        }
        
        if (rbmale.isSelected())
        {
            gender ="Male";
        }else if (rbfemale.isSelected())
        {
            gender = "Female";
        }
    
        String job = (String)cbjob.getSelectedItem();
        
        try 
        {   conn conn = new conn();
            
            String query = "insert into employee values ('"+name+"',' "+age+" ',' "+gender+" ',' "+job+" ',' "+Salary+" ',' "+phone+" ', ' "+email+" ')";
            
            conn.s.executeUpdate(query);
            
            JOptionPane.showMessageDialog(null,"Employee added sucessfully");
             
            setVisible(false);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
        
    }
    
    
    
    
    
    public static void main(String[]args){
        new Addemployee();
    
    }
    
}
