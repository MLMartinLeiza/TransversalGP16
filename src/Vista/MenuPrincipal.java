package Vista;

public class MenuPrincipal extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MenuPrincipal.class.getName());

    public MenuPrincipal() {
        initComponents();
        setLocationRelativeTo(null); // Centra la ventana
        setTitle("Sistema de Universidad - TransversalGP16");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane = new javax.swing.JDesktopPane();
        jMenuPrincipal = new javax.swing.JMenuBar();
        jMenuAlumno = new javax.swing.JMenu();
        jMenuFormularioAlumnos = new javax.swing.JMenuItem();
        jMenuMateria = new javax.swing.JMenu();
        jMenuFormularioMateria = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane.setBackground(java.awt.SystemColor.activeCaptionBorder);

        javax.swing.GroupLayout jDesktopPaneLayout = new javax.swing.GroupLayout(jDesktopPane);
        jDesktopPane.setLayout(jDesktopPaneLayout);
        jDesktopPaneLayout.setHorizontalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 788, Short.MAX_VALUE)
        );
        jDesktopPaneLayout.setVerticalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 458, Short.MAX_VALUE)
        );

        jMenuAlumno.setText("Alumno");

        jMenuFormularioAlumnos.setText("Formulario de Alumnos");
        jMenuFormularioAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuFormularioAlumnosActionPerformed(evt);
            }
        });
        jMenuAlumno.add(jMenuFormularioAlumnos);

        jMenuPrincipal.add(jMenuAlumno);

        jMenuMateria.setText("Materia");

        jMenuFormularioMateria.setText("Formulario de Materias");
        jMenuFormularioMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuFormularioMateriaActionPerformed(evt);
            }
        });
        jMenuMateria.add(jMenuFormularioMateria);

        jMenuPrincipal.add(jMenuMateria);

        setJMenuBar(jMenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jDesktopPane)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuFormularioAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuFormularioAlumnosActionPerformed
        VistaAlumno vistaAlumno = new VistaAlumno();
        jDesktopPane.add(vistaAlumno);
        vistaAlumno.setVisible(true);

    }//GEN-LAST:event_jMenuFormularioAlumnosActionPerformed

    private void jMenuFormularioMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuFormularioMateriaActionPerformed
        // TODO add your handling code here:
        VistaMateria vistaMateria = new VistaMateria ();
       jDesktopPane.add(vistaMateria);
       vistaMateria.setVisible(true);
    }//GEN-LAST:event_jMenuFormularioMateriaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new MenuPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JMenu jMenuAlumno;
    private javax.swing.JMenuItem jMenuFormularioAlumnos;
    private javax.swing.JMenuItem jMenuFormularioMateria;
    private javax.swing.JMenu jMenuMateria;
    private javax.swing.JMenuBar jMenuPrincipal;
    // End of variables declaration//GEN-END:variables
}
