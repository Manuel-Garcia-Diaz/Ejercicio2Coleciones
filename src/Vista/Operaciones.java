/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Datos.Empresa;

/**
 *
 * @author dam
 */
public class Operaciones extends javax.swing.JFrame {

    private Empresa empresa;
    public Operaciones(Empresa empresa) {
        initComponents();
        this.empresa = empresa; // Guardamos los datos de la empresa que vienen del Login= empresa;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        MenuOperraciones = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        MenuItemAltaClientes = new javax.swing.JMenuItem();
        MenuItemManteRutinas = new javax.swing.JMenuItem();
        MenuItemHistorial = new javax.swing.JMenuItem();
        MenuSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MenuOperraciones.setText("Operaciones");

        jMenuItem1.setText("jMenuItem1");
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
                                                                                                              
        
        // 3. Ahora SÍ le pasamos this.empresa a tu panel
        pnAltaClientes panelAlta = new pnAltaClientes(this.empresa);
        
        // Uso setBounds para las dimensiones y posición exacta
        panelAlta.setBounds(0, 0, this.getWidth(), this.getHeight());
        
        // el panel sea visible
        panelAlta.setVisible(true);
        
        // quitamos cualquier panel que estuviera antes
        this.getContentPane().removeAll();
        
        // layout simple que ocupa toda la pantalla
        this.getContentPane().setLayout(new java.awt.BorderLayout());
        
        // Añadir el panel de Alta de Clientes en el centro
        this.getContentPane().add(panelAlta, java.awt.BorderLayout.CENTER);
        
        // Refrescamos toda la jerarquía de componentes de la ventana
        this.getContentPane().revalidate();
        this.getContentPane().repaint();
        
        // Esto fuerza a Java Swing a actualizar todo el árbol visual
        javax.swing.SwingUtilities.updateComponentTreeUI(this);
    
    
    
    }//GEN-LAST:event_MenuItemAltaClientesActionPerformed

    private void MenuItemManteRutinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemManteRutinasActionPerformed
                                                         
       /* pnRutina panelRutina = new pnRutina(this.empresa);
        panelRutina.setBounds(0, 0, this.getWidth(), this.getHeight());
        panelRutina.setVisible(true);
        
        this.getContentPane().removeAll();
        this.getContentPane().setLayout(new java.awt.BorderLayout());
        this.getContentPane().add(panelRutina, java.awt.BorderLayout.CENTER);
        this.getContentPane().revalidate();
        this.getContentPane().repaint();
        javax.swing.SwingUtilities.updateComponentTreeUI(this);*/
                                                          
        // Le pasamos this.empresa para que la nueva ventana tenga acceso a los datos
        pnRutina ventanaRutina = new pnRutina(this.empresa,this);
        
        // La centramos y la hacemos visible
        ventanaRutina.setLocationRelativeTo(null); 
        ventanaRutina.setVisible(true);
        
        this.setVisible(false); // ocultamos el panel 
    
    
    }//GEN-LAST:event_MenuItemManteRutinasActionPerformed

    private void MenuItemHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemHistorialActionPerformed
                                                         
                                                        
        //  Creamos la instancia de tu panel
        pnHistorial panelHistorial = new pnHistorial();
        
        //  Usamos setBounds para forzar sus dimensiones y posición exacta
        // cojemos el ancho y alto actual del JFrame (la ventana principal)
        panelHistorial.setBounds(0, 0, this.getWidth(), this.getHeight());
        
        // Forzamos que el panel sea visible
        panelHistorial.setVisible(true);
        
        //  Limpiamos el JFrame
        this.getContentPane().removeAll();
        
        //  Aplicamos un layout simple que ocupa toda la pantalla
        this.getContentPane().setLayout(new java.awt.BorderLayout());
        
        //  Añadimos el panel en el centro
        this.getContentPane().add(panelHistorial, java.awt.BorderLayout.CENTER);
        
        //  Refrescamos toda la jerarquía de componentes de la ventana
        this.getContentPane().revalidate();
        this.getContentPane().repaint();
        
        // Opcional: Esto fuerza a Java Swing a actualizar todo el árbol visual
        javax.swing.SwingUtilities.updateComponentTreeUI(this);
    
    
    }//GEN-LAST:event_MenuItemHistorialActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
                //  Creamos la instancia de tu panel
        pnAforo panelAforo = new pnAforo();
        
        
        panelAforo.setBounds(0, 0, this.getWidth(), this.getHeight());
        panelAforo.setVisible(true);
        
        //  Limpiamos el JFrame
        this.getContentPane().removeAll();
        
        //  Aplicamos un layout simple que ocupa toda la pantalla
        this.getContentPane().setLayout(new java.awt.BorderLayout());
        
        //  Añadimos el panel en el centro
        this.getContentPane().add(panelAforo, java.awt.BorderLayout.CENTER);
        
        //  Refrescamos toda la jerarquía de componentes de la ventana
        this.getContentPane().revalidate();
        this.getContentPane().repaint();
        
        // Opcional: Esto fuerza a Java Swing a actualizar todo el árbol visual
        javax.swing.SwingUtilities.updateComponentTreeUI(this);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuItemAltaClientes;
    private javax.swing.JMenuItem MenuItemHistorial;
    private javax.swing.JMenuItem MenuItemManteRutinas;
    private javax.swing.JMenu MenuOperraciones;
    private javax.swing.JMenu MenuSalir;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
