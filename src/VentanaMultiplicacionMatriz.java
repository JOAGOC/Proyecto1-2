
import static javax.swing.JOptionPane.showMessageDialog;

import java.awt.event.WindowEvent;

import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Angel
 */
public class VentanaMultiplicacionMatriz extends javax.swing.JFrame {

    /**
     * Creates new form VentanaMultiplicacionMatriz
     */
    public static VentanaMultiplicacionMatriz getInstance() {
        if (instance == null) {
            instance = new VentanaMultiplicacionMatriz();
        }
        return instance;
    }

    private VentanaMultiplicacionMatriz() {
        initComponents();
        m1 = (DefaultTableModel) tblMatriz.getModel();
        m2 = (DefaultTableModel) tblMatriz1.getModel();
        mR = (DefaultTableModel) tblMatriz2.getModel();
        addWindowListener(VentanaPrincipal.escuchaHijo);
        collection = new XYSeriesCollection();
        jfc = ChartFactory.createXYLineChart("Coste de algoritmo", "Iteración", "Tiempo", collection,
                PlotOrientation.VERTICAL, true, false, false);
        series1 = new XYSeries("Multiplicación de matrices (Polinomial (N^3))");
        collection.addSeries(series1);
        series2 = new XYSeries("LLenar Matriz A(Cuadrática (N^2))");
        collection.addSeries(series2);
        series3 = new XYSeries("LLenar Matriz B(Cuadrática (N^2))");
        collection.addSeries(series3);
        ChartPanel oPanel = new ChartPanel(jfc);
        panelG.setLayout(new java.awt.BorderLayout());
        panelG.add(oPanel);
        panelG.validate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtRen0 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCol0 = new javax.swing.JTextField();
        btnCrearM1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMatriz = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtRen1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCol1 = new javax.swing.JTextField();
        btnCrearM2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMatriz1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblMatriz2 = new javax.swing.JTable();
        btnMultiplicar = new javax.swing.JButton();
        panelG = new javax.swing.JPanel();
        lblTiempo = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(680, 760));
        setPreferredSize(new java.awt.Dimension(680, 760));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel3.setLayout(new java.awt.GridBagLayout());

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Tamaño");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel1.add(jLabel1, gridBagConstraints);

        txtRen0.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel1.add(txtRen0, gridBagConstraints);

        jLabel2.setText("X");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel1.add(jLabel2, gridBagConstraints);

        txtCol0.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel1.add(txtCol0, gridBagConstraints);

