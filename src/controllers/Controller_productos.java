
   
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
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
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Conexion;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.JasperViewer;
   

public class Controller_productos implements ActionListener {
DBConnection conection = new DBConnection(3306,"localhost", "sistema", "root", "");
//Connection cn = conection;
Conexion conn = new Conexion();
private  DefaultTableModel Model = new DefaultTableModel();
   DefaultTableModel mytable;
   DefaultTableModel medel;
   private Statement st;
   private ResultSet rs;
    Model_prductos productsModel;
    View_productos productsView;
    
    public Controller_productos(Model_prductos productsModel, View_productos productsView) {
        this.productsModel = productsModel;
        this.productsView = productsView;
        this.productsView.jT_compra.addKeyListener(numeros);
        this.productsView.jT_existencia.addKeyListener(numeros);
        this.productsView.jT_venta.addKeyListener(numeros);
        Botones_de_eventos();
        init_view();
       
     //mostrartabla();
    }
    
   public void init_view(){
    productsModel.initValues();
    }
   
   public void Botones_de_eventos(){
      this.productsView.jbtn_inicio.addActionListener(this);
      this.productsView.jbtn_anterior.addActionListener(this);
      this.productsView.jbtn_siguiente.addActionListener(this);
      this.productsView.jbtn_fin.addActionListener(this);
      this.productsView.jbtn_modificar.addActionListener(this);
      this.productsView.jb_guarda.addActionListener(this);
      this.productsView.jbtn_quitar.addActionListener(this);
      this.productsView.jbtn_buscar.addActionListener(this);
      this.productsView.jb_nuevo.addActionListener(this);         
      this.productsView.jT_venta.addActionListener(this);
      this.productsView.jB_reporteproductos.addActionListener(this);
   }
   
   
   public void mostrartabla(){
     init_view();
     showData(); 
   }
   
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==productsView.jb_guarda){
           GuadarRegistro();
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
          ultimo(); 
        }
     
         else if(e.getSource()==productsView.jbtn_buscar){
         
          
          actualizar_tabla();
          showTabla();
         }
         
         else if(e.getSource()==productsView.jB_reporteproductos){
         
         productos_existentes();
         }
         
         
        
        else if(e.getSource()==productsView.jbtn_quitar){
            
            JOptionPane.showMessageDialog(null, "Borrar", "Atencion el registro se borrara", JOptionPane.WARNING_MESSAGE);
            borrar();
            JOptionPane.showMessageDialog(null, "registro borrado exitosamente ");
            NuevoRegistro();
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
    
    
     public void productos_existentes(){
       try {
                 conn.conectar();
                    String dir = "C:\\Users\\javier\\Desktop\\MVC_sistema\\src\\views\\reporteproductos.jrxml";
                    JasperReport reporteJasper = JasperCompileManager.compileReport(dir);
                    JasperPrint mostrarReporte = JasperFillManager.fillReport(reporteJasper, null, conn.getConn());
                    JasperViewer.viewReport(mostrarReporte);

                } catch (JRException ex) {
                    Logger.getLogger(Controller_productos.class.getName()).log(Level.SEVERE, null, ex);
                }
   }
    
    
    
       
        public void  actualizar_tabla(){
         productsView.j_Tabla.setModel(productsModel.tableModel);
         this.productsModel.Tabla();
         this.productsModel.setValues();
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
         this.productsModel.Tabla();
          //this.productsModel.setValues();
     }
    
     public void showTabla() {
      productsView.j_Tabla.setModel(productsModel.tableModel);
      
    }
     
     
    
    public void borrar() {
        Integer producto=Integer.parseInt(this.productsView.jT_Idproducto.getText());
        String remove = "delete from productos where id_producto=" +this.productsView.jT_Idproducto.getText();
        conection.executeUpdate(remove);      
       // this.productsModel.setValues();
       
        productsModel.initValues();
        showValues();
    }
    
    
    
    
     public void NuevoRegistro(){
         this.productsView.jT_Idproducto.setText("");
        this.productsView.jT_producto.setText("");
         this.productsView.jT_descripcion.setText("");
        this.productsView.jT_compra.setText("");
         this.productsView.jT_venta.setText("");
        this.productsView.jT_existencia.setText("");
         
        
    }
    

     
     public void GuadarRegistro() {        
       
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
     
   public  KeyListener numeros = new KeyListener(){
        @Override
        public void keyTyped(KeyEvent e) {
            
         char valida = e.getKeyChar();
        
     if(((valida< '0')|| (valida>'9')) &&(valida != KeyEvent.VK_BACK_SPACE)&&(valida !='.'))
           {
             e.consume();
           }
          }
         

        @Override
        public void keyPressed(KeyEvent e) {
           // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void keyReleased(KeyEvent e) {
           //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
    };
    
}



