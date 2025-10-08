package Persistencia;

import Modelo.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class MateriaData {

    private final Connection conexion;

    public MateriaData() {
        this.conexion = Conexion.conectar();
    }

    public void guardarMateria(Materia m) {

        String query = "INSERT INTO materia(nombre, anio, estado) VALUES(?,?,?)";

        try {
            PreparedStatement ps = conexion.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, m.getNombre());
            ps.setInt(2, m.getAnio());
            ps.setInt(3, m.getEstado());
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
                materiaEncontrada.setEstado(rs.getInt("estado"));
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

}
