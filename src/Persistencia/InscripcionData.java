package Persistencia;

import java.sql.Connection;

public class InscripcionData {

    private Connection conexion = null;

    public InscripcionData() {
        this.conexion = Conexion.conectar();
    }
}
