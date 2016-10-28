/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


import java.sql.SQLException;



/**
 *
 * @author jaivo
 */
public class Model_Producto {
 private Connection conexion;
    private Statement st;
    private ResultSet rs;
    
    public void Conectar() {
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/sensor", "root", "");
            st = conexion.createStatement();
        

        } catch (SQLException err) {
            

    }
    }
    
    private int idproducto;
    private String descripcion;
    private String compra;
    private String venta;
    private String existencia;

    public int getIdproducto() {
        return idproducto;
    }

    public void setidproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public String getdescripcion() {
        return descripcion;
    }

    public void setdescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getcompra() {
        return compra;
    }

    public void setcompra(String compra) {
        this.compra = compra;
    }

    public String getventa() {
        return venta;
    }

    public void setventa(String venta) {
        this.venta = venta;
    }
    
    public String getexistencia() {
        return  existencia;
    }

    public void setexistencia(String existencia) {
        this.venta = existencia;
    }
    
  
}
