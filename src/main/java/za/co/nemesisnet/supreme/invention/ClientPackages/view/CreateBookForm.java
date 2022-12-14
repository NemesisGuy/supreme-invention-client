/*
 *     
 * 
 */
package za.co.nemesisnet.supreme.invention.ClientPackages.view;

import za.co.nemesisnet.supreme.invention.model.Book;
import za.co.nemesisnet.supreme.invention.model.Message;

import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author Peter Buckingham
 */
public class CreateBookForm extends javax.swing.JFrame {
    //CLass that creates a new CreateBookForm gui Instance

    /**
     * Creates new form CreateBookForm
     */
    GuiClientApp guiClientApp;
    public CreateBookForm(GuiClientApp guiClientApp) {
        setTitle("Ubiquitous System" + " - " + "Create a Book");
        this.guiClientApp = guiClientApp;
        initComponents();
    }

    /**
     *
     */
 //   public static CreateBookForm createBookForm = new CreateBookForm(GuiClientApp guiClientApp);

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMain = new javax.swing.JPanel();
        jPanelMid = new javax.swing.JPanel();
        jLabelTitle = new javax.swing.JLabel();
        jLabelAuthor = new javax.swing.JLabel();
        jLabelISBN = new javax.swing.JLabel();
        jLabelRating = new javax.swing.JLabel();
        jTextFieldAuthor = new javax.swing.JTextField();
        jTextFieldISBN = new javax.swing.JTextField();
        jLabelCategory = new javax.swing.JLabel();
        jTextFieldCategory = new javax.swing.JTextField();
        jTextFieldTitle = new javax.swing.JTextField();
        jCheckBoxAvalible = new javax.swing.JCheckBox();
        jPanelBottom = new javax.swing.JPanel();
        jButtonSubmit = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jPanelTop = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Create Book Form");
        setIconImage(displayFrameImageIcon());

        jPanelMain.setBackground(new java.awt.Color(250, 249, 246));

        jPanelMid.setBackground(new java.awt.Color(192, 192, 192));
        jPanelMid.setForeground(new java.awt.Color(0, 0, 0));

        jLabelTitle.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTitle.setText("Title:");

        jLabelAuthor.setForeground(new java.awt.Color(0, 0, 0));
        jLabelAuthor.setText("Author:");

        jLabelISBN.setForeground(new java.awt.Color(0, 0, 0));
        jLabelISBN.setText("ISBN:");

        jLabelRating.setForeground(new java.awt.Color(0, 0, 0));
        jLabelRating.setText("Avalible :");
        jLabelRating.setToolTipText("Avalible for loan, tick for yes...");

