/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.membercrud;

/**
 *
 * @author Jefferson
 */
public class MemberList extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MemberList() {
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
        btnBack = new javax.swing.JButton();
        lbSearchByName = new javax.swing.JLabel();
        txtSearchByName = new javax.swing.JTextField();
        scrollMembers = new javax.swing.JScrollPane();
        tbAlunos = new javax.swing.JTable();
        btnSearchByName = new javax.swing.JButton();
        btnVisualizeMember = new javax.swing.JButton();
        btnUpdateMember = new javax.swing.JButton();
        btnDeleteMember = new javax.swing.JButton();
        btnAddMember = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoPequena.png"))); // NOI18N

        btnBack.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 20)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.png"))); // NOI18N
        btnBack.setText("Voltar");

        lbSearchByName.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 20)); // NOI18N
        lbSearchByName.setText("Pesquisar por nome");

        txtSearchByName.setBackground(new java.awt.Color(255, 255, 255));
        txtSearchByName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchByNameActionPerformed(evt);
            }
        });

        tbAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbAlunos.getTableHeader().setReorderingAllowed(false);
        scrollMembers.setViewportView(tbAlunos);

        btnSearchByName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search.png"))); // NOI18N
        btnSearchByName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchByNameActionPerformed(evt);
            }
        });

        btnVisualizeMember.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 20)); // NOI18N
        btnVisualizeMember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visualize.png"))); // NOI18N
        btnVisualizeMember.setText("Visualizar aluno");
        btnVisualizeMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizeMemberActionPerformed(evt);
            }
        });

        btnUpdateMember.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 20)); // NOI18N
        btnUpdateMember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edit.png"))); // NOI18N
        btnUpdateMember.setText("Editar aluno");
        btnUpdateMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateMemberActionPerformed(evt);
            }
        });

        btnDeleteMember.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 20)); // NOI18N
        btnDeleteMember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete.png"))); // NOI18N
        btnDeleteMember.setText("Remover aluno");
        btnDeleteMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteMemberActionPerformed(evt);
            }
        });

        btnAddMember.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 20)); // NOI18N
        btnAddMember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add-user.png"))); // NOI18N
        btnAddMember.setText("Adicionar aluno");
        btnAddMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMemberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lbLogo)
                        .addGap(126, 126, 126)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbSearchByName)
                            .addComponent(txtSearchByName, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addComponent(btnSearchByName))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(scrollMembers, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAddMember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUpdateMember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDeleteMember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVisualizeMember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnBack)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbLogo)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lbSearchByName)
                        .addGap(2, 2, 2)
                        .addComponent(txtSearchByName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btnSearchByName)))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollMembers, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnAddMember, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnVisualizeMember, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdateMember, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeleteMember, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addComponent(btnBack)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchByNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchByNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchByNameActionPerformed

    private void btnVisualizeMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizeMemberActionPerformed
        
    }//GEN-LAST:event_btnVisualizeMemberActionPerformed

    private void btnUpdateMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateMemberActionPerformed
        
    }//GEN-LAST:event_btnUpdateMemberActionPerformed

    private void btnDeleteMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteMemberActionPerformed
        
    }//GEN-LAST:event_btnDeleteMemberActionPerformed

    private void btnAddMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMemberActionPerformed
     
    }//GEN-LAST:event_btnAddMemberActionPerformed

    private void btnSearchByNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchByNameActionPerformed
        
    }//GEN-LAST:event_btnSearchByNameActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
       
    }//GEN-LAST:event_formWindowGainedFocus

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
            java.util.logging.Logger.getLogger(MemberList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MemberList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MemberList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MemberList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MemberList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddMember;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeleteMember;
    private javax.swing.JButton btnSearchByName;
    private javax.swing.JButton btnUpdateMember;
    private javax.swing.JButton btnVisualizeMember;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lbSearchByName;
    private javax.swing.JScrollPane scrollMembers;
    private javax.swing.JTable tbAlunos;
    private javax.swing.JTextField txtSearchByName;
    // End of variables declaration//GEN-END:variables
}
