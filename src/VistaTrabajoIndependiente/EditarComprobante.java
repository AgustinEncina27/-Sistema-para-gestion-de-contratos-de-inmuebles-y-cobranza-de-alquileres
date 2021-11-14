/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistaTrabajoIndependiente;

import Clases.Garante;
import Clases.Locatario;
import Clases.TrabajoIndependiente;
import Controlador.Controlador;
import Controlador.HibernateSession;
import Errores.NotificacionError;
import VistaPrincipal.VistaPrincipal;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class EditarComprobante extends javax.swing.JFrame {
       JFileChooser seleccionado = new JFileChooser();
	JFileChooser seleccionado2 = new JFileChooser();
	JFileChooser seleccionado3 = new JFileChooser();
	File archivo;
	File archivo2;
	File archivo3;
	Controlador control;
	List <TrabajoIndependiente> compro= new  ArrayList <TrabajoIndependiente>();
	TrabajoIndependiente compro1;
	TrabajoIndependiente compro2;
	TrabajoIndependiente compro3;
        Object objeto;
        byte[] bytesImg;
        byte[] bytesImg2;
        byte[] bytesImg3;
        
    public EditarComprobante(Controlador control2,Object objeto2) {
        objeto=objeto2;
        control=control2;
        initComponents();
        this.setLocationRelativeTo(null);
        if(objeto instanceof Locatario) {
            compro=((Locatario) objeto).getTrabajoIndependiente();
            
	}
	if(objeto instanceof Garante) {
            compro=((Garante) objeto).getTrabajoIndependiente();
	}
         if(compro.size()!=0){
             // COLOCA LOS COMPROBANTES EN LOS LABEL
            compro1=compro.get(0);
            compro2=compro.get(1);
            compro3=compro.get(2);
            bytesImg= compro1.getComprobante();
            ImageIcon imagen1= new ImageIcon(bytesImg);
            Icon fondo1= new ImageIcon(imagen1.getImage().getScaledInstance(imagen_1.getWidth(), imagen_1.getHeight(), Image.SCALE_DEFAULT));
            imagen_1.setIcon(fondo1);
            
            bytesImg2=compro2.getComprobante();
            ImageIcon imagen2= new ImageIcon(bytesImg2);
            Icon fondo2= new ImageIcon(imagen2.getImage().getScaledInstance(imagen_2.getWidth(), imagen_2.getHeight(), Image.SCALE_DEFAULT));
            imagen_2.setIcon(fondo2);

            bytesImg3=compro3.getComprobante();
            ImageIcon imagen3= new ImageIcon(bytesImg3);
            Icon fondo3= new ImageIcon(imagen3.getImage().getScaledInstance(imagen_3.getWidth(), imagen_3.getHeight(), Image.SCALE_DEFAULT));
            imagen_3.setIcon(fondo3);
        }else{
             compro=new ArrayList <TrabajoIndependiente>();
         }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtoncompro1 = new javax.swing.JButton();
        jButtoncompro2 = new javax.swing.JButton();
        jButtoncompro3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        imagen_1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        imagen_2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        imagen_3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtoncompro1.setText("EDITAR COMPROBANTE 1");
        jButtoncompro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoncompro1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButtoncompro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jButtoncompro2.setText("EDITAR COMPROBANTE 2");
        jButtoncompro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoncompro2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButtoncompro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jButtoncompro3.setText("EDITAR COMPROBANTE 3");
        jButtoncompro3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoncompro3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButtoncompro3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, -1, -1));

        jButton1.setText("GUARDAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 666, -1, -1));

        jButton2.setText("VOLVER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(619, 666, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagen_1, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagen_1, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 680, 180));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagen_2, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagen_2, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 262, 680, 180));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagen_3, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagen_3, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 482, 680, 180));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtoncompro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoncompro1ActionPerformed
        if(seleccionado.showDialog(null, "ABRIR ARCHIVO")== JFileChooser.APPROVE_OPTION ) {
                                        //BUSCA EL COMPROBANTE 1 EN LOS DIRECTORIOS
					archivo= seleccionado.getSelectedFile();
					if(archivo.canRead()) {
							if(archivo.getName().endsWith("jpg")||archivo.getName().endsWith("png")||archivo.getName().endsWith("gif")||archivo.getName().endsWith("jpeg")) {
								 if(compro.size()==3){
                                                                    compro.remove(0); 
                                                                 }
                                                                
                                                                bytesImg= control.AbrirAImagen(archivo);
								ImageIcon imagen1= new ImageIcon(bytesImg);
								Icon fondo1= new ImageIcon(imagen1.getImage().getScaledInstance(imagen_1.getWidth(), imagen_1.getHeight(), Image.SCALE_DEFAULT));
								imagen_1.setIcon(fondo1);
								compro1= new TrabajoIndependiente(bytesImg);
                                                                compro.add(0,compro1);
							}
							else {
								JOptionPane.showMessageDialog(null,"POR FAVOR SELECCIONE UN ARCHIVO DE TIPO IMAGEN");
							}
					}
				}
    }//GEN-LAST:event_jButtoncompro1ActionPerformed

    private void jButtoncompro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoncompro2ActionPerformed
       if(seleccionado2.showDialog(null, "ABRIR ARCHIVO")== JFileChooser.APPROVE_OPTION ) {
	//BUSCA EL COMPROBANTE 2 EN LOS DIRECTORIOS				
           archivo2= seleccionado2.getSelectedFile();
					if(archivo2.canRead()) {
						if(archivo2.getName().endsWith("jpg")||archivo2.getName().endsWith("png")||archivo2.getName().endsWith("gif")||archivo2.getName().endsWith("jpeg")) {
							if(compro.size()==3){
                                                            compro.remove(1); 
                                                        }
                                                        
                                                        bytesImg= control.AbrirAImagen(archivo2);
							ImageIcon imagen2= new ImageIcon(bytesImg);
							Icon fondo1= new ImageIcon(imagen2.getImage().getScaledInstance(imagen_2.getWidth(), imagen_2.getHeight(), Image.SCALE_DEFAULT));
							imagen_2.setIcon(fondo1);
							compro2= new TrabajoIndependiente(bytesImg);
                                                        compro.add(1,compro2);
						}
						else {
							JOptionPane.showMessageDialog(null,"POR FAVOR SELECCIONE UN ARCHIVO DE TIPO IMAGEN");
						}
					}
				}
    }//GEN-LAST:event_jButtoncompro2ActionPerformed

    private void jButtoncompro3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoncompro3ActionPerformed
        //BUSCA EL COMPROBANTE 3 EN LOS DIRECTORIOS
        if(seleccionado3.showDialog(null, "ABRIR ARCHIVO")== JFileChooser.APPROVE_OPTION ) {
					archivo3= seleccionado3.getSelectedFile();
					if(archivo3.canRead()) {
						if(archivo3.getName().endsWith("jpg")||archivo3.getName().endsWith("png")||archivo3.getName().endsWith("gif")||archivo3.getName().endsWith("jpeg")) {
                                                        if(compro.size()==3){
                                                            compro.remove(2); 
                                                        }
                                                        bytesImg= control.AbrirAImagen(archivo3);
							ImageIcon imagen3= new ImageIcon(bytesImg);
							Icon fondo1= new ImageIcon(imagen3.getImage().getScaledInstance(imagen_3.getWidth(), imagen_3.getHeight(), Image.SCALE_DEFAULT));
							imagen_3.setIcon(fondo1);
							compro3= new TrabajoIndependiente(bytesImg);
                                                        compro.add(2,compro3);
						}
						else {
							JOptionPane.showMessageDialog(null,"POR FAVOR SELECCIONE UN ARCHIVO DE TIPO IMAGEN");
						}
					}
				}
    }//GEN-LAST:event_jButtoncompro3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        VistaPrincipal l= new VistaPrincipal(control);
        l.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
	if(objeto instanceof Locatario) {
            ((Locatario) objeto).setTrabajoIndependiente(compro);
            control.ActualizarLocatoria(((Locatario) objeto));
	}
	if(objeto instanceof Garante) {
            ((Garante) objeto).setTrabajoIndependiente(compro);
            control.ActualizarGarante(((Garante) objeto));
	}
	VistaPrincipal l= new VistaPrincipal(control);
        l.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imagen_1;
    private javax.swing.JLabel imagen_2;
    private javax.swing.JLabel imagen_3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtoncompro1;
    private javax.swing.JButton jButtoncompro2;
    private javax.swing.JButton jButtoncompro3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
