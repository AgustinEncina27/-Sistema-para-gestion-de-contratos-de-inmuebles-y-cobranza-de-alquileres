/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistaLocatario;

import Clases.Locatario;
import Controlador.Controlador;
import Errores.NotificacionError;
import VistaPrincipal.VistaPrincipal;
import VistaRelacionDeDependencia.VistaRelacionDeDependencia;
import VistaTrabajoIndependiente.VistaTrabajoIndependiente;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Agustin
 */
public class CrearLocatario extends javax.swing.JFrame {
    Controlador control;
    private Locatario loca;
    /**
     * Creates new form CrearLocatario
     */
    public CrearLocatario(Controlador control2) {
        control=control2;
        loca= new Locatario();
        initComponents();
        this.setLocationRelativeTo(null);
        jButton4.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        comboBox = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new java.awt.GridLayout(10, 2));

        jLabel1.setText("Nombre de Usuario:");
        jPanel2.add(jLabel1);
        jPanel2.add(jTextField1);

        jLabel2.setText("Contraseña:");
        jPanel2.add(jLabel2);
        jPanel2.add(jTextField2);

        jLabel3.setText("Nombre:");
        jPanel2.add(jLabel3);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField3);

        jLabel4.setText("Apellido");
        jPanel2.add(jLabel4);
        jPanel2.add(jTextField4);

        jLabel5.setText("DNI:");
        jPanel2.add(jLabel5);
        jPanel2.add(jTextField5);

        jLabel6.setText("Estado Civil:");
        jPanel2.add(jLabel6);

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField6);

        jLabel7.setText("Domicilio:");
        jPanel2.add(jLabel7);

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField7);

        jLabel8.setText("Teléfono");
        jPanel2.add(jLabel8);
        jPanel2.add(jTextField8);

        jLabel9.setText("Correo Electronico:");
        jPanel2.add(jLabel9);
        jPanel2.add(jTextField9);

        jLabel10.setText("Actividad a la que se dedica");
        jPanel2.add(jLabel10);
        jPanel2.add(jTextField10);

        jButton1.setText("Trabaja en relación de dependencia");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Trabajo independiente");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel11.setText("Es Estudiante:");

        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Falso", "Verdadero" }));
        comboBox.setToolTipText(""); // NOI18N
        comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxActionPerformed(evt);
            }
        });

        jButton3.setText("VOLVER");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("AGREGAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPanelLayout = new javax.swing.GroupLayout(JPanel);
        JPanel.setLayout(JPanelLayout);
        JPanelLayout.setHorizontalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(160, 160, 160)
                        .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelLayout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        JPanelLayout.setVerticalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //BUSCA TODOS LOS DATOS DEL LOCATARIO Y LOS ENVIA A LA INTERFAZ DE VISTATRABAJOINDEPENDIENTE
        if(!jTextField1.getText().equals("")&&!jTextField2.getText().equals("")&&!jTextField3.getText().equals("")&&!jTextField4.getText().equals("")&&!jTextField5.getText().equals("")&&!jTextField6.getText().equals("")&&!jTextField7.getText().equals("")&&!jTextField8.getText().equals("")&&!jTextField9.getText().equals("")&&!jTextField10.getText().equals("")) {
            loca.setNombre(jTextField3.getText());
            loca.setApellido(jTextField4.getText());
            long dnum = Long.parseLong(jTextField5.getText());
            loca.setDni(dnum);
            loca.setEstadoCivil(jTextField6.getText());
            loca.setDomicilio(jTextField7.getText());
            loca.setTelefono(jTextField8.getText());
            loca.setCorreoElectronico(jTextField9.getText());
            loca.setActividadALaQueSeDedica(jTextField10.getText());
            if("Falso".equals(comboBox.getSelectedItem())) {
            loca.setEstudiante(false);
            }else {
            loca.setEstudiante(true);
            }
            loca.setUsuario(jTextField1.getText());
            loca.setContrasenia(jTextField2.getText());

            VistaTrabajoIndependiente v2 = null;                          
            try {
                v2 = new VistaTrabajoIndependiente(control,loca);
            } catch (NotificacionError ex) {
                Logger.getLogger(CrearLocatario.class.getName()).log(Level.SEVERE, null, ex);
            }
            v2.setVisible(true);
            this.setVisible(false);
        }else {
            JOptionPane.showMessageDialog(null,"Por favor Ingrese todos los campos");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxActionPerformed
        //SI ES FALSO MUESTRA LOS BOTONES PARA AGREGAR LOS COMPROBANTES, DE LO CONTRARIO LOS SACA
        if("Falso".equals(comboBox.getSelectedItem())) {
					jButton2.setVisible(true);
					jButton1.setVisible(true);
					jButton4.setVisible(false);
				}else {
					jButton2.setVisible(false);
					jButton1.setVisible(false);
					jButton4.setVisible(true);
				}
    }//GEN-LAST:event_comboBoxActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //VUELVE A LA INTERFAZ PRINCIPAL
        VistaPrincipal l= new VistaPrincipal(control);
        l.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //BUSCA TODOS LOS DATOS DEL LOCATARIO Y LOS ENVIA A LA INTERFAZ DE VISTARELACIONDEDEPENDENCIA
        if(!jTextField1.getText().equals("")&&!jTextField2.getText().equals("")&&!jTextField3.getText().equals("")&&!jTextField4.getText().equals("")&&!jTextField5.getText().equals("")&&!jTextField6.getText().equals("")&&!jTextField7.getText().equals("")&&!jTextField8.getText().equals("")&&!jTextField9.getText().equals("")&&!jTextField10.getText().equals("")) {
            loca.setNombre(jTextField3.getText());
            loca.setApellido(jTextField4.getText());
            long dnum = Long.parseLong(jTextField5.getText());
            loca.setDni(dnum);
            loca.setEstadoCivil(jTextField6.getText());
            loca.setDomicilio(jTextField7.getText());
            loca.setTelefono(jTextField8.getText());
            loca.setCorreoElectronico(jTextField9.getText());
            loca.setActividadALaQueSeDedica(jTextField10.getText());
            if("Falso".equals(comboBox.getSelectedItem())) {
                loca.setEstudiante(false);
            }else {
		loca.setEstudiante(true);
            }
            loca.setUsuario(jTextField1.getText());
            loca.setContrasenia(jTextField2.getText());
            VistaRelacionDeDependencia c= new VistaRelacionDeDependencia(control,loca);
            c.setVisible(true);
            this.setVisible(false);
        }else {
            JOptionPane.showMessageDialog(null,"Por favor,Ingrese todos los campos");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //AGREGA AL LOCATARIO
        if(!jTextField1.getText().equals("")&&!jTextField2.getText().equals("")&&!jTextField3.getText().equals("")&&!jTextField4.getText().equals("")&&!jTextField5.getText().equals("")&&!jTextField6.getText().equals("")&&!jTextField7.getText().equals("")&&!jTextField8.getText().equals("")&&!jTextField9.getText().equals("")&&!jTextField10.getText().equals("")) {
            loca.setNombre(jTextField3.getText());
            loca.setApellido(jTextField4.getText());
            try{
            long dnum = Long.parseLong(jTextField5.getText());
            loca.setDni(dnum);
            loca.setEstadoCivil(jTextField6.getText());
            loca.setDomicilio(jTextField7.getText());
            loca.setTelefono(jTextField8.getText());
            loca.setCorreoElectronico(jTextField9.getText());
            loca.setActividadALaQueSeDedica(jTextField10.getText());
            if("Falso".equals(comboBox.getSelectedItem())) {
                loca.setEstudiante(false);
            }else {
		loca.setEstudiante(true);
            }
            loca.setUsuario(jTextField1.getText());
            loca.setContrasenia(jTextField2.getText());
            control.InsertarLocatoria(loca);
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jTextField4.setText("");
            jTextField5.setText("");
            jTextField6.setText("");
            jTextField7.setText("");
            jTextField8.setText("");
            jTextField9.setText("");
            jTextField10.setText("");
            } catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,"EL DNI TIENE QUE SER NUMÉRICO");
            }
                
            
        }else {
            JOptionPane.showMessageDialog(null,"Por favor,Ingrese todos los campos");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

   
    
    
	

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanel;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
