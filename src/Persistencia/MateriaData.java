package Persistencia;

import Modelo.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class MateriaData {

    private Connection conexion = null;

    public MateriaData() {
        this.conexion = Conexion.conectar();
    }

    public void guardarMateria(Materia m) {

        String query = "INSERT INTO materia(nombre, anio, estado) VALUES(?,?,?)";

        try {
            PreparedStatement ps = conexion.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, m.getNombre());
            ps.setInt(2, m.getAnio());
            ps.setBoolean(3, m.isEstado());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                m.setIdMateria(1);
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo obtener ID");
            }
            ps.close();
            JOptionPane.showMessageDialog(null, "Guardado");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla materia");
        }
    }

    public Materia buscarMateria(String nombreMateria) {
        Materia materiaEncontrada = null;
        String query = "SELECT * FROM materia WHERE nombre = ?";

        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setString(1, nombreMateria);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                materiaEncontrada = new Materia();
                materiaEncontrada.setIdMateria(rs.getInt("idMateria"));
                materiaEncontrada.setNombre(rs.getString("nombre"));
                materiaEncontrada.setAnio(rs.getInt("anio"));
                materiaEncontrada.setEstado(rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro la materia");
            }

            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
        }
        return materiaEncontrada;
    }

    public void modificarMateria(Materia m) {
        String query = "UPDATE materia SET nombre=?, anio=? WHERE idMateria = ?";

        try {
            PreparedStatement ps = conexion.prepareStatement(query);

            ps.setString(1, m.getNombre());
            ps.setInt(2, m.getAnio());
            ps.setInt(3, m.getIdMateria());

            int logrado = ps.executeUpdate();

            if (logrado == 1) {
                JOptionPane.showMessageDialog(null, "Materia actualizada");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
        }
    }

    public void bajaLogicaMateria(int idMateria) {
        String query = "UPDATE materia SET estado=0 WHERE IdMateria=?";

        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setInt(1, idMateria);
            int baja = ps.executeUpdate();

            if (baja == 1) {
                JOptionPane.showMessageDialog(null, "Materia eliminada");
            }

            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
        }
    }

    public void altaLogicaMateria(int idMateria) {
        String query = "UPDATE materia SET estado=1 WHERE idMateria=?";

        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setInt(1, idMateria);
            int alta = ps.executeUpdate();

            if (alta == 1) {
                JOptionPane.showMessageDialog(null, "Alta confirmada");
            }
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
        }

    }

    public List<Materia> listarMaterias() {

        String query = "SELECT idMateria, nombre, anio FROM materia WHERE estado=1";
        List<Materia> materias = new ArrayList<>();

        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("anio"));
                materias.add(materia);

                ps.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
        }
        return materias;
    }

    public void eliminarMateria(int idMateria) {
        String query = "DELETE FROM materia WHERE idMateria = ?";

        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setInt(1, idMateria);
            int eliminado = ps.executeUpdate();
            
            if(eliminado == 1){
            JOptionPane.showMessageDialog(null, "Materia eliminada correctamente");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
        }

    }

}
