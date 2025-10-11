package Vista;

import Modelo.Alumno;
import Persistencia.AlumnoData;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VistaAlumno extends javax.swing.JInternalFrame {
    
    AlumnoData alumnoData = new AlumnoData();
    
    private DefaultTableModel modeloTabla;
    public VistaAlumno() {
        initComponents();
        setTitle("Formulario de Alumno");
        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtnombre = new javax.swing.JTextField();
        jtapellido = new javax.swing.JTextField();
        jtdni = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jbactualizar = new javax.swing.JButton();
        jbeliminar = new javax.swing.JButton();
        jbbaja = new javax.swing.JButton();
        jbalta = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jbmostrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jbinsertar = new javax.swing.JButton();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("FORMULARIO DE ALUMNO");

        jLabel3.setText("Apellido");

        jLabel4.setText("Nombre");

        jLabel5.setText("Estado");

        jLabel6.setText("DNI");

        jLabel7.setText("Fecha de nacimiento");

        jtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtnombreActionPerformed(evt);
            }
        });

        jtdni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtdniActionPerformed(evt);
            }
        });

        jCheckBox1.setText("Activo");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jbactualizar.setText("Actualizar");
        jbactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbactualizarActionPerformed(evt);
            }
        });

        jbeliminar.setText("Eliminar");
        jbeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbeliminarActionPerformed(evt);
            }
        });

        jbbaja.setText("Baja");
        jbbaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbbajaActionPerformed(evt);
            }
        });

        jbalta.setText("Alta");
        jbalta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbaltaActionPerformed(evt);
            }
        });

        jbmostrar.setText("Mostrar");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jbinsertar.setText("Insertar");
        jbinsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbinsertarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jbactualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addComponent(jbbaja)
                        .addGap(58, 58, 58)
                        .addComponent(jbalta)
                        .addGap(72, 72, 72)
                        .addComponent(jbmostrar)
                        .addGap(83, 83, 83)
                        .addComponent(jbeliminar)))
                .addGap(63, 63, 63))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtdni, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                                    .addComponent(jtnombre))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBox1))
                                .addGap(132, 132, 132))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(27, 27, 27)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                                .addComponent(jbinsertar)
                                .addGap(83, 83, 83))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(jLabel1)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jCheckBox1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbactualizar)
                            .addComponent(jbbaja)
                            .addComponent(jbalta)
                            .addComponent(jbeliminar)
                            .addComponent(jbmostrar))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jbinsertar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbactualizarActionPerformed
                                    
    try {
        int id = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingrese ID del alumno a actualizar"));
        int dni = Integer.parseInt(jtdni.getText());
        String nombre = jtnombre.getText();
        String apellido = jtapellido.getText();
        LocalDate fecha = jDateChooser1.getDate().toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
        boolean estado = jCheckBox1.isSelected();

        Alumno a = new Alumno(dni, apellido, nombre, fecha, estado);
        a.setIdAlumno(id);

        alumnoData.actualizarAlumno(a);
    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Error al actualizar alumno: " + e.getMessage());
    }//GEN-LAST:event_jbactualizarActionPerformed
    }
    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
      
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jbbajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbbajaActionPerformed
              try {
            int dni = Integer.parseInt(jtdni.getText());
            Alumno alumno = alumnoData.buscarAlumnoDni(dni);
            if (alumno != null) {
                alumno.setEstado(false);
                alumnoData.actualizarAlumno(alumno);
                JOptionPane.showMessageDialog(this, "Alumno dado de baja.");
                cargarTabla();
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró el alumno.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al dar de baja: " + e.getMessage());
        }
    }//GEN-LAST:event_jbbajaActionPerformed

    private void jbaltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbaltaActionPerformed
        try {
            int dni = Integer.parseInt(jtdni.getText());
            Alumno alumno = alumnoData.buscarAlumnoDni(dni);
            if (alumno != null) {
                alumno.setEstado(true);
                alumnoData.actualizarAlumno(alumno);
                JOptionPane.showMessageDialog(this, "Alumno dado de alta.");
                cargarTabla();
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró el alumno.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al dar de alta: " + e.getMessage());
        }
    }//GEN-LAST:event_jbaltaActionPerformed

    private void jbinsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbinsertarActionPerformed
        try {
            int dni = Integer.parseInt(jtdni.getText());
            String apellido = jtapellido.getText();
            String nombre = jtnombre.getText();
            LocalDate fecha = jDateChooser1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            boolean estado = jCheckBox1.isSelected();

            Alumno alumno = new Alumno(dni, apellido, nombre, fecha, estado);
            alumnoData.guardarAlumno(alumno);

            JOptionPane.showMessageDialog(this, "Alumno insertado correctamente.");
            limpiarCampos();
            cargarTabla();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al insertar alumno: " + e.getMessage());
        }
    }//GEN-LAST:event_jbinsertarActionPerformed

    private void jbeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbeliminarActionPerformed
        try {
            int dni = Integer.parseInt(jtdni.getText());
            alumnoData.eliminarAlumnoDni(dni);
            limpiarCampos();
            cargarTabla();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al eliminar alumno: " + e.getMessage());
        }
    }//GEN-LAST:event_jbeliminarActionPerformed

    private void jtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtnombreActionPerformed
        
    }//GEN-LAST:event_jtnombreActionPerformed

    private void jtdniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtdniActionPerformed
       
    }//GEN-LAST:event_jtdniActionPerformed
    
      private void limpiarCampos() {
        jtnombre.setText("");
        jtapellido.setText("");
        jtdni.setText("");
        jCheckBox1.setSelected(false);
        jDateChooser1.setDate(null);

    }

    private void cargarTabla() {
            modeloTabla.setRowCount(0); 
        List<Alumno> alumnos = alumnoData.listarAlumnosActivos();
        for (Alumno a : alumnos) {
            modeloTabla.addRow(new Object[]{
                a.getIdAlumno(),
                a.getDni(),
                a.getApellido(),
                a.getNombre(),
                a.getFechaNacimiento(),
                a.isEstado()
            });
        }
    }
     private void armarCabeceraTabla() {
        modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("ID");
        modeloTabla.addColumn("DNI");
        modeloTabla.addColumn("Apellido");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Fecha Nac.");
        modeloTabla.addColumn("Activo");
        jTable1.setModel(modeloTabla);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbactualizar;
    private javax.swing.JButton jbalta;
    private javax.swing.JButton jbbaja;
    private javax.swing.JButton jbeliminar;
    private javax.swing.JButton jbinsertar;
    private javax.swing.JButton jbmostrar;
    private javax.swing.JTextField jtapellido;
    private javax.swing.JTextField jtdni;
    private javax.swing.JTextField jtnombre;
    // End of variables declaration//GEN-END:variables

}