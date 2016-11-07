package models;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import views.View_productos;
import sax.DBConnection;


import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;



/**
 *
 * @author jaivo
 */
public class Model_Proveedor {
 private Connection conexion;
    private Statement st;
    private ResultSet rs;
      
    private int id_proveedor;
    private String nombre;
    private String ap_paterno;
    private String ap_materno;
    private int telefono;
    private String email;
    private int rfc;
    private String calle;
    private int numero;
    private String colonia;
    private String ciudad;
    private String estado;
    public TableModel tableModel;
    
  
    
    
    public void guadarRegistro() throws SQLException {
        Conectar();
        getSt().executeUpdate("Insert into proveedor (id_proveedor,nombre,ap_paterno,ap_materno,telefono,email,rfc,calle,numero,colonia,ciudad,estado)" + " values ('" + id_proveedor + "','" + nombre + "','" + ap_paterno + "','" + ap_materno + "','" + telefono +"','" + email + "','" + rfc + "','" + calle + "','" + numero + "','" + colonia +"','" + ciudad + "','" + estado + "')");

    }

    /**
     * @return the conexion
     */
    public Connection getConexion() {
        return conexion;
    }

    /**
     * @param conexion the conexion to set
     */
    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }

    /**
     * @return the st
     */
    public Statement getSt() {
        return st;
    }

    /**
     * @param st the st to set
     */
    public void setSt(Statement st) {
        this.st = st;
    }

    /**
     * @return the rs
     */
    public ResultSet getRs() {
        return rs;
    }

    /**
     * @param rs the rs to set
     */
    public void setRs(ResultSet rs) {
        this.rs = rs;
    }

    /**
     * @return the id
     */
    public int getId_proveedor() {
        return id_proveedor;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id_proveedor= id_proveedor;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the ap_paterno
     */
    public String getAp_paterno() {
        return ap_paterno;
    }

    /**
     * @param ap_paterno the ap_paterno to set
     */
    public void setAp_paterno(String ap_paterno) {
        this.ap_paterno = ap_paterno;
    }

    /**
     * @return the ap_materno
     */
    public String getAp_materno() {
        return ap_materno;
    }

    /**
     * @param ap_materno the ap_materno to set
     */
    public void setAp_materno(String ap_materno) {
        this.ap_materno = ap_materno;
    }

    /**
     * @return the telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the rfc
     */
    public int getRfc() {
        return rfc;
    }

    /**
     * @param rfc the rfc to set
     */
    public void setRfc(int rfc) {
        this.rfc = rfc;
    }

    /**
     * @return the calle
     */
    public String getCalle() {
        return calle;
    }

    /**
     * @param calle the calle to set
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the colonia
     */
    public String getColonia() {
        return colonia;
    }

    /**
     * @param colonia the colonia to set
     */
    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    /**
     * @return the ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    //private DBConnection conection = new DBConnection(3306,"localhost", "sistema", "root", "");
    
    
    public void Conectar() {
        try {
            setConexion(DriverManager.getConnection("jdbc:mysql://localhost/sistema", "root", ""));
            setSt(getConexion().createStatement());
        

        } catch (SQLException err) {
             JOptionPane.showMessageDialog(null, "Error de Conexion " + err.getMessage());

    }
    }

    public String getRFC() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getApellido_Paterno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getApellido_Materno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void initValues() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setValues() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void agregarProveedor(String nombre, String ap_paterno, String ap_materno, String telefono, String email, String rfc, String calle, int numero, String colonia, String ciudad, String estado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void populateTable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void moveToNext() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void moveToAnterior() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void moveToSiguiente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void moveToFin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void moveToinicio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getid_Proveedor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void quitar_proveedor(int id_proveedor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String gettelefono() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
 
  

}
    
