/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

/**
 *
 * @author dam
 */
public class Entrenamiento {
   int Peso;
   int Series;
   int Repeticiones;

    public Entrenamiento(int Peso, int Series, int Repeticiones) {
        this.Peso = Peso;
        this.Series = Series;
        this.Repeticiones = Repeticiones;
    }

    public int getPeso() {
        return Peso;
    }

    public int getSeries() {
        return Series;
    }

    public int getRepeticiones() {
        return Repeticiones;
    }
   
}
