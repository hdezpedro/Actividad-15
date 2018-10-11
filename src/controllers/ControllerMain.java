/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.ModelMain;
import views.ViewMain;


public class ControllerMain {

    private final ModelMain modelMain;
    private final ViewMain viewMain;
    
    
    private Object controllers[];
    
    private ControllerAgenda controllerAgenda;
    private ControllerDetalleContacto controllerDetalleContacto;

    /**
     
     * @param modelMain 
     * @param viewMain
     * @param controllers arreglo con todos los controladores del proyecto. 
     */
    public ControllerMain(ModelMain modelMain, ViewMain viewMain, Object[] controllers) {
        this.modelMain = modelMain;
        this.viewMain = viewMain;
        this.controllers = controllers;
        setControllers();
        setActionListener();
        initComponets();
    }

    
    private void setControllers() {
        controllerAgenda = (ControllerAgenda) controllers[0];
        controllerDetalleContacto = (ControllerDetalleContacto) controllers[1];
    }

    
    private void initComponets() {
        viewMain.setTitle("Agenda");
        viewMain.setResizable(false);
        viewMain.setLocationRelativeTo(null);
        viewMain.setVisible(true);
    }
    
    
    private void setActionListener() {
        viewMain.jmi_detalle_contacto.addActionListener(actionListener);
        viewMain.jmi_agenda.addActionListener(actionListener);
        viewMain.jmi_salir.addActionListener(actionListener);
    }
    
    
    private final ActionListener actionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == viewMain.jmi_detalle_contacto) {
                jmi_detalle_contacto_actionPerformed();
            } else if (e.getSource() == viewMain.jmi_agenda) {
                jmi_agenda_actionPerformed();
            } 
        }
    };

    
    private void jmi_detalle_contacto_actionPerformed() {
        // 
        controllerDetalleContacto.modelDetalleContacto.setNombre(controllerAgenda.modelAgenda.getNombre());
        controllerDetalleContacto.modelDetalleContacto.setEmail(controllerAgenda.modelAgenda.getEmail());
        controllerDetalleContacto.modelDetalleContacto.setTelefono(controllerAgenda.modelAgenda.getTelefono());
        controllerDetalleContacto.initView();
        
        viewMain.setContentPane(controllerDetalleContacto.viewDetalleContacto);
        viewMain.revalidate();
        viewMain.repaint();
    }

    
    private void jmi_agenda_actionPerformed() {
        viewMain.setContentPane(controllerAgenda.viewAgenda);
        viewMain.revalidate();
        viewMain.repaint();
    }
    
  
   
}
