package hotelmanagement;
import java.sql.*;


public class conn {
    Connection c;
    Statement s;
    
    conn(){
        
    try {
    Class.forName("com.mysql.cj.jdbc.Driver");
     c = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelmangementsystem", "root","root");
     s = c.createStatement();
     
}
    catch(Exception e){
    e.printStackTrace();
}

}
    public static void main(String[] args){
       new conn(); 
    }

    ResultSet executeQuery(String query) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}