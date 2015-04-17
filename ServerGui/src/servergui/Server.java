/********************************************************************
*       Filename: Server.java                                       *
*       Author: Tejas Dwarkaram                                     *
*       Date: 19 July 2012, 10:48                                   *
*       Operating System: Windows XP Professional                   *
*       Java Version: JDK 1.5 Update 9                              *
*       Description: Class used to create the connections for the   *
*                    server                                         *
********************************************************************/

package servergui;

import java.io.IOException;
import java.net.ServerSocket;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 * Class used to create the server side processes, and create a network connection
 * @author Tejas Dwarkaram
 * @since JDK 1.5
 * @version 0.1 07/08/2012
 */
public class Server implements Runnable
{
    /** Creates a new instance of Server */
    static ServerSocket ss;
    static boolean listening;
    Thread runner;
    static Date start = new Date();
    static SimpleDateFormat startTime = new SimpleDateFormat("HH:mm:ss");
    static String stTime = startTime.format(start.getTime());
    
    /**
     * Used to create the constructor for the server class
     */
    public Server() 
    {
        String port = JOptionPane.showInputDialog(null,"Enter port number to be used for the server", "PortSettings", JOptionPane.INFORMATION_MESSAGE);
        
        int portNumber = Integer.parseInt(port);
        while(portNumber == 0)
        {
            JOptionPane.showMessageDialog(null,"An error has occured, please enter a valid port number of 4 digits!", "Error on port number", JOptionPane.ERROR_MESSAGE);
            port = JOptionPane.showInputDialog(null,"Enter port number to be used for the server", "PortSettings", JOptionPane.INFORMATION_MESSAGE);
            portNumber = Integer.parseInt(port);
        }
        try
        {
            //creating a new server socket
            ss = new ServerSocket(portNumber);
            ServerGui.serverArea.append("Server connection started.\nTime started: " + stTime + "\nAdministrator Name - " + ServerGui.userFld.getText() + "\nServer at port: " + portNumber + "\n*-*-*-*-*-*-*-*-*-*-*-*\n ");
            listening = true;
            new Time();
        }
        catch(IOException e) 
        {
            System.out.println("T"+ e.toString());
            System.exit(1);
        }
        if(runner == null) 
        {
            //starting the runner
            runner = new Thread(this);
            runner.start();
        }
    }
    
    /**
     * Method used to keep the thread running
     */
    public void run() 
    {
         while(runner == Thread.currentThread()) 
         {
            while(listening) 
            {
                try 
                {
                    //trying to create a new session
                    new Session(ss.accept());
                }
                catch(IOException e) 
                {
                    System.out.println("C" + e.toString());
                }
            }
            try 
            {
                //intiating the thread to sleep
                Thread.sleep(100);
            }
            catch(InterruptedException ie){}
         }
    }
    
    /**
     * Method used to start the server
     * @param logonName String
     * @param pass String
     * @param option int
     */
    public static void startServer(String logonName, String pass, int option) 
    {
        int x=1;
        boolean log = false;
        ServerConnect connect = new ServerConnect();
        if(option==1)
        {
            try 
            {
                //creating a statement to be used
                Statement st = connect.con.createStatement();
                //creating the statement to select all of the data from the artists table
                ResultSet rec = st.executeQuery("SELECT * FROM users");
                while(rec.next() && x==1) 
                {
                    if((logonName).equals(rec.getString(2)) && (pass).equals(rec.getString(3))) 
                    {
                        log = true;
                        x=0;
                    }
                }
                st.close();
                if(log==true) 
                {
                    ServerGui.serverPnl.setVisible(true);
                    ServerGui.serverArea.setVisible(true);
                    ServerGui.serverStartBtn.setVisible(false); 
                    ServerGui.stopServerBtn.setVisible(true);
                    ServerGui.userFld.setText("");
                    ServerGui.passFld.setText("");
                    ServerGui.timePnl.setVisible(true);
                    new Server();
                } 
                else 
                {
                    JOptionPane.showMessageDialog(null, "Error in login name or password, please try again", "Error", JOptionPane.ERROR_MESSAGE);
                    ServerGui.userFld.setText("");
                    ServerGui.passFld.setText("");
                }
            } 
            catch(SQLException e) 
            {
                System.out.println("Error" + e.toString());
            }
        }
        else
        {
            try 
            {
                //creating a statement to be used
                Statement st = connect.con.createStatement();
                //creating the statement to select all of the data from the artists table
                ResultSet rec = st.executeQuery("SELECT * FROM users");
                while(rec.next() && x==1) 
                {
                    if((logonName).equals(rec.getString(2)) && (pass).equals(rec.getString(3)))
                    {
                        log = true;
                        x=0;
                    }
                }
                st.close();
                if(log==true) 
                {
                    try
                    {
                        Server.ss.close();
                        Server.listening = false;
                        ServerGui.serverArea.append("Server connection stopped.\nTime ended: " + stTime + "\nServer Up-Time - " + ServerGui.hoursLbl.getText() + ":" + ServerGui.minutesLbl.getText() + ":" + ServerGui.secondsLbl.getText() + "\n*-*-*-*-*-*-*-*-*-*-*-*\n ");
                        ServerGui.userFld.setText("");
                        ServerGui.passFld.setText("");
                        ServerGui.serverStartBtn.setVisible(true);
                        ServerGui.stopServerBtn.setVisible(false);
                        
                        Time.runner = null;
                        Time.seconds=0;
                        Time.minutes=0;
                        Time.hours=0;
                        ServerGui.hoursLbl.setText("00");
                        ServerGui.secondsLbl.setText("00");
                        ServerGui.minutesLbl.setText("00");
                        
                        ServerGui.timePnl.setVisible(false);
                    }
                    catch(IOException ioe){}
                } 
                else 
                {
                    JOptionPane.showMessageDialog(null, "Please enter your administrator details", "You have left some blanks", JOptionPane.INFORMATION_MESSAGE);
                    ServerGui.userFld.setText("");
                    ServerGui.passFld.setText("");
                }
            }
            catch(SQLException e) 
            {
                System.out.println("Error" + e.toString());
            }
        }
    }
}
