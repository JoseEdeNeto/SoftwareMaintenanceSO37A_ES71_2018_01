/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas.TelasDeCadastro;

import Classes.Onibus;
import Classes.Passageiro;
import Classes.Viagem;
import ClassesDAO.PassageiroDAO;
import ClassesDAO.ViagemDAO;
import Controller.HibernateUtil;
import Telas.TelaPrincipal;
import java.awt.Color;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Session;

public class TelaGerenciaPassageirosViagem extends javax.swing.JFrame {
    
    Session session = HibernateUtil.getSession();
    PassageiroDAO dao = new PassageiroDAO(session);
    Viagem via = new Viagem();
    List <Passageiro> pas;
    
    public TelaGerenciaPassageirosViagem() {
        initComponents();
        popularJcbViagem();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.getContentPane().setBackground(Color.white);
        this.setTitle("Gerenciamento de Passageiros e Viagens");
    }
    private void popularJcbViagem(){
        ViagemDAO viaDAO = new ViagemDAO(HibernateUtil.getSession());

        if (viaDAO.listaTudo() != null){
            for (Viagem via : viaDAO.listaTudo()){
                jcbListaViagem.addItem(via.toString());
            }
        }
    }
    private void popularJcbListaPassageiro(List<Passageiro> listaPassageiro) {
        for (Passageiro p : listaPassageiro) {
            jcbListaPassageiro.addItem(p.toString());
        }
    }
    private void organizaTabela() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("CPF");
        modelo.addColumn("Nome");
        modelo.addColumn("Endereço");
        modelo.addColumn("Telefone");
        pas = via.getPassageiros();
        Object rowData[] = new Object[5];
        int i = 0;
        for (Passageiro p : pas) {
            rowData[0] = pas.get(i).getCPF();
            rowData[1] = pas.get(i).getNome();
            rowData[2] = pas.get(i).getEndereco();
            rowData[3] = pas.get(i).getTelefone();
            modelo.addRow(rowData);
            i++;
        }
        jtbPassageiros.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblViagem = new javax.swing.JLabel();
        jcbListaViagem = new javax.swing.JComboBox<>();
        lblPassageiro = new javax.swing.JLabel();
        jtfPassageiro = new javax.swing.JTextField();
        lblLista = new javax.swing.JLabel();
        jbtBuscar = new javax.swing.JButton();
        jcbListaPassageiro = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbPassageiros = new javax.swing.JTable();
        jbtVoltar = new javax.swing.JButton();
        btSelecionar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuOpcoes = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblViagem.setText("Viagem:");

        jcbListaViagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbListaViagemActionPerformed(evt);
            }
        });

        lblPassageiro.setText("Passageiro:");

        lblLista.setText("Lista:");

        jbtBuscar.setText("Buscar");
        jbtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtBuscarActionPerformed(evt);
            }
        });

        jButton2.setText("Adicionar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Excluir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jtbPassageiros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtbPassageiros);

        jbtVoltar.setText("Voltar");
        jbtVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtVoltarActionPerformed(evt);
            }
        });

        btSelecionar.setText("Selecionar");
        btSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSelecionarActionPerformed(evt);
            }
        });

        jMenuOpcoes.setText("Opções");
        jMenuOpcoes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuOpcoes.add(jMenuItemSair);

        jMenuBar1.add(jMenuOpcoes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 682, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblLista)
                        .addGap(18, 18, 18)
                        .addComponent(jcbListaPassageiro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2))
                            .addComponent(jbtVoltar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblViagem)
                                .addGap(18, 18, 18)
                                .addComponent(jcbListaViagem, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblPassageiro)
                                .addGap(18, 18, 18)
                                .addComponent(jtfPassageiro)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btSelecionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblViagem)
                    .addComponent(jcbListaViagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSelecionar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassageiro)
                    .addComponent(jtfPassageiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLista)
                    .addComponent(jcbListaPassageiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtVoltar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtBuscarActionPerformed
        String nomePassageiro = "SELECT * FROM passageiro WHERE pas_nome LIKE '%"+jtfPassageiro.getText()+"%'";
        List<Passageiro> listaPassageiro = dao.listapassageirosSQL(nomePassageiro);
        popularJcbListaPassageiro(listaPassageiro);
    }//GEN-LAST:event_jbtBuscarActionPerformed

    private void jcbListaViagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbListaViagemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbListaViagemActionPerformed

    private void jbtVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtVoltarActionPerformed
       TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtVoltarActionPerformed

    private void btSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSelecionarActionPerformed
        String idViagem = jcbListaViagem.getSelectedItem().toString().split(";")[0];
        System.out.println(idViagem);
        if(idViagem != null){
            ViagemDAO viaDAO = new ViagemDAO(session);
            via = viaDAO.procura(Long.parseLong(idViagem));
            organizaTabela();
        }
    }//GEN-LAST:event_btSelecionarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String idPas = jcbListaPassageiro.getSelectedItem().toString().split(";")[0];
        PassageiroDAO pasDAO = new PassageiroDAO(session);
        Passageiro p = pasDAO.procura(Long.parseLong(idPas));
        via.getPassageiros().add(p);
        ViagemDAO viaDAO = new ViagemDAO(session);
        viaDAO.atualiza(via);
        organizaTabela();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String idPas = jcbListaPassageiro.getSelectedItem().toString().split(";")[0];
        PassageiroDAO pasDAO = new PassageiroDAO(session);
        Passageiro p = pasDAO.procura(Long.parseLong(idPas));
        via.getPassageiros().remove(p);
        ViagemDAO viaDAO = new ViagemDAO(session);
        viaDAO.atualiza(via);
        organizaTabela();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSairActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSelecionar;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenu jMenuOpcoes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtBuscar;
    private javax.swing.JButton jbtVoltar;
    private javax.swing.JComboBox<String> jcbListaPassageiro;
    private javax.swing.JComboBox<String> jcbListaViagem;
    private javax.swing.JTable jtbPassageiros;
    private javax.swing.JTextField jtfPassageiro;
    private javax.swing.JLabel lblLista;
    private javax.swing.JLabel lblPassageiro;
    private javax.swing.JLabel lblViagem;
    // End of variables declaration//GEN-END:variables
}
