/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author NICOLAS
 */
import Vistas.Menu;
import Conexiones.Conexion;

public class GEstudiantesAPP {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Conexion con = new Conexion();
        
        menu.setVisible(true);
        menu.setResizable(false);
        menu.setLocationRelativeTo(null);
        
        con.conectar(); //probando que conecta
        
    }
}
