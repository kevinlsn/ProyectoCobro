/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.dilemma.cerveza;

import java.text.DecimalFormat;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kevinlsn
 */
public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
                
        //CAMBIAR TAMAÑO DE COLUMNAS EN LA TABLA
        tablaProducts.getColumnModel().getColumn(0).setPreferredWidth(30);
        tablaProducts.getColumnModel().getColumn(1).setPreferredWidth(200);
        tablaProducts.getColumnModel().getColumn(2).setPreferredWidth(100);
        
    }

    public void addTable(int ID, String PRODUCTO, int CANTIDAD, Double PRECIO){
        DefaultTableModel dt = (DefaultTableModel) tablaProducts.getModel();
        
        // Se crea en el precio la formula de cantidad por valor en decimal
        DecimalFormat df = new DecimalFormat("00.00"); //Convierte el valor del label en decimal
        double totPrice = PRECIO * Double.valueOf(CANTIDAD); // Formula para obtener el resultado total de los productos seleccionados
        String totalPrice = df.format(totPrice);
        
        //FOR QUE SIRVE PARA ACTUALIZAR EL NUMERO DE CERVEZAS
        for(int row = 0; row < tablaProducts.getRowCount(); row++){
            if(PRODUCTO == tablaProducts.getValueAt(row, 1)){
                dt.removeRow(tablaProducts.convertRowIndexToModel(row));
                }            
            }
        
        Vector v = new Vector();
        //SE CREAN LOS VECTORES POR CADA CAMPO DE LA TABLA
        v.add(ID);
        v.add(PRODUCTO);
        v.add(CANTIDAD);
        v.add(totalPrice);
        
        //SE CREA EL AGREGAR COLUMNAS A LA TABLA
        dt.addRow(v);
    }
    
    public void cal(){
    //Crea la suma del total de los valores de precio de la tabla
    int numOfRow = tablaProducts.getRowCount(); //Toma el valor de la tabla para crear variable
    double tot = 0.0; //Variable
    
        for(int i = 0; i < numOfRow; i++){
            double value = Double.valueOf(tablaProducts.getValueAt(i,3).toString());
            tot += value;
        }
        //Actualiza el label del total
        DecimalFormat df = new DecimalFormat("00.00");
        labelTotal.setText(df.format(tot));
    }
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelProducto = new javax.swing.JPanel();
        labelXX = new javax.swing.JLabel();
        labelTecate = new javax.swing.JLabel();
        labelUltra = new javax.swing.JLabel();
        labelIndio = new javax.swing.JLabel();
        labelCoca = new javax.swing.JLabel();
        labelCiel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        buttonXX = new com.dilemma.cerveza.ButtonEdit();
        buttonTecate = new com.dilemma.cerveza.ButtonEdit();
        buttonUltra = new com.dilemma.cerveza.ButtonEdit();
        buttonIndio = new com.dilemma.cerveza.ButtonEdit();
        buttonCiel = new com.dilemma.cerveza.ButtonEdit();
        buttonCoca = new com.dilemma.cerveza.ButtonEdit();
        panelTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProducts = new javax.swing.JTable();
        buttonDelete = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelCambio = new javax.swing.JLabel();
        labelTotal = new javax.swing.JLabel();
        textPago = new javax.swing.JTextField();
        buttonPay = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        panelRecibo = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        panelProducto.setBackground(new java.awt.Color(0, 143, 255));

        labelXX.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelXX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelXX.setText("0");

        labelTecate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelTecate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTecate.setText("0");

        labelUltra.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelUltra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelUltra.setText("0");

        labelIndio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelIndio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIndio.setText("0");

        labelCoca.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelCoca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCoca.setText("0");

        labelCiel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelCiel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCiel.setText("0");

        jPanel2.setBackground(new java.awt.Color(0, 36, 255));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DILEMMA");

        jLabel5.setFont(new java.awt.Font("Rage Italic", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("BEER");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buttonXX.setBorder(null);
        buttonXX.setText("XX LAGER");
        buttonXX.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        buttonXX.setRadius(200);
        buttonXX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonXXActionPerformed(evt);
            }
        });

        buttonTecate.setBorder(null);
        buttonTecate.setText("TECATE LIGHT");
        buttonTecate.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        buttonTecate.setRadius(200);
        buttonTecate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTecateActionPerformed(evt);
            }
        });

        buttonUltra.setBorder(null);
        buttonUltra.setText("AMSTEL ULTRA");
        buttonUltra.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        buttonUltra.setRadius(200);
        buttonUltra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUltraActionPerformed(evt);
            }
        });

        buttonIndio.setBorder(null);
        buttonIndio.setText("INDIO");
        buttonIndio.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        buttonIndio.setRadius(200);
        buttonIndio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIndioActionPerformed(evt);
            }
        });

        buttonCiel.setBorder(null);
        buttonCiel.setText("AGUA CIEL");
        buttonCiel.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        buttonCiel.setRadius(200);
        buttonCiel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCielActionPerformed(evt);
            }
        });

        buttonCoca.setBorder(null);
        buttonCoca.setText("COCA COLA");
        buttonCoca.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        buttonCoca.setRadius(200);
        buttonCoca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCocaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelProductoLayout = new javax.swing.GroupLayout(panelProducto);
        panelProducto.setLayout(panelProductoLayout);
        panelProductoLayout.setHorizontalGroup(
            panelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelProductoLayout.createSequentialGroup()
                        .addComponent(buttonUltra, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelIndio, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonCiel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelCiel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelProductoLayout.createSequentialGroup()
                        .addComponent(buttonXX, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelXX, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(buttonTecate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelTecate, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonIndio, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCoca, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelUltra, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCoca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 31, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelProductoLayout.setVerticalGroup(
            panelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductoLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelProductoLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(panelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonXX, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonTecate, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonIndio, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(labelXX)
                    .addGroup(panelProductoLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(labelTecate))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProductoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelUltra)
                        .addGap(82, 82, 82)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buttonUltra, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonCiel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonCoca, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelIndio)
                    .addGroup(panelProductoLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(labelCoca))
                    .addGroup(panelProductoLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(labelCiel)))
                .addGap(99, 99, 99))
        );

        panelTable.setBackground(new java.awt.Color(255, 255, 255));

        tablaProducts.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tablaProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "PRODUCTO", "CANTIDAD", "PRECIO"
            }
        ));
        jScrollPane1.setViewportView(tablaProducts);

        buttonDelete.setText("ELIMINAR");
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("TOTAL:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("PAGO:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("CAMBIO:");

        labelCambio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelCambio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelCambio.setText("00");

        labelTotal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelTotal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelTotal.setText("00");

        textPago.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        buttonPay.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonPay.setText("PAGAR");
        buttonPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textPago, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(buttonPay, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(labelTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textPago, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(labelCambio))
                .addGap(18, 18, 18)
                .addComponent(buttonPay, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelTableLayout = new javax.swing.GroupLayout(panelTable);
        panelTable.setLayout(panelTableLayout);
        panelTableLayout.setHorizontalGroup(
            panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(panelTableLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelTableLayout.setVerticalGroup(
            panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelRecibo.setColumns(20);
        panelRecibo.setRows(5);
        jScrollPane2.setViewportView(panelRecibo);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTable, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        //Eliminar cualquier producto
        DefaultTableModel dt = (DefaultTableModel) tablaProducts.getModel(); //Tomar valores de tabla
        String r = dt.getValueAt(tablaProducts.getSelectedRow(), 0).toString();
        
        int rw = tablaProducts.getSelectedRow(); //Toma el valor seleccionado
        dt.removeRow(rw); //Elimina el valor seleccionado
        
        // Se cambiara el valor del label debajo del boton del producto por 0
        switch(r){
            case "1":
                labelXX.setText("0");
                break;
            case "2":
                labelTecate.setText("0");
                break;
            case "3":
                labelUltra.setText("0");
                break;
            case "4":
                labelIndio.setText("0");
                break;
            case "5":
                labelCoca.setText("0");
                break;
            case "6":
                labelCiel.setText("0");
                break;
                
            default:
                System.out.println("Over");
        }
    }//GEN-LAST:event_buttonDeleteActionPerformed

    private void buttonPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPayActionPerformed
        //Boton para pagar
        double tot = Double.valueOf(labelTotal.getText()); //Toma el valor de Total
        double pago = Double.valueOf(textPago.getText()); // Toma el valor del pago
        double cambio = pago - tot; // Formula para obtener el cambio
        
        
        DecimalFormat dc = new DecimalFormat("00.00"); //Convierte el valor del label en decimal
        
        labelCambio.setText(String.valueOf(dc.format(cambio))); //El label toma el valor de la formula
        
        // Impresion cuenta
        
         //Boton Imprimir
        try{
            // INFORMACION
            panelRecibo.setText("                                CERVECERIA DILEMMA \n");
            panelRecibo.setText(panelRecibo.getText() + "                                ESTADIO CENTENARIO \n");
            panelRecibo.setText(panelRecibo.getText() + "                            VILLAHERMOSA, TABASCO \n");
            panelRecibo.setText(panelRecibo.getText() + "                                   +52 (247) 1308720 \n");
            panelRecibo.setText(panelRecibo.getText() + "                         \n");
            panelRecibo.setText(panelRecibo.getText() + "--------------------------------------------------------------------------\n");
            panelRecibo.setText(panelRecibo.getText() + "                         \n");
            panelRecibo.setText(panelRecibo.getText() + " PRODUCTO\t CANTIDAD \tPRECIO" + "\n");
            panelRecibo.setText(panelRecibo.getText() + "--------------------------------------------------------------------------\n");
            
            
            //PEDIDO
            DefaultTableModel df = (DefaultTableModel) tablaProducts.getModel(); //Tomar los valores de la tabla
            
            //Tomar los detalles del pedido
            for(int i = 0; i < tablaProducts.getRowCount(); i++){
                String Producto = df.getValueAt(i, 1).toString(); //Toma los valores de la row de Productos
                String Cantidad = df.getValueAt(i, 2).toString(); //Toma los valores de la row de Cantidad
                String Precio = df.getValueAt(i, 3).toString(); //Toma los valores de la row de Precio
                
                panelRecibo.setText(panelRecibo.getText() +"  "+Producto +"\t         "+ Cantidad +"\t"+ Precio + "\n");
            }
            
            //Pago Cuenta
            panelRecibo.setText(panelRecibo.getText() + "                         \n");
            panelRecibo.setText(panelRecibo.getText() + "--------------------------------------------------------------------------\n");
            panelRecibo.setText(panelRecibo.getText() + "   SubTotal: " + labelTotal.getText() + "\n");
            panelRecibo.setText(panelRecibo.getText() + "   Pago       : " + textPago.getText() + "\n");
            panelRecibo.setText(panelRecibo.getText() + "   Cambio  : " + labelCambio.getText() + "\n");
            panelRecibo.setText(panelRecibo.getText() + "                         \n");
            panelRecibo.setText(panelRecibo.getText() + "                         \n");
            panelRecibo.setText(panelRecibo.getText() + "--------------------------------------------------------------------------\n");
            panelRecibo.setText(panelRecibo.getText() + "                        GRACIAS POR SU PREFERENCIA \n");
            panelRecibo.setText(panelRecibo.getText() + "--------------------------------------------------------------------------\n");
            panelRecibo.setText(panelRecibo.getText() + "                         \n");
            panelRecibo.setText(panelRecibo.getText() + "                         \n");
            panelRecibo.setText(panelRecibo.getText() + "DILEMMA SOFTWARE \n");
            
            panelRecibo.print(); //Imprime
            
        }catch(Exception e){
            System.out.println(e);
        }
        
    }//GEN-LAST:event_buttonPayActionPerformed

    private void buttonIndioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIndioActionPerformed
        // SE CREA LA ACCION: ABAJO DEL BOTON ACTUALIZA EL NUMERO DE PRODUCTOS EN TOTAL QUE SE AGREGARON A LA TABLA
        int i = Integer.valueOf(labelIndio.getText()); //Se obtiene el valor actual
        ++i; //Se suma el valor
        labelIndio.setText(String.valueOf(i)); //Se actualiza el valor actual

        //Se crea la acción: Dar click y crea columna en la tabla
        addTable(4, "Indio       ", i, 90.0);

        //Llama la funcion Cal
        cal();
    }//GEN-LAST:event_buttonIndioActionPerformed

    private void buttonUltraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUltraActionPerformed
        // SE CREA LA ACCION: ABAJO DEL BOTON ACTUALIZA EL NUMERO DE PRODUCTOS EN TOTAL QUE SE AGREGARON A LA TABLA
        int i = Integer.valueOf(labelUltra.getText()); //Se obtiene el valor actual
        ++i; //Se suma el valor
        labelUltra.setText(String.valueOf(i)); //Se actualiza el valor actual

        //Se crea la acción: Dar click y crea columna en la tabla
        addTable(3, "Amstel Ultra", i, 90.0);

        //Llama la funcion Cal
        cal();
    }//GEN-LAST:event_buttonUltraActionPerformed

    private void buttonTecateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTecateActionPerformed
        // SE CREA LA ACCION: ABAJO DEL BOTON ACTUALIZA EL NUMERO DE PRODUCTOS EN TOTAL QUE SE AGREGARON A LA TABLA
        int i = Integer.valueOf(labelTecate.getText()); //Se obtiene el valor actual
        ++i; //Se suma el valor
        labelTecate.setText(String.valueOf(i)); //Se actualiza el valor actual

        //Se crea la acción: Dar click y crea columna en la tabla
        addTable(2, "Tecate Light", i, 90.0);

        //Llama la funcion Cal
        cal();
    }//GEN-LAST:event_buttonTecateActionPerformed

    private void buttonXXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonXXActionPerformed
        // SE CREA LA ACCION: ABAJO DEL BOTON ACTUALIZA EL NUMERO DE PRODUCTOS EN TOTAL QUE SE AGREGARON A LA TABLA
        int i = Integer.valueOf(labelXX.getText()); //Se obtiene el valor actual
        ++i; //Se suma el valor
        labelXX.setText(String.valueOf(i)); //Se actualiza el valor actual

        //Se crea la acción: Dar click y crea columna en la tabla
        addTable(1, "XX Lager    ", i, 90.0);

        //Llama la funcion Cal
        cal();
    }//GEN-LAST:event_buttonXXActionPerformed

    private void buttonCielActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCielActionPerformed
        // SE CREA LA ACCION: ABAJO DEL BOTON ACTUALIZA EL NUMERO DE PRODUCTOS EN TOTAL QUE SE AGREGARON A LA TABLA
        int i = Integer.valueOf(labelCiel.getText()); //Se obtiene el valor actual
        ++i; //Se suma el valor
        labelCiel.setText(String.valueOf(i)); //Se actualiza el valor actual

        //Se crea la acción: Dar click y crea columna en la tabla
        addTable(6, "Agua Ciel   ", i, 30.0);

        //Llama la funcion Cal
        cal();
    }//GEN-LAST:event_buttonCielActionPerformed

    private void buttonCocaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCocaActionPerformed
        // SE CREA LA ACCION: ABAJO DEL BOTON ACTUALIZA EL NUMERO DE PRODUCTOS EN TOTAL QUE SE AGREGARON A LA TABLA
        int i = Integer.valueOf(labelCoca.getText()); //Se obtiene el valor actual
        ++i; //Se suma el valor
        labelCoca.setText(String.valueOf(i)); //Se actualiza el valor actual

        //Se crea la acción: Dar click y crea columna en la tabla
        addTable(5, "Coca - Cola ", i, 40.0);

        //Llama la funcion Cal
        cal();
    }//GEN-LAST:event_buttonCocaActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.dilemma.cerveza.ButtonEdit buttonCiel;
    private com.dilemma.cerveza.ButtonEdit buttonCoca;
    private javax.swing.JButton buttonDelete;
    private com.dilemma.cerveza.ButtonEdit buttonIndio;
    private javax.swing.JButton buttonPay;
    private com.dilemma.cerveza.ButtonEdit buttonTecate;
    private com.dilemma.cerveza.ButtonEdit buttonUltra;
    private com.dilemma.cerveza.ButtonEdit buttonXX;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelCambio;
    private javax.swing.JLabel labelCiel;
    private javax.swing.JLabel labelCoca;
    private javax.swing.JLabel labelIndio;
    private javax.swing.JLabel labelTecate;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JLabel labelUltra;
    private javax.swing.JLabel labelXX;
    private javax.swing.JPanel panelProducto;
    private javax.swing.JTextArea panelRecibo;
    private javax.swing.JPanel panelTable;
    private javax.swing.JTable tablaProducts;
    private javax.swing.JTextField textPago;
    // End of variables declaration//GEN-END:variables
}
