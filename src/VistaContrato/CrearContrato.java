/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistaContrato;

import Clases.Alquiler;
import Clases.Contrato;
import Clases.Cronograma;
import Clases.Cuota;
import Clases.Garante;
import Clases.Inmueble;
import Clases.Locador;
import Clases.Locatario;
import Clases.Servicio;
import Clases.Venta;
import Controlador.Controlador;
import VistaPrincipal.VistaPrincipal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Agustin
 */
public class CrearContrato extends javax.swing.JFrame {
    Controlador control;
    Locatario l= new Locatario();
    List <Cuota> cuota= null;   
    Inmueble inmu = new Inmueble(){} ;
    public String stringFecha;
    public int contcu;
    private Cuota cuot;
    java.util.Date date1, date2,date3,fechaini,fechafin;
    private Garante gt;
    private Contrato contrato;
    private Cronograma cro= new Cronograma();
    static List <Servicio> servicios;
    static List <Servicio> servicios2= new ArrayList <Servicio>();
    DefaultTableModel dtm= new DefaultTableModel();
     List <Servicio> ser= null;
   
     
    public CrearContrato(Controlador control2) {
        control= control2;
        cuot = new Cuota();
        
        this.setExtendedState(MAXIMIZED_BOTH);
        
        initComponents();
        this.setLocationRelativeTo(null);
        jPanel7.setVisible(false);
        jLabel35.setVisible(false);
        jLabel44.setVisible(false);
        jTextField35.setVisible(false);
        jButton9.setVisible(false);
        Agregar();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jTextField32 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jTextField31 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jTextField25 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel35 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jTextField26 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jTextField34 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jTextField27 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jTextField28 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jTextField29 = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jTextField30 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jTextField33 = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jTextField35 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jTextField36 = new javax.swing.JTextField();
        jTextField37 = new javax.swing.JTextField();
        jTextField38 = new javax.swing.JTextField();
        jTextField39 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("DATOS LOCADOR");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 105, 26));

        jPanel2.setLayout(new java.awt.GridLayout(7, 7));

        jLabel2.setText("NOMBRE:");
        jPanel2.add(jLabel2);

        jTextField1.setEditable(false);
        jTextField1.setEnabled(false);
        jPanel2.add(jTextField1);

        jLabel3.setText("APELLIDO:");
        jPanel2.add(jLabel3);

        jTextField2.setEditable(false);
        jTextField2.setEnabled(false);
        jPanel2.add(jTextField2);

        jLabel4.setText("DNI:");
        jPanel2.add(jLabel4);

        jTextField3.setEditable(false);
        jTextField3.setEnabled(false);
        jPanel2.add(jTextField3);

        jLabel5.setText("ESTADO CIVIL:");
        jPanel2.add(jLabel5);

        jTextField4.setEditable(false);
        jTextField4.setEnabled(false);
        jPanel2.add(jTextField4);

        jLabel6.setText("DOMICILIO:");
        jPanel2.add(jLabel6);

        jTextField5.setEditable(false);
        jTextField5.setEnabled(false);
        jPanel2.add(jTextField5);

        jLabel7.setText("TELEFONO:");
        jPanel2.add(jLabel7);

        jTextField6.setEditable(false);
        jTextField6.setEnabled(false);
        jPanel2.add(jTextField6);

        jLabel8.setText("CORREO ELECTRONICO:");
        jPanel2.add(jLabel8);

        jTextField7.setEditable(false);
        jTextField7.setEnabled(false);
        jPanel2.add(jTextField7);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 85, 399, 110));

        jLabel11.setText("DATOS INMUEBLE");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 60, -1, -1));

        jPanel3.setLayout(new java.awt.GridLayout(3, 3));

        jLabel12.setText("LOCALIDAD:");
        jPanel3.add(jLabel12);

        jTextField10.setEditable(false);
        jTextField10.setEnabled(false);
        jPanel3.add(jTextField10);

        jLabel13.setText("DIRECCION:");
        jPanel3.add(jLabel13);

        jTextField11.setEditable(false);
        jTextField11.setEnabled(false);
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField11);

        jLabel14.setText("TAMAÑO:");
        jPanel3.add(jLabel14);

        jTextField12.setEditable(false);
        jTextField12.setEnabled(false);
        jPanel3.add(jTextField12);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(511, 85, 300, 60));

        jLabel15.setText("BUSCAR INMUEBLE");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 11, -1, 23));
        jPanel1.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 10, 230, -1));

        jLabel16.setText("DATOS LOCATARIO");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, -1, -1));

        jLabel17.setText("NOMBRE:");

        jLabel18.setText("APELLIDO:");

        jLabel19.setText("DNI:");

        jLabel20.setText("ESTADO CIVIL:");

        jLabel21.setText("DOMICILIO:");

        jLabel22.setText("TELEFONO:");

        jLabel23.setText("CORREO ELECTRONICO:");

        jLabel24.setText("ACTIVIDAD A LA QUE SE DEDICA:");

        jLabel25.setText("ESTUDIANTE:");

        jTextField14.setEditable(false);
        jTextField14.setEnabled(false);

        jTextField15.setEditable(false);
        jTextField15.setEnabled(false);

        jTextField16.setEditable(false);
        jTextField16.setEnabled(false);

        jTextField17.setEditable(false);
        jTextField17.setEnabled(false);

        jTextField18.setEditable(false);
        jTextField18.setEnabled(false);

        jTextField19.setEditable(false);
        jTextField19.setEnabled(false);

        jTextField20.setEditable(false);
        jTextField20.setEnabled(false);

        jTextField21.setEditable(false);
        jTextField21.setEnabled(false);

        jTextField22.setEditable(false);
        jTextField22.setEnabled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(120, 120, 120)
                        .addComponent(jTextField14))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(114, 114, 114)
                        .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel22)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21))
                        .addGap(93, 93, 93)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(jLabel23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(67, 67, 67))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-9, 285, 980, -1));

        jLabel26.setText("SERVICIO ADHERIDOS");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 590, -1, -1));

        jLabel29.setText("CRONOGRAMA");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 470, -1, -1));

        jPanel6.setLayout(new java.awt.GridLayout(2, 2));

        jLabel30.setText("NROCUOTA:");
        jPanel6.add(jLabel30);
        jPanel6.add(jTextField32);

        jLabel28.setText("COSTO CUOTA:");
        jPanel6.add(jLabel28);
        jPanel6.add(jTextField23);

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(531, 497, 420, 70));

        jButton1.setText("BUSCAR INMUEBLE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 150, -1));

        jLabel36.setText("BUSCAR LOCATARIO:");
        jPanel1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));
        jPanel1.add(jTextField31, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 210, -1));

        jButton2.setText("BUSCAR LOCATARIO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, -1, -1));

        jButton4.setText("AGREGAR \nSERVICIO");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 490, 160, 30));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Costo del servicio"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 310, 85));

        jLabel27.setText("SERVICIO DISPONIBLES");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, -1, -1));

        tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Costo del servicio"
            }
        ));
        jScrollPane2.setViewportView(tabla2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, 310, 85));

        jButton5.setText("VOLVER");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 640, 100, 50));

        jPanel5.setLayout(new java.awt.GridLayout(2, 2));

        jLabel31.setText("RECARGO FIJO");
        jPanel5.add(jLabel31);
        jPanel5.add(jTextField24);

        jLabel32.setText("VALOR BASE");
        jPanel5.add(jLabel32);
        jPanel5.add(jTextField25);

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 140, 380, 40));

        jLabel33.setText("DATOS CONTRATO");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 50, -1, -1));

        jButton6.setText("AGREGAR \nSERVICIO");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 490, 160, 30));

        jButton7.setText("ELIMINAR SERVICIO");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 610, 160, 30));

        jButton8.setText("CREAR CONTRATO");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 640, 160, 50));

        jLabel34.setText("TIPO CONTRATO ");
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, -1, 20));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("ALQUILER");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("VENTA");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, -1, -1));

        jLabel35.setText("DATOS GARANTE");
        jPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 270, -1, -1));

        jPanel7.setLayout(new java.awt.GridLayout(7, 2));

        jLabel37.setText("DNI:");
        jPanel7.add(jLabel37);

        jTextField26.setEditable(false);
        jTextField26.setEnabled(false);
        jPanel7.add(jTextField26);

        jLabel38.setText("NOMBRE:");
        jPanel7.add(jLabel38);

        jTextField34.setEditable(false);
        jTextField34.setEnabled(false);
        jPanel7.add(jTextField34);

        jLabel39.setText("APELLIDO:");
        jPanel7.add(jLabel39);

        jTextField27.setEditable(false);
        jTextField27.setEnabled(false);
        jPanel7.add(jTextField27);

        jLabel40.setText("ESTADO CIVIL:");
        jPanel7.add(jLabel40);

        jTextField28.setEditable(false);
        jTextField28.setEnabled(false);
        jPanel7.add(jTextField28);

        jLabel41.setText("DOMICILIO:");
        jPanel7.add(jLabel41);

        jTextField29.setEditable(false);
        jTextField29.setEnabled(false);
        jPanel7.add(jTextField29);

        jLabel42.setText("TELEFONO:");
        jPanel7.add(jLabel42);

        jTextField30.setEditable(false);
        jTextField30.setEnabled(false);
        jPanel7.add(jTextField30);

        jLabel43.setText("CORREO ELECTRONICO:");
        jPanel7.add(jLabel43);

        jTextField33.setEditable(false);
        jTextField33.setEnabled(false);
        jPanel7.add(jTextField33);

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 290, 300, 160));

        jLabel44.setText("BUSCAR GARANTE:");
        jPanel1.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 230, -1, 20));

        jTextField35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField35ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField35, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 230, 120, -1));

        jButton9.setText("BUSCAR GARANTE");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 230, -1, -1));

        jLabel9.setText("FECHA INICIO DE CONTRATO: ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 90, 190, 22));

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 110, 40, 20));

        jLabel10.setText("FECHA FIN DE CONTRATO:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 110, 190, 22));
        jPanel1.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 110, 40, 22));

        jLabel45.setText("/");
        jPanel1.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 110, -1, -1));

        jLabel46.setText("/");
        jPanel1.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 90, -1, -1));

        jTextField36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField36ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField36, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 90, 40, 20));

        jTextField37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField37ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField37, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 90, 40, 20));

        jTextField38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField38ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField38, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 90, 40, 20));

        jTextField39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField39ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField39, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 110, 40, 20));

        jLabel47.setText("/");
        jPanel1.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 90, -1, -1));

        jLabel48.setText("/");
        jPanel1.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 110, -1, -1));

        jLabel49.setText("Dia");
        jPanel1.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 70, -1, -1));

        jLabel50.setText("Mes");
        jPanel1.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 70, -1, -1));

        jLabel51.setText("Año");
        jPanel1.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 70, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(!jTextField31.getText().equals("")){

            long dnum = Long.parseLong(jTextField31.getText());
            l=control.ObtenerLocatario(dnum);
            //jTextField1.setText(l.getUsuario());
            //jTextField2.setText(l.getContrasenia());
            jTextField14.setText(l.getNombre());
            jTextField15.setText(l.getApellido());
            String s=String.valueOf(l.getDni());
            jTextField16.setText(s);
            jTextField17.setText(l.getEstadoCivil());
            jTextField18.setText(l.getDomicilio());
            jTextField19.setText(l.getTelefono());
            jTextField20.setText(l.getCorreoElectronico());
            jTextField21.setText(l.getActividadALaQueSeDedica());
            if(l.isEstudiante()){
                jTextField22.setText("SI");

            }else{
                jTextField22.setText("NO");

            }
            control.desconectarBaseDatosLocatario();
        }else {
            JOptionPane.showMessageDialog(null,"Por favor Ingrese un DNI");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(!jTextField13.getText().equals("")){
            long dnum = Long.parseLong(jTextField13.getText());
            inmu=control.ObtenerInmuebleID(dnum);
            jTextField1.setText(inmu.getLocador().get(0).getNombre());
            jTextField2.setText(inmu.getLocador().get(0).getApellido());
            String s=String.valueOf(inmu.getLocador().get(0).getDni());
            jTextField3.setText(s);
            jTextField4.setText(inmu.getLocador().get(0).getEstadoCivil());
            jTextField5.setText(inmu.getLocador().get(0).getDomicilio());
            jTextField6.setText(inmu.getLocador().get(0).getTelefono());
            jTextField7.setText(inmu.getLocador().get(0).getCorreoElectronico());

            jTextField10.setText(inmu.getLocalidad());
            jTextField11.setText(inmu.getDireccion());
            jTextField12.setText(inmu.getTamanio());

        }else {
            JOptionPane.showMessageDialog(null,"Por favor Ingrese un DNI");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Servicio aux;
        int c;
        c= tabla.getSelectedRow();
        aux= servicios.get(c);
        
        String[] columnas = new String [] {"ID", "Nombre", "Costo del servicio"};
        dtm.setColumnIdentifiers(columnas);
        dtm.addRow(new Object[]{String.valueOf(aux.getIdServicio()),aux.getNombre(),String.valueOf(aux.getCosto())});
        tabla2.setModel(dtm);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        VistaPrincipal l= new VistaPrincipal(control);
        l.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        int fila= tabla2.getSelectedRow();
        dtm.removeRow(fila);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if(!jTextField13.getText().equals("")){
            int dnum = Integer.parseInt(jTextField32.getText());
            contcu=1;
            boolean b= false;
            for (int cont = 0; cont < dnum; ++cont) {
                
                cuot.setNumeroCuota(contcu);
                cuot.setMontoDeRecargo(0);    
                int mta = Integer.parseInt(jTextField23.getText());
                cuot.setMontoTotalAPagar(mta);
                
                if(cont==0){
                    stringFecha = jTextField37.getText()+"/"+jTextField38.getText()+"/"+jTextField36.getText() ;

                    DateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");
                    try {
                        date1 = fecha.parse(stringFecha);   
                    } catch (ParseException ex) {
                     Logger.getLogger(CrearContrato.class.getName()).log(Level.SEVERE, null, ex);
                    }   
                }
                
		
                java.sql.Date sqlDate = new java.sql.Date(date1.getTime());
                
                cuot.setPrimerFechaDePago(sqlDate);
                
                date2 =  new java.util.Date();
                date2 = date1;
                
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(date2);// Configuramos la fecha que se recibe
                calendar.add(Calendar.DAY_OF_YEAR, 10);// numero de días a añadir, o restar en caso de días<0
                date2=calendar.getTime();// Devuelve el objeto Date con los nuevos días añadidos
               
                java.sql.Date sqlDate2 = new java.sql.Date(date2.getTime());

                DateFormat fecha1 = new SimpleDateFormat("dd/MM/yyyy");
                    try {
                        date3 = fecha1.parse("0/0/0000");   
                    } catch (ParseException ex) {
                     Logger.getLogger(CrearContrato.class.getName()).log(Level.SEVERE, null, ex);
                    } 
                java.sql.Date sqlDate3 = new java.sql.Date(date3.getTime());


                Calendar calendar1 = Calendar.getInstance();
                calendar.setTime(date1);// Configuramos la fecha que se recibe
                calendar.add(Calendar.DAY_OF_YEAR, 30);// numero de días a añadir, o restar en caso de días<0
                date1 = calendar.getTime();// Devuelve el objeto Date con los nuevos días añadidos
                cro.cargarlista(0, mta, sqlDate, sqlDate2,sqlDate3, b); 
            }
            control.InsertarCronograma(cro);
            
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            SimpleDateFormat formato2 = new SimpleDateFormat("dd/MM/yyyy");
                    
            int recargofijo = Integer. parseInt (jTextField24.getText());
            int valorbase = Integer. parseInt (jTextField25.getText());
            try {
                fechaini = formato.parse(jTextField37.getText()+"/"+jTextField38.getText()+"/"+jTextField36.getText());
                fechafin = formato2.parse(jTextField9.getText()+"/"+jTextField39.getText()+"/"+jTextField8.getText());
            } 
            catch (ParseException ex) {
                System.out.println(ex);
            }
            java.sql.Date sqlfechaini = new java.sql.Date(fechaini.getTime());
            java.sql.Date sqlfechafin = new java.sql.Date(fechafin.getTime());
            List <Locatario> loca = new ArrayList<Locatario>();
            loca.add(l);
            for (int i = 0; i < dtm.getRowCount(); i++) {
                String s= (String) dtm.getValueAt(i,0);
                long id = Long.parseLong(s);
                String nombre= (String) dtm.getValueAt(i,1);
                String a=(String) dtm.getValueAt(i,2);
                double costo= Double.parseDouble(a);
                Servicio ser= new Servicio(id,nombre, costo);
                servicios2.add(ser);
            }
            
            if( jRadioButton1.isSelected()== true){
                System.out.println("VistaContrato.CrearContrato.jButton8ActionPerformed()");
                Alquiler a= new Alquiler(gt, sqlfechaini, sqlfechafin, valorbase, recargofijo, loca, inmu, servicios2, cro);
                control.InsertarContrato(a);
            }else{
                 if( jRadioButton2.isSelected()== true){
                     System.out.println("VistaContrato.CrearContrato.jButton8ActionPerformed()");
                    Venta v= new Venta(sqlfechaini, sqlfechafin, valorbase, recargofijo, loca, inmu, servicios2, cro);
                    control.InsertarContrato(v);
                 }
            }
        }else{
           JOptionPane.showMessageDialog(null,"Por favor Ingrese todos los datos"); 
        }   
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jTextField35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField35ActionPerformed
        
    }//GEN-LAST:event_jTextField35ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
      if(!jTextField35.getText().equals("")){   
            long dnum = Long.parseLong(jTextField35.getText());
            gt=control.ObtenerGarante(dnum);
            jTextField34.setText(gt.getNombre());
            jTextField27.setText(gt.getApellido());
            String s=String.valueOf(gt.getDni());
            jTextField26.setText(s);
            jTextField28.setText(gt.getEstadoCivil());
            jTextField29.setText(gt.getDomicilio());
            jTextField30.setText(gt.getTelefono());
            jTextField33.setText(gt.getCorreoElectronico());
          
        }else {
            JOptionPane.showMessageDialog(null,"Por favor Ingrese un DNI");
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        jPanel7.setVisible(true);
        jLabel35.setVisible(true);
        jLabel44.setVisible(true);
        jTextField35.setVisible(true);
        jButton9.setVisible(true);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        jPanel7.setVisible(false);
        jLabel35.setVisible(false);
        jLabel44.setVisible(false);
        jTextField35.setVisible(false);
        jButton9.setVisible(false);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jTextField36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField36ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField36ActionPerformed

    private void jTextField37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField37ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField37ActionPerformed

    private void jTextField38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField38ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField38ActionPerformed

    private void jTextField39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField39ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField39ActionPerformed

    public void Agregar(){
        servicios = control.obtenerTodosLosServicios();
        String mat[][]= new String [servicios.size()][3];
        Servicio aux;
        for (int i = 0; i < servicios.size(); i++) {
            aux= servicios.get(i);
            mat[i][0]= String.valueOf(aux.getIdServicio());
            mat[i][1]= aux.getNombre();
            mat[i][2]= String.valueOf(aux.getCosto());    
        }
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            mat,
            new String [] {
                "ID", "Nombre", "Costo del servicio"
            }
        ));
    }
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTable tabla;
    private javax.swing.JTable tabla2;
    // End of variables declaration//GEN-END:variables
}
