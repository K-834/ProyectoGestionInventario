/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista.entrega;

import dao.DaoDatos;
import dao.DaoHistorial;
import dao.impl.DaoImplDatos;
import dao.impl.DaoImplHistorial;
import entidades.Datos;
import entidades.Historial;
import java.awt.Color;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import util.Memoria;

/**
 *
 * @author antho
 */
public class Eliminar extends javax.swing.JFrame {

    private DaoDatos dao;
    private List<Datos> lista;
    private DefaultTableModel model;
    private Datos data;
    private Boolean seleccion;

    private DaoHistorial daoH;
    private Historial dataH;
    DateTimeFormatter formato;
    DateTimeFormatter formato2;

    /**
     * Creates new form EliminarO
     */
    public Eliminar() {
        initComponents();
        dao = new DaoImplDatos();
        data = new Datos();
        model = (DefaultTableModel) tblDatosEliminar.getModel();

        formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        formato2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        daoH = new DaoImplHistorial();
        dataH = new Historial();
        datosSelect();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton3 = new javax.swing.JToggleButton();
        jTextField1 = new javax.swing.JTextField();
        titulo5 = new javax.swing.JLabel();
        lblFecha1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatosEliminar = new javax.swing.JTable();
        btnRecuperar = new javax.swing.JToggleButton();
        btnMenu = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        titulo4 = new javax.swing.JLabel();
        titulo3 = new javax.swing.JLabel();
        titulo2 = new javax.swing.JLabel();
        titulo1 = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        lblProducto = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jlblSelecciontxt = new javax.swing.JLabel();
        titulo6 = new javax.swing.JLabel();
        lblProveedor = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();

        jToggleButton3.setText("jToggleButton1");

        jTextField1.setText("jTextField1");

        titulo5.setBackground(new java.awt.Color(0, 0, 0));
        titulo5.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        titulo5.setText("   Fecha Ingreso");
        titulo5.setAlignmentX(2.0F);
        titulo5.setAlignmentY(2.0F);
        titulo5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));

        lblFecha1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblFecha1.setText("Fecha de Ingreso");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Eliminar Entrega");

        tblDatosEliminar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        tblDatosEliminar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Producto", "Cantidad", "Fecha Ingreso", "Fecha Caducidad", "Ubicación"
            }
        ));
        tblDatosEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDatosEliminarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDatosEliminar);

        btnRecuperar.setBackground(new java.awt.Color(0, 0, 0));
        btnRecuperar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnRecuperar.setForeground(new java.awt.Color(255, 255, 255));
        btnRecuperar.setText("Recuperar");
        btnRecuperar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecuperarActionPerformed(evt);
            }
        });

        btnMenu.setBackground(new java.awt.Color(0, 0, 0));
        btnMenu.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnMenu.setText("Menú");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.gray, null));

        titulo4.setBackground(new java.awt.Color(0, 0, 0));
        titulo4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        titulo4.setText("   Fecha Ingreso");
        titulo4.setAlignmentX(2.0F);
        titulo4.setAlignmentY(2.0F);
        titulo4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));

        titulo3.setBackground(new java.awt.Color(0, 0, 0));
        titulo3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        titulo3.setText("  Cantidad");
        titulo3.setAlignmentX(2.0F);
        titulo3.setAlignmentY(2.0F);
        titulo3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));

        titulo2.setBackground(new java.awt.Color(0, 0, 0));
        titulo2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        titulo2.setText("   Producto");
        titulo2.setAlignmentX(2.0F);
        titulo2.setAlignmentY(2.0F);
        titulo2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));

        titulo1.setBackground(new java.awt.Color(0, 0, 0));
        titulo1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        titulo1.setText("     ID");
        titulo1.setAlignmentX(2.0F);
        titulo1.setAlignmentY(2.0F);
        titulo1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));

        lblID.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblID.setText("ID");

        lblProducto.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblProducto.setText("Producto");
        lblProducto.setName("a"); // NOI18N

        lblCantidad.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblCantidad.setText("Cantidad");

        lblFecha.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblFecha.setText("Fecha de Ingreso");

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel1.setText("Eliminar producto :");

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Seleccionar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(0, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setAlignmentY(0.0F);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jlblSelecciontxt.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jlblSelecciontxt.setText("Seleccionar una Fila");

        titulo6.setBackground(new java.awt.Color(0, 0, 0));
        titulo6.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        titulo6.setText("ID Proveedor");
        titulo6.setAlignmentX(2.0F);
        titulo6.setAlignmentY(2.0F);
        titulo6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));

        lblProveedor.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblProveedor.setText("ID Proveedor");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlblSelecciontxt, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar)
                .addGap(18, 18, 18))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lblProducto)
                                .addGap(19, 19, 19)))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCantidad)
                            .addComponent(titulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFecha)
                            .addComponent(titulo4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titulo6, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lblProveedor)
                                .addGap(24, 24, 24))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(titulo1)
                            .addComponent(titulo2)
                            .addComponent(titulo3)
                            .addComponent(titulo4))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblID)
                            .addComponent(lblProducto)
                            .addComponent(lblCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblFecha)
                            .addComponent(lblProveedor))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(btnEliminar)
                            .addComponent(jlblSelecciontxt))
                        .addGap(17, 17, 17))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(titulo6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        btnActualizar.setBackground(new java.awt.Color(0, 0, 0));
        btnActualizar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(btnMenu)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnActualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRecuperar)
                .addGap(46, 46, 46))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(265, 265, 265))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRecuperar)
                    .addComponent(btnMenu)
                    .addComponent(btnActualizar)
                    .addComponent(jButton2))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRecuperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecuperarActionPerformed
        // TODO add your handling code here:
        Recuperar.main(null);
        this.dispose();
    }//GEN-LAST:event_btnRecuperarActionPerformed

    private void tblDatosEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDatosEliminarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblDatosEliminarMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (seleccion) {

            int opcion = JOptionPane.showConfirmDialog(null, "¿Estás seguro?", "Confirmación", JOptionPane.YES_NO_OPTION);

            if (opcion == JOptionPane.YES_OPTION) {
                int seleccionFila = Integer.parseInt(tblDatosEliminar.getValueAt(tblDatosEliminar.getSelectedRow(), 0).toString());
                data.setIdStock(seleccionFila);
                dao.datosEliminar(data);
                seleccion = false;
                jlblSelecciontxt.setText("Se ha eliminado la fila");
                jlblSelecciontxt.setForeground(Color.BLACK);
                jlblSelecciontxt.getText();
                model.setRowCount(0);
                datosSelect();
                JOptionPane.showMessageDialog(null, "Se ha eliminado Satisfactoriamente",
                        "Información",
                        JOptionPane.INFORMATION_MESSAGE);

                dataH.setIdStock(seleccionFila);
                dataH.setIdUsuario((String) Memoria.get("codigoEmpleado"));
                dataH.setHistorial("ELIMINADO");
                dataH.setFechaCambio(LocalDateTime.now().format(formato2));
                dataH.setDescripcion("");
                daoH.userInsertar(dataH);

            } else {

            }

        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila",
                    "Información",
                    JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            lblID.setText(model.getValueAt(tblDatosEliminar.getSelectedRow(), 0).toString());
            lblProducto.setText(model.getValueAt(tblDatosEliminar.getSelectedRow(), 1).toString());
            lblCantidad.setText(model.getValueAt(tblDatosEliminar.getSelectedRow(), 2).toString());
            lblFecha.setText(model.getValueAt(tblDatosEliminar.getSelectedRow(), 3).toString());
            lblProveedor.setText(model.getValueAt(tblDatosEliminar.getSelectedRow(), 6).toString());
            
            seleccion = true;
            jlblSelecciontxt.setText("Se ha seleccionado una fila");
            jlblSelecciontxt.setForeground(Color.BLACK);
            jlblSelecciontxt.getText();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila en tabla",
                    "Información",
                    JOptionPane.INFORMATION_MESSAGE);
            jlblSelecciontxt.setText("No se ha seleccionado ninguna fila");
            jlblSelecciontxt.setForeground(Color.RED);
            jlblSelecciontxt.getText();

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        // TODO add your handling code here:
        //   vistaMenu();
        this.dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_btnActualizarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        //   vistaAñadir();
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Eliminar vista = new Eliminar();
                vista.setLocationRelativeTo(null);
                vista.setVisible(true);
            }
        });
    }

    private void datosSelect() {
        lista = dao.datosSelect();
        model.setRowCount(0);
        for (Datos dat : lista) {
            Object[] objeto = new Object[7];
            objeto[0] = dat.getIdStock();
            objeto[1] = dat.getCodProducto();
            objeto[2] = dat.getCantidad();
            objeto[3] = dat.getFechaIngreso();
            objeto[4] = dat.getFechaCaducidad();
            objeto[5] = dat.getUbicacion();
            objeto[6] = dat.getIdProveedor();
            model.addRow(objeto);
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JToggleButton btnMenu;
    private javax.swing.JToggleButton btnRecuperar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JLabel jlblSelecciontxt;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblFecha1;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblProducto;
    private javax.swing.JLabel lblProveedor;
    private javax.swing.JTable tblDatosEliminar;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo2;
    private javax.swing.JLabel titulo3;
    private javax.swing.JLabel titulo4;
    private javax.swing.JLabel titulo5;
    private javax.swing.JLabel titulo6;
    // End of variables declaration//GEN-END:variables
}
