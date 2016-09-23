/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.graphic.forms.shapes;

import ec.edu.espe.math.conversion.Conversion;
import ec.edu.espe.math.geometry.shapes.quadrilaterals.Quadrilateral;
import ec.edu.espe.math.geometry.shapes.quadrilaterals.Rectangle;
import ec.edu.espe.math.geometry.shapes.quadrilaterals.Rhombus;
import ec.edu.espe.math.geometry.shapes.quadrilaterals.Romboide;
import ec.edu.espe.math.geometry.shapes.quadrilaterals.Square;
import ec.edu.espe.math.graphic.forms.text.ShapesCatalog;
import ec.edu.espe.math.graphic.utils.PrinterUtil;
import ec.edu.espe.util.UnitConstants;
import javax.swing.JOptionPane;

/**
 *
 * @author SONY
 */
public class ShapeQuadrilateral extends javax.swing.JFrame {

    /**
     * Creates new form ShapeCircular
     */
    public ShapeQuadrilateral() {
        initComponents();

        shapeSelection.addItem(ShapesCatalog.RECTANGLE);
        shapeSelection.addItem(ShapesCatalog.SQUARE);
        shapeSelection.addItem(ShapesCatalog.ROMBOIDE);
        shapeSelection.addItem(ShapesCatalog.RHOMBUS);
        shapeSelection.addItem(ShapesCatalog.PARALLELOGRAM);
        
        
        unitIn.addItem(UnitConstants.MM);
        unitIn.addItem(UnitConstants.CM);
        unitIn.addItem(UnitConstants.DM);
        unitIn.addItem(UnitConstants.M);
        unitIn.addItem(UnitConstants.DAM);
        unitIn.addItem(UnitConstants.HM);
        unitIn.addItem(UnitConstants.KM);

        unitOut.addItem(UnitConstants.MM);
        unitOut.addItem(UnitConstants.CM);
        unitOut.addItem(UnitConstants.DM);
        unitOut.addItem(UnitConstants.M);
        unitOut.addItem(UnitConstants.DAM);
        unitOut.addItem(UnitConstants.HM);
        unitOut.addItem(UnitConstants.KM);
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
        shapeSelection = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtLado1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtLado2 = new javax.swing.JTextField();
        txtLado3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        unitIn = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPerimeter = new javax.swing.JTextField();
        txtArea = new javax.swing.JTextField();
        unitOut = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnCalcular = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 0, 36)); // NOI18N
        jLabel1.setText("Quadrilateral");

        shapeSelection.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        shapeSelection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shapeSelectionActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        jLabel2.setText("Side 1");

        jLabel5.setText("Side 2");

        jLabel6.setText("Height");

        unitIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unitInActionPerformed(evt);
            }
        });

        jLabel7.setText("Units");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(31, 31, 31)
                        .addComponent(txtLado2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(31, 31, 31)
                        .addComponent(txtLado1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGap(31, 31, 31)
                        .addComponent(txtLado3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(unitIn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtLado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtLado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtLado3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unitIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(103, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(102, 204, 255));

        jLabel3.setText("Perimeter");

        jLabel4.setText("Area");

        unitOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unitOutActionPerformed(evt);
            }
        });

        jLabel8.setText("Units");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(unitOut, 0, 60, Short.MAX_VALUE)
                    .addComponent(txtArea)
                    .addComponent(txtPerimeter))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPerimeter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unitOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(102, 204, 255));

        btnCalcular.setText("CALCULAR");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        jButton2.setText("ATRAS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnCalcular)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(shapeSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(shapeSelection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void shapeSelectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shapeSelectionActionPerformed
        
        if (shapeSelection.getSelectedItem().equals(ShapesCatalog.SQUARE)||shapeSelection.getSelectedItem().equals(ShapesCatalog.PARALLELOGRAM)) {
            txtLado2.setEnabled(false);
            txtLado3.setEnabled(false);
            PrinterUtil.setLabels(jLabel2, jLabel5, jLabel6, "Side 1", "Side 2", "      ");
        } else if (shapeSelection.getSelectedItem().equals(ShapesCatalog.RECTANGLE)) {
            txtLado2.setEnabled(true);
            txtLado3.setEnabled(false);
            PrinterUtil.setLabels(jLabel2, jLabel5, jLabel6, "Base", "Height", "      ");
        } else if (shapeSelection.getSelectedItem().equals(ShapesCatalog.RHOMBUS)) {
            txtLado2.setEnabled(true);
            txtLado3.setEnabled(false);
            PrinterUtil.setLabels(jLabel2, jLabel5, jLabel6, "Diagonal 1", "Diagonal 2", "      ");
        } else if (shapeSelection.getSelectedItem().equals(ShapesCatalog.ROMBOIDE)) {
            txtLado2.setEnabled(true);
            txtLado3.setEnabled(true);
            PrinterUtil.setLabels(jLabel2, jLabel5, jLabel6, "Diagonal 1", "Diagonal 2", "Height");
        }
    }//GEN-LAST:event_shapeSelectionActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        
        try{
            Quadrilateral quadri=null;
            Conversion conv=new Conversion();

            if(shapeSelection.getSelectedItem().equals(ShapesCatalog.SQUARE)){
                quadri=new Square(Float.parseFloat(txtLado1.getText()));
            }
            else if(shapeSelection.getSelectedItem().equals(ShapesCatalog.RECTANGLE)){
                quadri=new Rectangle(Float.parseFloat(txtLado1.getText()),Float.parseFloat(txtLado2.getText()));
            }
            else if(shapeSelection.getSelectedItem().equals(ShapesCatalog.RHOMBUS)){
                quadri=new Rhombus(Float.parseFloat(txtLado1.getText()),Float.parseFloat(txtLado2.getText()));
            }
            else if(shapeSelection.getSelectedItem().equals(ShapesCatalog.ROMBOIDE)){
                quadri=new Romboide(Float.parseFloat(txtLado1.getText()),Float.parseFloat(txtLado2.getText()),Float.parseFloat(txtLado3.getText()));
            }
            ec.edu.espe.math.graphic.utils.PrinterUtil.printResults(txtArea, txtPerimeter, conv.convertSquare(quadri.area(),unitIn.getSelectedItem().toString(),unitOut.getSelectedItem().toString()), conv.convert(quadri.perimeter(),unitIn.getSelectedItem().toString(),unitOut.getSelectedItem().toString()));

        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "INGRESE DATOS VALIDOS");

        }
        
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        MenuShape menuShape=new MenuShape();
        menuShape.setLocationRelativeTo(this);
        menuShape.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void unitInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unitInActionPerformed
        // lblUnits.setText(unitIn.getSelectedItem().toString());
    }//GEN-LAST:event_unitInActionPerformed

    private void unitOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unitOutActionPerformed
        // Conversion conv= new Conversion();
        //  conv.convert(Float.parseFloat(txtPerimeter.getText()), , unit2)
    }//GEN-LAST:event_unitOutActionPerformed

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
            java.util.logging.Logger.getLogger(ShapeQuadrilateral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShapeQuadrilateral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShapeQuadrilateral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShapeQuadrilateral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShapeQuadrilateral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JComboBox<String> shapeSelection;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtLado1;
    private javax.swing.JTextField txtLado2;
    private javax.swing.JTextField txtLado3;
    private javax.swing.JTextField txtPerimeter;
    private javax.swing.JComboBox<String> unitIn;
    private javax.swing.JComboBox<String> unitOut;
    // End of variables declaration//GEN-END:variables
}
