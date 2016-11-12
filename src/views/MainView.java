/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

/**
 *
 * @author Sergio
 */
public class MainView extends javax.swing.JFrame {

    /**
     * Creates new form MainView
     */
    public MainView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jmb_menu = new javax.swing.JMenuBar();
        jm_options = new javax.swing.JMenu();
        jmi_login = new javax.swing.JMenuItem();
        jmi_customers = new javax.swing.JMenuItem();
        jmi_suppliers = new javax.swing.JMenuItem();
        jmi_products = new javax.swing.JMenuItem();
        jmi_ventas = new javax.swing.JMenuItem();
        jmi_exit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 150, 136));

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 815, Short.MAX_VALUE)
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/08.jpg"))); // NOI18N

        jLabel1.setText("TODO LO QUE BUSCA LO TENEMOS");

        jmb_menu.setBorder(null);

        jm_options.setBackground(new java.awt.Color(244, 244, 244));
        jm_options.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jm_options.setText("BIENVENIDO.");
        jm_options.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        jmi_login.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jmi_login.setText("login");
        jmi_login.setBorder(null);
        jmi_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_loginActionPerformed(evt);
            }
        });
        jm_options.add(jmi_login);

        jmi_customers.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jmi_customers.setText("Clientes");
        jmi_customers.setBorder(null);
        jmi_customers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_customersActionPerformed(evt);
            }
        });
        jm_options.add(jmi_customers);

        jmi_suppliers.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jmi_suppliers.setText("Proveedores");
        jmi_suppliers.setBorder(null);
        jm_options.add(jmi_suppliers);

        jmi_products.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jmi_products.setText("Productos");
        jmi_products.setBorder(null);
        jm_options.add(jmi_products);

        jmi_ventas.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jmi_ventas.setText("ventas");
        jmi_ventas.setBorder(null);
        jmi_ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_ventasActionPerformed(evt);
            }
        });
        jm_options.add(jmi_ventas);

        jmi_exit.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jmi_exit.setText("Salir");
        jmi_exit.setBorder(null);
        jm_options.add(jmi_exit);

        jmb_menu.add(jm_options);

        setJMenuBar(jmb_menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(333, 333, 333)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmi_customersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_customersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmi_customersActionPerformed

    private void jmi_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmi_loginActionPerformed

    private void jmi_ventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_ventasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmi_ventasActionPerformed

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
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel;
    private javax.swing.JMenu jm_options;
    private javax.swing.JMenuBar jmb_menu;
    public javax.swing.JMenuItem jmi_customers;
    public javax.swing.JMenuItem jmi_exit;
    public javax.swing.JMenuItem jmi_login;
    public javax.swing.JMenuItem jmi_products;
    public javax.swing.JMenuItem jmi_suppliers;
    public javax.swing.JMenuItem jmi_ventas;
    // End of variables declaration//GEN-END:variables
}
