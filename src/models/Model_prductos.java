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
 private Connection conexion;
    private Statement st;
    private ResultSet rs;
    
    private String producto;
    private String descripcion;
    private int compra;
    private int venta;
    private int existencia;
    
      public  DefaultTableModel tableModel = new DefaultTableModel(new String [] {"id_producto", "producto","descripcion","precio_compra","precio_venta","existencia"}, 0);
    
    public void Tabla() {
        while (conection.moveNext()) {
            setValues();
            
               tableModel.addRow(new Object []{ producto,descripcion,compra,venta,existencia});
         
        }
        
    }
    

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
    public int getCompra() {
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
    public int getVenta() {
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

    
    
    private final DBConnection conection = new DBConnection(3306,"localhost", "sistema", "root", "");
    
    
   /* public void Conectar() {
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/sistema", "root", "");
            st = conexion.createStatement();
        

        } catch (SQLException err) {
             JOptionPane.showMessageDialog(null, "Error de Conexion " + err.getMessage());

    }
    }*/
    
    
    
    
    
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
    
   public void guarda(){
       conection.executeUpdate("Insert into productos (producto,descripcion,precio_compra,precio_venta,existencia)" + " values ('" + getProducto() + "','" + getDescripcion() + "','" + getCompra() + "','" + getVenta() + "','" + getExistencia() + "')");
       setValues();
   }


   public void initValues(){
        conection.executeQuery("SELECT idContacto, producto, descripcion, precio_compra, Precio_venta, existencia FROM sistema;");
        conection.moveNext();
        setValues();
    }
   public void editar(){
       conection.executeUpdate("update productos set producto");
   }
    public void setValues(){
        this.producto = conection.getString("producto");
        this.descripcion = conection.getString("descripcion");
        this.compra = conection.getInteger("precio_compra");
        this.venta = conection.getInteger("Precio_venta");
        this.existencia = conection.getInteger("existencia");          
    }
    
  
    
     public void borra() {
         this.setProducto("");
         this.setDescripcion("");
         this.setExistencia(0);
         this.setVenta(0);
         this.setCompra(0);
        

    }
    
    
   /* public void guadarRegistro() {
        try {
            //Conectar();
        
            st.executeUpdate("Insert into productos (producto,descripcion,precio_compra,precio_venta,existencia)" + " values ('" + getProducto() + "','" + getDescripcion() + "','" + getCompra() + "','" + getVenta() + "','" + getExistencia() + "')");

           

        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Error de guardar registros" + err.getMessage());
        }

    }*/

    
    
    
}
    
