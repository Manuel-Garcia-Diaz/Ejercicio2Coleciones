/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;



public class Rutina {
    private String codRutina;
    private String nombre;
    private String nivel;
    private String descripcion;

    public Rutina(String codRutina, String nombre, String nivel, String descripcion) {
        this.codRutina = codRutina;
        this.nombre = nombre;
        this.nivel = nivel;
        this.descripcion = descripcion;
    }

    public String getCodRutina() { return codRutina; }
    public String getNombre() { return nombre; }
    public String getNivel() { return nivel; }
    public String getDescripcion() { return descripcion; }
    
    @Override
    public String toString() {
        return nombre + " (" + nivel + ")";
    }
}