        jTextFieldAuthor.setColumns(40);
        jTextFieldAuthor.setToolTipText("Enter author");
        jTextFieldAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAuthorActionPerformed(evt);
            }
        });

        jTextFieldISBN.setColumns(40);
        jTextFieldISBN.setToolTipText("Enter ISBN code");
        jTextFieldISBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldISBNActionPerformed(evt);
            }
        });

        jLabelCategory.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCategory.setText("Category : ");
        jLabelCategory.setToolTipText("Category");

        jTextFieldCategory.setColumns(40);
        jTextFieldCategory.setToolTipText("Enter Category ");
        jTextFieldCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCategoryActionPerformed(evt);
            }
        });

        jTextFieldTitle.setColumns(40);
        jTextFieldTitle.setToolTipText("Enter book title");

        jCheckBoxAvalible.setToolTipText("Avalible for loan, tick for yes...");
        jCheckBoxAvalible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxAvalibleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMidLayout = new javax.swing.GroupLayout(jPanelMid);
        jPanelMid.setLayout(jPanelMidLayout);
        jPanelMidLayout.setHorizontalGroup(
            jPanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMidLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTitle)
                    .addComponent(jLabelISBN)
                    .addComponent(jLabelAuthor)
                    .addComponent(jLabelRating)
                    .addComponent(jLabelCategory))
                .addGap(50, 50, 50)
                .addGroup(jPanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxAvalible))
                .addGap(20, 20, 20))
        );
        jPanelMidLayout.setVerticalGroup(
            jPanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMidLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelTitle)
                    .addComponent(jTextFieldTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAuthor)
                    .addComponent(jTextFieldAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelISBN)
                    .addComponent(jTextFieldISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCategory))
                .addGap(18, 18, 18)
                .addGroup(jPanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelRating)
                    .addComponent(jCheckBoxAvalible))
                .addGap(20, 20, 20))
        );

        jPanelBottom.setBackground(new java.awt.Color(192, 192, 192));
        jPanelBottom.setForeground(new java.awt.Color(0, 0, 0));

        jButtonSubmit.setText("Submit");
        jButtonSubmit.setToolTipText("Click to submit ");
        jButtonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubmitActionPerformed(evt);
            }
        });

        jButtonCancel.setMnemonic('C');
        jButtonCancel.setText("Cancel");
        jButtonCancel.setToolTipText("Click to cancel");
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBottomLayout.setVerticalGroup(
            jPanelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBottomLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSubmit)
                    .addComponent(jButtonCancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelTop.setBackground(new java.awt.Color(192, 192, 192));

        jLabel3.setBackground(new java.awt.Color(192, 192, 192));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Create Book:");

        javax.swing.GroupLayout jPanelTopLayout = new javax.swing.GroupLayout(jPanelTop);
        jPanelTop.setLayout(jPanelTopLayout);
        jPanelTopLayout.setHorizontalGroup(
            jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTopLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jTextFieldAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAuthorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAuthorActionPerformed

    private void jTextFieldISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldISBNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldISBNActionPerformed

    private void jButtonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubmitActionPerformed
        //JButtonSubmitActionPerformed method with parameters : ActionEvent evt
        //JButtonSubmitActionPerformed method with signature : void jButtonSubmitActionPerformed(java.awt.event.ActionEvent evt)
        //create a new Book object and saves the values from the text fields to the object and saves the object to the databasep
    //    Create create = new Create();
      //  create.createBook(jTextFieldTitle.getText(), jTextFieldSubTitle.getText(), jTextFieldAuthor.getText(), jTextFieldISBN.getText(), jTextFieldDescription.getText(), jTextFieldRating.getText(), jTextFieldImageLink.getText());
     // public Book(String ISBN, String title, String author, String category, boolean availableForLoan) {
        Message message = new Message();

        Message responseMessage = new Message();
        Book book = new Book(jTextFieldISBN.getText(), jTextFieldTitle.getText(), jTextFieldAuthor.getText(),  jTextFieldCategory.getText(), jCheckBoxAvalible .isSelected());
       responseMessage = guiClientApp.sendMessageData(message);
        System.out.println("Response message: " + responseMessage.getText());

        Book bookFromDatabase = (Book) guiClientApp.sendObjectData(book);
        System.out.println("Book from database: " + bookFromDatabase.toString());
        if (bookFromDatabase != null) {
            JOptionPane.showMessageDialog(null, "Book added to database");
        } else {
            JOptionPane.showMessageDialog(null, "Book not added to database");
        }


    }//GEN-LAST:event_jButtonSubmitActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        //jButtonCancelActionPerformed method with parameters : ActionEvent evt
        //jButtonCancelActionPerformed method with signature : void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt)
        //this method closes the window
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jCheckBoxAvalibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxAvalibleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxAvalibleActionPerformed

    private void jTextFieldCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCategoryActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //main method with parameters : String[] args
        //main method with signature : public static void main(String[] args)
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
            java.util.logging.Logger.getLogger(CreateBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    /**
     *
     * @return displayFrameImageIcon the image icon of the frame
     */
    public Image displayFrameImageIcon() {
        return null;
    }

    /**
     * @apiNote exit this method exits the program when the user clicks the close button. It displays a goodbye message and exits the program
     *
     */
    public void exit() {
        //exit method with parameters : ActionEvent evt
        //exit method with signature : void exit(java.awt.event.ActionEvent evt)
        //this method exits the program and displays a messageDialog with a goodbye message to the user
        JOptionPane.showMessageDialog(new JFrame(), "Thanks for using my program!  \n \n " + "Author : Peter Buckingham \n Student Number: ****65289 \n Date: May 2022", "Ubiquitous System - CRUD ", JOptionPane.INFORMATION_MESSAGE);
        System.out.println("");
        System.out.println("Thanks for using my program!");
        System.out.println("Author : Peter Buckingham \n");
        System.err.println("");
        System.exit(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonSubmit;
    private javax.swing.JCheckBox jCheckBoxAvalible;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelAuthor;
    private javax.swing.JLabel jLabelCategory;
    private javax.swing.JLabel jLabelISBN;
    private javax.swing.JLabel jLabelRating;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanelBottom;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JPanel jPanelMid;
    private javax.swing.JPanel jPanelTop;
    private javax.swing.JTextField jTextFieldAuthor;
    private javax.swing.JTextField jTextFieldCategory;
    private javax.swing.JTextField jTextFieldISBN;
    private javax.swing.JTextField jTextFieldTitle;
    // End of variables declaration//GEN-END:variables
}