        btnCrearM1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCrearM1.setText("Crear");
        btnCrearM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearM1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel1.add(btnCrearM1, gridBagConstraints);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(60, 60));

        tblMatriz.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblMatriz.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblMatriz.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(tblMatriz);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 100;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel1.add(jScrollPane1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 30);
        jPanel3.add(jPanel1, gridBagConstraints);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel3.setText("Tamaño");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel2.add(jLabel3, gridBagConstraints);

        txtRen1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel2.add(txtRen1, gridBagConstraints);

        jLabel4.setText("X");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel2.add(jLabel4, gridBagConstraints);

        txtCol1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel2.add(txtCol1, gridBagConstraints);

        btnCrearM2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCrearM2.setText("Crear");
        btnCrearM2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearM2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel2.add(btnCrearM2, gridBagConstraints);

        jScrollPane2.setPreferredSize(new java.awt.Dimension(60, 60));

        tblMatriz1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblMatriz1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblMatriz1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane2.setViewportView(tblMatriz1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 100;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel2.add(jScrollPane2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.5;
        jPanel3.add(jPanel2, gridBagConstraints);

        jScrollPane3.setPreferredSize(new java.awt.Dimension(60, 60));

        tblMatriz2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblMatriz2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblMatriz2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane3.setViewportView(tblMatriz2);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 100;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        jPanel3.add(jScrollPane3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 20);
        getContentPane().add(jPanel3, gridBagConstraints);

        btnMultiplicar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnMultiplicar.setText("Multiplicar");
        btnMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.001;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 0);
        getContentPane().add(btnMultiplicar, gridBagConstraints);

        panelG.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 300;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 10, 20);
        getContentPane().add(panelG, gridBagConstraints);

        lblTiempo.setText("Tiempo de ejecución:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.001;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 20);
        getContentPane().add(lblTiempo, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearM1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnCrearM1ActionPerformed
        a = crearMatriz(txtRen0, txtCol0, m1);
        graficar(a);
    }// GEN-LAST:event_btnCrearM1ActionPerformed

    private void btnCrearM2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnCrearM2ActionPerformed
        b = crearMatriz(txtRen1, txtCol1, m2);
        graficar(b);
    }// GEN-LAST:event_btnCrearM2ActionPerformed

    private MatrizEntero crearMatriz(javax.swing.JTextField txtRen, javax.swing.JTextField txtCol,
            DefaultTableModel m) {
        MatrizEntero b = null;
        try {
            b = new MatrizEntero(Integer.parseInt(txtRen.getText()), Integer.parseInt(txtCol.getText()));
            txtRen.setText("");
            txtCol.setText("");
            b.inicializar();
            llenarTabla(m, b);
        } catch (Exception e) {
            showMessageDialog(this, "Inserta una dimensión válida para la matriz");
        }
        return b;
    }

    private void btnMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnMultiplicarActionPerformed
        try {
            if (a.getCol() != b.getRen()) {
                throw new Exception(
                        "No es posible efectuar la multiplicación a estas matrices; las condiciones no hacen posible esta operación.\nLas filas de la primera tabla no son iguales a las columnas de la segunda.");
            }
            long tI = System.nanoTime();
            r = multiplicarMatrices(a, b);
            lblTiempo.setText("Tiempo de ejecución: " + (System.nanoTime() - tI));
            llenarTabla(mR, r);
            series1.clear();
            for (int i = 1; i <= a.getRen(); i++) {
                series1.add(i, 5 * i * i * i + 4 * i * i + 4 * i + 6);
            }
        } catch (NullPointerException e) {
            showMessageDialog(this, "Crea las matrices antes de multiplicar");
        } catch (Exception e) {
            showMessageDialog(this, e.getMessage());
        }
    }// GEN-LAST:event_btnMultiplicarActionPerformed

    private void graficar(MatrizEntero matriz){
        int worstCase = (matriz.getRen() < matriz.getCol()) ? matriz.getCol() : matriz.getRen() ;
            if (matriz.equals(a)) {
                series2.clear();
                for (int i = 1; i <= worstCase; i++) {
                    series2.add(i + 2, i * i);
                }
            } else {
                series3.clear();
                for (int i = 1; i <= worstCase; i++) {
                    series3.add(i, i * i);
                }
            }
    }
    
    private void llenarTabla(DefaultTableModel m, MatrizEntero matriz) {
        try {
            m.setRowCount(matriz.getRen());
            m.setColumnCount(matriz.getCol());
            for (int i = 0; i < matriz.getRen(); i++) {
                for (int j = 0; j < matriz.getCol(); j++) {
                    m.setValueAt(matriz.getM()[i][j], i, j);
                }
            }
        } catch (NullPointerException e) {
            showMessageDialog(this, "El objeto no ha sido creado");
        }
    }

    public static MatrizEntero multiplicarMatrices(MatrizEntero a, MatrizEntero b) {
        MatrizEntero r = new MatrizEntero(a.getRen(), b.getCol());// 3
        // int[][] ma = a.getM();
        // int[][] mb = b.getM(); //Más memoria
        // 1 (n+1) n
        for (int i = 0; i < a.getRen(); i++) {
            // 1 (n+1) n
            for (int j = 0; j < b.getCol(); j++) {
                // 1 (n+1) n
                for (int k = 0; k < a.getCol(); k++) {
                    // r.getM()[i][j] += ma[i][k] * mb[k][j];
                    r.getM()[i][j] += a.getM()[i][k] * b.getM()[k][j];// 3
                }
            }
        }
        return r;// 1
    }// 3n+2n+2 -> 5n+2(n)+2n+2 -> 5n2+4n+2(n) + 2n+2 -> 5n3+4n2+4n+2 + 4 =
    // 5n3+4n2+4n+6

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaMultiplicacionMatriz.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaMultiplicacionMatriz.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaMultiplicacionMatriz.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaMultiplicacionMatriz.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaMultiplicacionMatriz().setVisible(true);
            }
        });
    }

    private static VentanaMultiplicacionMatriz instance;
    private DefaultTableModel m1;
    private DefaultTableModel m2;
    private DefaultTableModel mR;
    private MatrizEntero a;
    private MatrizEntero b;
    private MatrizEntero r;
    private JFreeChart jfc;
    private XYSeriesCollection collection;
    private XYSeries series1;
    private XYSeries series2;
    private XYSeries series3;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearM1;
    private javax.swing.JButton btnCrearM2;
    private javax.swing.JButton btnMultiplicar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblTiempo;
    private javax.swing.JPanel panelG;
    private javax.swing.JTable tblMatriz;
    private javax.swing.JTable tblMatriz1;
    private javax.swing.JTable tblMatriz2;
    private javax.swing.JTextField txtCol0;
    private javax.swing.JTextField txtCol1;
    private javax.swing.JTextField txtRen0;
    private javax.swing.JTextField txtRen1;
    // End of variables declaration//GEN-END:variables
}
