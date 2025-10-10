package Vista;

public class MenuPrincipal extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MenuPrincipal.class.getName());

    public MenuPrincipal() {
        initComponents();
        // Inicia el JFrame maximizado
        setExtendedState(MenuPrincipal.MAXIMIZED_BOTH);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane = new javax.swing.JDesktopPane();
        jMenuPrincipal = new javax.swing.JMenuBar();
        jMenuAlumno = new javax.swing.JMenu();
        jMenuFormularioAlumnos = new javax.swing.JMenuItem();
        jMenuMateria = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

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

        jMenuItem2.setText("jMenuItem2");
        jMenuMateria.add(jMenuItem2);

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

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new MenuPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JMenu jMenuAlumno;
    private javax.swing.JMenuItem jMenuFormularioAlumnos;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenu jMenuMateria;
    private javax.swing.JMenuBar jMenuPrincipal;
    // End of variables declaration//GEN-END:variables
}
