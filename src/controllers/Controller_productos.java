
   
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.Model_prductos;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import views.View_productos;
import sax.DBConnection;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.HashMap;
    
   

public class Controller_productos implements ActionListener {
private DBConnection conection = new DBConnection(3306,"localhost", "sistema", "root", "");
    Model_prductos productsModel;
    View_productos productsView;
    
    public Controller_productos(Model_prductos productsModel, View_productos productsView) {
        this.productsModel = productsModel;
        this.productsView = productsView;
     
      
      this.productsView.jbtn_inicio.addActionListener(this);
      this.productsView.jbtn_anterior.addActionListener(this);
      this.productsView.jbtn_siguiente.addActionListener(this);
      this.productsView.jbtn_fin.addActionListener(this);
       this.productsView.jB_mostrartodo.addActionListener(this);
       this.productsView.jbtn_modificar.addActionListener(this);
       this.productsView.jb_guarda.addActionListener(this);
       this.productsView.jbtn_quitar.addActionListener(this);
       this.productsView.jbtn_buscar.addActionListener(this);
       this.productsView.jb_nuevo.addActionListener(this);         
      
    //showData();
     init_view();
     
    }
    
   public void init_view(){
// para mostrar la interfaz

       productsModel.initValues();
        //showValues();
}
   
   
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==productsView.jb_guarda){
           guadarRegistro();
           JOptionPane.showMessageDialog(null, "guardado exitosamente ");
           NuevoRegistro();
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
          
        }
        else if (e.getSource()== productsView.jB_mostrartodo){
           // mostrar_todo();
    }
        else if (e.getSource()== productsView.jbtn_modificar){
           editar();
           NuevoRegistro();
           JOptionPane.showMessageDialog(null, "actualizacion guardada exitosamente ");
    }
        else if (e.getSource()== productsView.jb_nuevo){
          NuevoRegistro();
           JOptionPane.showMessageDialog(null, "llene un nuevo registro ");
    }
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
        
    productsModel.setValues();
    productsView.jT_Idproducto.setText(""+productsModel.getIdproducto());
    productsView.jT_producto.setText(""+this.productsModel.getProducto());
    productsView.jT_descripcion.setText(""+this.productsModel.getDescripcion());
    productsView.jT_existencia.setText(""+this.productsModel.getExistencia());
    productsView.jT_compra.setText(""+this.productsModel.getCompra());
    productsView.jT_venta.setText(""+this.productsModel.getVenta());
    }

    private void showData() {
        productsView.j_Tabla.setModel(productsModel.tableModel);
        productsModel.Tabla();
        productsModel.setValues();
    }
    
    
    
    
    
    
    
     public void NuevoRegistro(){
         this.productsView.jT_Idproducto.setText("");
        this.productsView.jT_producto.setText("");
         this.productsView.jT_descripcion.setText("");
        this.productsView.jT_compra.setText("");
         this.productsView.jT_venta.setText("");
        this.productsView.jT_existencia.setText("");
         
        
    }
    /* public void mostrar_todo (){
         DefaultTableModel  dm = new DefaultTableModel();
         dm.addColumn("Producto");
         dm.addColumn("Descripcion");
         dm.addColumn("Precio compra");
         dm.addColumn("Precio venta");
         dm.addColumn("Existencia");
         productsView.j_Tabla.setModel(dm);
         //String consulta="";
         //consulta = "Select * from productos where Id_producto='"+id+"'";
         
     }
*/
     
     
     public void guadarRegistro() {        
       
             String producto=this.productsView.jT_producto.getText();
             String descripcion=this.productsView.jT_descripcion.getText();
             Integer compra=Integer.parseInt(productsView.jT_compra.getText());
             Integer venta=Integer.parseInt(productsView.jT_venta.getText());
             Integer existencia=Integer.parseInt(productsView.jT_existencia.getText());
            

            conection.executeUpdate("insert into productos (producto,descripcion,precio_compra,precio_venta,existencia)"+" values "
                    + "('"+producto+"','"+descripcion+"','"+compra+"','"+venta+"','"+existencia+"');"); 
            
           this.productsModel.setValues();
          
          productsModel.initValues();
          showValues();
    }
     public void editar(){
             
             String producto=productsView.jT_producto.getText();
             String descripcion=productsView.jT_descripcion.getText();
             double compra=Double.parseDouble(productsView.jT_compra.getText());
             double venta=Double.parseDouble(productsView.jT_venta.getText());
             int existencia=Integer.parseInt(productsView.jT_existencia.getText());
         
             conection.executeUpdate ( "update productos set producto='"+producto+"',descripcion='"+descripcion+"',precio_compra='"+compra+"',precio_venta='"+venta+"',existencia='"+existencia+"'where id_producto='"+this.productsView.jT_Idproducto.getText()+"';");
       
       this.productsModel.setValues();
       
       productsModel.initValues();
        showValues();

     } 

     
     
     
     
     
     
     
     
}
