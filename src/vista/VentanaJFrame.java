/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.AdminBD;


/**
 *
 * @author Jhon Nash
 */
public class VentanaJFrame extends JFrame {
    AdminBD adminBD;
    JTable tabla;
    DefaultTableModel m;
    double total;
    
    /**
     * Creates new form VentanaJFrame
     */
    public VentanaJFrame() {
        initComponents();
        desplegarCatalogo();
        
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanelAsignaPeli = new javax.swing.JPanel();
        jButtonAgregarEstreno = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldAnadirCompra = new javax.swing.JTextField();
        btnAnadir = new javax.swing.JButton();
        jbtnEliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCompra = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jblTotal = new javax.swing.JLabel();
        jtxtTotal = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelAsignaPeli.setBackground(new java.awt.Color(0, 0, 0));

        jButtonAgregarEstreno.setBackground(new java.awt.Color(255, 255, 255));
        jButtonAgregarEstreno.setText("Agregar Estreno");
        jButtonAgregarEstreno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarEstrenoActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualiza Catalogo");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAsignaPeliLayout = new javax.swing.GroupLayout(jPanelAsignaPeli);
        jPanelAsignaPeli.setLayout(jPanelAsignaPeliLayout);
        jPanelAsignaPeliLayout.setHorizontalGroup(
            jPanelAsignaPeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAsignaPeliLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jButtonAgregarEstreno)
                .addGap(135, 135, 135)
                .addComponent(btnActualizar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelAsignaPeliLayout.setVerticalGroup(
            jPanelAsignaPeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAsignaPeliLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanelAsignaPeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAgregarEstreno)
                    .addComponent(btnActualizar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setText("Cantidad");

        btnAnadir.setText("Añadir");
        btnAnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirActionPerformed(evt);
            }
        });

        jbtnEliminar.setText("Eliminar");
        jbtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldAnadirCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAnadir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnEliminar)
                .addGap(169, 169, 169))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldAnadirCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAnadir)
                    .addComponent(jbtnEliminar))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jTableCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane2.setViewportView(jTableCompra);

        jblTotal.setText("Total");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblTotal)
                    .addComponent(jtxtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelAsignaPeli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelAsignaPeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAgregarEstrenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarEstrenoActionPerformed
        InfoPelicula estrenos = new InfoPelicula();
        estrenos.setVisible(true);   
    }//GEN-LAST:event_jButtonAgregarEstrenoActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        desplegarCatalogo();    
    }//GEN-LAST:event_btnActualizarActionPerformed
//funcion cuando das clik en la tabla
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnAnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadirActionPerformed
        int filaSelect = jTable1.getSelectedRow();  
        try{
            String codigo,nombre,precio, subtotal,unidades;
            double x, y,subTotal=0.0;
            int cantidad=0;
            
            if(filaSelect==-1){
                JOptionPane.showMessageDialog(null, "Seleccione Pelicula", "Advertencia", JOptionPane.WARNING_MESSAGE);
                
            }else{
               
                m=(DefaultTableModel)jTable1.getModel();
                codigo = jTable1.getValueAt(filaSelect,0).toString();
                nombre = jTable1.getValueAt(filaSelect,1).toString();
                precio = jTable1.getValueAt(filaSelect,4).toString();
                
                unidades =this.jTextFieldAnadirCompra.getText();
                int u= Integer.parseInt(unidades);
                if(u<=0){
                    JOptionPane.showMessageDialog(null, "Capture cantidad mayor a 1", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }else{
                    /*Calculamos el subtotal de la compra*/
                    x= Double.parseDouble(precio);
                    cantidad= Integer.parseInt(unidades);
                    subTotal= x*cantidad;
                    
                    subtotal= String.valueOf(subTotal);/*regresamos a cadena el subtotal*/
                    m=(DefaultTableModel)jTableCompra.getModel();
                    m.setColumnIdentifiers(new Object[]{"CODIGO","NOMBRE","PRECIO","CANTIDAD","SUBTOTAL"});
                    String elementosFila[] = {codigo, nombre, precio, unidades,subtotal};
                    m.addRow(elementosFila);
                    /*codigo para calcular total*/
                    this.total= total+subTotal;
                    this.jtxtTotal.setText(String.valueOf(total));
                }
            }
        }catch(HeadlessException| NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Verificar Seleccion del Producto", "error", JOptionPane.ERROR_MESSAGE);
	}
        
        
    }//GEN-LAST:event_btnAnadirActionPerformed

    private void jbtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarActionPerformed
        int filaSelect;
        int resp;
        double subtotal=0.0;
        int fil;
        try{
            filaSelect= jTableCompra.getSelectedRow();
            if(filaSelect==-1){
                JOptionPane.showMessageDialog(null, "Seleccione Pelicula", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }else{
                resp =JOptionPane.showConfirmDialog(null, "Estas seguro de eliminar de carrito", "Eliminar", JOptionPane.YES_NO_OPTION);
                if(resp == JOptionPane.YES_OPTION){
                    /*Codigo para restar subtotal a total*/
                    subtotal = Double.parseDouble(jTableCompra.getValueAt(filaSelect,4).toString());
                    this.total = total - subtotal;
                    
                    /*Codigo para eliminar Fila*/
                    this.jtxtTotal.setText(String.valueOf(total));
                     m=(DefaultTableModel)jTableCompra.getModel();
                     m.removeRow(filaSelect);
                }
            
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se Elimino Pelicula", "Error", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_jbtnEliminarActionPerformed
    public void desplegarCatalogo(){
        adminBD = new AdminBD();
        DefaultTableModel catalogos = new DefaultTableModel();
        catalogos = adminBD.consultaPelicula();
        jTable1.setModel(catalogos); 
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAnadir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAgregarEstreno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelAsignaPeli;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableCompra;
    private javax.swing.JTextField jTextFieldAnadirCompra;
    private javax.swing.JLabel jblTotal;
    private javax.swing.JButton jbtnEliminar;
    private javax.swing.JTextField jtxtTotal;
    // End of variables declaration//GEN-END:variables
}
