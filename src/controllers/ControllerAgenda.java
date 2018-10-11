/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import models.ModelAgenda;
import views.ViewAgenda;


public class ControllerAgenda {

    public ModelAgenda modelAgenda;
    public ViewAgenda viewAgenda;

  
    ActionListener actionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == viewAgenda.jbtn_primero) {
                jbtn_primero_actionPerformed();
            } else if (e.getSource() == viewAgenda.jbtn_anterior) {
                jbtn_anterior_actionPerformed();
            } else if (e.getSource() == viewAgenda.jbtn_siguiente) {
                jbtn_siguiente_actionPerformed();
            } else if (e.getSource() == viewAgenda.jbtn_ultimo) {
                jbtn_ultimo_actionPerformed();
            } else if (e.getSource() == viewAgenda.jbtn_nuevo) {
                jbtn_nuevo_actionPerformed();
            } else if (e.getSource() == viewAgenda.jbtn_guardar) {
                jbtn_guardar_actionPerformed();
            }  else if (e.getSource() == viewAgenda.jbtn_modificar) {
                jbtn_modificar_actionPerformed();
            } else if (e.getSource() == viewAgenda.jbtn_borrar) {
                jbtn_borrar_actionPerformed();
            }
        }

    };

    /**
     
     * @param modelAgenda objeto de tipo ModelAgenda
     * @param viewAgenda objeto de tipo ViewAgenda
     */
    public ControllerAgenda(ModelAgenda modelAgenda, ViewAgenda viewAgenda) {
        this.modelAgenda = modelAgenda;
        this.viewAgenda = viewAgenda;
        setActionListener();
        initDB();
    }

   
    private void initDB() {
        
        viewAgenda.jbtn_guardar.setEnabled(false);
        modelAgenda.conectarDB();
        viewAgenda.jtf_nombre.setText(modelAgenda.getNombre());
        viewAgenda.jtf_email.setText(modelAgenda.getEmail());
        viewAgenda.jtf_telefono.setText(modelAgenda.getTelefono());
    }


    private void setActionListener() {
        viewAgenda.jbtn_primero.addActionListener(actionListener);
        viewAgenda.jbtn_anterior.addActionListener(actionListener);
        viewAgenda.jbtn_siguiente.addActionListener(actionListener);
        viewAgenda.jbtn_ultimo.addActionListener(actionListener);
        viewAgenda.jbtn_nuevo.addActionListener(actionListener);
        viewAgenda.jbtn_guardar.addActionListener(actionListener);
        viewAgenda.jbtn_modificar.addActionListener(actionListener);
       
        viewAgenda.jbtn_borrar.addActionListener(actionListener);
    }

   
    private void jbtn_primero_actionPerformed() {
        System.out.println("Action del boton jbtn_primero");
        modelAgenda.moverPrimerRegistro();
        setValues();
    }

    
    private void jbtn_anterior_actionPerformed() {
        System.out.println("Action del boton jbtn_anterior");
        modelAgenda.moverAnteriorRegistro();
        setValues();
    }

   
    private void jbtn_ultimo_actionPerformed() {
        System.out.println("Action del boton jbtn_ultimo");
        modelAgenda.moverUltimoRegistro();
        setValues();
    }

    
    private void jbtn_siguiente_actionPerformed() {
        System.out.println("Action del boton jbtn_siguiente");
        modelAgenda.moverSiguienteRegistro();
        setValues();
    }

    
    private void setValues() {
        viewAgenda.jtf_nombre.setText(modelAgenda.getNombre());
        viewAgenda.jtf_email.setText(modelAgenda.getEmail());
        viewAgenda.jtf_telefono.setText(modelAgenda.getTelefono());
    }

    private void jbtn_nuevo_actionPerformed() {
        System.out.println("Action del boton jbtn_nuevo");

        int reply = JOptionPane.showConfirmDialog(null, "Agregar nuevo contacto", "Nuevo", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            viewAgenda.jbtn_primero.setEnabled(false);
            viewAgenda.jbtn_siguiente.setEnabled(false);
            viewAgenda.jbtn_anterior.setEnabled(false);
            viewAgenda.jbtn_ultimo.setEnabled(false);
            viewAgenda.jbtn_nuevo.setEnabled(false);
            viewAgenda.jbtn_borrar.setEnabled(false);
            viewAgenda.jbtn_modificar.setEnabled(false);
            viewAgenda.jbtn_guardar.setEnabled(true);
           

            viewAgenda.jtf_email.setText("");
            viewAgenda.jtf_nombre.setText("");
            viewAgenda.jtf_telefono.setText("");
        } else {
            System.out.println("Action no de JOptionPane");
        }
    }

    private void jbtn_guardar_actionPerformed() {
        System.out.println("Action del boton jbtn_guardar");

        int reply = JOptionPane.showConfirmDialog(null, "¿Quiere guardar el nuevo contacto?", "Guardar", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            viewAgenda.jbtn_primero.setEnabled(true);
            viewAgenda.jbtn_siguiente.setEnabled(true);
            viewAgenda.jbtn_anterior.setEnabled(true);
            viewAgenda.jbtn_ultimo.setEnabled(true);
            viewAgenda.jbtn_nuevo.setEnabled(true);
            viewAgenda.jbtn_borrar.setEnabled(true);
            viewAgenda.jbtn_modificar.setEnabled(true);
            viewAgenda.jbtn_guardar.setEnabled(false);
            

            modelAgenda.setNombre(viewAgenda.jtf_nombre.getText());
            modelAgenda.setEmail(viewAgenda.jtf_email.getText());
            modelAgenda.setTelefono(viewAgenda.jtf_telefono.getText());

            modelAgenda.nuevoRegistro(modelAgenda.getNombre(), modelAgenda.getEmail(), modelAgenda.getTelefono());
            initDB();
        } else {
            System.out.println("Action no de JOptionPane");
        }
    }

    private void jbtn_cancelar_actionPerformed() {
        System.out.println("Action del boton jbtn_cancelar");

        int reply = JOptionPane.showConfirmDialog(null, "¿Quiere cancelar el registro?", "Cancelar", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {

            viewAgenda.jbtn_primero.setEnabled(true);
            viewAgenda.jbtn_siguiente.setEnabled(true);
            viewAgenda.jbtn_anterior.setEnabled(true);
            viewAgenda.jbtn_ultimo.setEnabled(true);
            viewAgenda.jbtn_nuevo.setEnabled(true);
            viewAgenda.jbtn_borrar.setEnabled(true);
            viewAgenda.jbtn_modificar.setEnabled(true);
            viewAgenda.jbtn_guardar.setEnabled(false);
           
            initDB();

            this.initDB();
        } else {
            System.out.println("Action no de JOptionPane");
        }
    }

    private void jbtn_modificar_actionPerformed() {

        int reply = JOptionPane.showConfirmDialog(null, "¿Desea modificar el registro?", "Modifcar", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            modelAgenda.setNombre(viewAgenda.jtf_nombre.getText());
            modelAgenda.setEmail(viewAgenda.jtf_email.getText());
            modelAgenda.setTelefono(viewAgenda.jtf_telefono.getText());
            modelAgenda.cambiarRegistro(modelAgenda.getEmail(), modelAgenda.getNombre(), modelAgenda.getTelefono());
            initDB();
        } else {
            System.out.println("Action no de JOptionPane");
        }
    }

    private void jbtn_borrar_actionPerformed() {
        System.out.println("Action del boton jbtn_borrar");

        int reply = JOptionPane.showConfirmDialog(null, "¿Estas seguro que quieres borrar el contacto?", "Borrar", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
        } else {
            System.out.println("Action no de JOptionPane");
        }
    }
}
