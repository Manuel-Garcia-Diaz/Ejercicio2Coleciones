/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import java.util.ArrayList;


public class Cliente {
    private String DNI;
    private String nombre;
    private String subscripcion;
    private ArrayList<Entrenamiento> historialEntrenamientos;

    public Cliente(String DNI, String nombre, String subscripcion) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.subscripcion = subscripcion;
        this.historialEntrenamientos = new ArrayList<>();
    }

    public String getDNI() { return DNI; }
    public String getNombre() { return nombre; }
    public String getSubscripcion() { return subscripcion; }
    public ArrayList<Entrenamiento> getHistorial() { return historialEntrenamientos; }

    public void registrarEntrenamiento(Entrenamiento e) {
        historialEntrenamientos.add(e);
    }
}
    

