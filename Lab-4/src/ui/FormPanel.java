/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;
import java.awt.CardLayout;
import java.io.File;
//import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author abdulmohsin
 */
public class FormPanel extends javax.swing.JPanel {

    /**
     * Creates new form FormPanel
     */
    private JPanel bottomPanel;
    public FormPanel(JPanel inputPanel) {
        initComponents();
        this.bottomPanel = inputPanel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        firstName = new javax.swing.JLabel();
        lastName = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        eMail = new javax.swing.JLabel();
        textMessage = new javax.swing.JLabel();
        userPhoto = new javax.swing.JLabel();
        firstnameText = new javax.swing.JTextField();
        lastnameText = new javax.swing.JTextField();
        ageText = new javax.swing.JTextField();
        emailText = new javax.swing.JTextField();
        messageText = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        uploadImage = new javax.swing.JButton();

        mainPanel.setBackground(new java.awt.Color(255, 255, 204));
        mainPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mainPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        titleLabel.setFont(new java.awt.Font("Beirut", 2, 20)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Patient Registration Form");

        firstName.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        firstName.setText("First Name :");

        lastName.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lastName.setText("Last Name :");

        age.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        age.setText("Age :");

        eMail.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        eMail.setText("Email :");

        textMessage.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        textMessage.setText("Message :");

        userPhoto.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        userPhoto.setText("Photo :");

        firstnameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnameTextActionPerformed(evt);
            }
        });

        lastnameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameTextActionPerformed(evt);
            }
        });

        emailText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextActionPerformed(evt);
            }
        });

        messageText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messageTextActionPerformed(evt);
            }
        });

        submitButton.setBackground(new java.awt.Color(204, 204, 204));
        submitButton.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        submitButton.setForeground(new java.awt.Color(0, 0, 51));
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        uploadImage.setBackground(new java.awt.Color(204, 204, 204));
        uploadImage.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        uploadImage.setText("Upload Image");
        uploadImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadImageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstName)
                            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(age)
                                .addComponent(lastName)
                                .addComponent(eMail)
                                .addComponent(textMessage)
                                .addComponent(userPhoto)))
                        .addGap(38, 38, 38)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lastnameText, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstnameText, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ageText, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(messageText, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addComponent(uploadImage))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstName)
                    .addComponent(firstnameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastnameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastName))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(age))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eMail))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(messageText, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textMessage))
                .addGap(28, 28, 28)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uploadImage)
                    .addComponent(userPhoto))
                .addGap(18, 18, 18)
                .addComponent(submitButton)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void firstnameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnameTextActionPerformed

    private void lastnameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameTextActionPerformed

    private void emailTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextActionPerformed

    private void messageTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messageTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_messageTextActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        Patient newPatient = new Patient();
        newPatient.setFirstname(firstnameText.getText());
        newPatient.setLastname(lastnameText.getText());
        newPatient.setAge(ageText.getText());
        newPatient.setEmail(emailText.getText());
        newPatient.setMessage(messageText.getText());
        newPatient.setImagePath(path);
     
        if (!newPatient.getFirstname().matches("[A-Z][a-zA-Z\\s]*")) {
            JOptionPane.showMessageDialog(this, "First name cannot contain numbers or special characters.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!newPatient.getLastname().matches("[A-Z][a-zA-Z\\s]*")) {
            JOptionPane.showMessageDialog(this, "Last name cannot contain numbers or special characters.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!newPatient.getAge().matches("\\d+") || Integer.parseInt(newPatient.getAge()) < 1 || Integer.parseInt(newPatient.getAge()) > 120) {
            JOptionPane.showMessageDialog(this, "Invalid age format or out of range.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!newPatient.getEmail().matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            JOptionPane.showMessageDialog(this, "Invalid email format.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        JOptionPane.showMessageDialog(this, "Data submitted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
        System.out.println(newPatient.getFirstname() + " " + newPatient.getLastname() + " " + newPatient.getAge() + " " + newPatient.getEmail() + " " + newPatient.getMessage() + " ");
        //        Icon Icon = null;
       // JOptionPane.showMessageDialog(this, "Name:" +newPatient.getFirstname() + " " + newPatient.getLastname() + " \n Age:" + newPatient.getAge() + "\n Email:" + newPatient.getEmail() + "\n Message: " + newPatient.getMessage(), "User Info", JOptionPane.INFORMATION_MESSAGE,Icon);
       ViewPanel view = new ViewPanel(newPatient);
        bottomPanel.add(view);
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.next(bottomPanel);
    }//GEN-LAST:event_submitButtonActionPerformed
private ImageIcon Icon;
private String path;
    private void uploadImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadImageActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Image Files", "jpg", "jpeg", "png", "gif");
        fileChooser.setFileFilter(filter);

        int returnValue = fileChooser.showOpenDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            if (isImageFile(selectedFile)) {
                Icon = new ImageIcon(selectedFile.getAbsolutePath());
                path = selectedFile.getAbsolutePath();
                JOptionPane.showMessageDialog( this, "Selected Image:", "Image Upload", JOptionPane.INFORMATION_MESSAGE,Icon);
            //imgPanel.setIcon(Icon);
            } else {
                JOptionPane.showMessageDialog( this, "Invalid file. Please select an image file.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        
    }//GEN-LAST:event_uploadImageActionPerformed
private boolean isImageFile(File file) {
    String fileName = file.getName().toLowerCase();
    return fileName.endsWith(".jpg") || fileName.endsWith(".jpeg") || fileName.endsWith(".png") || fileName.endsWith(".gif");
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel age;
    private javax.swing.JTextField ageText;
    private javax.swing.JLabel eMail;
    private javax.swing.JTextField emailText;
    private javax.swing.JLabel firstName;
    private javax.swing.JTextField firstnameText;
    private javax.swing.JLabel lastName;
    private javax.swing.JTextField lastnameText;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField messageText;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel textMessage;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton uploadImage;
    private javax.swing.JLabel userPhoto;
    // End of variables declaration//GEN-END:variables

    
}
