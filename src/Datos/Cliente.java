/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import java.util.ArrayList;

/**
 *
 * @author dam
 */
public class Cliente {
    String DNI; // clave cliente . 
    String Nombre;
    String Subscripcion;
 //crear array list Entrenamiento
//Entrenamiento --> Fecha, codigo Rutina , peso , Series , Repeticiones .
    //(Esta clase) presencia o array list de clientes que estan dentro del gym en (clase emresa)
    ArrayList<Entrenamiento>Entrenamientos;
    
    public Cliente(String DNI, String Nombre, String Subscripcion) {
        this.DNI = DNI;
        this.Nombre = Nombre;
        this.Subscripcion = Subscripcion;
        Entrenamientos = new ArrayList<>();
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getSubscripcion() {
        return Subscripcion;
    }

    public ArrayList<Entrenamiento> getEntrenamientos() {
        return Entrenamientos;
    }
    
    
}
