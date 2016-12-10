package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Conexion {

    private Connection conn;
    private Statement stm;
    private ResultSet rst;

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }

    public Statement getStm() {
        return stm;
    }

    public void setStm(Statement stm) {
        this.stm = stm;
    }

    public ResultSet getRst() {
        return rst;
    }

    public void setRst(ResultSet rst) {
        this.rst = rst;
    }

    public void conectar() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/sistema", "root", "");
            stm = conn.createStatement();
        

        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Error de Conexion " + err.getMessage());
        }

    }

    public void desconectar() throws SQLException {

        conn.close();

    }

    

}
