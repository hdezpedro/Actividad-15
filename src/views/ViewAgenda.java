/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

/**
 *
 * @author Zeo
 */
public class ViewAgenda extends javax.swing.JPanel {

    /**
     * Creates new form ViewAgenda1
     */
    public ViewAgenda() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_nombre = new javax.swing.JLabel();
        jl_email = new javax.swing.JLabel();
        jtf_nombre = new javax.swing.JTextField();
        jtf_email = new javax.swing.JTextField();
        jbtn_primero = new javax.swing.JButton();
        jbtn_anterior = new javax.swing.JButton();
        jbtn_siguiente = new javax.swing.JButton();
        jbtn_ultimo = new javax.swing.JButton();
        jl_telefono = new javax.swing.JLabel();
        jtf_telefono = new javax.swing.JTextField();
        jbtn_borrar = new javax.swing.JButton();
        jbtn_nuevo = new javax.swing.JButton();
        jbtn_guardar = new javax.swing.JButton();
        jbtn_modificar = new javax.swing.JButton();

        jl_nombre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jl_nombre.setText("Nombre");

        jl_email.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jl_email.setText("Email");

        jtf_nombre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jtf_email.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jbtn_primero.setText("|<");

        jbtn_anterior.setText("<<");

        jbtn_siguiente.setText(">>");

        jbtn_ultimo.setText(">|");

        jl_telefono.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jl_telefono.setText("Telefono");

        jtf_telefono.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jbtn_borrar.setText("Eliminar");
        jbtn_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_borrarActionPerformed(evt);
            }
        });

        jbtn_nuevo.setText("Nuevo");

        jbtn_guardar.setText("Guardar");

        jbtn_modificar.setText("Modificar");
        jbtn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_modificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jbtn_nuevo, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtn_modificar)
                        .addGap(13, 13, 13)
                        .addComponent(jbtn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtn_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(9, 9, 9)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jl_email)
                                        .addComponent(jl_nombre))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtf_nombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtf_email, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jl_telefono)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jtf_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtn_primero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbtn_anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbtn_siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbtn_ultimo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(102, 102, 102)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_nombre)
                    .addComponent(jtf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_email)
                    .addComponent(jtf_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_telefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_primero)
                    .addComponent(jbtn_anterior)
                    .addComponent(jbtn_siguiente)
                    .addComponent(jbtn_ultimo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_nuevo)
                    .addComponent(jbtn_modificar)
                    .addComponent(jbtn_borrar)
                    .addComponent(jbtn_guardar))
                .addContainerGap(45, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_modificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn_modificarActionPerformed

    private void jbtn_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_borrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn_borrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jbtn_anterior;
    public javax.swing.JButton jbtn_borrar;
    public javax.swing.JButton jbtn_guardar;
    public javax.swing.JButton jbtn_modificar;
    public javax.swing.JButton jbtn_nuevo;
    public javax.swing.JButton jbtn_primero;
    public javax.swing.JButton jbtn_siguiente;
    public javax.swing.JButton jbtn_ultimo;
    public javax.swing.JLabel jl_email;
    public javax.swing.JLabel jl_nombre;
    public javax.swing.JLabel jl_telefono;
    public javax.swing.JTextField jtf_email;
    public javax.swing.JTextField jtf_nombre;
    public javax.swing.JTextField jtf_telefono;
    // End of variables declaration//GEN-END:variables
}
