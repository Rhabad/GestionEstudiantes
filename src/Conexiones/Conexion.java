/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

import Vistas.Calificaciones;
import java.util.Date;

/**
 *
 * @author NICOLAS
 */
public class Conexion {
    private String bd = "GestionEstudiantes";
    private String url = "jdbc:mysql://localhost:3306/";
    private String user = "prueba";
    private String pass = "123";
    private String driver = "com.mysql.cj.jdbc.Driver";
    
    Connection con;
    
    public Conexion(){
    }
    
    //metodo para que conecte, retorna la cn
    public Connection conectar(){
        Connection cn = null;
        try {
            Class.forName(driver);
            cn = DriverManager.getConnection(url+bd, user, pass);
            System.out.println("Conectado");
        } catch (Exception e) {
            System.err.println(e);
        }
        
        return cn;
    }
    
    
    //creamos la consulta de insertar nuevos alumnos
    public void agregarAlumnos(int rut, String nombres, String apellidoP, String apellidoM, String fechaNacimiento, int carreras){
        try {
            //creamos la conexion
            con = conectar();
            
            //ingresamos la consulta
            PreparedStatement ps = con.prepareStatement("insert into alumnos (rut, nombres, apellidoP, apellidoM, fechaNacimiento, idCarrerasFK)\n" +
                                                        "values(?, ?, ?, ?, ?, ?);");
            //se agrega al campo correspondiente, por ejemplo campo 1, rut 123
            ps.setInt(1, rut);
            ps.setString(2, nombres);
            ps.setString(3, apellidoP);
            ps.setString(4, apellidoM);
            ps.setString(5, fechaNacimiento);
            ps.setInt(6, carreras);
            
            int res = ps.executeUpdate();
            
            if (res >0) {
                JOptionPane.showMessageDialog(null, "Alumno inscrito");
                
            } else {
                JOptionPane.showMessageDialog(null, "Error al inscribir el alumno");
            }
            con.close();
        } catch (Exception e) {
            System.err.println(e);
        }
        
        
        
    }
    
