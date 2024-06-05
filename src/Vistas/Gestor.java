/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

/**
 *
 * @author debor
 */
public class Gestor extends javax.swing.JFrame {

    /**
     * Creates new form Gestor
     */
    public Gestor() {
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

        escritorio = new javax.swing.JDesktopPane();
        jmenubarra = new javax.swing.JMenuBar();
        jmVenta = new javax.swing.JMenu();
        jmiVenderpasaje = new javax.swing.JMenuItem();
        jmAdministracion = new javax.swing.JMenu();
        jmiFormulariocolectivo = new javax.swing.JMenuItem();
        jmiFormularioruta = new javax.swing.JMenuItem();
        jmiFormulariohorario = new javax.swing.JMenuItem();
        jmiPasajero = new javax.swing.JMenuItem();
        jmiInformepasajes = new javax.swing.JMenuItem();
        jmConsultas = new javax.swing.JMenu();
        jmiRegistropasajeros = new javax.swing.JMenuItem();
        jmiRegistrorutas = new javax.swing.JMenuItem();
        jmiRegistrohorarios = new javax.swing.JMenuItem();
        jmSalir = new javax.swing.JMenu();
        jmiSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestor de colectivos Sol Bus");
        setForeground(java.awt.Color.blue);
        setResizable(false);

        escritorio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        escritorio.setPreferredSize(new java.awt.Dimension(1000, 670));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );

        jmVenta.setText("Venta");

        jmiVenderpasaje.setText("Vender pasaje");
        jmiVenderpasaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiVenderpasajeActionPerformed(evt);
            }
        });
        jmVenta.add(jmiVenderpasaje);

        jmenubarra.add(jmVenta);

        jmAdministracion.setText("Administracion");

        jmiFormulariocolectivo.setText("Formulario Colectivo");
        jmiFormulariocolectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFormulariocolectivoActionPerformed(evt);
            }
        });
        jmAdministracion.add(jmiFormulariocolectivo);

        jmiFormularioruta.setText("Formulario Ruta");
        jmiFormularioruta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFormulariorutaActionPerformed(evt);
            }
        });
        jmAdministracion.add(jmiFormularioruta);

        jmiFormulariohorario.setText("Formulario Horario");
        jmiFormulariohorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFormulariohorarioActionPerformed(evt);
            }
        });
        jmAdministracion.add(jmiFormulariohorario);

        jmiPasajero.setText("Formulario Pasajero");
        jmiPasajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPasajeroActionPerformed(evt);
            }
        });
        jmAdministracion.add(jmiPasajero);

        jmiInformepasajes.setText("Historial de ventas");
        jmiInformepasajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiInformepasajesActionPerformed(evt);
            }
        });
        jmAdministracion.add(jmiInformepasajes);

        jmenubarra.add(jmAdministracion);

        jmConsultas.setText("Consultas");

        jmiRegistropasajeros.setText("Registro de pasajeros");
        jmConsultas.add(jmiRegistropasajeros);

        jmiRegistrorutas.setText("Registro de rutas");
        jmConsultas.add(jmiRegistrorutas);

        jmiRegistrohorarios.setText("Registro de horarios");
        jmiRegistrohorarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRegistrohorariosActionPerformed(evt);
            }
        });
        jmConsultas.add(jmiRegistrohorarios);

        jmenubarra.add(jmConsultas);

        jmSalir.setText("Salir");

        jmiSalir.setText("¿Desea Salir?");
        jmiSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSalirActionPerformed(evt);
            }
        });
        jmSalir.add(jmiSalir);

        jmenubarra.add(jmSalir);

        setJMenuBar(jmenubarra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiVenderpasajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiVenderpasajeActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        FormularioPasaje fp = new FormularioPasaje();
        fp.setVisible(true);
        escritorio.add(fp);
        escritorio.moveToFront(fp);
    }//GEN-LAST:event_jmiVenderpasajeActionPerformed

    private void jmiSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jmiSalirActionPerformed

    private void jmiPasajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPasajeroActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        FormularioPasajero fp = new FormularioPasajero();
        fp.setVisible(true);
        escritorio.add(fp);
        escritorio.moveToFront(fp);
    }//GEN-LAST:event_jmiPasajeroActionPerformed

    private void jmiFormulariocolectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFormulariocolectivoActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        FormularioColectivo fc = new FormularioColectivo();
        fc.setVisible(true);
        escritorio.add(fc);
        escritorio.moveToFront(fc);
    }//GEN-LAST:event_jmiFormulariocolectivoActionPerformed

    private void jmiFormulariorutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFormulariorutaActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        FormularioRuta fr = new FormularioRuta();
        fr.setVisible(true);
        escritorio.add(fr);
        escritorio.moveToFront(fr);
    }//GEN-LAST:event_jmiFormulariorutaActionPerformed

    private void jmiFormulariohorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFormulariohorarioActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        FormularioHorario fh = new FormularioHorario();
        fh.setVisible(true);
        escritorio.add(fh);
        escritorio.moveToFront(fh);
    }//GEN-LAST:event_jmiFormulariohorarioActionPerformed

    private void jmiInformepasajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiInformepasajesActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        FormularioHistorialVentas fhv = new FormularioHistorialVentas();
        fhv.setVisible(true);
        escritorio.add(fhv);
        escritorio.moveToFront(fhv);
    }//GEN-LAST:event_jmiInformepasajesActionPerformed

    private void jmiRegistrohorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRegistrohorariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmiRegistrohorariosActionPerformed

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
            java.util.logging.Logger.getLogger(Gestor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gestor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gestor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gestor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gestor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jmAdministracion;
    private javax.swing.JMenu jmConsultas;
    private javax.swing.JMenu jmSalir;
    private javax.swing.JMenu jmVenta;
    private javax.swing.JMenuBar jmenubarra;
    private javax.swing.JMenuItem jmiFormulariocolectivo;
    private javax.swing.JMenuItem jmiFormulariohorario;
    private javax.swing.JMenuItem jmiFormularioruta;
    private javax.swing.JMenuItem jmiInformepasajes;
    private javax.swing.JMenuItem jmiPasajero;
    private javax.swing.JMenuItem jmiRegistrohorarios;
    private javax.swing.JMenuItem jmiRegistropasajeros;
    private javax.swing.JMenuItem jmiRegistrorutas;
    private javax.swing.JMenuItem jmiSalir;
    private javax.swing.JMenuItem jmiVenderpasaje;
    // End of variables declaration//GEN-END:variables
}
