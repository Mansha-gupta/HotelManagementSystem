package hotelmanagement;
import javax.swing.*;
import java.awt.*;


public class Reception extends JFrame{
    Reception(){
        
        getContentPane().setBackground(Color.WHITE);
       setLayout(null);
        
        JButton newCustomer = new JButton("New Customer Form");
        newCustomer.setBounds(10,30,200,40);
        newCustomer.setBackground(Color.black);
        newCustomer.setForeground(Color.WHITE);
        add(newCustomer);
        
        
        JButton rooms = new JButton("Rooms");
        rooms.setBounds(10,90,200,40);
        rooms.setBackground(Color.black);
        rooms.setForeground(Color.WHITE);
        add(rooms);
        
        JButton department = new JButton("Department");
       department.setBounds(10,150,200,40);
        department.setBackground(Color.black);
        department.setForeground(Color.WHITE);
        add(department);
        
        
        JButton allemployee = new JButton("All Employee");
      allemployee.setBounds(10,210,200,40);
       allemployee.setBackground(Color.black);
       allemployee.setForeground(Color.WHITE);
        add(allemployee);
        
        
        JButton customers = new JButton("Customer Info");
       customers.setBounds(10,270,200,40);
        customers.setBackground(Color.black);
        customers.setForeground(Color.WHITE);
        add(customers);
        
        JButton managerInfo = new JButton("Manager Info");
       managerInfo.setBounds(10,330,200,40);
       managerInfo.setBackground(Color.black);
       managerInfo.setForeground(Color.WHITE);
        add(managerInfo);
        
        JButton checkout = new JButton("Check Out");
      checkout.setBounds(10,400,200,40);
      checkout.setBackground(Color.black);
       checkout.setForeground(Color.WHITE);
        add(checkout);
        
        JButton Logout = new JButton("Log out ");
      Logout .setBounds(10,470,200,40);
   Logout .setBackground(Color.black);
       Logout .setForeground(Color.WHITE);
        add(Logout );
        
        
        ImageIcon i1 = new  ImageIcon(ClassLoader.getSystemResource("icons/fourth.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(280,30,500,500 );
        add(image);
        
        
        setBounds(350,200,900,670);
        setVisible(true);
    
    
    }
    public static void main(String[]args){
    new Reception();
    }
    
  
    
}
    

