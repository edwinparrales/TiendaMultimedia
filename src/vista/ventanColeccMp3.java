/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controla.ArrayCdmp3;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author UsuarioEp
 */
public class ventanColeccMp3 extends javax.swing.JFrame {
    ArrayCdmp3 objCdmp3;
    DefaultTableModel modbuscar;
    DefaultTableModel modCarrito;
    DefaultTableModel m;
    String vecAux[];
    DefaultListModel lista;
    int i,g,cont;
    double total;

    /**
     * Creates new form ventanColeccMp3
     */
    public ventanColeccMp3() {
        initComponents();
        objCdmp3=new ArrayCdmp3();
        modbuscar=new DefaultTableModel();
        modCarrito=new  DefaultTableModel();
        lista = new DefaultListModel();
        i=5;
        g=0;
        total=0;
        cont=0;
        String []titulos ={"Cod","Nombre Cancion","Nom interpret","Nom Producto","Valor"};
        String []titulos2 ={"Cod","Nombre Cancion","Nom interpret","Nom Producto","Valor"};
        modbuscar.setColumnIdentifiers(titulos);
        modCarrito.setColumnIdentifiers(titulos2);
        tablabuscar.setModel(modbuscar);
        tablaCarrito.setModel(modCarrito);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoBuscar = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtnomcancion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnomColeccion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtvalor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtnomInterprete = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        btnRegis = new javax.swing.JButton();
        btnCargarInv = new javax.swing.JButton();
        rdbtnBusCodigo = new javax.swing.JRadioButton();
        rdbtnBusNomCancion = new javax.swing.JRadioButton();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablabuscar = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaCarrito = new javax.swing.JTable();
        btnAgregarCarrito = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnLimpTabla = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        cantCarrito = new javax.swing.JLabel();
        elimElemenCarrito = new javax.swing.JButton();
        lbtotal = new javax.swing.JLabel();
        GenerarTicket = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbCant = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtnomProduc = new javax.swing.JTextField();
        LimpiarJlist = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("         COLECCIONES CDMP3");

        jLabel2.setText("NOMBRE CANCION :");

        jLabel3.setText("NOMBRE COLECCION: ");

        jLabel4.setText("PRECIO:");

        txtvalor.setSelectionColor(new java.awt.Color(255, 0, 51));

        jLabel5.setText("NOMBRE INTERPRETE :");

        jLabel6.setText("CODIGO:");

        jScrollPane1.setViewportView(jList1);

        btnRegis.setText("REGISTRAR");
        btnRegis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisActionPerformed(evt);
            }
        });

        btnCargarInv.setText("Stock");
        btnCargarInv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarInvActionPerformed(evt);
            }
        });

        GrupoBuscar.add(rdbtnBusCodigo);
        rdbtnBusCodigo.setText("BuscarCodigo");

        GrupoBuscar.add(rdbtnBusNomCancion);
        rdbtnBusNomCancion.setText("BuscarNomCancion");

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tablabuscar.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tablabuscar);

        tablaCarrito.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tablaCarrito);

        btnAgregarCarrito.setText("Agregar al Carro");
        btnAgregarCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCarritoActionPerformed(evt);
            }
        });

        jLabel7.setText(" CARRITO DE COMPRAS ");

        btnLimpTabla.setText("Limpiar tabla");
        btnLimpTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpTablaActionPerformed(evt);
            }
        });

        jLabel9.setText("Cantidad:");

        cantCarrito.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        elimElemenCarrito.setText("Eliminar");
        elimElemenCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elimElemenCarritoActionPerformed(evt);
            }
        });

        lbtotal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        GenerarTicket.setText("Generar Ticket");
        GenerarTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarTicketActionPerformed(evt);
            }
        });

        jLabel10.setText("Total:");

        jLabel8.setText("Cantidad:");

        lbCant.setBackground(new java.awt.Color(204, 255, 255));
        lbCant.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel11.setText("NOMBRE PRODUCTO :");

        LimpiarJlist.setText("Limpiar");
        LimpiarJlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarJlistActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtcodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                    .addComponent(txtnomcancion)
                                    .addComponent(txtnomColeccion))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtnomProduc)
                                    .addComponent(txtvalor)
                                    .addComponent(txtnomInterprete))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnRegis)
                                        .addGap(57, 57, 57)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lbCant, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnLimpTabla))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(115, 115, 115)
                                        .addComponent(rdbtnBusNomCancion)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(rdbtnBusCodigo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBuscar)
                                .addGap(47, 47, 47)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btnCargarInv, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(LimpiarJlist)))
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(btnAgregarCarrito)
                                .addGap(100, 100, 100)
                                .addComponent(jLabel7))
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
                                .addComponent(GenerarTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(278, 278, 278)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCargarInv, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LimpiarJlist)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtnomcancion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(21, 21, 21)
                                .addComponent(txtnomColeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtnomInterprete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(txtnomProduc, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtvalor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRegis)
                            .addComponent(jLabel8)
                            .addComponent(lbCant, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rdbtnBusCodigo)
                                    .addComponent(rdbtnBusNomCancion)
                                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBuscar)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(btnLimpTabla)))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnAgregarCarrito)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9)
                    .addComponent(elimElemenCarrito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cantCarrito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10)
                    .addComponent(lbtotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GenerarTicket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtcodigo, txtnomColeccion, txtnomInterprete, txtnomProduc, txtnomcancion, txtvalor});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void elimElemenCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elimElemenCarritoActionPerformed
        int fila;
        String totalAux;
        fila=this.tablaCarrito.getSelectedRow();
        if(fila>=0){
            totalAux=tablaCarrito.getValueAt(fila, 4).toString();
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

    private void btnRegisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisActionPerformed
        
        objCdmp3.agregaDisco(txtnomInterprete.getText(), txtnomcancion.getText(), txtcodigo.getText(), txtnomProduc.getText(), Double.parseDouble(txtvalor.getText()));

        lista.add(i, objCdmp3.getArrmp3().get(i).getCod() + "  " + objCdmp3.getArrmp3().get(i).getNomCancion());
        i++;

        jList1.setModel(lista);
        lbCant.setText("" + objCdmp3.getCont());
    }//GEN-LAST:event_btnRegisActionPerformed

    private void btnCargarInvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarInvActionPerformed
        // TODO add your handling code here:
       
        for (int k = 0; k < objCdmp3.getArrmp3().size(); k++) {
            
            lista.add(k, objCdmp3.getArrmp3().get(k).getCod()+" "+objCdmp3.getArrmp3().get(k).getNomCancion());
             jList1.setModel(lista);
        }
        
       
        
        
        
    }//GEN-LAST:event_btnCargarInvActionPerformed

    private void LimpiarJlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarJlistActionPerformed
        // TODO add your handling code here:
        
         lista=new DefaultListModel();
        jList1.setModel(lista);
        
    }//GEN-LAST:event_LimpiarJlistActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
         vecAux = new String[5];
        if (rdbtnBusCodigo.isSelected()) {
            objCdmp3.buscar(1, txtBuscar.getText());
            for (int j = 0; j < objCdmp3.getAux().size(); j++) {
                vecAux[0] = objCdmp3.getAux().get(j).getCod();
                vecAux[1] = objCdmp3.getAux().get(j).getNomCancion();
                vecAux[2] = objCdmp3.getAux().get(j).getNomInter();
                vecAux[3] = objCdmp3.getAux().get(j).getNompro();
                vecAux[4] = "" + objCdmp3.getAux().get(j).getPrecio();
                modbuscar.addRow(vecAux);
                tablabuscar.setModel(modbuscar);
            }
            

       }else {
            objCdmp3.buscar(2, txtBuscar.getText());
            for (int j = 0; j < objCdmp3.getAux().size(); j++) {
                vecAux[0] = objCdmp3.getAux().get(j).getCod();
                vecAux[1] = objCdmp3.getAux().get(j).getNomCancion();
                vecAux[2] = objCdmp3.getAux().get(j).getNomInter();
                vecAux[3] = objCdmp3.getAux().get(j).getNompro();
                vecAux[4] = "" + objCdmp3.getAux().get(j).getPrecio();
                modbuscar.addRow(vecAux);
                tablabuscar.setModel(modbuscar);
            }
            
        }

        
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAgregarCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCarritoActionPerformed
        int fs = tablabuscar.getSelectedRow();
        String Cod, NombreCancion, Nominterp, NomProducto, Valor;

        if (fs >= 0) {
            cont++;
            cantCarrito.setText("" + cont);
            Cod = tablabuscar.getValueAt(fs, 0).toString();
            NombreCancion = tablabuscar.getValueAt(fs, 1).toString();
            Nominterp = tablabuscar.getValueAt(fs, 2).toString();
            NomProducto = tablabuscar.getValueAt(fs, 3).toString();
            Valor = tablabuscar.getValueAt(fs, 4).toString();
            total += Double.parseDouble(Valor);
            lbtotal.setText("" + total);
            String felem[] = {Cod, NombreCancion, Nominterp, NomProducto, Valor};
            modCarrito.addRow(felem);
        } else {

            JOptionPane.showMessageDialog(null, " Por favor seleccione el Item que desea de la tabla ");
        }

    }//GEN-LAST:event_btnAgregarCarritoActionPerformed

    private void btnLimpTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpTablaActionPerformed
        
        modbuscar.setColumnCount(5);
        modbuscar.setRowCount(0);
        
                
    }//GEN-LAST:event_btnLimpTablaActionPerformed
       
     int f=0,k=0; 
     String data="";
    public void reporte() {

        for (int f = 0; f < modCarrito.getRowCount(); f++) {
            for (int k = 0; k < modCarrito.getColumnCount(); k++) {
                data += modCarrito.getValueAt(f, k).toString() + "                 ";
            }
            data += "\n";
        }
        JOptionPane.showMessageDialog(null, "Cod*NombreCancion*NomInterprete*NomProducto*Valor\n"
                + "" + data + "\n Total a pagar$:" + lbtotal.getText(), " *FACTURA*", JOptionPane.INFORMATION_MESSAGE);
        data = "";
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
//            java.util.logging.Logger.getLogger(ventanColeccMp3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ventanColeccMp3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ventanColeccMp3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ventanColeccMp3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ventanColeccMp3().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GenerarTicket;
    private javax.swing.ButtonGroup GrupoBuscar;
    private javax.swing.JButton LimpiarJlist;
    private javax.swing.JButton btnAgregarCarrito;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCargarInv;
    private javax.swing.JButton btnLimpTabla;
    private javax.swing.JButton btnRegis;
    private javax.swing.JLabel cantCarrito;
    private javax.swing.JButton elimElemenCarrito;
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
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbCant;
    private javax.swing.JLabel lbtotal;
    private javax.swing.JRadioButton rdbtnBusCodigo;
    private javax.swing.JRadioButton rdbtnBusNomCancion;
    private javax.swing.JTable tablaCarrito;
    private javax.swing.JTable tablabuscar;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtnomColeccion;
    private javax.swing.JTextField txtnomInterprete;
    private javax.swing.JTextField txtnomProduc;
    private javax.swing.JTextField txtnomcancion;
    private javax.swing.JTextField txtvalor;
    // End of variables declaration//GEN-END:variables
}
