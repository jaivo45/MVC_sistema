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
public class SuppliersView extends javax.swing.JPanel {

    /**
     * Creates new form SuppliersView
     */
    public SuppliersView() {
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

        jLabel1 = new javax.swing.JLabel();
        jtf_calle = new javax.swing.JTextField();
        jtf_numero = new javax.swing.JTextField();
        jtf_colonia = new javax.swing.JTextField();
        jtf_ciudad = new javax.swing.JTextField();
        jtf_estado = new javax.swing.JTextField();
        jL_nombre = new javax.swing.JLabel();
        jbtn_inicio = new javax.swing.JButton();
        jL_ap_paterno = new javax.swing.JLabel();
        jbtn_anterior = new javax.swing.JButton();
        jbtn_agregar = new javax.swing.JButton();
        jL_ap_materno = new javax.swing.JLabel();
        jbtn_quitar = new javax.swing.JButton();
        jL_colonia = new javax.swing.JLabel();
        jbtn_siguiente = new javax.swing.JButton();
        jL_telefono = new javax.swing.JLabel();
        jbtn_modificar = new javax.swing.JButton();
        jbtn_fin = new javax.swing.JButton();
        jL_ciudad = new javax.swing.JLabel();
        jL_email = new javax.swing.JLabel();
        jbtn_buscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jL_estado = new javax.swing.JLabel();
        jtf_nombre = new javax.swing.JTextField();
        jL_rfc = new javax.swing.JLabel();
        jtf_ap_paterno = new javax.swing.JTextField();
        jL_calle = new javax.swing.JLabel();
        jtf_ap_materno = new javax.swing.JTextField();
        jL_numero = new javax.swing.JLabel();
        jtf_telefono = new javax.swing.JTextField();
        jtf_email = new javax.swing.JTextField();
        jtf_rfc = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 0, 0));

        jLabel1.setBackground(new java.awt.Color(0, 121, 107));
        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PROVEEDORES");

        jL_nombre.setText("Nombre");

        jbtn_inicio.setText("l<");

        jL_ap_paterno.setText("Apellido Paterno");

        jbtn_anterior.setText("<");

        jbtn_agregar.setText("AGREGAR");

        jL_ap_materno.setText("Apellido Materno");

        jbtn_quitar.setText("QUITAR");

        jL_colonia.setText("Colonia");

        jbtn_siguiente.setText(">");

        jL_telefono.setText("Telefono");

        jbtn_modificar.setText("MODIFICAR");

        jbtn_fin.setText(">l");

        jL_ciudad.setText("Ciudad");

        jL_email.setText("Email");

        jbtn_buscar.setText("BUSCAR");
        jbtn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_buscarActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(204, 204, 255));
        jTable1.setBorder(new javax.swing.border.MatteBorder(null));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id ", "Nombre ", "Ap.Paterno ", "Ap.Materno "
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jL_estado.setText("Estado");

        jL_rfc.setText("RFC");

        jL_calle.setText("Calle");

        jL_numero.setText("Numero");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
                .addGap(48, 48, 48))
            .addGroup(layout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addComponent(jbtn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jbtn_quitar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jbtn_modificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtn_inicio)
                        .addGap(76, 76, 76)
                        .addComponent(jbtn_anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(jbtn_siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addComponent(jbtn_fin, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jL_ciudad)
                                .addComponent(jL_colonia)
                                .addComponent(jL_numero)
                                .addComponent(jL_calle)
                                .addComponent(jL_rfc)
                                .addComponent(jL_email)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jL_telefono)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                                        .addComponent(jtf_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jL_ap_paterno)
                                                .addComponent(jL_nombre))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jtf_nombre)
                                                .addComponent(jtf_ap_paterno, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)))
                                        .addComponent(jtf_email, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtf_rfc, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtf_calle, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtf_numero, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jtf_colonia, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                            .addComponent(jtf_estado)
                                            .addComponent(jtf_ciudad)))))
                            .addGap(587, 587, 587))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jL_ap_materno)
                                    .addGap(18, 18, 18)
                                    .addComponent(jtf_ap_materno, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jL_estado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 585, Short.MAX_VALUE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_agregar)
                    .addComponent(jbtn_quitar)
                    .addComponent(jbtn_modificar)
                    .addComponent(jbtn_buscar))
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_fin, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jbtn_siguiente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtn_anterior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtn_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jL_nombre)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jL_ap_paterno)
                                .addComponent(jtf_ap_paterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jtf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(26, 26, 26)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtf_ap_materno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jL_ap_materno))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jL_telefono)
                        .addComponent(jtf_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jL_email)
                        .addComponent(jtf_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jL_rfc)
                        .addComponent(jtf_rfc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jL_calle)
                        .addComponent(jtf_calle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jL_numero)
                        .addComponent(jtf_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jL_colonia)
                        .addComponent(jtf_colonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jL_ciudad)
                        .addComponent(jtf_ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jL_estado)
                        .addComponent(jtf_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(60, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn_buscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel jL_ap_materno;
    public javax.swing.JLabel jL_ap_paterno;
    public javax.swing.JLabel jL_calle;
    public javax.swing.JLabel jL_ciudad;
    public javax.swing.JLabel jL_colonia;
    public javax.swing.JLabel jL_email;
    public javax.swing.JLabel jL_estado;
    public javax.swing.JLabel jL_nombre;
    public static javax.swing.JLabel jL_numero;
    public javax.swing.JLabel jL_rfc;
    public javax.swing.JLabel jL_telefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    public javax.swing.JButton jbtn_agregar;
    public javax.swing.JButton jbtn_anterior;
    public javax.swing.JButton jbtn_buscar;
    public javax.swing.JButton jbtn_fin;
    public javax.swing.JButton jbtn_inicio;
    public javax.swing.JButton jbtn_modificar;
    public javax.swing.JButton jbtn_quitar;
    public javax.swing.JButton jbtn_siguiente;
    public javax.swing.JTextField jtf_ap_materno;
    public javax.swing.JTextField jtf_ap_paterno;
    public javax.swing.JTextField jtf_calle;
    public javax.swing.JTextField jtf_ciudad;
    public javax.swing.JTextField jtf_colonia;
    public javax.swing.JTextField jtf_email;
    public javax.swing.JTextField jtf_estado;
    public javax.swing.JTextField jtf_nombre;
    public javax.swing.JTextField jtf_numero;
    public javax.swing.JTextField jtf_rfc;
    public javax.swing.JTextField jtf_telefono;
    // End of variables declaration//GEN-END:variables
}