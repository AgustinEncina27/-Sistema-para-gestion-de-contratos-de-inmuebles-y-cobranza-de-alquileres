/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistaContrato;

import Clases.Contrato;
import Clases.Inmueble;
import Clases.Locador;
import Clases.Locatario;
import Clases.Servicio;
import Controlador.Controlador;
import VistaPrincipal.VistaPrincipal;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Agustin
 */
public class BuscarContrato extends javax.swing.JFrame {
    Controlador control;
    DefaultTableModel dtm= new DefaultTableModel();
    Contrato contra;
    
    
     List <Servicio> ser= null;
    /**
     * Creates new form CrearContrato
     */
    public BuscarContrato(Controlador control2) {
        control= control2;
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        txtbuscarcontra = new javax.swing.JTextField();
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
        jTextField8 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtfechaini = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtfechafin = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtrecargofijo = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        txtvalorbase = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("DATOS LOCADOR");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 105, 26));

        jPanel2.setLayout(new java.awt.GridLayout(7, 7));

        jLabel2.setText("NOMBRE:");
        jPanel2.add(jLabel2);

        jTextField1.setEditable(false);
        jPanel2.add(jTextField1);

        jLabel3.setText("APELLIDO:");
        jPanel2.add(jLabel3);

        jTextField2.setEditable(false);
        jPanel2.add(jTextField2);

        jLabel4.setText("DNI:");
        jPanel2.add(jLabel4);

        jTextField3.setEditable(false);
        jPanel2.add(jTextField3);

        jLabel5.setText("ESTADO CIVIL:");
        jPanel2.add(jLabel5);

        jTextField4.setEditable(false);
        jPanel2.add(jTextField4);

        jLabel6.setText("DOMICILIO:");
        jPanel2.add(jLabel6);

        jTextField5.setEditable(false);
        jPanel2.add(jTextField5);

        jLabel7.setText("TELEFONO:");
        jPanel2.add(jLabel7);

        jTextField6.setEditable(false);
        jPanel2.add(jTextField6);

        jLabel8.setText("CORREO ELECTRONICO:");
        jPanel2.add(jLabel8);

        jTextField7.setEditable(false);
        jPanel2.add(jTextField7);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 85, 399, 110));

        jLabel11.setText("DATOS INMUEBLE");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, -1, -1));

        jPanel3.setLayout(new java.awt.GridLayout(3, 3));

        jLabel12.setText("LOCALIDAD:");
        jPanel3.add(jLabel12);

        jTextField10.setEditable(false);
        jPanel3.add(jTextField10);

        jLabel13.setText("DIRECCION:");
        jPanel3.add(jLabel13);

        jTextField11.setEditable(false);
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField11);

        jLabel14.setText("TAMAÑO:");
        jPanel3.add(jLabel14);

        jTextField12.setEditable(false);
        jPanel3.add(jTextField12);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 85, 240, 60));

        jLabel15.setText("BUSCAR CONTRATO:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 11, -1, 23));
        jPanel1.add(txtbuscarcontra, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 10, 230, -1));

        jLabel16.setText("DATOS LOCATARIO");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, -1, -1));

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

        jTextField15.setEditable(false);

        jTextField16.setEditable(false);

        jTextField17.setEditable(false);

        jTextField18.setEditable(false);

        jTextField19.setEditable(false);

        jTextField20.setEditable(false);

        jTextField21.setEditable(false);

        jTextField22.setEditable(false);

        jLabel26.setText("ID CRONOGRAMA:");

        jLabel29.setText("CRONOGRAMA");

        jTextField8.setEditable(false);

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
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel23))
                                .addGap(67, 68, Short.MAX_VALUE)
                                .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(67, 67, 67))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jLabel29)
                        .addGap(0, 0, Short.MAX_VALUE))))
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
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel21)
                                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel22)
                                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(15, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel26)
                                .addGap(30, 30, 30))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-9, 224, 1020, 170));

        jButton1.setText("BUSCAR CONTRATO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 150, -1));

        jLabel27.setText("SERVICIO ADHERIDOS");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, -1, -1));

        tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Costo del servicio"
            }
        ));
        jScrollPane2.setViewportView(tabla2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 310, 85));

        jButton5.setText("VOLVER");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 550, 100, 50));

        jPanel5.setLayout(new java.awt.GridLayout(4, 2));

        jLabel9.setText("FECHA INICIO DE CONTRATO: ");
        jPanel5.add(jLabel9);

        txtfechaini.setEditable(false);
        jPanel5.add(txtfechaini);

        jLabel10.setText("FECHA FIN DE CONTRATO:");
        jPanel5.add(jLabel10);

        txtfechafin.setEditable(false);
        jPanel5.add(txtfechafin);

        jLabel31.setText("RECARGO FIJO");
        jPanel5.add(jLabel31);

        txtrecargofijo.setEditable(false);
        jPanel5.add(txtrecargofijo);

        jLabel32.setText("VALOR BASE");
        jPanel5.add(jLabel32);

        txtvalorbase.setEditable(false);
        jPanel5.add(txtvalorbase);

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 80, 340, 90));

        jLabel33.setText("DATOS CONTRATO");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 60, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1047, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        VistaPrincipal l= new VistaPrincipal(control);
        l.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         if(!txtbuscarcontra.getText().equals("")){
        try{
        long a=Long.parseLong(txtbuscarcontra.getText());
        contra= control.ObtenerContrato(a);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        String fechaini = sdf.format(contra.getFechaDeInicioDelContrato());
        txtfechaini.setText(fechaini);
        SimpleDateFormat sd = new SimpleDateFormat("yyyy/MM/dd");
        String fechafin = sd.format(contra.getFechaDeFinalDelContrato());
        txtfechafin.setText(fechafin);
        txtrecargofijo.setText(Integer.toString(contra.getRecargoFijo()));
        txtvalorbase.setText(Integer.toString(contra.getValorBaseDelRecargoProporcional()));
        AgregarTabla(contra.getServicio());
        AgregarDatosInmueble(contra.getInmueble());
        AgregarDatosLocatario( contra.getLocatario());
        jTextField8.setText(String.valueOf(contra.getCronograma().getIdCronograma()));
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(null,"NO SE ENCONTRO EL CONTRATO");
        }
         }else{
             JOptionPane.showMessageDialog(null,"POR FAVOR INGRESE EL ID DEL CONTRATO"); 
         }
    }//GEN-LAST:event_jButton1ActionPerformed

    public void AgregarTabla(List <Servicio> ser){
        String mat[][]= new String [ser.size()][3];
        Servicio aux;
        for (int i = 0; i < ser.size(); i++) {
            aux= ser.get(i);
            mat[i][0]= String.valueOf(aux.getIdServicio());
            mat[i][1]= aux.getNombre();
            mat[i][2]= String.valueOf(aux.getCosto());    
        }
        tabla2.setModel(new javax.swing.table.DefaultTableModel(
            mat,
            new String [] {
                "ID", "Nombre", "Costo del servicio"
            }
        ));
    }
 
    public void  AgregarDatosInmueble(Inmueble inmu){
        List <Locador> loca= inmu.getLocador();
        Locador l= loca.get(0);
        jTextField1.setText(l.getNombre());
        jTextField2.setText(l.getApellido());
        jTextField3.setText(String.valueOf(l.getDni()));
        jTextField4.setText(l.getEstadoCivil());
        jTextField5.setText(l.getDomicilio());
        jTextField6.setText(l.getTelefono());
        jTextField7.setText(l.getCorreoElectronico());
        
        jTextField10.setText(inmu.getLocalidad());
        jTextField11.setText(inmu.getDireccion());
        jTextField12.setText(inmu.getTamanio());
    }
    
    public void  AgregarDatosLocatario(List <Locatario> loca){
        Locatario locat= loca.get(0);
        jTextField14.setText(locat.getNombre());
        jTextField15.setText(locat.getApellido());
        jTextField16.setText(String.valueOf(locat.getDni()));
        jTextField17.setText(locat.getEstadoCivil());
        jTextField18.setText(locat.getDomicilio());
        jTextField19.setText(locat.getTelefono());
        jTextField20.setText(locat.getCorreoElectronico());
        jTextField21.setText(locat.getActividadALaQueSeDedica());
        jTextField22.setText(String.valueOf(locat.isEstudiante()));
    }
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
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
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
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
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTable tabla2;
    private javax.swing.JTextField txtbuscarcontra;
    private javax.swing.JTextField txtfechafin;
    private javax.swing.JTextField txtfechaini;
    private javax.swing.JTextField txtrecargofijo;
    private javax.swing.JTextField txtvalorbase;
    // End of variables declaration//GEN-END:variables
}
