
   
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.Model_prductos;
import javax.swing.JOptionPane;
import views.View_productos;



    
   

public class Controller_productos implements ActionListener {

    Model_prductos productsModel;
    View_productos productsView;
    
    public Controller_productos(Model_prductos productsModel, View_productos productsView) {
        this.productsModel = productsModel;
        this.productsView = productsView;
     
     this.productsView.jb_guarda.addActionListener(this);
    
     init_view();
    }
    
   public void init_view(){
// para mostrar la interfaz
    
    
    
    this.productsView.jT_idproducto.setText(""+this.productsModel.getproducto());
    this.productsView.jT_descripcion.setText(""+this.productsModel.getdescripcion());
    this.productsView.jT_existencia.setText(""+this.productsModel.getexistencia());
    this.productsView.jT_compra.setText(""+this.productsModel.getcompra());
    this.productsView.jT_venta.setText(""+this.productsModel.getventa());
    
    
    
}
   
   
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==productsView.jb_guarda){
          productsModel.Conectar();
          productsModel.guadarRegistro();
          //productsModel.borra();
           JOptionPane.showMessageDialog(null, "guardado exitosamente ");
        }
    }
}
