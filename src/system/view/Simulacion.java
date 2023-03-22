
package system.view;

import system.controller.HiloInventario;
import system.controller.PanelController;
import system.controller.SectorBaseController;

/**
 * @author matth
 */
public class Simulacion extends javax.swing.JPanel {
    PanelController panelController = new PanelController();
    javax.swing.JPanel cambioPanel;
    int tiempo = 0;
    long tiempoInicio = System.currentTimeMillis();
    
    public Simulacion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Simular = new javax.swing.JButton();
        btn_Volver = new javax.swing.JButton();
        btn_Reporte = new javax.swing.JButton();
        panelS = new javax.swing.JPanel();
        label1 = new javax.swing.JLabel();
        panelInventario = new javax.swing.JPanel();
        inventario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inicio = new javax.swing.JLabel();
        panelInventario1 = new javax.swing.JPanel();
        inventario1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));

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

        panelS.setBackground(new java.awt.Color(204, 255, 204));

        label1.setText("Tiempo:");

        panelInventario.setBackground(new java.awt.Color(153, 255, 255));
        panelInventario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        inventario.setText("INVENTARIO:  0");

        javax.swing.GroupLayout panelInventarioLayout = new javax.swing.GroupLayout(panelInventario);
        panelInventario.setLayout(panelInventarioLayout);
        panelInventarioLayout.setHorizontalGroup(
            panelInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInventarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inventario, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelInventarioLayout.setVerticalGroup(
            panelInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInventarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inventario)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        jLabel2.setText("Inicio");

        inicio.setText("30");

        panelInventario1.setBackground(new java.awt.Color(102, 255, 102));
        panelInventario1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        inventario1.setText("PRODUCCIÓN: 0");

        javax.swing.GroupLayout panelInventario1Layout = new javax.swing.GroupLayout(panelInventario1);
        panelInventario1.setLayout(panelInventario1Layout);
        panelInventario1Layout.setHorizontalGroup(
            panelInventario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInventario1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inventario1, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelInventario1Layout.setVerticalGroup(
            panelInventario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInventario1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inventario1)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelSLayout = new javax.swing.GroupLayout(panelS);
        panelS.setLayout(panelSLayout);
        panelSLayout.setHorizontalGroup(
            panelSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSLayout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(242, 242, 242))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSLayout.createSequentialGroup()
                        .addGroup(panelSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(panelInventario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(110, 110, 110))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSLayout.createSequentialGroup()
                        .addGroup(panelSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSLayout.createSequentialGroup()
                                .addComponent(inicio)
                                .addGap(14, 14, 14))
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(29, 29, 29))))
        );
        panelSLayout.setVerticalGroup(
            panelSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSLayout.createSequentialGroup()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelInventario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(panelInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(btn_Volver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addComponent(btn_Simular)
                .addGap(137, 137, 137)
                .addComponent(btn_Reporte)
                .addGap(60, 60, 60))
            .addComponent(panelS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Simular)
                    .addComponent(btn_Volver)
                    .addComponent(btn_Reporte))
                .addGap(18, 18, 18)
                .addComponent(panelS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ReporteActionPerformed
        cambioPanel = panelController.getReporte();
        panelController.getPracticaMain().getVentanaBase().cambiarPaneles(cambioPanel);
    }//GEN-LAST:event_btn_ReporteActionPerformed

    private void btn_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VolverActionPerformed
        cambioPanel = panelController.getMenuPrincipal();
        panelController.getPracticaMain().getVentanaBase().cambiarPaneles(cambioPanel);
    }//GEN-LAST:event_btn_VolverActionPerformed

    private void btn_SimularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SimularActionPerformed
        //INSTANCIA DEL HILO PRINCIPAL
        SectorBaseController hiloInicio = new SectorBaseController(panelS,inicio, 
                inventario, panelInventario
        );
//        HiloInventario hiloInventario = new HiloInventario(inventario);
        hiloInicio.start();
//        hiloInventario.start();
    }//GEN-LAST:event_btn_SimularActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Reporte;
    private javax.swing.JButton btn_Simular;
    private javax.swing.JButton btn_Volver;
    private javax.swing.JLabel inicio;
    private javax.swing.JLabel inventario;
    private javax.swing.JLabel inventario1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel label1;
    private javax.swing.JPanel panelInventario;
    private javax.swing.JPanel panelInventario1;
    private javax.swing.JPanel panelS;
    // End of variables declaration//GEN-END:variables
}
