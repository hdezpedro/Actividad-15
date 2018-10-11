/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import models.ModelDetalleContacto;
import views.ViewDetalleContacto;


public class ControllerDetalleContacto {
    public ModelDetalleContacto modelDetalleContacto;
    public ViewDetalleContacto viewDetalleContacto;

    /**
     *
     * @param modelDetalleContacto
     * @param viewDetalleContacto 
     */
    public ControllerDetalleContacto(ModelDetalleContacto modelDetalleContacto, ViewDetalleContacto viewDetalleContacto) {
        this.modelDetalleContacto = modelDetalleContacto;
        this.viewDetalleContacto = viewDetalleContacto;
        initView();
    }
    
    
    public final void initView(){
        viewDetalleContacto.jl_nombre.setText(modelDetalleContacto.getNombre());
        viewDetalleContacto.jl_email.setText(modelDetalleContacto.getEmail());
        viewDetalleContacto.jl_telefono.setText(modelDetalleContacto.getTelefono());
    }
}
