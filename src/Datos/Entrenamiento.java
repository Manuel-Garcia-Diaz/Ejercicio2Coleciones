/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import java.time.LocalDate;


public class Entrenamiento {
    private LocalDate fecha;
    private Rutina rutina;
    private int Peso;
    private int Series;
    private int Repeticiones;

    public Entrenamiento(LocalDate fecha, Rutina rutina, int Peso, int Series, int Repeticiones) {
        this.fecha = fecha;
        this.rutina = rutina;
        this.Peso = Peso;
        this.Series = Series;
        this.Repeticiones = Repeticiones;
    }

    public LocalDate getFecha() { return fecha; }
    public Rutina getRutina() { return rutina; }
    public int getPeso() { return Peso; }
    public int getSeries() { return Series; }
    public int getRepeticiones() { return Repeticiones; }
}
