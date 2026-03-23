/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import java.time.LocalDate;




public class Entrenamiento {
    private LocalDate fecha;
    private Rutina rutina;
    private int peso;
    private int series;
    private int repeticiones;

    public Entrenamiento(LocalDate fecha, Rutina rutina, int peso, int series, int repeticiones) {
        this.fecha = fecha;
        this.rutina = rutina;
        this.peso = peso;
        this.series = series;
        this.repeticiones = repeticiones;
    }

    public LocalDate getFecha() { return fecha; }
    public Rutina getRutina() { return rutina; }
    public int getPeso() { return peso; }
    public int getSeries() { return series; }
    public int getRepeticiones() { return repeticiones; }
}

