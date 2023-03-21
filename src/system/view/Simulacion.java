
package system.view;

import java.awt.Graphics;
import system.controller.PanelController;
import system.controller.SectorBaseController;

/**
 * @author matth
 */
public class Simulacion extends javax.swing.JPanel {
    PanelController panelController = new PanelController();
    javax.swing.JPanel cambioPanel;
    
    public Simulacion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Simular = new javax.swing.JButton();
        btn_Volver = new javax.swing.JButton();
        btn_Reporte = new javax.swing.JButton();

        btn_Simular.setText("INICIAR SiMULACIÓN");
        btn_Simular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SimularActionPerformed(evt);
            }
        });

        btn_Volver.setText("VOLVER");
        btn_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VolverActionPerformed(evt);
            }
        });

        btn_Reporte.setText("REPORTE");
        btn_Reporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ReporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(btn_Volver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                .addComponent(btn_Simular)
                .addGap(137, 137, 137)
                .addComponent(btn_Reporte)
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Simular)
                    .addComponent(btn_Volver)
                    .addComponent(btn_Reporte))
                .addGap(92, 92, 92))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VolverActionPerformed
        cambioPanel = panelController.getMenuPrincipal();
        panelController.getPracticaMain().getVentanaBase().cambiarPaneles(cambioPanel);
    }//GEN-LAST:event_btn_VolverActionPerformed

    private void btn_ReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ReporteActionPerformed
        cambioPanel = panelController.getReporte();
        panelController.getPracticaMain().getVentanaBase().cambiarPaneles(cambioPanel);
    }//GEN-LAST:event_btn_ReporteActionPerformed

    private void btn_SimularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SimularActionPerformed
        //INSTANCIA DEL HILO PRINCIPAL
        SectorBaseController hilo1 = new SectorBaseController();
        hilo1.start();
    }//GEN-LAST:event_btn_SimularActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Reporte;
    private javax.swing.JButton btn_Simular;
    private javax.swing.JButton btn_Volver;
    // End of variables declaration//GEN-END:variables
}
