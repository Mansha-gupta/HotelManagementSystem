package hotelmanagement;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Hotelmanagement extends JFrame implements ActionListener{
    Hotelmanagement(){
    setSize(1366,565);
    setLocation(100,100);
    setBounds(100,100,1366,565);
    setLayout(null);
    
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));
    JLabel image = new JLabel(i1);
    image.setBounds(0,0,1366,565);
    add (image);     
    setVisible(true);
    
    JLabel text = new JLabel("HOTEL MANAGEMENT SYSTEM");
    text.setBounds(20, 430, 1000, 100);
    text.setForeground(Color.WHITE);
    text. setFont(new Font("serif",Font.PLAIN,50));
    image.add(text);
    
    JButton next = new JButton("Next");
    setVisible(true);
    next.setBounds(1150, 450, 150, 50);
    image.add(next);
    next.setBackground(Color.WHITE);
    next.addActionListener(this);
    
    while(true){
        text.setVisible(false);
    try {
        Thread.sleep(500);
        
    }catch (Exception e)
    {
        e.printStackTrace();
    }
    text.setVisible(true);
    
    try {
        Thread.sleep(500);
        
    }catch (Exception e)
    {
        e.printStackTrace();
    }
    text.setVisible(true);
    
    }
    }
    public  void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }
    
   
    public static void main(String[] args) {
        new Hotelmanagement();
    }
}

   
    