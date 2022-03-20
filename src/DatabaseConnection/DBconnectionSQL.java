/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DatabaseConnection;

import java.sql.* ;

/**
 *
 * @author asus
 */
public class DBconnectionSQL {
    Connection con ;
    Statement st ;
    ResultSet rs ;
    
    String url = "jdbc:mysql://SERVER_NAME:3306/DATABASE_NAME";
    String login="USERNAME";
    String password="PASSWORD";
    
    public DBconnectionSQL()
    {
        try
        {
            con = DriverManager.getConnection(url, login, password);
            st = con.createStatement();
        }
        catch(Exception e){System.out.println(" Attention l'exception : " + e + "est arrivée / creation");}
    }
    
    public ResultSet search(String query)
    {
        try
        {
            rs = st.executeQuery(query);
        }
        catch(Exception e){System.out.println(" Attention l'exception : " + e + "est arrivée /search\n"+query);}
        
        return rs ;
    }
    
    public void update(String query)
    {
        try
        {
            int x = st.executeUpdate(query);
        }
        catch(Exception e){System.out.println(" Attention l'exception : " + e + "est arrivée / update");}
    }
    
    public void closeConnection()
    {
        try
        {
            rs.close();
            st.close();
            con.close();
        }
        catch(Exception e){System.out.println(" Attention l'exception : " + e + "est arrivée /close");}
    }
}
