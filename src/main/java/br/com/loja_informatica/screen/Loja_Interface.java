/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.loja_informatica.screen;

import br.com.loja_informatica.Computador;
import br.com.loja_informatica.DAO.ComputadorDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo
 */
public class Loja_Interface extends javax.swing.JFrame {

    /**
     * Creates new form Loja_Interface
     */
    public Loja_Interface() {
        initComponents();

        jDesktopPane1.setVisible(false);
        jInternalFrameCadastrarPC.setVisible(false);
        jInternalFrameVisualizarPC.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1Principal = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jInternalFrameVisualizarPC = new javax.swing.JInternalFrame();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButtonVisualizarVoltar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButtonVisualizarDeletar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jInternalFrameCadastrarPC = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1CadastrarProcessador = new javax.swing.JTextField();
        jTextField2CadastrarHd = new javax.swing.JTextField();
        jButton1CadastrarSalvar = new javax.swing.JButton();
        jButtonCadastrarCancelar = new javax.swing.JButton();
        BarraPrincipal = new javax.swing.JMenuBar();
        jMenu1Cadastrar = new javax.swing.JMenu();
        jMenuItemCadastrarPC = new javax.swing.JMenuItem();
        jMenu2Visualizar = new javax.swing.JMenu();
        jMenuItemVisualizarPC = new javax.swing.JMenuItem();
        jMenu5Sair = new javax.swing.JMenu();
        jMenuItem1Sair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 400));
        getContentPane().setLayout(null);

        jPanel1Principal.setLayout(null);

        jInternalFrameVisualizarPC.setMinimumSize(new java.awt.Dimension(680, 530));
        jInternalFrameVisualizarPC.setVisible(true);
        jInternalFrameVisualizarPC.getContentPane().setLayout(null);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jInternalFrameVisualizarPC.getContentPane().add(jTextField1);
        jTextField1.setBounds(140, 30, 150, 22);

        jLabel3.setText("Filtrar por processador:");
        jInternalFrameVisualizarPC.getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 20, 130, 40);

        jButtonVisualizarVoltar.setText("Voltar");
        jButtonVisualizarVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVisualizarVoltarActionPerformed(evt);
            }
        });
        jInternalFrameVisualizarPC.getContentPane().add(jButtonVisualizarVoltar);
        jButtonVisualizarVoltar.setBounds(430, 30, 63, 25);

        jButton1.setText("Atualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jInternalFrameVisualizarPC.getContentPane().add(jButton1);
        jButton1.setBounds(350, 130, 130, 40);

        jButtonVisualizarDeletar.setText("Deletar");
        jButtonVisualizarDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVisualizarDeletarActionPerformed(evt);
            }
        });
        jInternalFrameVisualizarPC.getContentPane().add(jButtonVisualizarDeletar);
        jButtonVisualizarDeletar.setBounds(350, 210, 130, 40);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jInternalFrameVisualizarPC.getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(16, 70, 270, 180);

        jDesktopPane1.add(jInternalFrameVisualizarPC);
        jInternalFrameVisualizarPC.setBounds(0, 0, 680, 530);

        jInternalFrameCadastrarPC.setMinimumSize(new java.awt.Dimension(300, 400));
        jInternalFrameCadastrarPC.setVisible(true);
        jInternalFrameCadastrarPC.getContentPane().setLayout(null);

        jLabel1.setText("Processador:");
        jInternalFrameCadastrarPC.getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 30, 88, 31);

        jLabel2.setText("HD:");
        jInternalFrameCadastrarPC.getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 90, 71, 27);

        jTextField1CadastrarProcessador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1CadastrarProcessadorActionPerformed(evt);
            }
        });
        jInternalFrameCadastrarPC.getContentPane().add(jTextField1CadastrarProcessador);
        jTextField1CadastrarProcessador.setBounds(100, 32, 185, 30);
        jInternalFrameCadastrarPC.getContentPane().add(jTextField2CadastrarHd);
        jTextField2CadastrarHd.setBounds(100, 90, 190, 30);

        jButton1CadastrarSalvar.setText("Salvar");
        jButton1CadastrarSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1CadastrarSalvarActionPerformed(evt);
            }
        });
        jInternalFrameCadastrarPC.getContentPane().add(jButton1CadastrarSalvar);
        jButton1CadastrarSalvar.setBounds(210, 170, 90, 40);

        jButtonCadastrarCancelar.setText("Cancelar");
        jButtonCadastrarCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarCancelarActionPerformed(evt);
            }
        });
        jInternalFrameCadastrarPC.getContentPane().add(jButtonCadastrarCancelar);
        jButtonCadastrarCancelar.setBounds(320, 170, 110, 40);

        jDesktopPane1.add(jInternalFrameCadastrarPC);
        jInternalFrameCadastrarPC.setBounds(-10, -20, 22, 30);
        try {
            jInternalFrameCadastrarPC.setMaximum(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        jPanel1Principal.add(jDesktopPane1);
        jDesktopPane1.setBounds(0, 0, 870, 560);

        getContentPane().add(jPanel1Principal);
        jPanel1Principal.setBounds(0, 0, 820, 510);

        jMenu1Cadastrar.setText("Cadastrar");
        jMenu1Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1CadastrarActionPerformed(evt);
            }
        });

        jMenuItemCadastrarPC.setText("CadastrarPC");
        jMenuItemCadastrarPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastrarPCActionPerformed(evt);
            }
        });
        jMenu1Cadastrar.add(jMenuItemCadastrarPC);

        BarraPrincipal.add(jMenu1Cadastrar);

        jMenu2Visualizar.setText("Visualizar");
        jMenu2Visualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2VisualizarActionPerformed(evt);
            }
        });

        jMenuItemVisualizarPC.setText("VisualizarPC");
        jMenuItemVisualizarPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVisualizarPCActionPerformed(evt);
            }
        });
        jMenu2Visualizar.add(jMenuItemVisualizarPC);

        BarraPrincipal.add(jMenu2Visualizar);

        jMenu5Sair.setText("Sair");

        jMenuItem1Sair.setText("Encerrar");
        jMenuItem1Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1SairActionPerformed(evt);
            }
        });
        jMenu5Sair.add(jMenuItem1Sair);

        BarraPrincipal.add(jMenu5Sair);

        setJMenuBar(BarraPrincipal);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemVisualizarPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVisualizarPCActionPerformed
        jDesktopPane1.setVisible(true);
        jInternalFrameVisualizarPC.setVisible(true);

        Computador computador = new Computador();
        ComputadorDAO computadorDAO = new ComputadorDAO();

        for (Computador c : computadorDAO.getComputador()) {
            jTextArea1.setText(jTextArea1.getText() + "PC " + c.getId() + " -> " + c.getProcessador() + " " + c.getHd() + "\n");
        }
    }//GEN-LAST:event_jMenuItemVisualizarPCActionPerformed

    private void jTextField1CadastrarProcessadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1CadastrarProcessadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1CadastrarProcessadorActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jMenu1CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1CadastrarActionPerformed

    }//GEN-LAST:event_jMenu1CadastrarActionPerformed

    private void jMenuItemCadastrarPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastrarPCActionPerformed
        jDesktopPane1.setVisible(true);
        jInternalFrameCadastrarPC.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemCadastrarPCActionPerformed

    private void jButtonCadastrarCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarCancelarActionPerformed
        jDesktopPane1.setVisible(false);
        jInternalFrameCadastrarPC.setVisible(false);
    }//GEN-LAST:event_jButtonCadastrarCancelarActionPerformed

    private void jMenu2VisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2VisualizarActionPerformed

    }//GEN-LAST:event_jMenu2VisualizarActionPerformed

    private void jButtonVisualizarVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVisualizarVoltarActionPerformed
        jDesktopPane1.setVisible(false);
        jInternalFrameVisualizarPC.setVisible(false);
        jTextArea1.setText("");
    }//GEN-LAST:event_jButtonVisualizarVoltarActionPerformed

    private void jMenuItem1SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1SairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1SairActionPerformed

    private void jButton1CadastrarSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1CadastrarSalvarActionPerformed
        String processador = jTextField1CadastrarProcessador.getText();
        String hd = jTextField2CadastrarHd.getText();

        Computador computador = new Computador();
        ComputadorDAO computadorDAO = new ComputadorDAO();

        computador.setHd(hd);
        computador.setProcessador(processador);
        computadorDAO.save(computador);

        jTextField1CadastrarProcessador.setText("");
        jTextField2CadastrarHd.setText("");
        JOptionPane.showMessageDialog(rootPane, "Salvo com sucesso!");

    }//GEN-LAST:event_jButton1CadastrarSalvarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        ComputadorDAO computadorDAO = new ComputadorDAO();
        Computador c1 = new Computador();
        int i = Integer.parseInt(JOptionPane.showInputDialog("Insira o número do PC que deseja atualizar:"));
        String processador = JOptionPane.showInputDialog("Insira o processador do novo PC");
        String hd = JOptionPane.showInputDialog("Insira o HD do novo PC");
        
        c1.setProcessador(processador);
        c1.setHd(hd);
        c1.setId(i);
        computadorDAO.update(c1);
        jTextArea1.setText("");
        for (Computador c : computadorDAO.getComputador()) {
            jTextArea1.setText(jTextArea1.getText() + "PC " + c.getId() + " -> " + c.getProcessador() + " " + c.getHd() + "\n");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonVisualizarDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVisualizarDeletarActionPerformed

        Computador computador = new Computador();
        ComputadorDAO computadorDAO = new ComputadorDAO();
        int i = Integer.parseInt(JOptionPane.showInputDialog(rootPane, "Insira o número do PC que deseja deletar"));
        computadorDAO.deleteById(i);
        JOptionPane.showMessageDialog(rootPane, "Deletado com sucesso!");
        
        jTextArea1.setText("");
        for (Computador c : computadorDAO.getComputador()) {
            jTextArea1.setText(jTextArea1.getText() + "PC " + c.getId() + " -> " + c.getProcessador() + " " + c.getHd() + "\n");
        }
 
    }//GEN-LAST:event_jButtonVisualizarDeletarActionPerformed

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
            java.util.logging.Logger.getLogger(Loja_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loja_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loja_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loja_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loja_Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarraPrincipal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton1CadastrarSalvar;
    private javax.swing.JButton jButtonCadastrarCancelar;
    private javax.swing.JButton jButtonVisualizarDeletar;
    private javax.swing.JButton jButtonVisualizarVoltar;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JInternalFrame jInternalFrameCadastrarPC;
    private javax.swing.JInternalFrame jInternalFrameVisualizarPC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1Cadastrar;
    private javax.swing.JMenu jMenu2Visualizar;
    private javax.swing.JMenu jMenu5Sair;
    private javax.swing.JMenuItem jMenuItem1Sair;
    private javax.swing.JMenuItem jMenuItemCadastrarPC;
    private javax.swing.JMenuItem jMenuItemVisualizarPC;
    private javax.swing.JPanel jPanel1Principal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField1CadastrarProcessador;
    private javax.swing.JTextField jTextField2CadastrarHd;
    // End of variables declaration//GEN-END:variables
}
