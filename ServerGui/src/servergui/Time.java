/********************************************************************
*       Filename: Time.java                                         *
*       Author: Tejas Dwarkaram                                     *
*       Date: 12 August 2012, 03:23                                 *
*       Operating System: Windows XP Professional                   *
*       Java Version: JDK 1.5 Update 9                              *
*       Description: Class used to create the thread to run the     *
*                    timer for the server                           *
********************************************************************/

package servergui;

/**
 * Class used to create the functions that run a thread to keep the timer running
 * @author Tejas Dwarkaram
 * @since JDK 1.5
 * @version 0.1 07/08/2012
 */
public class Time implements Runnable
{
    static int seconds=0;
    static int minutes=0;
    static int hours=0;
    static Thread runner;
    
    /** Creates a new instance of Time */
    public Time() 
    {
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
            try 
            {
                //intiating the thread to sleep
                Thread.sleep(1000);
                seconds++;
            }
            catch(InterruptedException ie){}
            
            if(seconds<10)
            {
                ServerGui.secondsLbl.setText("0" + Integer.toString(seconds));
            }
            else
            {
                ServerGui.secondsLbl.setText(Integer.toString(seconds));   
            }
            
            
            if(seconds==59)
            {
                minutes++;
                if(minutes<10)
                {
                    ServerGui.minutesLbl.setText("0" + Integer.toString(minutes));
                }
                else
                {
                    ServerGui.minutesLbl.setText(Integer.toString(minutes));
                }
                seconds=0;
                
                if(minutes==59)
                {
                    hours++;
                    if(hours<10)
                    {
                        ServerGui.hoursLbl.setText("0" + Integer.toString(hours));
                    }
                    else
                    {
                        ServerGui.hoursLbl.setText(Integer.toString(hours));
                    }
                    minutes=0;
                }
            }
        }
    }
    
}
