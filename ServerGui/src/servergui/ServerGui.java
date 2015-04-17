/********************************************************************
*       Filename: ServerGui.java                                    *
*       Author: Tejas Dwarkaram                                     *
*       Date: 19 July 2012, 10:50                                   *
*       Operating System: Windows XP Professional                   *
*       Java Version: JDK 1.5 Update 9                              *
*       Description: Class used to create the GUI for the server    *
********************************************************************/

package servergui;

import java.awt.Cursor;
import javax.swing.JOptionPane;

/**
 * Class to hold all of the components required to create the Graphical User Interface for the server application
 * @author Tejas
 * @version 0.1 07/08/2012
 * @since JDK 1.5
 */
public class ServerGui extends javax.swing.JFrame
{
    /**
     * Creates new form ServerGui
     */
    public ServerGui() 
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        loginPnl = new javax.swing.JPanel();
        userFld = new javax.swing.JTextField();
        passFld = new javax.swing.JPasswordField();
        usernameLbl = new javax.swing.JLabel();
        passwordLbl = new javax.swing.JLabel();
        serverBtnsPnl = new javax.swing.JPanel();
        serverStartBtn = new javax.swing.JButton();
        stopServerBtn = new javax.swing.JButton();
        serverPnl = new javax.swing.JPanel();
        serverAreaScrlPne = new javax.swing.JScrollPane();
        serverArea = new javax.swing.JTextArea();
        timePnl = new javax.swing.JPanel();
        secondsLbl = new javax.swing.JLabel();
        minutesLbl = new javax.swing.JLabel();
        hoursLbl = new javax.swing.JLabel();
        timeSemiLbl2 = new javax.swing.JLabel();
        timeSemiLbl = new javax.swing.JLabel();
        timerHeadingLbl = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");
        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Server Application");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.black);
        setName("serverFrame");
        setResizable(false);
        loginPnl.setBackground(new java.awt.Color(0, 0, 0));
        loginPnl.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        loginPnl.setOpaque(false);
        userFld.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userFldMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                userFldMouseEntered(evt);
            }
        });

        passFld.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                passFldMouseEntered(evt);
            }
        });

        usernameLbl.setFont(new java.awt.Font("Book Antiqua", 1, 12));
        usernameLbl.setText("Username");

        passwordLbl.setFont(new java.awt.Font("Bookman Old Style", 1, 12));
        passwordLbl.setText("Password");

        org.jdesktop.layout.GroupLayout loginPnlLayout = new org.jdesktop.layout.GroupLayout(loginPnl);
        loginPnl.setLayout(loginPnlLayout);
        loginPnlLayout.setHorizontalGroup(
            loginPnlLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(loginPnlLayout.createSequentialGroup()
                .addContainerGap()
                .add(loginPnlLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(passwordLbl)
                    .add(usernameLbl))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(loginPnlLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(passFld, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 171, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(userFld, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))
                .addContainerGap())
        );
        loginPnlLayout.setVerticalGroup(
            loginPnlLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, loginPnlLayout.createSequentialGroup()
                .add(loginPnlLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(loginPnlLayout.createSequentialGroup()
                        .addContainerGap(25, Short.MAX_VALUE)
                        .add(usernameLbl)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED))
                    .add(loginPnlLayout.createSequentialGroup()
                        .addContainerGap()
                        .add(userFld, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)))
                .add(loginPnlLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(passwordLbl)
                    .add(passFld, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(15, 15, 15))
        );

        serverBtnsPnl.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        serverStartBtn.setText("Start Server");
        serverStartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serverStartBtnActionPerformed(evt);
            }
        });
        serverStartBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                serverStartBtnMouseEntered(evt);
            }
        });

        stopServerBtn.setText("Stop Server");
        stopServerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopServerBtnActionPerformed(evt);
            }
        });
        stopServerBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                stopServerBtnMouseEntered(evt);
            }
        });

        org.jdesktop.layout.GroupLayout serverBtnsPnlLayout = new org.jdesktop.layout.GroupLayout(serverBtnsPnl);
        serverBtnsPnl.setLayout(serverBtnsPnlLayout);
        serverBtnsPnlLayout.setHorizontalGroup(
            serverBtnsPnlLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(serverBtnsPnlLayout.createSequentialGroup()
                .addContainerGap()
                .add(serverBtnsPnlLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(serverStartBtn, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, stopServerBtn, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
                .addContainerGap())
        );
        serverBtnsPnlLayout.setVerticalGroup(
            serverBtnsPnlLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(serverBtnsPnlLayout.createSequentialGroup()
                .addContainerGap()
                .add(serverStartBtn, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(stopServerBtn, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 31, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        serverArea.setColumns(20);
        serverArea.setEditable(false);
        serverArea.setRows(5);
        serverAreaScrlPne.setViewportView(serverArea);

        org.jdesktop.layout.GroupLayout serverPnlLayout = new org.jdesktop.layout.GroupLayout(serverPnl);
        serverPnl.setLayout(serverPnlLayout);
        serverPnlLayout.setHorizontalGroup(
            serverPnlLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, serverPnlLayout.createSequentialGroup()
                .addContainerGap()
                .add(serverAreaScrlPne, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                .addContainerGap())
        );
        serverPnlLayout.setVerticalGroup(
            serverPnlLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(serverPnlLayout.createSequentialGroup()
                .addContainerGap()
                .add(serverAreaScrlPne, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                .addContainerGap())
        );

        secondsLbl.setFont(new java.awt.Font("Tahoma", 1, 14));
        secondsLbl.setText("00");

        minutesLbl.setFont(new java.awt.Font("Tahoma", 1, 14));
        minutesLbl.setText("00");

        hoursLbl.setFont(new java.awt.Font("Tahoma", 1, 14));
        hoursLbl.setText("00");

        timeSemiLbl2.setFont(new java.awt.Font("Tahoma", 1, 14));
        timeSemiLbl2.setText(":");

        timeSemiLbl.setFont(new java.awt.Font("Tahoma", 1, 14));
        timeSemiLbl.setText(":");

        timerHeadingLbl.setFont(new java.awt.Font("Bookman Old Style", 1, 14));
        timerHeadingLbl.setText("Server Up-Time");

        org.jdesktop.layout.GroupLayout timePnlLayout = new org.jdesktop.layout.GroupLayout(timePnl);
        timePnl.setLayout(timePnlLayout);
        timePnlLayout.setHorizontalGroup(
            timePnlLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(timePnlLayout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(timePnlLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, timePnlLayout.createSequentialGroup()
                        .add(hoursLbl, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 21, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(timeSemiLbl)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(minutesLbl, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(timeSemiLbl2)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(secondsLbl, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, timerHeadingLbl))
                .addContainerGap())
        );
        timePnlLayout.setVerticalGroup(
            timePnlLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, timePnlLayout.createSequentialGroup()
                .addContainerGap()
                .add(timerHeadingLbl)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(timePnlLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(secondsLbl, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(timeSemiLbl2)
                    .add(minutesLbl, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(timeSemiLbl)
                    .add(hoursLbl, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, serverPnl, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(timePnl, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(layout.createSequentialGroup()
                                .add(loginPnl, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(serverBtnsPnl, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(loginPnl, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(serverBtnsPnl, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(timePnl, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(serverPnl, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents

    //method to execute if the button is clicked
    private void stopServerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopServerBtnActionPerformed
        Server.startServer(userFld.getText(), convertPassword(passFld.getPassword()), 2);
    }//GEN-LAST:event_stopServerBtnActionPerformed

    //method to execute if the mouse moves over the password field
    private void passFldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passFldMouseEntered
        passFld.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_passFldMouseEntered

    //method to execute if the mouse is moved over the user text field
    private void userFldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userFldMouseEntered
        userFld.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_userFldMouseEntered

    //method to execute if the mouse is entered over the stop server button
    private void stopServerBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stopServerBtnMouseEntered
        stopServerBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_stopServerBtnMouseEntered

    //method to execute if the mouse moves over the server start button
    private void serverStartBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_serverStartBtnMouseEntered
        serverStartBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_serverStartBtnMouseEntered
    
    //method to execute if the button is clicked
    private void serverStartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serverStartBtnActionPerformed
        Server.startServer(userFld.getText(),convertPassword(passFld.getPassword()), 1);
    }//GEN-LAST:event_serverStartBtnActionPerformed
            
    //method to be executed if the username field is clicked
    private void userFldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userFldMouseClicked
        if(((userFld.getText()).equals("Username"))||((userFld.getText()).equals(""))) 
        {
            userFld.setText("");
        }
    }//GEN-LAST:event_userFldMouseClicked
    
    /**
     * Main method to create new instance of the constructor of the ServerGui class
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
                    new ServerGui().setVisible(true);
                    serverPnl.setVisible(false);
                    stopServerBtn.setVisible(false);
                    timePnl.setVisible(false);
                    JOptionPane.showMessageDialog(null, "Please enter your login details above \nOnly Admin can start/stop server", "Welcome", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        );
    }

    /**
     * Method to convert the array of Characters found in the JPasswordField into String characters
     * @param pass Character Array
     * @return String
     */
    public String convertPassword(char[] pass)
    {
        String password ="";
        for(int x=0;x<pass.length;x++)
        {
            password = password + Character.toString(pass[x]);
        }
        return password;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel hoursLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JPanel loginPnl;
    public static javax.swing.JLabel minutesLbl;
    public static javax.swing.JPasswordField passFld;
    private javax.swing.JLabel passwordLbl;
    public static javax.swing.JLabel secondsLbl;
    public static javax.swing.JTextArea serverArea;
    private javax.swing.JScrollPane serverAreaScrlPne;
    private javax.swing.JPanel serverBtnsPnl;
    public static javax.swing.JPanel serverPnl;
    public static javax.swing.JButton serverStartBtn;
    public static javax.swing.JButton stopServerBtn;
    public static javax.swing.JPanel timePnl;
    public static javax.swing.JLabel timeSemiLbl;
    public static javax.swing.JLabel timeSemiLbl2;
    private javax.swing.JLabel timerHeadingLbl;
    public static javax.swing.JTextField userFld;
    private javax.swing.JLabel usernameLbl;
    // End of variables declaration//GEN-END:variables
    
}
