package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


import models.Model_Proveedor;

import views.View_Proveedor;

public class Controller_Proveedor implements ActionListener {
    private Model_Proveedor Model_Proveedor;
    View_Proveedor View_Proveedor;

    public Controller_Proveedor(Model_Proveedor Model_Proveedor, View_Proveedor View_Proveedor) {
        this.Model_Proveedor = Model_Proveedor;
        this.View_Proveedor = View_Proveedor;
        
        this.View_Proveedor.jbtn_inicio.addActionListener(this);
        this.View_Proveedor.jbtn_anterior.addActionListener(this);
        this.View_Proveedor.jbtn_siguiente.addActionListener(this);
        this.View_Proveedor.jbtn_fin.addActionListener(this);
        
        this.View_Proveedor.jbtn_agregar.addActionListener(this);
        this.View_Proveedor.jbtn_modificar.addActionListener(this);
        this.View_Proveedor.jbtn_quitar.addActionListener(this);
        this.View_Proveedor.jbtn_buscar .addActionListener(this);
        
        initView();
        registros();
    }

    @Override
    public void actionPerformed(ActionEvent a) {
        if(a.getSource() == View_Proveedor.jbtn_inicio)
            inicioProveedor();
        else if(a.getSource() == View_Proveedor.jbtn_anterior)
            anteriorProveedor();
        else if(a.getSource() == View_Proveedor.jbtn_siguiente)
            siguienteProveedor();
        else if(a.getSource() == View_Proveedor.jbtn_fin)
            finProveedor();
        else if(a.getSource() == View_Proveedor.jbtn_agregar)
            agregarProveedor();
        else if(a.getSource() == View_Proveedor.jbtn_modificar)
            modificarProveedor();
        else if(a.getSource() == View_Proveedor.jbtn_quitar)
            quitarProveedor();
        else if(a.getSource() == View_Proveedor.jbtn_buscar)
            buscarProveedor();
    }
    
    public void initView() {
        View_Proveedor.setVisible(true);
        Model_Proveedor.initValues();
        Model_Proveedor.setValues();
    }
    
    public void showValues() {
        View_Proveedor.jTF_id_proveedor.setText("" + Model_Proveedor.getid_Proveedor());
        View_Proveedor.jtf_nombre.setText(Model_Proveedor.getNombre());
        View_Proveedor.jtf_ap_materno.setText(Model_Proveedor.getApellido_Paterno());
        View_Proveedor.jtf_ap_materno.setText(Model_Proveedor.getApellido_Materno());
        View_Proveedor.jtf_telefono.setText(Model_Proveedor.gettelefono());
        View_Proveedor.jtf_email.setText(Model_Proveedor.getEmail());
        View_Proveedor.jtf_rfc.setText(Model_Proveedor.getRFC());
        View_Proveedor.jtf_calle.setText(Model_Proveedor.getCalle());
        View_Proveedor.jtf_numero.setText("" + Model_Proveedor.getNumero());
        View_Proveedor.jtf_colonia.setText(Model_Proveedor.getColonia());
        View_Proveedor.jtf_ciudad.setText(Model_Proveedor.getCiudad());
        View_Proveedor.jtf_estado.setText(Model_Proveedor.getEstado());
    }
    
    public void inicio_Proveedor() {
        Model_Proveedor.moveToinicio();
        showValues();
    }
    
    public void anterior_Proveedor() {
      Model_Proveedor.moveToAnterior();
        showValues();
    }
    
    public void siguiente_Proveedor() {
        Model_Proveedor.moveToSiguiente();
        showValues();
    }
    
    public void fin_Proveedor() {
       Model_Proveedor.moveToFin();
        showValues();
    }
    
    public void agregarProveedor() {             
        String name = View_Proveedor.jtf_nombre.getText();
        String surname1 = View_Proveedor.jtf_ap_paterno.getText();
        String surname2 = View_Proveedor.jtf_ap_materno.getText();
        String phone = View_Proveedor.jtf_telefono.getText();
        String email = View_Proveedor.jtf_email.getText();
        String rfc = View_Proveedor.jtf_rfc.getText();
        String street = View_Proveedor.jtf_calle.getText();
        int number = Integer.parseInt(View_Proveedor.jtf_numero.getText());
        String suburb = View_Proveedor.jtf_colonia.getText();
        String city = View_Proveedor.jtf_ciudad.getText();
        String state = View_Proveedor.jtf_estado.getText();
        Model_Proveedor.agregarProveedor(name, surname1, surname2, phone, email, rfc, street, number, suburb, city, state);
       Model_Proveedor.setValues();
        showValues();
    }
    
    public void modificarProveedor() {
        int ID_proveedor = Integer.parseInt(View_Proveedor.jTF_id_proveedor.getText());
        String nombre = View_Proveedor.jtf_nombre.getText();
        String ap_paterno = View_Proveedor.jtf_ap_paterno.getText();
        String ap_materno = View_Proveedor.jtf_ap_materno.getText();
        String telefono = View_Proveedor.jtf_telefono.getText();
        String email = View_Proveedor.jtf_email.getText();
        String rfc = View_Proveedor.jtf_rfc.getText();
        String calle = View_Proveedor.jtf_calle.getText();
        int numero = Integer.parseInt(View_Proveedor.jtf_numero.getText());
        String colonia = View_Proveedor.jtf_colonia.getText();
        String ciudad = View_Proveedor.jtf_ciudad.getText();
        String estado = View_Proveedor.jtf_estado.getText();
        Model_Proveedor (modificarProveedor(id_proveedor, nombre, ap_paterno, ap_materno, telefono, email, rfc, calle, numero, colonia, ciudad, estado));
        Model_Proveedor.setValues();
        showValues();
    }
    
    public void quitarProveedor() {
        int id_proveedor = Integer.parseInt( View_Proveedor.jTF_id_proveedor.getText());
        Model_Proveedor.quitar_proveedor(id_proveedor);
     Model_Proveedor.setValues();
        showValues();
    }
    
    public void buscarProveedor() {
        String name = JOptionPane.showInputDialog(null, "Introduce el nombre que deseas buscar:", "Búsqueda por nombre", JOptionPane.INFORMATION_MESSAGE);
        if(name.equals( View_Proveedor.jtf_nombre.getText()))
            JOptionPane.showMessageDialog(null, name + " existe en la base de datos", "Resultados", JOptionPane.INFORMATION_MESSAGE);
        else 
            JOptionPane.showMessageDialog(null, name + " no existe en la base de datos. Intente de nuevo", "Alerta", JOptionPane.ERROR_MESSAGE);
    }
    
    public void registros() {
         View_Proveedor.jT_id_proveedor.setModel_Proveedor(Model_Proveedor.tableModel);
        Model_Proveedor.populateTable();
    }

    private void inicioProveedor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void anteriorProveedor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void siguienteProveedor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void finProveedor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
   

    
}

    

