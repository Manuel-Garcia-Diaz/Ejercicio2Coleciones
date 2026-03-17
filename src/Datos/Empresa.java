/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Generador.Generador;
import java.util.HashMap;
import java.util.Map;

public class Empresa {
    //Hash map Cliente
    //Has map Usuarios
Map<String,Usuario> mapaUsuarios = new HashMap<>();
Map<String,Cliente > mapaClientes= new HashMap<>();
Map<String,Rutina> mapaRutina =new HashMap<>();

    public Map<String, Usuario> getMapaUsuarios() {
        return mapaUsuarios;
    }

    public Map<String, Cliente> getMapaClientes() {
        return mapaClientes;
    }

    public Map<String, Rutina> getMapaRutina() {
        return mapaRutina;
    }

public void cargarRutina() {
    mapaRutina.put("Abductores",new Rutina("A","Abductores","Intermedio","Trabajo tren inferior"));
    mapaRutina.put("Gemelos",new Rutina("B","Gemelos","Bajo","Trabajo tren inferior"));
    mapaRutina.put("Pecho",new Rutina("C","Pecho","Alto","Trabajo tren Superior"));
    mapaRutina.put("Cuello",new Rutina("D","Cuello","Intermedio","Trabajo tren Superior"));
    }

    /* este e metodo permite cargar los usuarios
    sin que puedan existan repetidos.*/
    public void cargarUsuarios() {
        mapaUsuarios.put("Recep",
                new Usuario(Generador.getSHA("clave123"), 1));
        mapaUsuarios.put("Entrenador",
                new Usuario(Generador.getSHA("clave456"), 2));
        mapaUsuarios.put("Gerente",
                new Usuario(Generador.getSHA("clave789"), 3));
    }
    
    
    
}
