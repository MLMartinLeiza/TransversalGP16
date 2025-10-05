package Vista;

import Modelo.Alumno;
import Modelo.Materia;
import Persistencia.AlumnoData;
import Persistencia.Conexion;
import Persistencia.MateriaData;
import java.sql.Connection;
import java.time.LocalDate;
import java.util.List;


public class TransversalGP16 {

    public static void main(String[] args) {

        /*Alumno brayan = new Alumno(42278291, "Arce", "Brayan", LocalDate.of(1999, 12, 16), 1);

        AlumnoData alu = new AlumnoData();

        alu.guardarAlumno(brayan);

        Alumno jonatan = new Alumno(39092552, "Aguero", "Jonatan", LocalDate.of(1995, 9, 10), 1);

        alu.guardarAlumno(jonatan);

        Alumno eduardo = new Alumno(24681663, "Giménez", "Héctor", LocalDate.of(1975, 11, 19), 1);

        alu.guardarAlumno(eduardo);

        Alumno santiago = new Alumno(44283749, "Gomez", "Santiago", LocalDate.of(2001, 05, 12), 1);

        alu.guardarAlumno(santiago);

        Alumno martin = new Alumno(41574821, "Leiza", "Martin", LocalDate.of(1995, 10, 5), 1);

        alu.guardarAlumno(martin);

        Alumno paula = new Alumno(42516816, "Giménez", "Paula", LocalDate.of(1997, 06, 15), 1);

        alu.guardarAlumno(paula);

        Alumno milagros = new Alumno(44285298, "Alfaro", "Milagros", LocalDate.of(2000, 07, 18), 1);

        alu.guardarAlumno(milagros);
        
        Alumno juan = new Alumno(44000000, "APerez", "Juan", LocalDate.of(2000, 07, 18), 1);

        alu.guardarAlumno(juan);

        //-----PRUEBO  BUSCAR UN ALUMNO POR DNI 
//     Alumno encontrado= alu.buscarAlumnonDni(42278291);
//     
//     if(encontrado !=null){
//         System.out.println("Alumno encontrado: "+encontrado);
//     }
        //-------- LISTAR ALUMNOS ACTIVOS------
        List<Alumno> listaActivos = alu.listarAlumnosActivos();

        System.out.println("------- alumnos activos--------");

        for (Alumno a : listaActivos) {
            System.out.println(a);
        }

        //--------------Prueba de dar baja a alumno---------------
//        
//        alu.darBaja(2);
//                
//         List<Alumno> listaActivos2 = alu.listarAlumnosActivos();
//        
//        System.out.println("------- alumnos activos--------");
//        
//        
//        
//        for (Alumno a: listaActivos2){
//            System.out.println(a);
//        }
        //----------Prueba de elimar alumno de la tabla-----------
//        System.out.println("------------");
//  alu.eliminarAumno(5);
//  
//  listaActivos = alu.listarAlumnosActivos();
//  
//        for (Alumno a : listaActivos) {
//            System.out.println(a);
//        }*/
        
        /*
        // Prueba de cargar una materia
        
        Materia materia = new Materia("Matemática", 2025, 1);
        
        MateriaData materiaData = new MateriaData();
        
        materiaData.guardarMateria(materia);*/
        
    }

}
