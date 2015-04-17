 /********************************************************************
*       Filename: ClientConnect.java                                *
*       Author: Tejas Dwarkaram                                     *
*       Date: 20 July 2012, 10:10                                   *
*       Operating System: Windows XP Professional                   *
*       Java Version: JDK 1.5 Update 9                              *
*       Description: Class to establish a connection to the server  *
********************************************************************/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.swing.JOptionPane;

/**
 * Class used to establish a connection to the database server for the client side application
 * @author Tejas Dwarkaram
 * @since JDK 1.5
 * @version 0.1 07/08/2012
 */
public class ClientConnect
{
    //creating the static variables that will be used globally
    static Socket clientSocket = null;
    static PrintWriter out = null;
    static BufferedReader in = null;
    
    /**
     * Creates a new instance of ClientConnect
     */
    public ClientConnect() 
    {
        int portNumber = getPortNumber();        
        try
        {
            //assigining a new client socket
            clientSocket = new Socket("127.0.0.1", portNumber);
            //creating a new print writer
            out = new PrintWriter(clientSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        }
        catch(UnknownHostException e)
        {
            System.err.println("Dont know about host 127.0.0.1");
            System.exit(1);
        }
        catch(IOException e)
        {
            JOptionPane.showMessageDialog(null, "No response from server! Please ensure server is running, and port numbers correspond!", "Error", JOptionPane.ERROR_MESSAGE);
            System.err.println("Couldnt get I/O");
            new ClientConnect();
        }
    }
    
    public int getPortNumber()
    {
        JOptionPane.showMessageDialog(null,"Hello", "Welcome", JOptionPane.INFORMATION_MESSAGE);
        String port = JOptionPane.showInputDialog(null,"Enter port number to be used for the server", "Port Requirement", JOptionPane.INFORMATION_MESSAGE);
        int portNumber = Integer.parseInt(port);
        return portNumber;
    }
    
}
