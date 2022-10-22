/*
 *     
 * 
 */
package za.co.nemesisnet.supreme.invention.ClientPackages.view;

import java.awt.Image;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import za.co.nemesisnet.supreme.invention.model.Message;
import za.co.nemesisnet.supreme.invention.model.User;
import za.co.nemesisnet.supreme.invention.model.Validator;


/**
 *
 * @author Peter Buckingham
 */
public class CreateUserForm extends javax.swing.JDialog {

    /**
     * Creates new form createUserForm
     *
     * @param parent
     * @param modal
     */

    static GuiClientApp guiClientApp;
    public CreateUserForm(java.awt.Frame parent, boolean modal , GuiClientApp guiClientApp) {
        //constructor with parameters : parent, modal
        //constructor with signature : public CreateUserForm(java.awt.Frame parent, boolean modal);
        //constructor set to properties : parent, modal and sets the frame title to "Create User"
        super(parent, modal);
        setTitle("Ubiquitous System" + " - " + "Create a User");
        this.guiClientApp = guiClientApp;

        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMain = new javax.swing.JPanel();
        jPanelMid = new javax.swing.JPanel();
        jLabelFirstName = new javax.swing.JLabel();
        jLabelUserName = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        jTextFieldUserName = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelLastName = new javax.swing.JLabel();
        jLabelComfirmEmail = new javax.swing.JLabel();
        jTextFieldLastName = new javax.swing.JTextField();
        jTextFieldConfirmEmail = new javax.swing.JTextField();
        jPasswordFieldPassword = new javax.swing.JPasswordField();
        jLabelConfirmPassword = new javax.swing.JLabel();
        jPasswordFieldConfirmPassword = new javax.swing.JPasswordField();
        jTextFieldFirstName = new javax.swing.JTextField();
        jPanelBottom = new javax.swing.JPanel();
        jButtonSubmit = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jPanelTop = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CRUD - Operations - Create User Form");
        setIconImage(displayFrameImageIcon());

        jPanelMain.setBackground(new java.awt.Color(250, 249, 246));

        jPanelMid.setBackground(new java.awt.Color(192, 192, 192));
        jPanelMid.setForeground(new java.awt.Color(0, 0, 0));

        jLabelFirstName.setForeground(new java.awt.Color(0, 0, 0));
        jLabelFirstName.setText("First Name:");

        jLabelUserName.setForeground(new java.awt.Color(0, 0, 0));
        jLabelUserName.setText("User Name:");

        jLabelEmail.setForeground(new java.awt.Color(0, 0, 0));
        jLabelEmail.setText("Email:");

        jLabelPassword.setForeground(new java.awt.Color(0, 0, 0));
        jLabelPassword.setText("Password:");

        jTextFieldUserName.setColumns(40);
        jTextFieldUserName.setToolTipText("Enter user name");
        jTextFieldUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUserNameActionPerformed(evt);
            }
        });

        jTextFieldEmail.setColumns(40);
        jTextFieldEmail.setToolTipText("Enter email");
        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });

        jLabelLastName.setForeground(new java.awt.Color(0, 0, 0));
        jLabelLastName.setText("Last Name: ");

        jLabelComfirmEmail.setForeground(new java.awt.Color(0, 0, 0));
        jLabelComfirmEmail.setText("Confirm Email:");

        jTextFieldLastName.setColumns(40);
        jTextFieldLastName.setToolTipText("Enter last name");

        jTextFieldConfirmEmail.setColumns(40);
        jTextFieldConfirmEmail.setToolTipText("Re-enter email");

        jPasswordFieldPassword.setColumns(40);
        jPasswordFieldPassword.setToolTipText("Enter password");
        jPasswordFieldPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldPasswordActionPerformed(evt);
            }
        });

        jLabelConfirmPassword.setForeground(new java.awt.Color(0, 0, 0));
        jLabelConfirmPassword.setText("Confirm Password:");

        jPasswordFieldConfirmPassword.setColumns(40);
        jPasswordFieldConfirmPassword.setToolTipText("Re-enter password");

        jTextFieldFirstName.setColumns(40);
        jTextFieldFirstName.setToolTipText("Enter first name");

        javax.swing.GroupLayout jPanelMidLayout = new javax.swing.GroupLayout(jPanelMid);
        jPanelMid.setLayout(jPanelMidLayout);
        jPanelMidLayout.setHorizontalGroup(
            jPanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMidLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelFirstName)
                    .addComponent(jLabelEmail)
                    .addComponent(jLabelLastName)
                    .addComponent(jLabelUserName)
                    .addComponent(jLabelPassword)
                    .addComponent(jLabelComfirmEmail)
                    .addComponent(jLabelConfirmPassword))
                .addGap(20, 20, 20)
                .addGroup(jPanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPasswordFieldPassword, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldLastName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldUserName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldConfirmEmail, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldFirstName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPasswordFieldConfirmPassword, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(20, 20, 20))
        );
        jPanelMidLayout.setVerticalGroup(
            jPanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMidLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelFirstName)
                    .addComponent(jTextFieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLastName)
                    .addComponent(jTextFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUserName)
                    .addComponent(jTextFieldUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmail)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldConfirmEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelComfirmEmail))
                .addGap(18, 18, 18)
                .addGroup(jPanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPassword)
                    .addComponent(jPasswordFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelConfirmPassword)
                    .addComponent(jPasswordFieldConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        jPanelBottom.setBackground(new java.awt.Color(192, 192, 192));
        jPanelBottom.setForeground(new java.awt.Color(0, 0, 0));

        jButtonSubmit.setText("Submit");
        jButtonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubmitActionPerformed(evt);
            }
        });

        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBottomLayout = new javax.swing.GroupLayout(jPanelBottom);
        jPanelBottom.setLayout(jPanelBottomLayout);
        jPanelBottomLayout.setHorizontalGroup(
            jPanelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBottomLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140))
        );
        jPanelBottomLayout.setVerticalGroup(
            jPanelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBottomLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancel)
                    .addComponent(jButtonSubmit))
                .addGap(20, 20, 20))
        );

        jPanelTop.setBackground(new java.awt.Color(192, 192, 192));

        jLabel3.setBackground(new java.awt.Color(192, 192, 192));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Create User:");

        javax.swing.GroupLayout jPanelTopLayout = new javax.swing.GroupLayout(jPanelTop);
        jPanelTop.setLayout(jPanelTopLayout);
        jPanelTopLayout.setHorizontalGroup(
            jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTopLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelTopLayout.setVerticalGroup(
            jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTopLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout jPanelMainLayout = new javax.swing.GroupLayout(jPanelMain);
        jPanelMain.setLayout(jPanelMainLayout);
        jPanelMainLayout.setHorizontalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelBottom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelMainLayout.setVerticalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addComponent(jPanelTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelMid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBottom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jTextFieldUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUserNameActionPerformed

    private boolean validateFormNames() //validateformnames method parameters : none
    //validateformnames method signature : boolean
    //validateformnames method return type : boolean
    //validateformnames method description : this method validates the form names
    // and returns true if the names are valid and false if the names are invalid and displays an error message
    {
        if (jTextFieldFirstName.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Error: invald First Name! \n User creation unsuccessfull!");
        } else if (jTextFieldLastName.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Error: invald Last Name! \n User creation unsuccessfull!");
        } else if (jTextFieldUserName.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Error: invald User Name! \n Setting Suggested Name \n User creation unsuccessfull!");
            Random rand = new Random();
            int number = rand.nextInt(9999);
            jTextFieldUserName.setText(jTextFieldFirstName.getText() + "." + jTextFieldLastName.getText() + "#" + number);
        } else {
            return true;
        }
        return false;
    }

    private boolean validateFormEmails() {
        //validateformemails method parameters : none
        //validateformemails method signature : boolean  true
        //validateformemails method return type : boolean
        //validateformemails method description : this method validates the form emails and returns true if the emails are valid and false,
        // if the emails are invalid and displays an error message indicating the error and clearing the email field

        Validator validator = new Validator();
        if (validator.isEmailValid(jTextFieldEmail.getText())) {
            if (validator.compareEmails(jTextFieldEmail.getText(), jTextFieldConfirmEmail.getText())) {
                return true;
            } else {
                JOptionPane.showMessageDialog(this, "Error: email address missmatch! \n User creation unsuccessfull!");
                clearEmail();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Error: invald email address! \n User creation unsuccessfull!");
            clearEmail();
        }

        return false;
    }

    private void validateFormPasswords() {
        //validateformpasswords method parameters : none
        //validateformpasswords method signature : void
        //validateformpasswords method return type : void
        //validateformpasswords method description : this method validates the form passwords and returns true if the passwords are valid and false,
        // if the passwords are invalid and displays an error message indicating the error and clearing the password fields

     
        Validator validator = new Validator();
        String tempPassword = new String(jPasswordFieldPassword.getPassword());
        String tempPasswordConfirm = new String(jPasswordFieldConfirmPassword.getPassword());
        if (validator.isValidPassword(tempPassword)) {

            if (validator.comparePasswords(tempPassword, tempPasswordConfirm)) {
                createUser();
                clearForm();
            } else {

                JOptionPane.showMessageDialog(this, "Error: password missmatch! \n User creation unsuccessfull!");
                clearPasswords();
            }

        } else {
            JOptionPane.showMessageDialog(this, "Error: invalid password! \nrequired :\n It contains at least 8 characters and at most 20 characters.\n It contains at least one digit. \nIt contains at least one upper case alphabet.\n It contains at least one lower case alphabet.\nIt contains at least one special character which includes !@#$%&*()-+=^.\n It doesn’t contain any white space.\n User creation unsuccessfull!");
            clearPasswords();
            //not stronk
        }
    }

    private void validateFormFileds() {
        //validateformfields method parameters : none
        //validateformfields method signature : void
        //validateformfields method return type : void
        //validateformfields method description : this method validates the form fields and returns true if the fields are valid and false,
        // if the fields are invalid and displays an error message indicating the error and clearing the fields

        if (validateFormNames()) {
            if (validateFormEmails()) {
                validateFormPasswords();
            }
        }
        if (validateFormNames()) {
            if (validateFormEmails()) {
                validateFormPasswords();
            }
        }
    }

    private void clearPasswords() {
        //clearpasswords method parameters : none
        //clearpasswords method signature : void
        //clearpasswords method return type : void
        //clearpasswords method description : this method clears the password fields

        jPasswordFieldPassword.setText("");
        jPasswordFieldConfirmPassword.setText("");
    }

    private void clearEmail() {
        //clearemail method parameters : none
        //clearemail method signature : void
        //clearemail method return type : void
        //clearemail method description : this method clears the email fields

        jTextFieldEmail.setText("");
        jTextFieldConfirmEmail.setText("");
    }

    private void clearForm() {
        //clearform method parameters : none
        //clearform method signature : void
        //clearform method return type : void
        //clearform method description : this method clears the form fields

        jTextFieldFirstName.setText("");
        jTextFieldLastName.setText("");
        jTextFieldUserName.setText("");
        clearEmail();
        clearPasswords();
    }
    private void jButtonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubmitActionPerformed
        // JButtonsubmitActionPerformed method parameters : none
        // JButtonsubmitActionPerformed method signature : void
        // JButtonsubmitActionPerformed method return type : void
        // JButtonsubmitActionPerformed method description : this method validates the form fields and returns true if the fields are valid and false,
        // if the fields are invalid and displays an error message indicating the error and clearing the fields
        //validate then talk to db
        validateFormFileds();

    }//GEN-LAST:event_jButtonSubmitActionPerformed

    private void jPasswordFieldPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldPasswordActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        //jButtonCancelActionPerformed method parameters : none
        //jButtonCancelActionPerformed method signature : void
        //jButtonCancelActionPerformed method return type : void
        //jButtonCancelActionPerformed method description : this method clears the form fields

        this.setVisible(false);
        this.dispose();

    }//GEN-LAST:event_jButtonCancelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CreateUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CreateUserForm dialog = new CreateUserForm(new javax.swing.JFrame(), true,guiClientApp);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonSubmit;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelComfirmEmail;
    private javax.swing.JLabel jLabelConfirmPassword;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelFirstName;
    private javax.swing.JLabel jLabelLastName;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelUserName;
    private javax.swing.JPanel jPanelBottom;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JPanel jPanelMid;
    private javax.swing.JPanel jPanelTop;
    private javax.swing.JPasswordField jPasswordFieldConfirmPassword;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JTextField jTextFieldConfirmEmail;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldFirstName;
    private javax.swing.JTextField jTextFieldLastName;
    private javax.swing.JTextField jTextFieldUserName;
    // End of variables declaration//GEN-END:variables
    /**
     * @apiNote createUsers method creates a user in the database
     */
    private void createUser() {
        //createUser method parameters : none
        //createUser method signature : void
        //createUser method return type : void
        //createUser method description : this method creates a user and inserts the user into the database
        //create a user object and saves it to the database
        
        String tempPassword = new String(jPasswordFieldPassword.getPassword());
            //send CREATE_USER message to server
        Message message = new Message();
        Message responseMessage = new Message();
        message.setText("CREATE_USER");
        responseMessage = guiClientApp.sendMessageData(message);
        System.out.println("responseMessage.getText() = " + responseMessage.getText());
    //public User(String userId, String firstName, String lastName, String userName, String email, String password, String accessLevel) {

        User user = new User("0",jTextFieldFirstName.getText(), jTextFieldLastName.getText(), jTextFieldUserName.getText(), jTextFieldEmail.getText(), jPasswordFieldPassword.getText(), "0");

        //send user object to server
        User userResponse = new User();
        userResponse = (User) guiClientApp.sendObjectData(user);
        if (userResponse != null) {
            JOptionPane.showMessageDialog(this, "User created successfully");
            this.setVisible(false);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "User creation failed");
        }


            

            
            //send user object to server for procceeing in to the database
            
      //  create.createUser(jTextFieldFirstName.getText(), jTextFieldLastName.getText(), jTextFieldUserName.getText(), jTextFieldEmail.getText(), jPasswordFieldPassword.getText(), 0);

    }

    /**
     *
     * @return Image
     */
    public Image displayFrameImageIcon() {
        //displayFrameImageIcon method parameters : none
        //displayFrameImageIcon method signature : Image
        //displayFrameImageIcon method return type : Image
        //displayFrameImageIcon method description : this method displays the image icon on the frame
        //display the image icon on the frame


        return null;
    }

    /**
     * @apiNote exit the application when the user clicks the close button , display a goodbye messageDialog
     */
    public void exit() {
        //exit method parameters : none
        //exit method signature : void
        //exit method return type : void
        //exit method description : this method exits the program when the user clicks the exit button and displays a goodbye messageDialog

        JOptionPane.showMessageDialog(new JFrame(), "Thanks for using my program!  \n \n " + "Author : Peter Buckingham \n Student Number: ****65289 \n Date: May 2022", "Ubiquitous System - CRUD ", JOptionPane.INFORMATION_MESSAGE);
        System.out.println("");
        System.out.println("Thanks for using my program!");
        System.out.println("Author : Peter Buckingham \n");
        System.err.println("");
        System.exit(0);
    }
}