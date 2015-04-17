/********************************************************************
*       Filename: Session.java                                      *
*       Author: Tejas Dwarkaram                                     *
*       Date: 19 July 2012, 10:48                                   *
*       Operating System: Windows XP Professional                   *
*       Java Version: JDK 1.5 Update 9                              *
*       Description: Class used to create to establish new sessions *
*                    for each client connection that is established *
*                    and interpret the commands to be sent to the   *
*                    protocol class                                 *
********************************************************************/

package servergui;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Class created to run the sessions that need to be created when ever a client application is enabled
 * @author Tejas Dwarkaram
 * @since JDK 1.5
 * @version 0.1 07/08/2012
 */
public class Session implements Runnable 
{
    Socket soc;
    BufferedReader br;
    PrintWriter pw;
    Thread runner;
    
    /**
     * Creates a new instance of Session
     * @param s Socket
     */
    public Session(Socket s) 
    {
        soc = s;
        try 
        {
            br = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            pw = new PrintWriter(new BufferedOutputStream(soc.getOutputStream()), true);
            pw.println("Welcome");
        }
        catch(IOException ioe) 
        {
            System.out.println("G" + ioe.toString());
        }
        
        if(runner == null) 
        {
            //starting the runner
            runner = new Thread(this);
            runner.start();
        }
    }
    
    /**
     * Method used to keep the thread running for the sessions class
     */
    public void run() 
    {
        try 
        {
            while(runner == Thread.currentThread()) 
            {
                //reading the input into the buffered reader
                String input = br.readLine();
                if(input != null) 
                {
                    String output;
                    output = "nothing";
                    //sending the input to the protocol class
                    if((input.substring(0,1)).equals("1")) 
                    {
                        output = Protocol.searchRecord(input);
                    } 
                    else if((input.substring(0,1)).equals("2")) 
                    {
                        output = Protocol.addRecord(input);
                    } 
                    else if((input.substring(0,1)).equals("3")) 
                    {
                        output = Protocol.deleteRecord(input);
                    }
                    else if((input.substring(0,1)).equals("4")) 
                    {
                        output = Protocol.getMovieId(input);
                    }
                    else if((input.substring(0,1)).equals("5")) 
                    {
                        output = Protocol.adminLogin(input);
                    }
                    else if((input.substring(0,1)).equals("6")) 
                    {
                        output = Protocol.checkGenre(input);
                    }
                    pw.println(output);
                    if(output.equalsIgnoreCase("BYE!")) 
                    {
                        //closing everything if the word BYE! is parsed
                        runner = null;
                        pw.close();
                        br.close();
                        soc.close();
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
        catch(IOException ioe) 
        {
            System.out.println("F" + ioe.toString());
        }
    }
    
}