    //actualizamos registro del alumno
    public void actualizarAlumno(int rut, String nombres, String apellidoP, String apellidoM, String fechaNacimiento, int carreras){
        try {
            con = conectar();
        
            PreparedStatement ps = con.prepareStatement("update alumnos set nombres = ?, apellidoP = ?, apellidoM = ?, "
                    + "fechaNacimiento = ?, idCarrerasFK = ? where rut = ?;");
            
            
            ps.setString(1, nombres);
            ps.setString(2, apellidoP);
            ps.setString(3, apellidoM);
            ps.setString(4, fechaNacimiento);
            ps.setInt(5, carreras);
            ps.setInt(6, rut);
            
            int res = ps.executeUpdate();
            
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Alumno Actualizado");
            } else {
                JOptionPane.showMessageDialog(null, "Error al modificar");
            }
            
            con.close();
        } catch (Exception e) {
            System.err.println(e);
        }
        
        
        
    }
    
    //Mostramos el alumno por completo
    public void mostrarAlumno(int rut){
        try {
            con = conectar();
            
            PreparedStatement ps = con.prepareStatement("SELECT alumnos.*, carreras.nombreCarrera AS nombreCarrera\n" +
                                                        "FROM alumnos\n" +
                                                        "INNER JOIN carreras ON alumnos.idCarrerasFK = carreras.idCarrera\n" +
                                                        "WHERE alumnos.rut = ?;");
            ps.setInt(1, rut);
            
            ResultSet res = ps.executeQuery();
            if (res.next()) {
                
                int rutn = res.getInt("rut");
                String nombres = res.getString("nombres");
                String apellidoP = res.getString("apellidoP");
                String apellidoM = res.getString("apellidoM");
                String fecha = res.getString("fechaNacimiento");
                int idCarrera = res.getInt("idCarrerasFK");
                String nombreCarrera = res.getString("nombreCarrera");
                
                JOptionPane.showMessageDialog(null, rutn+"  "+nombres+"  "+apellidoP+"  "+apellidoM+"  "+fecha+"  "+idCarrera+"  "+nombreCarrera);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron registros para el rut: "+rut);
            }
            con.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
    public void eliminarAlumno(int rut){
        try {
            con = conectar();

            PreparedStatement ps = con.prepareStatement("delete from alumnos where rut = ?;");
            ps.setInt(1, rut);
            
            int res = ps.executeUpdate();
            
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Alumno eliminado del registro");
            } else {
                JOptionPane.showMessageDialog(null, "Error al Eliminar alumno");
            }
            
            con.close();
        } catch (Exception e) {
        }
        
        
    }
    
    public String mostrarCalificacionesAlumno(int rut){
        try {
            StringBuilder registrados = new StringBuilder();
            con = conectar();
            
            PreparedStatement ps = con.prepareStatement("SELECT c.rutFK, m.nom_materia, c.idMateriaFK, c.cal1, c.cal2, cal3, cal4\n" +
                                                        "FROM calificaciones c\n" +
                                                        "INNER JOIN materias m ON c.idmateriafk = m.idMateria\n" +
                                                        "where c.rutFK = ?;");
            ps.setInt(1, rut);
            
            ResultSet rs = ps.executeQuery();
            
            //con un while para que recorra los registros, que son varios
            while (rs.next()) {
                int rut1 = rs.getInt("rutFK");
                String nombreMateria = rs.getString("nom_materia");
                int idmat = rs.getInt("idMateriaFK");
                double not1 = rs.getDouble("cal1");
                double not2 = rs.getDouble("cal2");
                double not3 = rs.getDouble("cal3");
                double not4 = rs.getDouble("cal4");
                
                String elrut = String.valueOf(rut1);
                String idmateria = String.valueOf(idmat);
                String notas = String.valueOf(not1) +"  "+String.valueOf(not2)+"  "+String.valueOf(not3)+"  "+String.valueOf(not4);
                
                registrados.append(elrut).append("  ").append(nombreMateria).append("  ").append(idmateria).append("-->> ").append(notas).append("\n");
            }
            
            con.close();
            return registrados.toString();
        } catch (Exception e) {
            System.err.println(e);
        }
        return null;
    }
    
    public void ingresarNotasAlumno(int rut, int idmateria, double cal1, double cal2, double cal3, double cal4){
        try {
            con = conectar();
            
            PreparedStatement ps = con.prepareStatement("insert into calificaciones (cal1, cal2, cal3, cal4, rutFK, idMateriaFK)"
                                                        + "values (?,?,?,?,?,?);");
            
            ps.setDouble(1, cal1);
            ps.setDouble(2, cal2);
            ps.setDouble(3, cal3);
            ps.setDouble(4, cal4);
            ps.setInt(5, rut);
            ps.setInt(6, idmateria);
            
            int res = ps.executeUpdate();
            
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Calificaciones agregadas al alumno "+rut);
            } else {
                JOptionPane.showMessageDialog(null, "Error al ingresar notas o rut '"+rut+"' no existe");
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
    public String motrarTodosAlumnos(){
        try {
            StringBuilder losAlumnos = new StringBuilder();
            con = conectar();
            
            PreparedStatement ps = con.prepareStatement("select a.rut, a.nombres, a.apellidoP, a.apellidoM, a.fechaNacimiento, a.idCarrerasFK, c.nombreCarrera from alumnos a\n" +
                                                        "inner join carreras c on c.idCarrera = a.idCarrerasFK\n" +
                                                        "where a.rut;");
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {                
                int rut = rs.getInt("rut");
                String nombres = rs.getString("nombres");
                String apellidoP = rs.getString("apellidoP");
                String apellidoM = rs.getString("apellidoM");
                Date fechaNacimiento = rs.getDate("fechaNacimiento");
                int idcarrera = rs.getInt("idCarrerasFK");
                String carrera = rs.getString("nombreCarrera");
                
                String elrut = String.valueOf(rut);
                String laCarreraid = String.valueOf(idcarrera);
                
                losAlumnos.append(elrut).append("  ").append(nombres).append("  ").append(apellidoP).append("  ").append(apellidoM).append("  ").append(fechaNacimiento).append("  ").append(laCarreraid).append("  ").append(carrera).append("\n");
            }
            con.close();
            return losAlumnos.toString();
        } catch (Exception e) {
        }
        
        return null;
    }
    
    
}
