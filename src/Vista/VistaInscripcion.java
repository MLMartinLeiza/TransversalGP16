package Vista;

import Modelo.Alumno;
import Modelo.Inscripcion;
import Modelo.Materia;
import Persistencia.AlumnoData;
import Persistencia.InscripcionData;
import Persistencia.MateriaData;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class VistaInscripcion extends javax.swing.JInternalFrame {

    private List<Alumno> alumnosCombo;
    private List<Materia> listaM;

    private InscripcionData inscData;
    private MateriaData matData;
    private AlumnoData aluData;
    private DefaultTableModel modelo;

    public VistaInscripcion() {
        initComponents();
        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        inscData = new InscripcionData();
        matData = new MateriaData();
        listaM = matData.listarMaterias();
        aluData = new AlumnoData();
        alumnosCombo = aluData.listarAlumnosActivos();
        modelo = new DefaultTableModel();
        cargarAlumnos();
        armarCabeceraTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboFormInsc = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jRadioButtonInscriptas = new javax.swing.JRadioButton();
        jRadioButtonNoInscriptas = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtFormInsc = new javax.swing.JTable();
        jbtnInscribir = new javax.swing.JButton();
        jbtnAnularInsc = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setTitle("Formulario de Inscripcion");
        setPreferredSize(new java.awt.Dimension(700, 500));

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel1.setText("Formulario de Inscripción");

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel2.setText("Seleccione un Alumno");

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel3.setText("Listado de Materias");

        jRadioButtonInscriptas.setText("Materias inscriptas");
        jRadioButtonInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonInscriptasActionPerformed(evt);
            }
        });

        jRadioButtonNoInscriptas.setText("Materias no inscriptas");
        jRadioButtonNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonNoInscriptasActionPerformed(evt);
            }
        });

        jtFormInsc.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtFormInsc);

        jbtnInscribir.setText("Inscribir");
        jbtnInscribir.setEnabled(false);
        jbtnInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnInscribirActionPerformed(evt);
            }
        });

        jbtnAnularInsc.setText("Anular Inscripcion");
        jbtnAnularInsc.setEnabled(false);

        jButton1.setText("Salir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(221, 221, 221))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioButtonInscriptas)
                                        .addGap(36, 36, 36)
                                        .addComponent(jRadioButtonNoInscriptas))
                                    .addComponent(jComboFormInsc, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnInscribir)
                .addGap(50, 50, 50)
                .addComponent(jbtnAnularInsc)
                .addGap(42, 42, 42)
                .addComponent(jButton1)
                .addGap(164, 164, 164))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboFormInsc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jRadioButtonNoInscriptas)
                    .addComponent(jRadioButtonInscriptas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnAnularInsc)
                    .addComponent(jbtnInscribir)
                    .addComponent(jButton1))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonNoInscriptasActionPerformed
        borrarFilaTabla();
        jRadioButtonInscriptas.setSelected(false);
        cargarMateriasNoInsc();
        jbtnInscribir.setEnabled(true);
        jbtnAnularInsc.setEnabled(false);
    }//GEN-LAST:event_jRadioButtonNoInscriptasActionPerformed

    private void jRadioButtonInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonInscriptasActionPerformed
        borrarFilaTabla();
        jRadioButtonNoInscriptas.setSelected(false);
        cargarMateriasInsc();
        jbtnAnularInsc.setEnabled(true);
        jbtnInscribir.setEnabled(false);
    }//GEN-LAST:event_jRadioButtonInscriptasActionPerformed

    private void jbtnInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnInscribirActionPerformed
        int filaSeleccionada = jtFormInsc.getSelectedRow();
        if (filaSeleccionada != -1) {
            Alumno alumno = (Alumno) jComboFormInsc.getSelectedItem();

            int idMateria = (Integer) jtFormInsc.getValueAt(filaSeleccionada, 0);
            String nombre = (String) jtFormInsc.getValueAt(filaSeleccionada, 1);
            int anio = (Integer) jtFormInsc.getValueAt(filaSeleccionada, 2);

            Materia materia = new Materia(idMateria, nombre, anio, true);

            Inscripcion insc = new Inscripcion(alumno, materia, 0);
            borrarFilaTabla();
        }
    }//GEN-LAST:event_jbtnInscribirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<Alumno> jComboFormInsc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRadioButtonInscriptas;
    private javax.swing.JRadioButton jRadioButtonNoInscriptas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnAnularInsc;
    private javax.swing.JButton jbtnInscribir;
    private javax.swing.JTable jtFormInsc;
    // End of variables declaration//GEN-END:variables

    private void cargarAlumnos() {
        for (Alumno a : alumnosCombo) {
            jComboFormInsc.addItem(a);
        }
    }

    private void armarCabeceraTabla() {
        List<Object> filaTabla = new ArrayList<>();
        filaTabla.add("Id");
        filaTabla.add("Nombre");
        filaTabla.add("Año");
        for (Object obj : filaTabla) {
            modelo.addColumn(obj);
        }
        jtFormInsc.setModel(modelo);
    }

    private void borrarFilaTabla() {
        int indice = modelo.getRowCount() - 1;

        for (int i = indice; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    private void cargarMateriasNoInsc() {
        Alumno aluSeleccionado = (Alumno) jComboFormInsc.getSelectedItem();

        listaM = inscData.obtenerMateriasNoCursadas(aluSeleccionado.getIdAlumno());

        for (Materia m : listaM) {
            modelo.addRow(new Object[]{m.getIdMateria(), m.getNombre(), m.getAnio()});
        }
    }

    public void cargarMateriasInsc() {
        Alumno aluSeleccionado = (Alumno) jComboFormInsc.getSelectedItem();

        listaM = inscData.obtenerMateriasCursadas(aluSeleccionado.getIdAlumno());

        for (Materia m : listaM) {
            modelo.addRow(new Object[]{m.getIdMateria(), m.getNombre(), m.getAnio()});
        }
    }

}
