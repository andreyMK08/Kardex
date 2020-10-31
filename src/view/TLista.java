/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author andre_000
 */
public class TLista extends javax.swing.JFrame {

    /** Creates new form TLista */
    public TLista(DefaultTableModel tm) {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Sistema de Controle de Estoque");
        tbTabela.setModel(tm);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnTitulo = new javax.swing.JPanel();
        lbLogo = new javax.swing.JLabel();
        lbTitulo = new javax.swing.JLabel();
        pnCentral = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbTabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnTitulo.setBackground(new java.awt.Color(17, 28, 33));
        pnTitulo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnTitulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbLogo.setBackground(new java.awt.Color(34, 20, 43));
        lbLogo.setForeground(new java.awt.Color(32, 19, 41));
        lbLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo.png"))); // NOI18N
        pnTitulo.add(lbLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, -1));

        lbTitulo.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(178, 251, 1));
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("LISTAGEM");
        pnTitulo.add(lbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 0, 750, 60));

        getContentPane().add(pnTitulo, java.awt.BorderLayout.NORTH);

        pnCentral.setBackground(new java.awt.Color(153, 153, 153));

        tbTabela.setBackground(new java.awt.Color(153, 153, 153));
        tbTabela.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tbTabela);
        if (tbTabela.getColumnModel().getColumnCount() > 0) {
            tbTabela.getColumnModel().getColumn(0).setHeaderValue("Title 1");
            tbTabela.getColumnModel().getColumn(1).setHeaderValue("Title 2");
            tbTabela.getColumnModel().getColumn(2).setHeaderValue("Title 3");
            tbTabela.getColumnModel().getColumn(3).setHeaderValue("Title 4");
        }

        javax.swing.GroupLayout pnCentralLayout = new javax.swing.GroupLayout(pnCentral);
        pnCentral.setLayout(pnCentralLayout);
        pnCentralLayout.setHorizontalGroup(
            pnCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 754, Short.MAX_VALUE)
        );
        pnCentralLayout.setVerticalGroup(
            pnCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCentralLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(pnCentral, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JPanel pnCentral;
    private javax.swing.JPanel pnTitulo;
    private javax.swing.JTable tbTabela;
    // End of variables declaration//GEN-END:variables

}
