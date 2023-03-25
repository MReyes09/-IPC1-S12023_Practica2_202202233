
package system.view;

import system.controller.Cronometro;
import system.controller.PanelController;
import system.controller.Reporte;
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
        panelInventario = new javax.swing.JPanel();
        inventario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inicio = new javax.swing.JLabel();
        panelProduccion = new javax.swing.JPanel();
        Produccion = new javax.swing.JLabel();
        panelEmpaquetado = new javax.swing.JPanel();
        Empaquetado = new javax.swing.JLabel();
        panelSalida = new javax.swing.JPanel();
        Salida = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        salida = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbl_Cronometro = new javax.swing.JLabel();

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

        panelProduccion.setBackground(new java.awt.Color(102, 255, 102));
        panelProduccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Produccion.setText("PRODUCCIÓN: 0");

        javax.swing.GroupLayout panelProduccionLayout = new javax.swing.GroupLayout(panelProduccion);
        panelProduccion.setLayout(panelProduccionLayout);
        panelProduccionLayout.setHorizontalGroup(
            panelProduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProduccionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Produccion, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelProduccionLayout.setVerticalGroup(
            panelProduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProduccionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Produccion)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        panelEmpaquetado.setBackground(new java.awt.Color(255, 153, 255));
        panelEmpaquetado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Empaquetado.setText("EMPAQUETADO: 0");

        javax.swing.GroupLayout panelEmpaquetadoLayout = new javax.swing.GroupLayout(panelEmpaquetado);
        panelEmpaquetado.setLayout(panelEmpaquetadoLayout);
        panelEmpaquetadoLayout.setHorizontalGroup(
            panelEmpaquetadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmpaquetadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Empaquetado, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelEmpaquetadoLayout.setVerticalGroup(
            panelEmpaquetadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmpaquetadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Empaquetado)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        panelSalida.setBackground(new java.awt.Color(204, 153, 255));
        panelSalida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Salida.setText("SALIDA: 0");

        javax.swing.GroupLayout panelSalidaLayout = new javax.swing.GroupLayout(panelSalida);
        panelSalida.setLayout(panelSalidaLayout);
        panelSalidaLayout.setHorizontalGroup(
            panelSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSalidaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Salida, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelSalidaLayout.setVerticalGroup(
            panelSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSalidaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Salida)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        jLabel3.setText("FINAL");

        salida.setText("0");

        jLabel1.setText("Tiempo:");

        lbl_Cronometro.setText("00:00");

        javax.swing.GroupLayout panelSLayout = new javax.swing.GroupLayout(panelS);
        panelS.setLayout(panelSLayout);
        panelSLayout.setHorizontalGroup(
            panelSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panelSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSLayout.createSequentialGroup()
                        .addComponent(salida)
                        .addGap(14, 14, 14))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(38, 38, 38)
                .addGroup(panelSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSLayout.createSequentialGroup()
                        .addGroup(panelSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelSLayout.createSequentialGroup()
                                .addComponent(panelSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                                .addComponent(panelInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelSLayout.createSequentialGroup()
                                .addComponent(panelEmpaquetado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(panelProduccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(110, 110, 110))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSLayout.createSequentialGroup()
                                .addComponent(inicio)
                                .addGap(14, 14, 14))
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(29, 29, 29))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_Cronometro, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(257, 257, 257))
        );
        panelSLayout.setVerticalGroup(
            panelSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbl_Cronometro))
                .addGap(12, 12, 12)
                .addGroup(panelSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelProduccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelEmpaquetado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(panelSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelSLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inicio))
                            .addGroup(panelSLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(salida)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(panelInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelSLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
        Reporte reporte = new Reporte();
        reporte.crearReporte();
    }//GEN-LAST:event_btn_ReporteActionPerformed

    private void btn_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VolverActionPerformed
        cambioPanel = panelController.getMenuPrincipal();
        panelController.getPracticaMain().getVentanaBase().cambiarPaneles(cambioPanel);
    }//GEN-LAST:event_btn_VolverActionPerformed

    private void btn_SimularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SimularActionPerformed
        //INSTANCIA DEL HILO PRINCIPAL
        
        lbl_Cronometro.setText("00:00");
        Cronometro resetTime = new Cronometro();
        resetTime.resetTime();
        Cronometro cronometro = new Cronometro(lbl_Cronometro);
        SectorBaseController hiloInicio = new SectorBaseController(panelS,inicio, 
                inventario, panelInventario, Produccion ,panelProduccion,
                Empaquetado, panelEmpaquetado, Salida, panelSalida, salida
        );
        hiloInicio.start();
        cronometro.start();
    }//GEN-LAST:event_btn_SimularActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Empaquetado;
    private javax.swing.JLabel Produccion;
    private javax.swing.JLabel Salida;
    private javax.swing.JButton btn_Reporte;
    private javax.swing.JButton btn_Simular;
    private javax.swing.JButton btn_Volver;
    private javax.swing.JLabel inicio;
    private javax.swing.JLabel inventario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbl_Cronometro;
    private javax.swing.JPanel panelEmpaquetado;
    private javax.swing.JPanel panelInventario;
    private javax.swing.JPanel panelProduccion;
    private javax.swing.JPanel panelS;
    private javax.swing.JPanel panelSalida;
    private javax.swing.JLabel salida;
    // End of variables declaration//GEN-END:variables
}
