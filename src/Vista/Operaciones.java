
package Vista;

import Datos.Empresa;
import java.awt.BorderLayout;
import javax.swing.JPanel;
public class Operaciones extends javax.swing.JFrame {
    private Empresa empresa;

    public Operaciones(Empresa empresa) {
        initComponents();
        this.empresa = empresa;
        this.setTitle("SmartFit - Panel de Gestión"); 
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout()); 
        
        controlarRoles(); // Configura visibilidad según el rol
    }
    
    private void controlarRoles() {
        int rol = empresa.getUsuarioLogueado().getPerfil();
        if (rol == 1) { // Recepcionista
            MenuItemManteRutinas.setVisible(false);
            MenuItemHistorial.setVisible(false);
        } else if (rol == 2) { // Entrenador
            MenuItemAltaClientes.setVisible(false);
            jMenuItem1.setVisible(false); // Check In
        }
        // Rol 3 (Gerente) ve todo
    }

    // Lógica para cambiar paneles dinámicamente
    private void cambiarPanel(JPanel panel) {
        this.getContentPane().removeAll();
        this.getContentPane().add(panel, BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        MenuOperraciones = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        MenuItemAltaClientes = new javax.swing.JMenuItem();
        MenuItemManteRutinas = new javax.swing.JMenuItem();
        MenuItemHistorial = new javax.swing.JMenuItem();
        MenuSalir = new javax.swing.JMenu();
        MenuItemDesconectar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SmartFit - Panel de Gestión");

        MenuOperraciones.setText("Operaciones");

        jMenuItem1.setText("CheckIn");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        MenuOperraciones.add(jMenuItem1);

        MenuItemAltaClientes.setText("Alta Clientes");
        MenuItemAltaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemAltaClientesActionPerformed(evt);
            }
        });
        MenuOperraciones.add(MenuItemAltaClientes);

        MenuItemManteRutinas.setText("Mantenimiento Rutinas");
        MenuItemManteRutinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemManteRutinasActionPerformed(evt);
            }
        });
        MenuOperraciones.add(MenuItemManteRutinas);

        MenuItemHistorial.setText("Historial Entrenamiento");
        MenuItemHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemHistorialActionPerformed(evt);
            }
        });
        MenuOperraciones.add(MenuItemHistorial);

        jMenuBar1.add(MenuOperraciones);

        MenuSalir.setText("Salir");

        MenuItemDesconectar.setText("Desconectar");
        MenuItemDesconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemDesconectarActionPerformed(evt);
            }
        });
        MenuSalir.add(MenuItemDesconectar);

        jMenuBar1.add(MenuSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuItemAltaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemAltaClientesActionPerformed
     cambiarPanel(new pnAltaClientes(empresa));  
    }//GEN-LAST:event_MenuItemAltaClientesActionPerformed

    private void MenuItemManteRutinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemManteRutinasActionPerformed
  cambiarPanel(new pnRutina(empresa));
    }//GEN-LAST:event_MenuItemManteRutinasActionPerformed

    private void MenuItemHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemHistorialActionPerformed
    cambiarPanel(new pnHistorial(empresa));                                                     

    }//GEN-LAST:event_MenuItemHistorialActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
  cambiarPanel(new pnAforo(empresa));
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void MenuItemDesconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemDesconectarActionPerformed
     //cambiarPanel(new pnEntrenamiento(empresa));
    }//GEN-LAST:event_MenuItemDesconectarActionPerformed

   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuItemAltaClientes;
    private javax.swing.JMenuItem MenuItemDesconectar;
    private javax.swing.JMenuItem MenuItemHistorial;
    private javax.swing.JMenuItem MenuItemManteRutinas;
    private javax.swing.JMenu MenuOperraciones;
    private javax.swing.JMenu MenuSalir;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables

}