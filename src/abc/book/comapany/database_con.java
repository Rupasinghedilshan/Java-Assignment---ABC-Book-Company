package abc.book.comapany;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class database_con {
    Connection conn=null;
    
    public static Connection database_con(){
        try{
            Class.forName("com.mysql.jdbc.Driver");//install jdbc driver
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/abc_book_company","root","");//database connection
            //JOptionPane.showMessageDialog(null,"connected!!!");
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }  
    }
}
