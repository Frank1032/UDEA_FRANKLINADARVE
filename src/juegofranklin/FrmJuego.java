/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package juegofranklin;

import javax.swing.JOptionPane;

/**
 *
 * @author FRANK
 */
public class FrmJuego extends javax.swing.JFrame {

    /**
     * Creates new form FrmJuego
     */
    
    private final Jugador Franklin = new Jugador();
    private final Jugador Marce = new Jugador();
    private final Jugador Vale = new Jugador();
    private boolean Repartido = false;
    private boolean Verificado = false;
    
    
    public FrmJuego() {
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

        bntRepartir = new javax.swing.JButton();
        btnVerificar = new javax.swing.JButton();
        btnOrdenar = new javax.swing.JButton();
        btnPuntaje = new javax.swing.JButton();
        ptJugadores = new javax.swing.JTabbedPane();
        pnlJugador1 = new javax.swing.JPanel();
        pnlJugador2 = new javax.swing.JPanel();
        pnlJugador3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bntRepartir.setBackground(new java.awt.Color(0, 255, 102));
        bntRepartir.setText("REPARTIR");
        bntRepartir.setAlignmentY(1.0F);
        bntRepartir.setBorder(new javax.swing.border.MatteBorder(null));
        bntRepartir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntRepartirActionPerformed(evt);
            }
        });

        btnVerificar.setBackground(new java.awt.Color(51, 51, 255));
        btnVerificar.setText("VERIFICAR");
        btnVerificar.setBorder(new javax.swing.border.MatteBorder(null));
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });

        btnOrdenar.setBackground(new java.awt.Color(255, 0, 255));
        btnOrdenar.setText("ORDENAR");
        btnOrdenar.setBorder(new javax.swing.border.MatteBorder(null));
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });

        btnPuntaje.setBackground(new java.awt.Color(255, 255, 51));
        btnPuntaje.setText("PUNTAJE");
        btnPuntaje.setBorder(new javax.swing.border.MatteBorder(null));
        btnPuntaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntajeActionPerformed(evt);
            }
        });

        ptJugadores.setBackground(new java.awt.Color(255, 102, 102));

        pnlJugador1.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout pnlJugador1Layout = new javax.swing.GroupLayout(pnlJugador1);
        pnlJugador1.setLayout(pnlJugador1Layout);
        pnlJugador1Layout.setHorizontalGroup(
            pnlJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 883, Short.MAX_VALUE)
        );
        pnlJugador1Layout.setVerticalGroup(
            pnlJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 275, Short.MAX_VALUE)
        );

        ptJugadores.addTab("FRANKLIN", pnlJugador1);

        pnlJugador2.setBackground(new java.awt.Color(255, 204, 255));

        javax.swing.GroupLayout pnlJugador2Layout = new javax.swing.GroupLayout(pnlJugador2);
        pnlJugador2.setLayout(pnlJugador2Layout);
        pnlJugador2Layout.setHorizontalGroup(
            pnlJugador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 883, Short.MAX_VALUE)
        );
        pnlJugador2Layout.setVerticalGroup(
            pnlJugador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 275, Short.MAX_VALUE)
        );

        ptJugadores.addTab("VALERIA", pnlJugador2);

        pnlJugador3.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout pnlJugador3Layout = new javax.swing.GroupLayout(pnlJugador3);
        pnlJugador3.setLayout(pnlJugador3Layout);
        pnlJugador3Layout.setHorizontalGroup(
            pnlJugador3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 883, Short.MAX_VALUE)
        );
        pnlJugador3Layout.setVerticalGroup(
            pnlJugador3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 275, Short.MAX_VALUE)
        );

        ptJugadores.addTab("MARCE", pnlJugador3);

        jLabel1.setBackground(new java.awt.Color(51, 255, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("JUEGO DE CARTAS");
        jLabel1.setIconTextGap(9);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bntRepartir, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(btnOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(btnVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(btnPuntaje))
                            .addComponent(ptJugadores)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(343, 343, 343)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ptJugadores, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(bntRepartir, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPuntaje, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntRepartirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntRepartirActionPerformed

        Franklin.repartir();
        Vale.repartir();
        Marce.repartir();

        Franklin.mostrar(pnlJugador1);
        Vale.mostrar(pnlJugador2);
        Vale.mostrar(pnlJugador3);

        //DESPUES DE REPARTIR SE HACE TRUE
        Repartido = true;
  
        
        
        
    }//GEN-LAST:event_bntRepartirActionPerformed

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        if (Repartido) {

            int pestaña = ptJugadores.getSelectedIndex();
            String mensaje = "";
            switch (pestaña) {
                case 0:
                    mensaje = Franklin.getGrupos();
                    break;
                case 1:
                    mensaje = Vale.getGrupos();
                    break;
                case 2:
                    mensaje = Marce.getGrupos();
                    break;
            }
              Verificado = true;
            JOptionPane.showMessageDialog(null, mensaje);
        } else {
                JOptionPane.showMessageDialog(null, "PRIMERO DEBES REPARTIR.");
        }

    }//GEN-LAST:event_btnVerificarActionPerformed

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed

       // Comprueba si btnRepartidoActionPerformed se ha realizado antes de permitir que bntPuntajeActionPerformed se ejecute
        if (Repartido) {
            Franklin.ordenarPorBurbuja();
            Vale.ordenarPorBurbuja();
            Marce.ordenarPorBurbuja();

            Franklin.mostrar(pnlJugador1);
            Vale.mostrar(pnlJugador2);
            Marce.mostrar(pnlJugador3);
        } else {
            JOptionPane.showMessageDialog(null, "PRIMERO DE REPARTIR ANTES DE.");
        }

  
    }//GEN-LAST:event_btnOrdenarActionPerformed

    private void btnPuntajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntajeActionPerformed
 if (Repartido && Verificado) {
            int pestaña = ptJugadores.getSelectedIndex();
            String mensaje = "";
            switch (pestaña) {
                case 0:
                    mensaje = Franklin.getPuntaje();
                    break;
                case 1:
                    mensaje = Vale.getPuntaje();
                    break;
                 case 3:
                    mensaje = Marce.getPuntaje();
                    break;
            }
            JOptionPane.showMessageDialog(null, mensaje);
    }//GEN-LAST:event_btnPuntajeActionPerformed
                                           
    else if (!Repartido) {
            JOptionPane.showMessageDialog(null, "PRIMERO DEBES REPARTIR.");
        } else {

            JOptionPane.showMessageDialog(null, "PRIMERO DEBES REPARTIR.");
        }}

    
 
 
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
            java.util.logging.Logger.getLogger(FrmJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmJuego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntRepartir;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JButton btnPuntaje;
    private javax.swing.JButton btnVerificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel pnlJugador1;
    private javax.swing.JPanel pnlJugador2;
    private javax.swing.JPanel pnlJugador3;
    private javax.swing.JTabbedPane ptJugadores;
    // End of variables declaration//GEN-END:variables
}