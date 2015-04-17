/********************************************************************
*       Filename: Protocol.java                                     *
*       Author: Tejas Dwarkaram                                     *
*       Date: 19 July 2012, 10:48                                   *
*       Operating System: Windows XP Professional                   *
*       Java Version: JDK 1.5 Update 9                              *
*       Description: Creating the class to execute commands         *
*                    recieved from the client application           *
********************************************************************/

package servergui;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Class created to handle various requests that are made on the client side application
 * @author Tejas Dwarkaram
 * @since JDK 1.5
 * @version 0.1 07/08/2012
 */
public class Protocol
{
    /**
     * Method used to do a search of the database
     * @param input String
     * @return String
     */
    public static String searchRecord(String input) 
    {
        input = input.substring(1);
        try 
        {
            int x=0;
            Statement st = ServerConnect.con.createStatement();
            ResultSet rec = st.executeQuery("SELECT * FROM movie WHERE movie_name LIKE '%" + input + "%'");
            
            String data = "";
            
            while(rec.next()) 
            {   
                if(x==0)
                {
                    String str = rec.getString(1) + "," + rec.getString(2) + "," + rec.getString(3) + "," + rec.getString(4);
                    data = data.concat(str);
                }
                else if(x>0)
                {
                    String str = "+" + rec.getString(1) + "," + rec.getString(2) + "," + rec.getString(3) + "," + rec.getString(4);
                    data = data.concat(str);
                }
                x++;
            }
            if(data.equals(""))
            {
                return "No";
            }
            else
            {
                return data;
            }
        }
        catch(SQLException sql) {}
        return "No";
    }
    
     /**
     * Method used to add a record into the database
     * @param data String
     * @return String
     */
    public static String addRecord(String data)
    {
        data = data.substring(1);
        try 
        {
            int addRows;
            Statement st = ServerConnect.con.createStatement();
            addRows = st.executeUpdate("INSERT INTO movie (movie_name, movie_description, genre_id) VALUES (" + data + ")");
        }
        catch(SQLException sql) 
        {
            return "SQL Exception" + sql.toString();
        }
        return "yes";
    }
    
    /**
     * Method used to delete a record from the database
     * @param input String
     * @return String
     */
    public static String deleteRecord(String input) 
    {
        try 
        {
            String h = "e" ;
            Statement st = ServerConnect.con.createStatement();
            ResultSet rec = st.executeQuery("SELECT * FROM movie WHERE movie_name LIKE '%" + input + "%'");
            while(rec.next()) 
            {
                String str = rec.getString(1) + "," + rec.getString(2) + "," + rec.getString(3) + "," + rec.getString(4);
                h = h.concat(str);
            }
            return h;
        } 
        catch(SQLException sql) 
        {
            return "SQL Exception" + sql.toString();
        }
    }
    
    /**
     * Method used to retrieve the next available id from the table
     * @param input String
     * @return String
     */
    public static String getMovieId(String input)
    {
        try 
        {
            int id=0;
            Statement st = ServerConnect.con.createStatement();
            ResultSet rec = st.executeQuery("SELECT * FROM movie");
            while(rec.next()) 
            {
                id = Integer.parseInt(rec.getString(1));
            }
            return Integer.toString(id + 1);
        } 
        catch(SQLException sql)
        {
            return "SQL Exception" + sql.toString();
        }
    }
    
    /**
     * Method used to check if the genre of a movie already exists
     * @param input String
     * @return String
     */
    public static String checkGenre(String input)
    {
        input = input.substring(1);
        int x=1;
        boolean log = false;
        try 
        {
            //creating a statement to be used
            Statement st = ServerConnect.con.createStatement();
            //creating the statement to select all of the data from the artists table
            ResultSet rec = st.executeQuery("SELECT * FROM genre");
            while(rec.next() && x==1)
            {
                if(input.equals(rec.getString(1)))
                {
                    log = true;
                    x=0;
                }
            }
            st.close();
            if(log==true) 
            {
                return "yes";
            }
            else
            {
                return "no";
            }
       }
       catch(SQLException e) 
       {
           System.out.println("Error" + e.toString());
       }
       return "gelo";
    }
    
    /**
     * Method used to verify that the user trying to access the admin panel is an administratorm and has corresponding username and password
     * @param input String
     * @return String
     */
    public static String adminLogin(String input)
    {
        input = input.substring(1);
        String[] login = input.split("[+]");
        String userName = login[0];
        String password = login[1];
        int x=1;
        boolean log = false;
        try 
        {
            //creating a statement to be used
            Statement st = ServerConnect.con.createStatement();
            //creating the statement to select all of the data from the artists table
            ResultSet rec = st.executeQuery("SELECT * FROM users");
            while(rec.next() && x==1) 
            {
                if(userName.equals(rec.getString(2)) && (password.equals(rec.getString(3))))
                {
                    log = true;
                    x=0;
                }
            }
            st.close();
            if(log==true) 
            {
                return "success";
            }
            else
            {
                return "fail";
            }
       }
       catch(SQLException e) 
       {
           System.out.println("Error" + e.toString());
       }
       return "gelo";
    }
}
