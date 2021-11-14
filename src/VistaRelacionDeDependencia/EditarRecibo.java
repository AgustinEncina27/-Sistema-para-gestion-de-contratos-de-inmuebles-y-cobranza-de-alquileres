/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistaRelacionDeDependencia;

import Clases.Garante;
import Clases.Locatario;
import Clases.RelacionDeDependencia;
import Clases.TrabajoIndependiente;
import Controlador.Controlador;
import Controlador.HibernateSession;
import VistaPrincipal.VistaPrincipal;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Agustin
 */
public class EditarRecibo extends javax.swing.JFrame {
    Controlador control;
    Object objeto;
    JFileChooser seleccionado = new JFileChooser();
	JFileChooser seleccionado2 = new JFileChooser();
	JFileChooser seleccionado3 = new JFileChooser();
	File archivo;
	File archivo2;
	File archivo3;
	byte[] bytesImg;
	RelacionDeDependencia compro1;

        
    public EditarRecibo(Controlador control2,Object objeto2) {
        control= control2;
        objeto= objeto2;
        initComponents();
        this.setLocationRelativeTo(null);
        //INSERTA SI ES QUE TIENE UN COMPROBANTE RELACIONADO DESDE LA BASE DE DATOS
        if(objeto instanceof Locatario) {
            compro1=((Locatario) objeto).getDependencia();
	}
	if(objeto instanceof Garante) {
            compro1=((Garante) objeto).getDependencia();
	}
        if(compro1 !=null){
        bytesImg= compro1.getReciboDeSueldo();
	ImageIcon imagen1= new ImageIcon(bytesImg);
	Icon fondo1= new ImageIcon(imagen1.getImage().getScaledInstance(imagen_1.getWidth(), imagen_1.getHeight(), Image.SCALE_DEFAULT));
	imagen_1.setIcon(fondo1);
	compro1= new RelacionDeDependencia(bytesImg);
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        imagen_1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("EDITAR RECIBO DE SUELDO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("GUARDAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("VOLVER");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagen_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagen_1, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 494, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //GUARDA LOS CAMBIOS 
        if(objeto instanceof Locatario) {
            ((Locatario) objeto).setDependencia(compro1);
            control.ActualizarLocatoria(((Locatario) objeto));
	}
	if(objeto instanceof Garante) {
            ((Garante) objeto).setDependencia(compro1);
            control.ActualizarGarante(((Garante) objeto));
	}	
	VistaPrincipal l= new VistaPrincipal(control);
        l.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //VUELVE A LA INTERFAZ PRINCIPAL
        VistaPrincipal l= new VistaPrincipal(control);
        l.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //EDITA EL COMPROBANTE
        if(seleccionado.showDialog(null, "ABRIR ARCHIVO")== JFileChooser.APPROVE_OPTION ) {
					archivo= seleccionado.getSelectedFile();
					if(archivo.canRead()) {
							if(archivo.getName().endsWith("jpg")||archivo.getName().endsWith("png")||archivo.getName().endsWith("gif")||archivo.getName().endsWith("jpeg")) {
								bytesImg= control.AbrirAImagen(archivo);
								ImageIcon imagen1= new ImageIcon(bytesImg);
								Icon fondo1= new ImageIcon(imagen1.getImage().getScaledInstance(imagen_1.getWidth(), imagen_1.getHeight(), Image.SCALE_DEFAULT));
								imagen_1.setIcon(fondo1);
								compro1= new RelacionDeDependencia(bytesImg);
							}
							else {
								JOptionPane.showMessageDialog(null,"POR FAVOR SELECCIONE UN ARCHIVO DE TIPO IMAGEN");
							}
					}
				}
    }//GEN-LAST:event_jButton1ActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imagen_1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
