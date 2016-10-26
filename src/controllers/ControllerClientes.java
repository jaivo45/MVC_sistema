/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.ModelCliente;
import views.View_Cliente;
/**
 *
 * @author lupita
 */


public class ControllerClientes implements ActionListener{
    private final ModelCliente modelClientes;
    private final View_Cliente viewClientes;
    
    public ControllerClientes(View_Cliente viewClientes, ModelCliente modelClientes){
        this.modelClientes=modelClientes;
        this.viewClientes=viewClientes;
        
        this.viewClientes.jbtn_agregar.addActionListener(this);
        this.viewClientes.jbtn_quitar.addActionListener(this);
        this.viewClientes.jbtn_buscar.addActionListener(this);
        this.viewClientes.jbtn_modificar.addActionListener(this);
        this.viewClientes.jbtn_inicio.addActionListener(this);
        this.viewClientes.jbtn_siguiente.addActionListener(this);
        this.viewClientes.jbtn_anterior.addActionListener(this);
        this.viewClientes.jbtn_fin.addActionListener(this);
        
        initView();
    }
        private void initView(){
        modelClientes.initValues();
        showValues();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==viewClientes.jbtn_inicio){
          jbtnFirstActionPerformed();
        }
        else if(ae.getSource()==viewClientes.jbtn_anterior){
          jbtnPreviousActionPerformed();  
        }
        else if(ae.getSource()==viewClientes.jbtn_siguiente){
          jbtnNextActionPerformed();  
        }
        else if(ae.getSource()==viewClientes.jbtn_fin){
          jbtnLastActionPerformed();  
        }
    }
    
    
    private void jbtnFirstActionPerformed(){
        modelClientes.moveFirst();
        showValues();
    }
    
    private void jbtnPreviousActionPerformed(){
         modelClientes.movePrevious();
        showValues();
    }
    
    private void jbtnNextActionPerformed(){
         modelClientes.moveNext();
        showValues();
    }
    
    private void jbtnLastActionPerformed(){
         modelClientes.moveLast();
        showValues();
    }
    
    private void showValues(){
        
        viewClientes.jtf_nombre.setText(modelClientes.getnombre());
        viewClientes.jtf_ap_paterno.setText(modelClientes.getap_paterno());
        viewClientes.jtf_ap_materno.setText(modelClientes.getap_materno());
        viewClientes.jtf_telefono.setText(""+modelClientes.gettelefono());
        viewClientes.jtf_email.setText(modelClientes.getemail());
        viewClientes.jtf_rfc.setText(modelClientes.getrfc());
        viewClientes.jtf_calle.setText(modelClientes.getcalle());
        viewClientes.jtf_numero.setText(""+modelClientes.getnumero());
        viewClientes.jtf_colonia.setText(modelClientes.getcolonia());
        viewClientes.jtf_ciudad.setText(""+modelClientes.getciudad());
        viewClientes.jtf_estado.setText(modelClientes.getestado());
    }

   
}
            


 


