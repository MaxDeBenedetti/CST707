/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Casino;

/**
 *This is an input form to collect data from new members.  Somehow it 
 * should alert the user if the member is already in the database.  
 * 
 */
public class MemberInfo extends javax.swing.JFrame {

    /**
     * Creates new form MemberInfo
     */
    public MemberInfo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        FirstNameLabel = new javax.swing.JTextField();
        FirstName = new java.awt.TextField();
        LastNameLabel = new javax.swing.JTextField();
        LastName = new java.awt.TextField();
        PhoneLabel = new javax.swing.JTextField();
        PhoneMember = new java.awt.TextField();
        EmailLabel = new javax.swing.JTextField();
        Email = new java.awt.TextField();
        StreetLabel = new javax.swing.JTextField();
        Street = new java.awt.TextField();
        CityLabel = new javax.swing.JTextField();
        City = new java.awt.TextField();
        StateLabel = new javax.swing.JTextField();
        State = new java.awt.TextField();
        ZipCodeLabel = new javax.swing.JTextField();
        ZipCode = new java.awt.TextField();
        CountryLabel = new javax.swing.JTextField();
        Country = new java.awt.TextField();
        MemberIDLabel = new javax.swing.JTextField();
        MemberID = new java.awt.TextField();
        DateOfBirthLabel = new javax.swing.JTextField();
        DateOfBirth = new java.awt.TextField();
        GenderLabel = new javax.swing.JTextField();
        GenderBoolean = new java.awt.Choice();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(461, 448));
        setPreferredSize(new java.awt.Dimension(465, 448));
        getContentPane().setLayout(null);

        FirstNameLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        FirstNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        FirstNameLabel.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        FirstNameLabel.setText("First Name");
        FirstNameLabel.setBorder(null);
        FirstNameLabel.setOpaque(false);
        getContentPane().add(FirstNameLabel);
        FirstNameLabel.setBounds(180, 10, 120, 24);

        FirstName.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        FirstName.setForeground(setOpaque(true));
        FirstName.setText("textField1");
        FirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstNameActionPerformed(evt);
            }
        });
        getContentPane().add(FirstName);
        FirstName.setBounds(300, 10, 132, 30);

        LastNameLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        LastNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        LastNameLabel.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        LastNameLabel.setText("Last Name");
        LastNameLabel.setBorder(null);
        LastNameLabel.setOpaque(false);
        getContentPane().add(LastNameLabel);
        LastNameLabel.setBounds(133, 40, 167, 24);

        LastName.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        LastName.setForeground(opaque);
        LastName.setText("textField1");
        LastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastNameActionPerformed(evt);
            }
        });
        getContentPane().add(LastName);
        LastName.setBounds(300, 40, 132, 30);

        PhoneLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        PhoneLabel.setForeground(new java.awt.Color(255, 255, 255));
        PhoneLabel.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        PhoneLabel.setText("Phone ");
        PhoneLabel.setBorder(null);
        PhoneLabel.setOpaque(false);
        getContentPane().add(PhoneLabel);
        PhoneLabel.setBounds(190, 70, 110, 30);

        PhoneMember.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        PhoneMember.setForeground(opaque);
        PhoneMember.setText("textField1");
        PhoneMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneMemberActionPerformed(evt);
            }
        });
        getContentPane().add(PhoneMember);
        PhoneMember.setBounds(300, 70, 132, 30);

        EmailLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        EmailLabel.setForeground(new java.awt.Color(255, 255, 255));
        EmailLabel.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        EmailLabel.setText("Email ");
        EmailLabel.setBorder(null);
        EmailLabel.setOpaque(false);
        getContentPane().add(EmailLabel);
        EmailLabel.setBounds(190, 106, 110, 24);

        Email.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        Email.setForeground(opaque);
        Email.setText("textField1");
        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });
        getContentPane().add(Email);
        Email.setBounds(300, 100, 132, 30);

        StreetLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        StreetLabel.setForeground(new java.awt.Color(255, 255, 255));
        StreetLabel.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        StreetLabel.setText("Street");
        StreetLabel.setBorder(null);
        StreetLabel.setOpaque(false);
        StreetLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StreetLabelActionPerformed(evt);
            }
        });
        getContentPane().add(StreetLabel);
        StreetLabel.setBounds(190, 136, 110, 24);

        Street.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        Street.setForeground(opaque);
        Street.setText("textField1");
        Street.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StreetActionPerformed(evt);
            }
        });
        getContentPane().add(Street);
        Street.setBounds(300, 130, 132, 30);

        CityLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        CityLabel.setForeground(new java.awt.Color(255, 255, 255));
        CityLabel.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        CityLabel.setText("City");
        CityLabel.setBorder(null);
        CityLabel.setOpaque(false);
        CityLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CityLabelActionPerformed(evt);
            }
        });
        getContentPane().add(CityLabel);
        CityLabel.setBounds(190, 166, 110, 24);

        City.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        City.setForeground(opaque);
        City.setText("textField1");
        City.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CityActionPerformed(evt);
            }
        });
        getContentPane().add(City);
        City.setBounds(300, 160, 132, 30);

        StateLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        StateLabel.setForeground(new java.awt.Color(255, 255, 255));
        StateLabel.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        StateLabel.setText("State");
        StateLabel.setBorder(null);
        StateLabel.setOpaque(false);
        StateLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StateLabelActionPerformed(evt);
            }
        });
        getContentPane().add(StateLabel);
        StateLabel.setBounds(190, 196, 110, 24);

        State.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        State.setForeground(opaque);
        State.setText("textField1");
        State.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StateActionPerformed(evt);
            }
        });
        getContentPane().add(State);
        State.setBounds(300, 190, 132, 30);

        ZipCodeLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        ZipCodeLabel.setForeground(new java.awt.Color(255, 255, 255));
        ZipCodeLabel.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        ZipCodeLabel.setText("Zip Code");
        ZipCodeLabel.setBorder(null);
        ZipCodeLabel.setOpaque(false);
        getContentPane().add(ZipCodeLabel);
        ZipCodeLabel.setBounds(190, 226, 110, 24);

        ZipCode.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        ZipCode.setForeground(opaque);
        ZipCode.setText("textField1");
        ZipCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZipCodeActionPerformed(evt);
            }
        });
        getContentPane().add(ZipCode);
        ZipCode.setBounds(300, 220, 132, 30);

        CountryLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        CountryLabel.setForeground(new java.awt.Color(255, 255, 255));
        CountryLabel.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        CountryLabel.setText("Member ID");
        CountryLabel.setBorder(null);
        CountryLabel.setOpaque(false);
        getContentPane().add(CountryLabel);
        CountryLabel.setBounds(190, 280, 110, 24);

        Country.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        Country.setForeground(opaque);
        Country.setText("textField1");
        Country.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CountryActionPerformed(evt);
            }
        });
        getContentPane().add(Country);
        Country.setBounds(300, 250, 132, 30);

        MemberIDLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        MemberIDLabel.setForeground(new java.awt.Color(255, 255, 255));
        MemberIDLabel.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        MemberIDLabel.setText("Country");
        MemberIDLabel.setBorder(null);
        MemberIDLabel.setOpaque(false);
        getContentPane().add(MemberIDLabel);
        MemberIDLabel.setBounds(190, 256, 110, 24);

        MemberID.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        MemberID.setForeground(opaque);
        MemberID.setText("textField1");
        MemberID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MemberIDActionPerformed(evt);
            }
        });
        getContentPane().add(MemberID);
        MemberID.setBounds(300, 280, 132, 30);

        DateOfBirthLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        DateOfBirthLabel.setForeground(new java.awt.Color(255, 255, 255));
        DateOfBirthLabel.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        DateOfBirthLabel.setText("Date Of Birth");
        DateOfBirthLabel.setBorder(null);
        DateOfBirthLabel.setOpaque(false);
        getContentPane().add(DateOfBirthLabel);
        DateOfBirthLabel.setBounds(190, 316, 130, 26);

        DateOfBirth.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        DateOfBirth.setText("textField10");
        getContentPane().add(DateOfBirth);
        DateOfBirth.setBounds(320, 310, 110, 32);

        GenderLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        GenderLabel.setForeground(new java.awt.Color(255, 255, 255));
        GenderLabel.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        GenderLabel.setText("Gender");
        GenderLabel.setBorder(null);
        GenderLabel.setOpaque(false);
        getContentPane().add(GenderLabel);
        GenderLabel.setBounds(240, 346, 80, 16);

        GenderBoolean.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                GenderBooleanMouseWheelMoved(evt);
            }
        });
        getContentPane().add(GenderBoolean);
        GenderBoolean.setBounds(320, 340, 110, 22);

        Background.setForeground(new java.awt.Color(255, 255, 255));
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Casino/cards black edited.jpg"))); // NOI18N

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, Background, org.jdesktop.beansbinding.ObjectProperty.create(), Background, org.jdesktop.beansbinding.BeanProperty.create("horizontalAlignment"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, Background, org.jdesktop.beansbinding.ObjectProperty.create(), Background, org.jdesktop.beansbinding.BeanProperty.create("verticalAlignment"));
        bindingGroup.addBinding(binding);

        getContentPane().add(Background);
        Background.setBounds(0, 0, 461, 457);

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StreetLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StreetLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StreetLabelActionPerformed

    private void StateLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StateLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StateLabelActionPerformed

    private void FirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstNameActionPerformed

    private void LastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastNameActionPerformed

    private void PhoneMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneMemberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneMemberActionPerformed

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailActionPerformed

    private void StreetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StreetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StreetActionPerformed

    private void CityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CityActionPerformed

    private void ZipCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZipCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ZipCodeActionPerformed

    private void StateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StateActionPerformed

    private void CountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CountryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CountryActionPerformed

    private void CityLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CityLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CityLabelActionPerformed

    private void GenderBooleanMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_GenderBooleanMouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_GenderBooleanMouseWheelMoved

    private void MemberIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MemberIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MemberIDActionPerformed

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
            java.util.logging.Logger.getLogger(MemberInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MemberInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MemberInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MemberInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MemberInfo().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private java.awt.TextField City;
    private javax.swing.JTextField CityLabel;
    private java.awt.TextField Country;
    private javax.swing.JTextField CountryLabel;
    private java.awt.TextField DateOfBirth;
    private javax.swing.JTextField DateOfBirthLabel;
    private java.awt.TextField Email;
    private javax.swing.JTextField EmailLabel;
    private java.awt.TextField FirstName;
    private javax.swing.JTextField FirstNameLabel;
    private java.awt.Choice GenderBoolean;
    private javax.swing.JTextField GenderLabel;
    private java.awt.TextField LastName;
    private javax.swing.JTextField LastNameLabel;
    private java.awt.TextField MemberID;
    private javax.swing.JTextField MemberIDLabel;
    private javax.swing.JTextField PhoneLabel;
    private java.awt.TextField PhoneMember;
    private java.awt.TextField State;
    private javax.swing.JTextField StateLabel;
    private java.awt.TextField Street;
    private javax.swing.JTextField StreetLabel;
    private java.awt.TextField ZipCode;
    private javax.swing.JTextField ZipCodeLabel;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
