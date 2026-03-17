/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

public class Rutina {
    String CodRutina;
    String Nombre;
    String Nivel;
    String Descripcion;

    public Rutina(String CodRutina, String Nombre, String Nivel, String Descripcion) {
        this.CodRutina = CodRutina;
        this.Nombre = Nombre;
        this.Nivel = Nivel;
        this.Descripcion = Descripcion;
    }

    public String getCodRutina() {
        return CodRutina;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getNivel() {
        return Nivel;
    }

    public String getDescripcion() {
        return Descripcion;
    }
    
    
}
