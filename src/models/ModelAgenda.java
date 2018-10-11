/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class ModelAgenda {

    private Connection conexion;
    private Statement st;
    private ResultSet rs;

    private String nombre;
    private String email;
    private String telefono;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
    public void conectarDB() {
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3307/agenda_mvc", "user_mvc", "pass_mvc.2018");
            st = conexion.createStatement();
            String sql = "SELECT * FROM contactos;";
            System.out.println(sql);
            rs = st.executeQuery(sql);
            rs.next();
            setValues();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Error ModelAgenda 001: " + err.getMessage());
        }
    }

   
    public void setValues() {
        try {
            nombre = rs.getString("nombre");
            email = rs.getString("email");
            telefono = rs.getString("telefono");
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Error ModelAgenda 002: " + err.getMessage());

        }
    }

    
    public void moverPrimerRegistro() {
        System.out.println("moverPrimerRegistro");
        try {
            rs.first();
            setValues();
        } catch (SQLException sql) {
            JOptionPane.showMessageDialog(null, "Error ModelAgenda 003: " + sql.getMessage());
        }
    }

    
    public void moverSiguienteRegistro() {
        System.out.println("moverSiguienteRegistro");
        try {
            if (!rs.isLast()) {
                rs.next();
                setValues();
                System.out.print("Programa accion moverSiguienteRegistro");
            }

        } catch (SQLException sql) {
            JOptionPane.showMessageDialog(null, "Error ModelAgenda 004: " + sql.getMessage());
        }
    }

   
    public void moverAnteriorRegistro() {
        System.out.println("moverAnteriorRegistro");
        try {
            if (!rs.isFirst()) {
                rs.previous();
                setValues();
                System.out.print("Programa accion moverAnteriorRegistro");
            }
        } catch (SQLException sql) {
            JOptionPane.showMessageDialog(null, "Error ModelAgenda 005: " + sql.getMessage());
        }
    }

    
    public void moverUltimoRegistro() {
        System.out.println("moverUltimoRegistro");
        try {
            rs.last();
            setValues();
        } catch (SQLException sql) {
            JOptionPane.showMessageDialog(null, "Error ModelAgenda 006: " + sql.getMessage());
        }
    }

    /**
     
     * @param email se obtiene de jtf_email
     * @param nombre se obtiene de jtf_nombre
     * @param telefono se obtiene de jtf_telefono
     */
    public void nuevoRegistro(String email, String nombre, String telefono) {
        System.out.println("Insertar nuevo contacto");
        try {
            st.executeUpdate("INSERT INTO contactos(nombre, email, telefono) VALUES " + "('" + nombre + "','" + email + "','" + telefono + "' );");
            this.conectarDB();
        } catch (SQLException sql) {
            JOptionPane.showMessageDialog(null, "Error ModelAgenda 008: " + sql.getMessage());
        }
    }

    /**
     
     * @param email se obtiene de jtf_email
     * @param nombre se obtiene de jtf_nombre
     * @param telefono se obtiene de jtf_telefono
     */
    public void cambiarRegistro(String email, String nombre, String telefono) {
        System.out.println("Modificar contacto");
        try {
            st.executeUpdate("UPDATE contactos SET nombre= '" + nombre + "',email='" + email + "', telefono = '" + telefono + "' WHERE email = '" + email + "';");
            this.conectarDB();
        } catch (SQLException sql) {
            JOptionPane.showMessageDialog(null, "Error ModelAgenda 009: " + sql.getMessage());
        }
    }

    /**
     
     * @param email se obtiene de jtf_email
     *
     */
    public void borrarRegistro(String email) {
        System.out.println("Eliminar contacto");
        try {
            st.executeUpdate("DELETE FROM contactos WHERE email = '" + email + "';");
            this.conectarDB();
        } catch (SQLException sql) {
            JOptionPane.showMessageDialog(null, "Error ModelAgenda 010: " + sql.getMessage());
        }
    }
}
