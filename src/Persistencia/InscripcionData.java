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
    public void guardarInscripcion(Inscripcion inscripcion) throws SQLException{
        String query = "INSERT INTO inscripcion (idAlumno, idMateria, nota) VALUES(?,?,?)";
        try{
             PreparedStatement ps = conexion.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
           ps.setInt (1, inscripcion.getAlumno().getIdAlumno());
           ps.setInt (2, inscripcion.getMateria().getIdMateria());
           ps.setDouble(3, inscripcion.getNota());
         
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()){
                inscripcion.setIdInscripcion(0);
                JOptionPane.showMessageDialog(null, "Inscripcion guardada con exito");
           
            }
            ps.close();
        }catch (SQLException e) {
             JOptionPane.showMessageDialog(null, "Error al guardar inscripcion");
        }
        
    }
    
    public void borrarInscripcion (int idAlumno, int idMateria) throws SQLException{
         String query = "DELETE FROM inscripcion WHERE idMateria = ? AND idAlumno = ?";
        
         try {
         
             PreparedStatement ps = conexion.prepareStatement(query);
         
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            int filas = ps.executeUpdate();
            if (filas > 0){
              JOptionPane.showMessageDialog(null, "inscripcion eliminada con exito");
             
         }else {
              JOptionPane.showMessageDialog(null, "no se enconro inscripcion para eliminar");
         }
    } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al eliminar la inscripcion");
    }
    }
  public void cargarNotas (int idAlumno, int idMateria, double nota) throws SQLException{
      String query = "UPDATE inscripcion SET nota = ? WHERE idMateria=? AND WHRE idAlumno = ?";
      try{
          PreparedStatement ps = conexion.prepareStatement(query);
          ps.setDouble(1, nota);
          ps.setInt(2, idAlumno);
          ps.setInt(2, idMateria);
          int filas = ps.executeUpdate();
          
          if (filas > 0) {
              JOptionPane.showMessageDialog(null, "nota cambiada correctamente");
          }
          ps.close();
      }catch (SQLException e){
          
      JOptionPane.showMessageDialog(null, "error al cambiar la nota");
    }
      
  }
   public List<Materia> obtenerMateriasCursadas (int idAlumno) throws SQLException{
      String query = "SELECT m.* FROM inscripcion i, materia m WHERE i.idMateria = m.idMateria AND i.idAlumno = ?";
      
      try{
           PreparedStatement ps = conexion.prepareStatement(query);
           ps.setInt(1, idAlumno);
           ResultSet rs = ps.executeQuery();
           
           while (rs.next()){
               Materia m = new Materia();
               m.setIdMateria(idAlumno);
               m.setNombre(query);
               m.setAnio(idAlumno);
               m.setEstado(true);
               Materia.add(m);

           }  
           ps.close();
      }catch (SQLException e){
                JOptionPane.showMessageDialog(null, "Error al mostrar materias cursadas");

          
      }
      return null;
   }
   public List<Materia> obtenerMateriasNoCursadas (int idAlumno) throws SQLException{
      String query = "SELECT m.* FROM materia WHERE estado = 1 AND idMateria not in " 
              + "(SELECT idMateria FROM inscripcion WHERE idAlumno = ?)";
      
      try{
           PreparedStatement ps = conexion.prepareStatement(query);
           ps.setInt(1, idAlumno);
           ResultSet rs = ps.executeQuery();
           
           while (rs.next()){
               Materia m = new Materia();
               m.setIdMateria(rs.getInt("idMateria"));
               m.setNombre(rs.getString ("Nombre"));
               m.setAnio(rs.getInt("Año"));
               m.setEstado(rs.getBoolean("Estado"));
               Materia.add(m);

           }  
           ps.close();
      }catch (SQLException e){
                JOptionPane.showMessageDialog(null, "Error al mostrar materias cursadas");

          
      }
      return null;
   }
   
    public List<Materia> obtenerAlumnoPorMateria (int idMateria) throws SQLException{
      String query = "SELECT m.idAlumno, dni, nombre, apellido, fechaNacimiento, estado " 
              + "( FROM inscripcion i,alumno a WHERE  i.idAlumno = a.idAlumno AND idMateria = ? AND a.estado = 1)";
      
      try{
           PreparedStatement ps = conexion.prepareStatement(query);
           ps.setInt(1, idMateria);
           ResultSet rs = ps.executeQuery();
           
           while (rs.next()){
               Materia m = new Materia();
               m.setIdMateria(rs.getInt("idMateria"));
               m.setNombre(rs.getString ("Nombre"));
               m.setAnio(rs.getInt("Año"));
               m.setEstado(rs.getBoolean("Estado"));
               Materia.add(m);

           }  
           ps.close();
      }catch (SQLException e){
                JOptionPane.showMessageDialog(null, "Error al no mostrar las materias no cursadas");

          
      }
      return null;
   }
   
    public List <Inscripcion > obtenerInscripcionesPorAlumno (int idAlumno) throws SQLException{
        List <Inscripcion> inscripciones = new ArrayList <>();
        
        String query = "SELECT * FROM inscripcion WHERE idAlumno = ?";
        
        try {
        PreparedStatement ps = conexion.prepareStatement(query);
        ps.setInt(1, idAlumno);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
           Inscripcion ins = new Inscripcion ();
           Alumno a = alumnoData.buscarAlumnoDni(rs.getInt("idAlumno"));
           Materia m = materiaData.buscarMateria(rs.getString("idMateria"));
           ins.setIdInscripcion(rs.getInt("IdInscripcion"));
           ins.setAlumno(a);
           ins.setMateria(m);
           ins.setNota(rs.getDouble("nota"));
           inscripciones.add(ins);
               
        }
        ps.close();
    
    
   }catch (SQLException e){
       JOptionPane.showMessageDialog(null, "Error");
   }
    
        return inscripciones;
   
}
    }

