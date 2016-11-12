
package models;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import views.View_productos; 
import sax.DBConnection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.JTableUpdateDb;


/**
 *
 * @author jaivo
 */
public class Model_prductos {
 
    private final DBConnection conection = new DBConnection(3306,"localhost", "sistema", "root", "");
    private int idproducto;
    private String producto;
    private String descripcion;
    private double compra;
    public double venta;
    private int existencia;
    
   
    
    public  DefaultTableModel tableModel = new DefaultTableModel(new String [] {"id_producto", "producto","descripcion","precio_compra","precio_venta","existencia"}, 0);
    

    /**
     * @return the producto
     */
    public String getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(String producto) {
        this.producto = producto;
        
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the compra
     */
    public double getCompra() {
        return compra;
    }

    /**
     * @param compra the compra to set
     */
    public void setCompra(int compra) {
        this.compra = compra;
    }

    /**
     * @return the venta
     */
    public double getVenta() {
        return venta;
    }

    /**
     * @param venta the venta to set
     */
    public void setVenta(int venta) {
        this.venta = venta;
    }

    /**
     * @return the existencia
     */
    public int getExistencia() {
        return existencia;
    }

    /**
     * @param existencia the existencia to set
     */
    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }
    
    /**
     * @return the idproducto
     */
    public int getIdproducto() {
        return idproducto;
    }

    /**
     * @param idproducto the idproducto to set
     */
    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public void moveNext(){
        conection.moveNext();
        setValues();
    }
    
    public void movePrevious(){
        conection.movePrevious();
        setValues();
    }
    
    public void moveFirst(){
        conection.moveFirst();
        setValues();
    }
    
    public void moveLast(){
        conection.moveLast();
        setValues();
    }
    
   
  

   public void initValues(){
        conection.executeQuery("SELECT id_producto, producto, descripcion, precio_compra, Precio_venta, existencia FROM productos;");
        conection.moveNext();
        setValues();
    }
   
  
   
   public void setValues(){
       this.idproducto=conection.getInteger("id_producto");
        this.producto = conection.getString("producto");
        this.descripcion = conection.getString("descripcion");
        this.compra = conection.getInteger("precio_compra");
        this.venta = conection.getInteger("Precio_venta");
        this.existencia = conection.getInteger("existencia"); 
        
        
        
    }
   public void setdatos(){
        this.idproducto=conection.getInteger("");
        this.producto = conection.getString("");
        this.descripcion = conection.getString("");
        this.compra = conection.getInteger("");
        this.venta = conection.getInteger("");
        this.existencia = conection.getInteger(""); 
        
        
        
    }
   
    

    public void Tabla() {
        while (conection.moveNext()) {
            setValues();
              tableModel.addRow(new Object []{idproducto, producto,descripcion,compra,venta,existencia});
        }
     }
    
     
    
    
     

}
    