/********************************************************************
*       Filename: HelpFrame.java                                    *
*       Author: Tejas Dwarkaram                                     *
*       Date: 25 July 2012, 03:30                                   *
*       Operating System: Windows XP Professional                   *
*       Java Version: JDK 1.5 Update 9                              *
*       Description: Class to create a new frame to show help on the*
*                    program                                        *
********************************************************************/

import javax.swing.JOptionPane;

/**
 * Class used to create the interface to give the user help
 * @author Tejas Dwarkaram
 * @since JDK 1.5 
 * @version 0.1 07/08/2012
 */
public class HelpFrame extends javax.swing.JFrame
{
    
    /**
     * Creates new form HelpFrame
     */
    public HelpFrame() 
    {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        helpTbdPne = new javax.swing.JTabbedPane();
        aboutScrlPne = new javax.swing.JScrollPane();
        aboutTxtArea = new javax.swing.JTextArea();
        helpMnuBar = new javax.swing.JMenuBar();
        helpMnu = new javax.swing.JMenu();
        backMnuItm = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Help ?");
        setName("helpFrame");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        aboutTxtArea.setColumns(20);
        aboutTxtArea.setEditable(false);
        aboutTxtArea.setLineWrap(true);
        aboutTxtArea.setRows(5);
        aboutTxtArea.setText("This is a client application of a client/server application created in Java. This application is for use in the Ins-pirate-d Video Store. The client application enables a user to search for movies even if they dont know the full title of the movie.\n\n\n All information is stored in a database, and the database can only be accessed by the Administrator, who has administrator privileges. Administrators have the ability to easily add or delete records of the database. \n\n_________________________________\n\nCreated by Tejas Dwarkaram \nDate : /07/12\n\nVersion 1.0.0.1.1\n\nLicense Agreement  - Still Pending . . . . \n\n");
        aboutTxtArea.setWrapStyleWord(true);
        aboutTxtArea.setOpaque(false);
        aboutScrlPne.setViewportView(aboutTxtArea);

        helpTbdPne.addTab("About", aboutScrlPne);

        helpMnu.setText("Menu");
        backMnuItm.setText("Back");
        backMnuItm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backMnuItmActionPerformed(evt);
            }
        });

        helpMnu.add(backMnuItm);

        helpMnuBar.add(helpMnu);

        setJMenuBar(helpMnuBar);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, helpTbdPne, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(helpTbdPne, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                .addContainerGap())
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    //method to execute if the frame is closing
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        //creating the object to store an array of possible options
        Object[] options = {"Go back to app", "Cancel"};
        
        //displaying an option dialog to allow the user to choose an option and storing the response in an int variable
        int opt = JOptionPane.showOptionDialog(null, "What would you like to do ?", "You sure you want to leave ?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
        //checking if the option is Zero
        if(opt==0) 
        {
            //if user chooses to close the application the process is disposed
            dispose();
        }
    }//GEN-LAST:event_formWindowClosing
    
    //method to be executed if the menu item is clicked
    private void backMnuItmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backMnuItmActionPerformed
        //closing this frame if user clicks close menu item
        this.setVisible(false);
    }//GEN-LAST:event_backMnuItmActionPerformed
    
    /**
     * Main method used to create the JFrame for the help interface
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater
        (
            new Runnable() 
            {
                public void run() 
                {
                    //setting the frame visible
                    new HelpFrame().setVisible(true);
                }
            }
        );        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane aboutScrlPne;
    private static javax.swing.JTextArea aboutTxtArea;
    private javax.swing.JMenuItem backMnuItm;
    private javax.swing.JMenu helpMnu;
    private javax.swing.JMenuBar helpMnuBar;
    private javax.swing.JTabbedPane helpTbdPne;
    // End of variables declaration//GEN-END:variables
    
}
