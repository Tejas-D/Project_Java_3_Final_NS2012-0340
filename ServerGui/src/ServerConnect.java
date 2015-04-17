/********************************************************************
*       Filename: searchFrame.java                                  *
*       Author: Tejas Dwarkaram                                     *
*       Date: 19 July 2012, 08:44                                   *
*       Operating System: Windows XP Professional                   *
*       Java Version: JDK 1.5 Update 9                              *
*       Description: Class to establish a connection to the database*
********************************************************************/

package servergui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 * Class created to establish a connection for the server between the application and the database server
 * @author Tejas Dwarkaram
 * @since JDK 1.5
 * @version 0.1 07/08/2012
 */
public class ServerConnect 
{
    
    static Connection con;
    /** Creates a new instance of ServerConnect */
    public ServerConnect() 
    {
        try 
        {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            //getting the connection to the database
            con = DriverManager.getConnection("jdbc:odbc:video_store");
        }
        catch(SQLException e) 
        {
            System.out.println("Error" + e.toString());
        }
        catch(ClassNotFoundException e) 
        {
            System.out.println("Error" + e.toString());
        }
    }
    
}
