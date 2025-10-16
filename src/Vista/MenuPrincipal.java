package Vista;

public class MenuPrincipal extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MenuPrincipal.class.getName());

    public MenuPrincipal() {
        initComponents();
        setLocationRelativeTo(null); // Centra la ventana
        setExtendedState(MenuPrincipal.MAXIMIZED_BOTH); //Inicia el menu maximizado
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
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuListInsc = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuCargarNotas = new javax.swing.JMenuItem();

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

        jMenu1.setText("Inscripcion");

        jMenuItem1.setText("Formulario Inscripción");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuListInsc.setText("Listar Inscripciones");
        jMenuListInsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuListInscActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuListInsc);

        jMenuPrincipal.add(jMenu1);

        jMenu2.setText("Notas");

        jMenuCargarNotas.setText("Cargar Notas");
        jMenuCargarNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCargarNotasActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuCargarNotas);

        jMenuPrincipal.add(jMenu2);

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
        VistaMateria vistaMateria = new VistaMateria();
        jDesktopPane.add(vistaMateria);
        vistaMateria.setVisible(true);
    }//GEN-LAST:event_jMenuFormularioMateriaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        VistaInscripcion vistaInscripcion = new VistaInscripcion();
        jDesktopPane.add(vistaInscripcion);
        vistaInscripcion.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuCargarNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCargarNotasActionPerformed
        VistaCargaNotas vistaNotas = new VistaCargaNotas();
        jDesktopPane.add(vistaNotas);
        vistaNotas.setVisible(true);
    }//GEN-LAST:event_jMenuCargarNotasActionPerformed

    private void jMenuListInscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuListInscActionPerformed
        VistaListarInscripciones vistaListarInsc = new VistaListarInscripciones();
        jDesktopPane.add(vistaListarInsc);
        vistaListarInsc.setVisible(true);
    }//GEN-LAST:event_jMenuListInscActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new MenuPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenuAlumno;
    private javax.swing.JMenuItem jMenuCargarNotas;
    private javax.swing.JMenuItem jMenuFormularioAlumnos;
    private javax.swing.JMenuItem jMenuFormularioMateria;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuListInsc;
    private javax.swing.JMenu jMenuMateria;
    private javax.swing.JMenuBar jMenuPrincipal;
    // End of variables declaration//GEN-END:variables
}
