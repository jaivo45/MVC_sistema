
   
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.Model_prductos;
import javax.swing.JOptionPane;
import views.View_productos;
import sax.DBConnection;


    
   

public class Controller_productos implements ActionListener {
private DBConnection conection = new DBConnection(3306,"localhost", "sistema", "root", "");
    Model_prductos productsModel;
    View_productos productsView;
    
    public Controller_productos(Model_prductos productsModel, View_productos productsView) {
        this.productsModel = productsModel;
        this.productsView = productsView;
     
     this.productsView.jb_guarda.addActionListener(this);
    
     showData();
     init_view();
    }
    
   public void init_view(){
// para mostrar la interfaz
    
    
    
   /* this.productsView.jT_idproducto.setText(""+this.productsModel.getProducto());
    this.productsView.jT_descripcion.setText(""+this.productsModel.getDescripcion());
    this.productsView.jT_existencia.setText(""+this.productsModel.getExistencia());
    this.productsView.jT_compra.setText(""+this.productsModel.getCompra());
    this.productsView.jT_venta.setText(""+this.productsModel.getVenta());
    */
    
        this.productsView.jbtn_inicio.addActionListener(this);
        this.productsView.jbtn_anterior.addActionListener(this);
        this.productsView.jbtn_siguiente.addActionListener(this);
        this.productsView.jbtn_fin.addActionListener(this);
    
  // this.productsView.setVisible(true); 
}
   
   
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==productsView.jb_guarda){
           productsModel.guarda();
           mensaje();
        }
        else if(e.getSource()==productsView.jbtn_inicio){
           primero();
        }
        else if(e.getSource()==productsView.jbtn_anterior){
           anterior();
        }
        else if(e.getSource()==productsView.jbtn_siguiente){
           sigiente();
        }
        else if(e.getSource()==productsView.jbtn_fin){
          ultimo();  }
        
        else if(e.getSource()==productsView.jbtn_quitar){
         mensajes();
          
          
           
        }
    }
    
       
           
       
       private void mensaje(){
       JOptionPane.showMessageDialog(null, "guardado exitosamente ");
     }
       private void mensajes(){
       JOptionPane.showMessageDialog(null, "borrado exitosamente ");
     }
        
        private void primero(){
        productsModel.moveFirst();
        showValues();
        
     }
    
        private void anterior(){
        productsModel.movePrevious();
        showValues();
        
    }
    
        private void sigiente(){
        productsModel.moveNext();
        showValues();
        
    }
    
        private void ultimo(){
        productsModel.moveLast();
        showValues();
        
    }
    
        
    private void showValues(){
    this.productsView.jT_idproducto.setText(""+this.productsModel.getProducto());
    this.productsView.jT_descripcion.setText(""+this.productsModel.getDescripcion());
    this.productsView.jT_existencia.setText(""+this.productsModel.getExistencia());
    this.productsView.jT_compra.setText(""+this.productsModel.getCompra());
    this.productsView.jT_venta.setText(""+this.productsModel.getVenta());
    }

    private void showData() {
        productsView.j_Tabla.setModel(productsModel.tableModel);
        productsModel.Tabla();
        this.productsModel.setValues();
    }
    
    
    
    
    
    
    
     public void agregarRegistro(){
        this.productsView.jT_idproducto.setText("");
         this.productsView.jT_descripcion.setText("");
        this.productsView.jT_compra.setText("");
         this.productsView.jT_venta.setText("");
        this.productsView.jT_existencia.setText("");
         
        
    }
     
     public void guadarRegistro() {        
       
             String producto=this.productsView.jT_idproducto.getText();
             String descripcion=this.productsView.jT_descripcion.getText();
             Integer compra=Integer.parseInt(productsView.jT_compra.getText());
             Integer venta=Integer.parseInt(productsView.jT_venta.getText());
             Integer existencia=Integer.parseInt(productsView.jT_existencia.getText());
            

            conection.executeUpdate("insert into producto (producto,descripcion,precio_compra,precio_venta,existencia)"+" values "
                    + "('"+producto+"','"+descripcion+"','"+compra+"','"+venta+"','"+existencia+"');"); 
            
           this.productsModel.setValues();
          
          productsModel.initValues();
          showValues();
    }
     public void editarValues(){
         
             String producto=this.productsView.jT_idproducto.getText();
             String descripcion=this.productsView.jT_descripcion.getText();
             Integer compra=Integer.parseInt(productsView.jT_compra.getText());
             Integer venta=Integer.parseInt(productsView.jT_venta.getText());
             Integer existencia=Integer.parseInt(productsView.jT_existencia.getText());
         
            
             conection.executeUpdate ( "update productos set nombre='"+producto+"',rfc='"+descripcion+"',calle='"+compra+"',numero='"+venta+"',colonia='"+existencia+"'"+this.productsView.jT_idproducto.getText()+"';");
       
       this.productsModel.setValues();
       
       productsModel.initValues();
        showValues();

     }


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
