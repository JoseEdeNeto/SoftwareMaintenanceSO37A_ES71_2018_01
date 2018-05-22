package Telas;


import Telas.TelasDeCadastro.TelaCadastroMotorista;
import Telas.TelasDeCadastro.TelaCadastroOnibus;
import Telas.TelasDeCadastro.TelaCadastroPassageiro;
import Telas.TelasDeCadastro.TelaCadastroViagem;
import Telas.TelasDeConsulta.TelaConsultaMotorista;
import Telas.TelasDeConsulta.TelaConsultaOnibus;
import Telas.TelasDeConsulta.TelaConsultaPassageiro;
import Telas.TelasDeConsulta.TelaConsultaViagem;
import Telas.TelasDeRelatorio.AcessaBD;
import Telas.TelasDeRelatorio.TelaDeRelatorios;
import java.util.HashMap;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jeff
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSair = new javax.swing.JButton();
        btnRelatorios = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuConsultas = new javax.swing.JMenu();
        jMenuItemConsultarMotorista = new javax.swing.JMenuItem();
        jMenuItemConsultarOnibus = new javax.swing.JMenuItem();
        jMenuItemConsultarPassageiro = new javax.swing.JMenuItem();
        jMenuItemConsultarViagem = new javax.swing.JMenuItem();
        jMenuCadastros = new javax.swing.JMenu();
        jMenuItemCadastrarMotorista = new javax.swing.JMenuItem();
        jMenuItemCadastrarOnibus = new javax.swing.JMenuItem();
        jMenuItemCadastrarPassageiro = new javax.swing.JMenuItem();
        jMenuItemCadastrarViajem = new javax.swing.JMenuItem();
        jMenuRelatorios = new javax.swing.JMenu();
        jMenuItemRelMot = new javax.swing.JMenuItem();
        jMenuItemRelOni = new javax.swing.JMenuItem();
        jMenuItemRelPas = new javax.swing.JMenuItem();
        jMenuItemRelVia = new javax.swing.JMenuItem();
        jMenuItemRelViaEsp = new javax.swing.JMenuItem();
        jMenuSobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnRelatorios.setText("Relatórios");
        btnRelatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatoriosActionPerformed(evt);
            }
        });

        jMenuConsultas.setText("Consultas");

        jMenuItemConsultarMotorista.setText("Consultar Motorista");
        jMenuItemConsultarMotorista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsultarMotoristaActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuItemConsultarMotorista);

        jMenuItemConsultarOnibus.setText("Consultar Onibus");
        jMenuItemConsultarOnibus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsultarOnibusActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuItemConsultarOnibus);

        jMenuItemConsultarPassageiro.setText("Consultar Passageiro");
        jMenuItemConsultarPassageiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsultarPassageiroActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuItemConsultarPassageiro);

        jMenuItemConsultarViagem.setText("Consultar Viagem");
        jMenuItemConsultarViagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsultarViagemActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuItemConsultarViagem);

        jMenuBar1.add(jMenuConsultas);

        jMenuCadastros.setText("Cadastros");

        jMenuItemCadastrarMotorista.setText("Cadastrar Motorista");
        jMenuItemCadastrarMotorista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastrarMotoristaActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemCadastrarMotorista);

        jMenuItemCadastrarOnibus.setText("Cadastrar Onibus");
        jMenuItemCadastrarOnibus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastrarOnibusActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemCadastrarOnibus);

        jMenuItemCadastrarPassageiro.setText("Cadastrar Passageiro");
        jMenuItemCadastrarPassageiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastrarPassageiroActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemCadastrarPassageiro);

        jMenuItemCadastrarViajem.setText("Cadastrar Viagem");
        jMenuItemCadastrarViajem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastrarViajemActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemCadastrarViajem);

        jMenuBar1.add(jMenuCadastros);

        jMenuRelatorios.setText("Relatórios");

        jMenuItemRelMot.setText("Relatório de Motoristas");
        jMenuItemRelMot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRelMotActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(jMenuItemRelMot);

        jMenuItemRelOni.setText("Relatório de Onibus");
        jMenuItemRelOni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRelOniActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(jMenuItemRelOni);

        jMenuItemRelPas.setText("Relatório de Passageiros");
        jMenuItemRelPas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRelPasActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(jMenuItemRelPas);

        jMenuItemRelVia.setText("Relatório de Viagens");
        jMenuItemRelVia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRelViaActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(jMenuItemRelVia);

        jMenuItemRelViaEsp.setText("Relatório de Viagem Específica");
        jMenuItemRelViaEsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRelViaEspActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(jMenuItemRelViaEsp);

        jMenuBar1.add(jMenuRelatorios);

        jMenuSobre.setText("Sobre");
        jMenuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSobreActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenuSobre);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(btnRelatorios)
                        .addGap(0, 41, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSair)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(176, Short.MAX_VALUE)
                .addComponent(btnRelatorios)
                .addGap(46, 46, 46)
                .addComponent(btnSair)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatoriosActionPerformed
        // TODO add your handling code here:
        TelaPrincipal tela = new TelaPrincipal();
        TelaDeRelatorios t = new TelaDeRelatorios();
        t.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRelatoriosActionPerformed

    private void jMenuItemConsultarMotoristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsultarMotoristaActionPerformed
        // TODO add your handling code here:
        TelaConsultaMotorista tela = new TelaConsultaMotorista();
        tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItemConsultarMotoristaActionPerformed

    private void jMenuItemConsultarPassageiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsultarPassageiroActionPerformed
        // TODO add your handling code here:
        TelaConsultaPassageiro tela = new TelaConsultaPassageiro();
        tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItemConsultarPassageiroActionPerformed

    private void jMenuItemConsultarOnibusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsultarOnibusActionPerformed
        // TODO add your handling code here:
        TelaConsultaOnibus tela = new TelaConsultaOnibus();
        tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItemConsultarOnibusActionPerformed

    private void jMenuItemConsultarViagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsultarViagemActionPerformed
        // TODO add your handling code here:
        TelaConsultaViagem tela = new TelaConsultaViagem();
        tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItemConsultarViagemActionPerformed

    private void jMenuItemCadastrarViajemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastrarViajemActionPerformed
        // TODO add your handling code here:
        TelaCadastroViagem tela = new TelaCadastroViagem();
        tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItemCadastrarViajemActionPerformed

    private void jMenuItemCadastrarPassageiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastrarPassageiroActionPerformed
        // TODO add your handling code here:
        TelaCadastroPassageiro tela = new TelaCadastroPassageiro();
        tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItemCadastrarPassageiroActionPerformed

    private void jMenuItemCadastrarMotoristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastrarMotoristaActionPerformed
        // TODO add your handling code here:
        TelaCadastroMotorista tela = new TelaCadastroMotorista();
        tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItemCadastrarMotoristaActionPerformed

    private void jMenuItemCadastrarOnibusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastrarOnibusActionPerformed
        // TODO add your handling code here:
        TelaCadastroOnibus tela = new TelaCadastroOnibus();
        tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItemCadastrarOnibusActionPerformed

    private void jMenuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSobreActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuSobreActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:,
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void jMenuItemRelMotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRelMotActionPerformed
        // TODO add your handling code here:
        HashMap map = new HashMap(); 
        JasperPrint impressao = null; 
        try { 
            impressao = JasperFillManager.fillReport(System.getProperty("user.dir")+"/src/relatorio/RelatorioDeMotoristas.jasper", map, AcessaBD.connection);
        } catch (JRException ex) {
            System.err.println("Erro: "+ex);
        }
        JasperViewer view = new JasperViewer(impressao, false);
        view.setVisible(true);
    }//GEN-LAST:event_jMenuItemRelMotActionPerformed

    private void jMenuItemRelPasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRelPasActionPerformed
        // TODO add your handling code here:
        HashMap map = new HashMap(); 
        JasperPrint impressao = null; 
        try { 
            impressao = JasperFillManager.fillReport(System.getProperty("user.dir")+"/src/relatorio/RelatorioDePassageiros.jasper", map, AcessaBD.connection);
        } catch (JRException ex) {
            System.err.println("Erro: "+ex);
        }
        JasperViewer view = new JasperViewer(impressao, false);
        view.setVisible(true);
    }//GEN-LAST:event_jMenuItemRelPasActionPerformed

    private void jMenuItemRelOniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRelOniActionPerformed
        // TODO add your handling code here:
        HashMap map = new HashMap(); 
        JasperPrint impressao = null; 
        try { 
            impressao = JasperFillManager.fillReport(System.getProperty("user.dir")+"/src/relatorio/RelatorioDeOnibus.jasper", map, AcessaBD.connection);
        } catch (JRException ex) {
            System.err.println("Erro: "+ex);
        }
        JasperViewer view = new JasperViewer(impressao, false);
        view.setVisible(true);
    }//GEN-LAST:event_jMenuItemRelOniActionPerformed

    private void jMenuItemRelViaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRelViaActionPerformed
        // TODO add your handling code here:
        HashMap map = new HashMap(); 
        JasperPrint impressao = null; 
        try { 
            impressao = JasperFillManager.fillReport(System.getProperty("user.dir")+"/src/relatorio/RelatorioDeViagens.jasper", map, AcessaBD.connection);
        } catch (JRException ex) {
            System.err.println("Erro: "+ex);
        }
        JasperViewer view = new JasperViewer(impressao, false);
        view.setVisible(true);
    }//GEN-LAST:event_jMenuItemRelViaActionPerformed

    private void jMenuItemRelViaEspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRelViaEspActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemRelViaEspActionPerformed

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
    private javax.swing.JButton btnRelatorios;
    private javax.swing.JButton btnSair;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastros;
    private javax.swing.JMenu jMenuConsultas;
    private javax.swing.JMenuItem jMenuItemCadastrarMotorista;
    private javax.swing.JMenuItem jMenuItemCadastrarOnibus;
    private javax.swing.JMenuItem jMenuItemCadastrarPassageiro;
    private javax.swing.JMenuItem jMenuItemCadastrarViajem;
    private javax.swing.JMenuItem jMenuItemConsultarMotorista;
    private javax.swing.JMenuItem jMenuItemConsultarOnibus;
    private javax.swing.JMenuItem jMenuItemConsultarPassageiro;
    private javax.swing.JMenuItem jMenuItemConsultarViagem;
    private javax.swing.JMenuItem jMenuItemRelMot;
    private javax.swing.JMenuItem jMenuItemRelOni;
    private javax.swing.JMenuItem jMenuItemRelPas;
    private javax.swing.JMenuItem jMenuItemRelVia;
    private javax.swing.JMenuItem jMenuItemRelViaEsp;
    private javax.swing.JMenu jMenuRelatorios;
    private javax.swing.JMenu jMenuSobre;
    // End of variables declaration//GEN-END:variables
}
