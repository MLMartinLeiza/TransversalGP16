package Persistencia;

import Modelo.Alumno;
import Modelo.Inscripcion;
import Modelo.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class InscripcionData {

    private Connection conexion = null;
    private AlumnoData alumnoData;
    private MateriaData materiaData;

    public InscripcionData() {
        this.conexion = Conexion.conectar();
        alumnoData = new AlumnoData();
        materiaData = new MateriaData();

    }

    public void guardarInscripcion(Inscripcion inscripcion) {
        String query = "INSERT INTO inscripcion (idAlumno, idMateria, nota) VALUES(?,?,?)";
        try {
            PreparedStatement ps = conexion.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, inscripcion.getAlumno().getIdAlumno());
            ps.setInt(2, inscripcion.getMateria().getIdMateria());
            ps.setDouble(3, inscripcion.getNota());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                inscripcion.setIdInscripcion(0);
                JOptionPane.showMessageDialog(null, "Inscripcion guardada con exito");

            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar inscripcion");
        }

    }

    public void borrarInscripcion(int idAlumno, int idMateria) {
        String query = "DELETE FROM inscripcion WHERE idMateria = ? AND idAlumno = ?";

        try {

            PreparedStatement ps = conexion.prepareStatement(query);

            ps.setInt(1, idMateria);
            ps.setInt(2, idAlumno);
            int filas = ps.executeUpdate();
            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "inscripcion eliminada con exito");

            } else {
                JOptionPane.showMessageDialog(null, "no se enconro inscripcion para eliminar");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al eliminar la inscripcion");
        }
    }

    public void cargarNotas(int idAlumno, int idMateria, double nota) {
        String query = "UPDATE inscripcion SET nota = ? WHERE idMateria=? AND idAlumno = ?";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
            int filas = ps.executeUpdate();

            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "nota cambiada correctamente");
            }
            ps.close();
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "error al cambiar la nota");
        }

    }

    public List<Materia> obtenerMateriasCursadas(int idAlumno) {
        List<Materia> materias = new ArrayList<>();
        String query = "SELECT inscripcion.idMateria, nombre, anio FROM inscripcion, materia "
                + " WHERE inscripcion.idMateria = materia.idMateria "
                + " AND inscripcion.idAlumno = ?";

        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Materia m = new Materia();
                m.setIdMateria(rs.getInt("idMateria"));
                m.setNombre(rs.getString("nombre"));
                m.setAnio(rs.getInt("anio"));
                materias.add(m);

            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar materias cursadas");

        }
        return materias;
    }

    public List<Materia> obtenerMateriasNoCursadas(int idAlumno) {

        List<Materia> materias = new ArrayList<>();
        String query = "SELECT * "
                + "FROM materia "
                + "WHERE estado = 1 "
                + "AND idMateria NOT IN "
                + "(SELECT idMateria FROM inscripcion WHERE idAlumno = ?)";

        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Materia m = new Materia();
                m.setIdMateria(rs.getInt("idMateria"));
                m.setNombre(rs.getString("nombre"));
                m.setAnio(rs.getInt("anio"));
                m.setEstado(rs.getBoolean("estado"));
                materias.add(m);

            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar materias cursadas");

        }
        return materias;
    }

    public List<Materia> obtenerAlumnoPorMateria(int idMateria) {
        List<Materia> materias = new ArrayList<>();
        String query = "SELECT m.idAlumno, dni, nombre, apellido, fechaNacimiento, estado "
                        + "( FROM inscripcion i,alumno a "
                        + "WHERE  i.idAlumno = a.idAlumno "
                            + "AND idMateria = ? "
                            + "AND a.estado = 1)";

        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setInt(1, idMateria);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Materia m = new Materia();
                m.setIdMateria(rs.getInt("idMateria"));
                m.setNombre(rs.getString("nombre"));
                m.setAnio(rs.getInt("anio"));
                m.setEstado(rs.getBoolean("estado"));
                materias.add(m);

            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al no mostrar las materias no cursadas");

        }
        return materias;
    }

    public List<Inscripcion> obtenerInscripcionesPorAlumno(int idAlumno) {
        List<Inscripcion> inscripciones = new ArrayList<>();

        String query = "SELECT * FROM inscripcion WHERE idAlumno = ?";

        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Inscripcion ins = new Inscripcion();
                Alumno a = alumnoData.buscarAlumnoDni(rs.getInt("idAlumno"));
                Materia m = materiaData.buscarMateria(rs.getString("idMateria"));
                ins.setIdInscripcion(rs.getInt("IdInscripcion"));
                ins.setAlumno(a);
                ins.setMateria(m);
                ins.setNota(rs.getDouble("nota"));
                inscripciones.add(ins);

            }
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error");
        }

        return inscripciones;

    }

}
    

