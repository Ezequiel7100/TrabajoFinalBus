/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import AccesoADatos.HorarioData;
import AccesoADatos.RutaData;
import Entidades.Horario;
import Entidades.Ruta;
import java.sql.Time;
import java.time.Duration;
import java.time.LocalTime;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author debor
 */
public class FormularioRuta extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormularioHorario
     */
    private final String expRegHora = "^(0?[1-9]|1[0-9]|2[0-3])$";
    private final String expRegMin = "^(0?[1-9]|[0-5][0-9])$";
    private RutaData rutaData;
    private HorarioData horaData;
    List<Ruta> rutas;

    public FormularioRuta() {
        initComponents();
        rutaData = new RutaData();
        horaData = new HorarioData();
        cargarCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlTitulo = new javax.swing.JLabel();
        jlHSalida = new javax.swing.JLabel();
        jlHLlegada = new javax.swing.JLabel();
        jbGuardarHorario = new javax.swing.JButton();
        jtfDestino = new javax.swing.JTextField();
        jlDestino = new javax.swing.JLabel();
        jlOrigen = new javax.swing.JLabel();
        jtfOrigen = new javax.swing.JTextField();
        jbGuardarHorarioRuta = new javax.swing.JButton();
        jlRutaExistente = new javax.swing.JLabel();
        jcbRutasExistentes = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jlHorario = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jlRutaNueva = new javax.swing.JLabel();
        jtfHoraSalida = new javax.swing.JTextField();
        jtfMinSalida = new javax.swing.JTextField();
        jlSeparadorHoraS = new javax.swing.JLabel();
        jtfHoraLlegada = new javax.swing.JTextField();
        jtfMinLlegada = new javax.swing.JTextField();
        jlSeparadorHoraL = new javax.swing.JLabel();

        setClosable(true);

        jlTitulo.setBackground(new java.awt.Color(0, 0, 125));
        jlTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jlTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitulo.setText("Formulario ruta");

        jlHSalida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlHSalida.setText("Horario de salida");

        jlHLlegada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlHLlegada.setText("Horario de llegada");

        jbGuardarHorario.setText("Guardar solo Horario (con Ruta existente)");
        jbGuardarHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarHorarioActionPerformed(evt);
            }
        });

        jlDestino.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlDestino.setText("Destino");

        jlOrigen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlOrigen.setText("Origen");

        jbGuardarHorarioRuta.setText("Guardar Ruta y Horario");
        jbGuardarHorarioRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarHorarioRutaActionPerformed(evt);
            }
        });

        jlRutaExistente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlRutaExistente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlRutaExistente.setText("Ruta existente");

        jlHorario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlHorario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlHorario.setText("Horario");

        jlRutaNueva.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlRutaNueva.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlRutaNueva.setText("Ruta nueva");

        jlSeparadorHoraS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlSeparadorHoraS.setText(":");

        jlSeparadorHoraL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlSeparadorHoraL.setText(":");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlRutaNueva)
                .addGap(182, 182, 182))
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jlHorario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jlRutaExistente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbGuardarHorario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbGuardarHorarioRuta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbRutasExistentes, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlHSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(57, 57, 57)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlHLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtfDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jlDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jlOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtfHoraSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlSeparadorHoraS, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfMinSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtfHoraLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlSeparadorHoraL, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfMinLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jlTitulo)
                .addGap(27, 27, 27)
                .addComponent(jlHorario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlHSalida)
                    .addComponent(jlHLlegada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfHoraLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtfMinLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlSeparadorHoraL))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfHoraSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtfMinSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlSeparadorHoraS)))
                .addGap(21, 21, 21)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jlRutaNueva)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDestino)
                    .addComponent(jlOrigen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jlRutaExistente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbRutasExistentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jbGuardarHorario)
                .addGap(18, 18, 18)
                .addComponent(jbGuardarHorarioRuta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbGuardarHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarHorarioActionPerformed
        Time horaSalida, horaLlegada;
        String h, min;
        Ruta ruta;
        Horario horario;

        //validar horario salida
        if (validarHorario(jtfHoraSalida, jtfMinSalida)) {
            h = jtfHoraSalida.getText();
            min = jtfMinSalida.getText();
            horaSalida = Time.valueOf(h + ":" + min + ":00");
        } else {
            return;
        }
        //validar horario salida

        //validar horario llegada
        if (validarHorario(jtfHoraLlegada, jtfMinLlegada)) {
            h = jtfHoraLlegada.getText();
            min = jtfMinLlegada.getText();
            horaLlegada = Time.valueOf(h + ":" + min + ":00");
        } else {
            return;
        }
        //validar horario llegada

        //validar ruta
        ruta = (Ruta) jcbRutasExistentes.getSelectedItem();
        if (ruta == null) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar o registrar una ruta");
            return;
        }
        //validar ruta

        //creo objeto horario
        horario = new Horario();
        horario.setHora_salida(horaSalida);
        horario.setHora_llegada(horaLlegada);
        horario.setRuta(ruta);
        //creo objeto horario

        horaData.GuardarHorario(horario);
    }//GEN-LAST:event_jbGuardarHorarioActionPerformed

    private void jbGuardarHorarioRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarHorarioRutaActionPerformed
        Time horaSalida, horaLlegada, duracionTime;
        String h, min, origen, destino;
        Ruta rutaConId, ruta = new Ruta();
        Horario horario = new Horario();
        long hours,minutes;
        Duration duracion;

        //validar horario salida
        if (validarHorario(jtfHoraSalida, jtfMinSalida)) {
            h = jtfHoraSalida.getText();
            min = jtfMinSalida.getText();
            horaSalida = Time.valueOf(h + ":" + min + ":00");
        } else {
            return;
        }
        //validar horario salida

        //validar horario llegada
        if (validarHorario(jtfHoraLlegada, jtfMinLlegada)) {
            h = jtfHoraLlegada.getText();
            min = jtfMinLlegada.getText();
            horaLlegada = Time.valueOf(h + ":" + min + ":00");
        } else {
            return;
        }
        //validar horario llegada

        //validar ruta
        if (jtfOrigen.getText().equals("") || jtfDestino.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ingrese un origen y un destino");
            return;
        }
        origen = jtfOrigen.getText();
        destino = jtfDestino.getText();
        //validar ruta   

        LocalTime salida = horaSalida.toLocalTime();
        LocalTime llegada = horaLlegada.toLocalTime();

        // Calcular la duración
        if (llegada.equals(salida)) {
            // Caso 24hrs
            duracion = Duration.ofHours(23).plusMinutes(59);
        } else if (llegada.isBefore(salida)) {
            // Caso en que la llegada es al día siguiente
            duracion = Duration.between(salida, LocalTime.MIDNIGHT).plus(Duration.between(LocalTime.MIDNIGHT, llegada));
        } else {
            // Caso normal
            duracion = Duration.between(salida, llegada);
        }
        // Convertir la duración a horas y minutos
        hours = duracion.toHours();
        minutes = duracion.toMinutes() % 60;
        duracionTime = Time.valueOf(hours + ":" + minutes + ":00");

        //creo la ruta
        ruta.setOrigen(origen);
        ruta.setDestino(destino);
        ruta.setDuracion_estimada(duracionTime);
        rutaConId = rutaData.GuardarRuta(ruta);
        if(rutaConId.getId_ruta()==0){
            JOptionPane.showMessageDialog(this, "La ruta no pudo agregarse");
            return;
        }
        //creo la ruta
        
        //creo el horario con la ruta anterior
        horario.setRuta(rutaConId);
        horario.setHora_salida(horaSalida);
        horario.setHora_llegada(horaLlegada);
        horaData.GuardarHorario(horario);
        //creo el horario con la ruta anterior
        
        //actualizo el combo
        cargarCombo();
        //actualizo el combo
    }//GEN-LAST:event_jbGuardarHorarioRutaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jbGuardarHorario;
    private javax.swing.JButton jbGuardarHorarioRuta;
    private javax.swing.JComboBox<Ruta> jcbRutasExistentes;
    private javax.swing.JLabel jlDestino;
    private javax.swing.JLabel jlHLlegada;
    private javax.swing.JLabel jlHSalida;
    private javax.swing.JLabel jlHorario;
    private javax.swing.JLabel jlOrigen;
    private javax.swing.JLabel jlRutaExistente;
    private javax.swing.JLabel jlRutaNueva;
    private javax.swing.JLabel jlSeparadorHoraL;
    private javax.swing.JLabel jlSeparadorHoraS;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JTextField jtfDestino;
    private javax.swing.JTextField jtfHoraLlegada;
    private javax.swing.JTextField jtfHoraSalida;
    private javax.swing.JTextField jtfMinLlegada;
    private javax.swing.JTextField jtfMinSalida;
    private javax.swing.JTextField jtfOrigen;
    // End of variables declaration//GEN-END:variables

    private void cargarCombo() {
        jcbRutasExistentes.removeAllItems(); //reseteo el combo
        rutas = rutaData.listarRutas();
        for (Ruta ruta : rutas) {
            jcbRutasExistentes.addItem(ruta);
        }
    }

    private boolean validarHorario(JTextField hora, JTextField min) {
        if (hora.getText().equals("") || min.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Debe ingresar una horario.");
            return false;
        }
        if (!hora.getText().matches(expRegHora)) {
            JOptionPane.showMessageDialog(this, "Debe ingresar una hora válida (1-23).");
            return false;
        }
        if (!min.getText().matches(expRegMin)) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un minuto válido (00-59).");
            return false;
        }
        return true;
    }
}
