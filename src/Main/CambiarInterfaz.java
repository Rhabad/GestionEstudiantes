/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Vistas.ActualizarDatos;
import Vistas.Agregar;
import Vistas.Calificaciones;
import Vistas.Menu;
import Vistas.Mostrar;

/**
 *
 * @author NICOLAS
 */
public class CambiarInterfaz {
    private Menu men = new Menu();
    private Agregar agre = new Agregar();
    private ActualizarDatos act = new ActualizarDatos();
    private Calificaciones cali = new Calificaciones();
    private Mostrar mos = new Mostrar();
    
    //desde cualquier interfaz ingresado, regresa a menu.
    public void regresarMenu(){
        men.setVisible(true);
        men.setResizable(false);
        men.setLocationRelativeTo(null);
    }
    
    //estando en menu y al precionar btnIngresar
    //entra en la interfaz Ingresar
    public void cambiaraAgregar(){
        agre.setVisible(true);
        agre.setResizable(false);
        agre.setLocationRelativeTo(null);
    }
    
    //cambia a actualizar
    public void cambiarActualizar(){
        act.setVisible(true);
        act.setResizable(true);
        act.setLocationRelativeTo(null);
    }
    
    //cambiar a calificaciones
    public void cambiarCalificaciones(){
        cali.setVisible(true);
        cali.setResizable(true);
        cali.setLocationRelativeTo(null);
    }
    
    //cambiar a mostrar
    public void cambiarMostrar(){
        mos.setVisible(true);
        mos.setResizable(true);
        mos.setLocationRelativeTo(null);
    }
}
