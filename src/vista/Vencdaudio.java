/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controla.Vecproduc;
import java.awt.JobAttributes;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cdaudio;

/**
 *
 * @author UsuarioEp
 */
public class Vencdaudio extends javax.swing.JFrame {

    Vecproduc objvec;
    Cdaudio []vecd;
    String []a;
    int i,y,cont;
    double total;
    String data;
    DefaultTableModel modTb= new DefaultTableModel();
    DefaultTableModel mod1 = new DefaultTableModel();
    DefaultTableModel modCarrito = new DefaultTableModel();
    DefaultTableModel m;
    public Vencdaudio() {
        initComponents();
        i=0;
        y=0;
        cont=1;
        total=0;
       
        data="";
        String []titulos ={"Nombre Interprete","Nombre Cancion","Cod","Nom Producto","Valor"};
        String []titulos2 ={"Nombre Interprete","Nombre Cancion","Cod","Nom Producto","Valor"};
        modTb.setColumnIdentifiers(titulos);
        modCarrito.setColumnIdentifiers(titulos2);
        tbBuscar.setModel(modTb);
        tbcarrito.setModel(modCarrito);
        objvec=new Vecproduc();
         

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtcod = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtnombcancio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtnomProduc = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtnomInterp = new javax.swing.JTextField();
        LimpiarCampos = new javax.swing.JButton();
        RegistrarPr = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cant = new javax.swing.JLabel();
        ComboBox1 = new javax.swing.JComboBox();
        txtbuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbBuscar = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbcarrito = new javax.swing.JTable();
        elimElemenCarrito = new javax.swing.JButton();
        GenerarTicket = new javax.swing.JButton();
        Buscar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbproduc = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cantCarrito = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbtotal = new javax.swing.JLabel();
        limpBusque = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("COLECCIONES DE AUDIO");

        jLabel7.setText("REGISTRO DE PRODUCTO CD DE AUDIO");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Codigo:");

        jLabel2.setText("Nombre cancion:");

        jLabel3.setText("Precio $:");

        jLabel4.setText("Nombre Producto:");

        jLabel5.setText("Nombre interprete: ");

        LimpiarCampos.setText("Limpiar Campos");
        LimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarCamposActionPerformed(evt);
            }
        });

        RegistrarPr.setText("Registrar");
        RegistrarPr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarPrActionPerformed(evt);
            }
        });

        jLabel8.setText("Cantidad:");

        cant.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(RegistrarPr)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtcod, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnombcancio)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(txtnomProduc))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LimpiarCampos)
                                .addComponent(txtnomInterp, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel8)
                        .addGap(29, 29, 29)
                        .addComponent(cant, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(252, 252, 252))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtnomProduc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtnomInterp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LimpiarCampos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cant, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtnombcancio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)))
                            .addComponent(txtcod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addComponent(RegistrarPr)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        ComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NombreCancion", "Cod" }));

        tbBuscar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbBuscar);

        jButton1.setText("Agregar al Carrito");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tbcarrito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tbcarrito);

        elimElemenCarrito.setText("Eliminar");
        elimElemenCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elimElemenCarritoActionPerformed(evt);
            }
        });

        GenerarTicket.setText("Generar Ticket");
        GenerarTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarTicketActionPerformed(evt);
            }
        });

        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        tbproduc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane3.setViewportView(tbproduc);

        jLabel6.setText("BUSQUEDA DE PRODUCTO");

        jLabel9.setText("Cantidad:");

        cantCarrito.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel10.setText("Total:");

        lbtotal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        limpBusque.setText("Limpiar Busquedas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(Buscar)
                                .addGap(18, 18, 18)
                                .addComponent(limpBusque))
                            .addComponent(jScrollPane2)
                            .addComponent(jButton1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(cantCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(elimElemenCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(lbtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(GenerarTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Buscar)
                    .addComponent(limpBusque))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(GenerarTicket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(153, 153, 153))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(elimElemenCarrito)
                            .addComponent(cantCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(lbtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegistrarPrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarPrActionPerformed
      
        objvec.ingCd(txtnomInterp.getText(), txtnombcancio.getText(), txtcod.getText(), txtnomProduc.getText(), 
                Double.parseDouble(txtPrecio.getText()));
         cant.setText(""+objvec.getC());
         Cdaudio []v2 =objvec.getCd();
         
         String b[]=new String[2];
         String []t2= {" Codigo "," Nombre Cancion"};
         
         mod1.setColumnIdentifiers(t2);
         tbproduc.setModel(mod1);
         
         b[0]=v2[y].getCod();
         b[1]=v2[y].getNomCancion();
         mod1.addRow(b);
         y++;
         
         
         
        
    }//GEN-LAST:event_RegistrarPrActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
          
        String nomabuscar = txtbuscar.getText();
        if (ComboBox1.getSelectedItem().equals("NombreCancion")) {
             objvec.buscar(1, nomabuscar);
        } else {
            objvec.buscar(2, nomabuscar);
        }
        vecd = new Cdaudio[objvec.getAux().length];
        vecd = objvec.getAux();
        a = new String[5];
        a[0] = vecd[i].getNomInter();
        a[1] = vecd[i].getNomCancion();
        a[2] = vecd[i].getCod();
        a[3] = vecd[i].getNompro();
        a[4] = "" + vecd[i].getPrecio();
        modTb.addRow(a);
        i++;


    }//GEN-LAST:event_BuscarActionPerformed

    private void LimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarCamposActionPerformed
        // TODO add your handling code here:
        txtnombcancio.setText("");
        txtPrecio.setText("");
        txtcod.setText("");
        txtnomInterp.setText("");
        txtnomProduc.setText("");
        
        
        
    }//GEN-LAST:event_LimpiarCamposActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Agregar elementos a la tabla de compra
        int fs = tbBuscar.getSelectedRow();
        String NomInpte,NomCan,Cod,NomPro,Valor;
        
        if(fs>=0){
            m=(DefaultTableModel)tbBuscar.getModel();
            NomInpte=tbBuscar.getValueAt(fs, 0).toString();
            NomCan=tbBuscar.getValueAt(fs, 1).toString();
            Cod=tbBuscar.getValueAt(fs, 2).toString();
            NomPro=tbBuscar.getValueAt(fs, 3).toString();
            Valor=tbBuscar.getValueAt(fs, 4).toString();
            total+=Double.parseDouble(Valor);
            lbtotal.setText(""+total);
            cantCarrito.setText(""+cont++);
            m=(DefaultTableModel)tbcarrito.getModel();
            String felem[]={NomInpte,NomCan,Cod,NomPro,Valor};
            m.addRow(felem);
                }else{
            
            JOptionPane.showMessageDialog(null," Por favor seleccione el Item que desea de la tabla ");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void elimElemenCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elimElemenCarritoActionPerformed
        int fila;
        String totalAux;
    fila=this.tbcarrito.getSelectedRow();
    if(fila>=0){
     totalAux=tbcarrito.getValueAt(fila, 4).toString();
     total-=Double.parseDouble(totalAux);
     lbtotal.setText(""+total);
     modCarrito.removeRow(fila); 
     cont= modCarrito.getRowCount();
     this.cantCarrito.setText(""+cont);
     }
    else{
        JOptionPane.showMessageDialog(null," Por favor seleccione el Item que desea eliminar de la tabla ");
    }

        
    }//GEN-LAST:event_elimElemenCarritoActionPerformed

    private void GenerarTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarTicketActionPerformed
       
                  reporte();
     
                  
    }//GEN-LAST:event_GenerarTicketActionPerformed
    int f=0,k=0;  
    public void reporte() {
        for (int f = 0; f < modCarrito.getRowCount(); f++) {
            for (int k = 0; k < modCarrito.getColumnCount(); k++) {
                data += modCarrito.getValueAt(f, k).toString() + "                 ";
            }
            data+="\n";
        }
        JOptionPane.showMessageDialog(null, " Nombre Interprete*Nombre Cancion*Cod*Nom Producto*Valor\n"
                                          + ""+data+"\n Total a pagar$:"+lbtotal.getText()," *FACTURA*",JOptionPane.INFORMATION_MESSAGE);
    }

        

    

    
    
    
    
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Vencdaudio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Vencdaudio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Vencdaudio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Vencdaudio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Vencdaudio().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JComboBox ComboBox1;
    private javax.swing.JButton GenerarTicket;
    private javax.swing.JButton LimpiarCampos;
    private javax.swing.JButton RegistrarPr;
    private javax.swing.JLabel cant;
    private javax.swing.JLabel cantCarrito;
    private javax.swing.JButton elimElemenCarrito;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbtotal;
    private javax.swing.JButton limpBusque;
    private javax.swing.JTable tbBuscar;
    private javax.swing.JTable tbcarrito;
    private javax.swing.JTable tbproduc;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtcod;
    private javax.swing.JTextField txtnomInterp;
    private javax.swing.JTextField txtnomProduc;
    private javax.swing.JTextField txtnombcancio;
    // End of variables declaration//GEN-END:variables
}
