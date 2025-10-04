package Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    private static Connection conexion;

    public static Connection conectar() {
        if (conexion == null) {

            try {
                Class.forName("org.mariadb.jdbc.Driver");
                conexion = DriverManager.getConnection("jdbc:mariadb://localhost/universidad_grupo16", "root", "");
                JOptionPane.showMessageDialog(null, "Base de datos conectada exitosamente");
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar los Driver de conexion" + ex.getMessage());
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al conectar base de datos" + e.getMessage());
            }

        }
        return conexion;
    }

}
