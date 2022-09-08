
package tpractico4;


public class BuscarClienteVista extends javax.swing.JInternalFrame {

   
    public BuscarClienteVista() {
        initComponents();
    }

  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfSalir = new javax.swing.JButton();
        jtfTelefono = new javax.swing.JTextField();
        jtfDni = new javax.swing.JTextField();
        jtfNombre = new javax.swing.JTextField();
        jtfApellido = new javax.swing.JTextField();
        jtfCiudad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jbBuscar = new javax.swing.JButton();

        jLabel1.setText("TELÉFONO:");

        jLabel2.setText("DNI:");

        jLabel3.setText("APELLIDO:");

        jLabel4.setText("NOMBRE:");

        jLabel5.setText("CIUDAD");

        jtfSalir.setText("SALIR");
        jtfSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfSalirActionPerformed(evt);
            }
        });

        jtfTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTelefonoActionPerformed(evt);
            }
        });

        jtfCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCiudadActionPerformed(evt);
            }
        });

        jLabel6.setText("Buscar Cliente");

        jbBuscar.setText("BUSCAR");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbBuscar)
                        .addGap(18, 18, 18)
                        .addComponent(jtfSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfTelefono)
                            .addComponent(jtfDni)
                            .addComponent(jtfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfNombre)
                            .addComponent(jtfCiudad))
                        .addGap(115, 115, 115))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(148, 148, 148))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jtfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfSalir)
                    .addComponent(jbBuscar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfSalirActionPerformed

    private void jtfTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTelefonoActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        // TODO add your handling code here:
//          long telefonoBuscar =Long.parseLong(jtfTelefono.getText());
//       Ejercicio4.DirectorioTelefonico df=Ejercicio4.DirectorioTelefonico.getInstance();
//       Cliente cli= df.buscarCliente(telefonoBuscar);
//        jtfDni.setText(cli.getDni()+"");
//        jtfApellido.setText(cli.getApellido());
//        jtfNombre.setText(cli.getNombre());
//        jtfCiudad.setText(cli.getCiudad());

    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jtfCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCiudadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JTextField jtfApellido;
    private javax.swing.JTextField jtfCiudad;
    private javax.swing.JTextField jtfDni;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JButton jtfSalir;
    private javax.swing.JTextField jtfTelefono;
    // End of variables declaration//GEN-END:variables
}
