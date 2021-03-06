/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

/**
 *
 * @author felipe
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
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

        itfBemVindo = new javax.swing.JInternalFrame();
        pnInternal = new javax.swing.JPanel();
        btnCadEnf = new javax.swing.JButton();
        btnPaciente = new javax.swing.JButton();
        btnAgenda = new javax.swing.JButton();
        btnCadMed3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblPainelFundo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnFechar = new javax.swing.JButton();
        lblFundoPrincipal = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mCad = new javax.swing.JMenu();
        miCadMed = new javax.swing.JMenuItem();
        miPaci = new javax.swing.JMenuItem();
        miEnf = new javax.swing.JMenuItem();
        miUser = new javax.swing.JMenuItem();
        mRelat = new javax.swing.JMenu();
        mTools = new javax.swing.JMenu();
        miTelaBemvindo = new javax.swing.JMenuItem();
        Sair = new javax.swing.JMenu();
        miSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        itfBemVindo.setTitle("Bem-Vindo!");
        itfBemVindo.setVisible(true);
        itfBemVindo.getContentPane().setLayout(null);

        pnInternal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnInternal.setLayout(null);

        btnCadEnf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon-infermeira.png"))); // NOI18N
        btnCadEnf.setToolTipText("Cadastrar enfermeiros");
        btnCadEnf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadEnfActionPerformed(evt);
            }
        });
        pnInternal.add(btnCadEnf);
        btnCadEnf.setBounds(150, 40, 130, 120);

        btnPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cadPacientes.png"))); // NOI18N
        btnPaciente.setToolTipText("Cadastrar pacientes");
        btnPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPacienteActionPerformed(evt);
            }
        });
        pnInternal.add(btnPaciente);
        btnPaciente.setBounds(290, 40, 130, 120);

        btnAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Agenda.png"))); // NOI18N
        btnAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendaActionPerformed(evt);
            }
        });
        pnInternal.add(btnAgenda);
        btnAgenda.setBounds(10, 220, 130, 120);

        btnCadMed3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/CadMedicos.png"))); // NOI18N
        btnCadMed3.setToolTipText("Cadastro de médicos");
        btnCadMed3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadMed3ActionPerformed(evt);
            }
        });
        pnInternal.add(btnCadMed3);
        btnCadMed3.setBounds(10, 40, 130, 120);

        jLabel3.setText("Agenda -");
        pnInternal.add(jLabel3);
        jLabel3.setBounds(20, 190, 60, 20);

        jLabel2.setText("Cadastros -");
        pnInternal.add(jLabel2);
        jLabel2.setBounds(10, 10, 70, 30);

        lblPainelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/internalframe.png"))); // NOI18N
        pnInternal.add(lblPainelFundo);
        lblPainelFundo.setBounds(0, 0, 1080, 490);

        itfBemVindo.getContentPane().add(pnInternal);
        pnInternal.setBounds(0, 55, 1080, 470);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Sistema de Gerênciamento de:");
        itfBemVindo.getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 0, 270, 50);

        btnFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/exit.png"))); // NOI18N
        btnFechar.setToolTipText("Fechar tela de bem-vindo");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });
        itfBemVindo.getContentPane().add(btnFechar);
        btnFechar.setBounds(1043, 0, 40, 40);

        getContentPane().add(itfBemVindo);
        itfBemVindo.setBounds(60, 40, 1100, 560);

        lblFundoPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo_telaprincipal.jpg"))); // NOI18N
        lblFundoPrincipal.setText("jLabel1");
        getContentPane().add(lblFundoPrincipal);
        lblFundoPrincipal.setBounds(0, 0, 1350, 660);

        mCad.setText("Cadastro");

        miCadMed.setText("Médicos");
        mCad.add(miCadMed);

        miPaci.setText("Pacientes");
        mCad.add(miPaci);

        miEnf.setText("Enfermeiros");
        mCad.add(miEnf);

        miUser.setText("Usuários");
        mCad.add(miUser);

        jMenuBar1.add(mCad);

        mRelat.setText("Relatórios");
        jMenuBar1.add(mRelat);

        mTools.setText("Ferramentas");

        miTelaBemvindo.setText("Tela Bem-Vindo");
        miTelaBemvindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miTelaBemvindoActionPerformed(evt);
            }
        });
        mTools.add(miTelaBemvindo);

        jMenuBar1.add(mTools);

        Sair.setText("Sair");

        miSair.setText("Sair");
        miSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSairActionPerformed(evt);
            }
        });
        Sair.add(miSair);

        jMenuBar1.add(Sair);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1364, 717));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadEnfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadEnfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadEnfActionPerformed

    private void btnPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPacienteActionPerformed

    private void btnAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgendaActionPerformed

    private void btnCadMed3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadMed3ActionPerformed

    }//GEN-LAST:event_btnCadMed3ActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        itfBemVindo.dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void miSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_miSairActionPerformed

    private void miTelaBemvindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miTelaBemvindoActionPerformed
        TelaLogin telal = new TelaLogin();
        telal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_miTelaBemvindoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Sair;
    private javax.swing.JButton btnAgenda;
    private javax.swing.JButton btnCadEnf;
    private javax.swing.JButton btnCadMed3;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnPaciente;
    private javax.swing.JInternalFrame itfBemVindo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblFundoPrincipal;
    private javax.swing.JLabel lblPainelFundo;
    private javax.swing.JMenu mCad;
    private javax.swing.JMenu mRelat;
    private javax.swing.JMenu mTools;
    private javax.swing.JMenuItem miCadMed;
    private javax.swing.JMenuItem miEnf;
    private javax.swing.JMenuItem miPaci;
    private javax.swing.JMenuItem miSair;
    private javax.swing.JMenuItem miTelaBemvindo;
    private javax.swing.JMenuItem miUser;
    private javax.swing.JPanel pnInternal;
    // End of variables declaration//GEN-END:variables
}
