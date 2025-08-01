/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view.membercrud;

/**
 *
 * @author Jefferson
 */
public class VisualizeMember extends javax.swing.JDialog {
    
    /**
     * Creates new form VisualizarAluno
     */
    public VisualizeMember() {
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

        lbLogo = new javax.swing.JLabel();
        lbFullName = new javax.swing.JLabel();
        lbEnrollment = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        lbCPF = new javax.swing.JLabel();
        lbRG = new javax.swing.JLabel();
        lbPhone = new javax.swing.JLabel();
        lbWhatsapp = new javax.swing.JLabel();
        lbRegistrationDateIcon = new javax.swing.JLabel();
        lbBirthDateIcon = new javax.swing.JLabel();
        lbFullNameIcon = new javax.swing.JLabel();
        lbEnrollmentIcon = new javax.swing.JLabel();
        lbEmailIcon = new javax.swing.JLabel();
        lbCPFIcon = new javax.swing.JLabel();
        lbRGIcon = new javax.swing.JLabel();
        lbPhoneIcon = new javax.swing.JLabel();
        lbBirthDate = new javax.swing.JLabel();
        lbWhatsappIcon = new javax.swing.JLabel();
        lbRegistrationDate = new javax.swing.JLabel();
        lbPaymentPlanIcon = new javax.swing.JLabel();
        lbPaymentPlan = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoPequena.png"))); // NOI18N

        lbFullName.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 22)); // NOI18N

        lbEnrollment.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 22)); // NOI18N

        lbEmail.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 22)); // NOI18N

        lbCPF.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 22)); // NOI18N

        lbRG.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 22)); // NOI18N

        lbPhone.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 22)); // NOI18N

        lbWhatsapp.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 22)); // NOI18N

        lbRegistrationDateIcon.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        lbRegistrationDateIcon.setText("Data de matrícula:");

        lbBirthDateIcon.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        lbBirthDateIcon.setText("Data de nascimento:");

        lbFullNameIcon.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        lbFullNameIcon.setText("Nome completo:");

        lbEnrollmentIcon.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        lbEnrollmentIcon.setText("Matrícula:");

        lbEmailIcon.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        lbEmailIcon.setText("Email:");

        lbCPFIcon.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        lbCPFIcon.setText("CPF:");

        lbRGIcon.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        lbRGIcon.setText("RG:");

        lbPhoneIcon.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        lbPhoneIcon.setText("Telefone:");

        lbBirthDate.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 22)); // NOI18N

        lbWhatsappIcon.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        lbWhatsappIcon.setText("Whatsapp:");

        lbRegistrationDate.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 22)); // NOI18N

        lbPaymentPlanIcon.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        lbPaymentPlanIcon.setText("Plano atual:");

        lbPaymentPlan.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 22)); // NOI18N

        btnBack.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 20)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.png"))); // NOI18N
        btnBack.setText("Voltar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbEmailIcon)
                            .addComponent(lbEnrollmentIcon)
                            .addComponent(lbFullNameIcon)
                            .addComponent(lbCPFIcon)
                            .addComponent(lbRGIcon)
                            .addComponent(lbPhoneIcon)
                            .addComponent(lbWhatsappIcon)
                            .addComponent(lbRegistrationDateIcon)
                            .addComponent(lbBirthDateIcon)
                            .addComponent(lbPaymentPlanIcon))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbFullName, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                            .addComponent(lbEnrollment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbCPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbRG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbPhone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbWhatsapp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbRegistrationDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbBirthDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbPaymentPlan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack)
                            .addComponent(lbLogo))))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lbLogo)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbFullNameIcon))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEnrollmentIcon)
                    .addComponent(lbEnrollment, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEmailIcon)
                    .addComponent(lbEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCPFIcon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbRGIcon)
                    .addComponent(lbRG, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPhoneIcon)
                    .addComponent(lbPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbWhatsappIcon)
                    .addComponent(lbWhatsapp, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbRegistrationDateIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbRegistrationDate, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbBirthDateIcon)
                    .addComponent(lbBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbPaymentPlanIcon)
                    .addComponent(lbPaymentPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel lbBirthDate;
    private javax.swing.JLabel lbBirthDateIcon;
    private javax.swing.JLabel lbCPF;
    private javax.swing.JLabel lbCPFIcon;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbEmailIcon;
    private javax.swing.JLabel lbEnrollment;
    private javax.swing.JLabel lbEnrollmentIcon;
    private javax.swing.JLabel lbFullName;
    private javax.swing.JLabel lbFullNameIcon;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lbPaymentPlan;
    private javax.swing.JLabel lbPaymentPlanIcon;
    private javax.swing.JLabel lbPhone;
    private javax.swing.JLabel lbPhoneIcon;
    private javax.swing.JLabel lbRG;
    private javax.swing.JLabel lbRGIcon;
    private javax.swing.JLabel lbRegistrationDate;
    private javax.swing.JLabel lbRegistrationDateIcon;
    private javax.swing.JLabel lbWhatsapp;
    private javax.swing.JLabel lbWhatsappIcon;
    // End of variables declaration//GEN-END:variables
}
