package hotelmanagement;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class dashboard  extends JFrame implements ActionListener{
    dashboard() 
    {
        setBounds(0,0,1550,1000);
        
        setLayout(null);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1550, 1000, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0, 1550, 1000);
        add(image);
        
        JLabel text = new JLabel("THE TAJ GROUP WELCOMES YOU");
        text.setBounds(400,80, 1000, 50);
        image.add(text);
        text. setFont(new Font("tahoma",Font.PLAIN,50));
        
        JMenuBar mb = new JMenuBar();
        mb.setBounds( 0, 0, 1550, 30);
        image.add(mb);
        
        JMenu hotel = new JMenu("Hotel Management");
        hotel.setForeground(Color.red);
        mb.add(hotel);
        
        JMenuItem reception = new JMenu ("Reception");
        reception.addActionListener(this);
        hotel.add(reception);
        
         JMenu admin = new JMenu("Admin");
        admin.setForeground(Color.red);
        mb.add(admin);
        
        JMenuItem addemployee = new JMenuItem ("ADD EMPLOYEE");
        addemployee.addActionListener(this);
        admin.add(addemployee);
        
        
        JMenuItem addrooms = new JMenuItem ("ADD ROOMS");
        addrooms.addActionListener(this);
        admin.add(addrooms); 
        
        setVisible(true);
        
    }
    
     public void actionPerformed(ActionEvent ae)
     {
         if(ae.getActionCommand().equals("ADD EMPLOYEE")){
             new Addemployee();
         }else if (ae.getActionCommand().equals("ADD ROOMS")){
             new AddRooms();
           
         }else if (ae.getActionCommand().equals("Reception")){
             new Reception();
         
     }
     }
    
    public static void main(String[] args){
        new dashboard();
        
    }
    
}


