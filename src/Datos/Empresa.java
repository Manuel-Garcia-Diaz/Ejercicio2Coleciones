/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Generador.Generador;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Empresa {
    Map<String, Usuario> mapaUsuarios = new HashMap<>();
    Map<String, Cliente> mapaClientes = new HashMap<>();
    Map<String, Rutina> mapaRutina = new HashMap<>();
    
    // Colección para el Control de Presencia (Aforo Actual)
    Set<String> aforoActual = new HashSet<>();

    public Map<String, Usuario> getMapaUsuarios() { return mapaUsuarios; }
    public Map<String, Cliente> getMapaClientes() { return mapaClientes; }
    public Map<String, Rutina> getMapaRutina() { return mapaRutina; }

    // --- FUNCIONES DEL RECEPCIONISTA ---

    // Alta de Clientes: Registro de DNI, nombre y tipo de suscripción
    public boolean altaCliente(String dni, String nombre, String suscripcion) {
        if (!mapaClientes.containsKey(dni)) {
            mapaClientes.put(dni, new Cliente(dni, nombre, suscripcion));
            return true;
        }
        return false; // El DNI ya existe
    }

    // Control de Presencia (Check-in): Al introducir el DNI, entra en el "Aforo Actual"
    public boolean checkIn(String dni) {
        if (mapaClientes.containsKey(dni) && !aforoActual.contains(dni)) {
            aforoActual.add(dni);
            return true;
        }
        return false; // El cliente no existe o ya está dentro
    }

    // Salida del gimnasio (Check-out)
    public boolean checkOut(String dni) {
        return aforoActual.remove(dni);
    }

    // --- FUNCIONES DEL ENTRENADOR ---

    // Mantenimiento de Rutinas: Dar de alta las rutinas base
    public boolean altaRutina(String codRutina, String nombre, String nivel, String descripcion) {
        if (!mapaRutina.containsKey(codRutina)) {
            mapaRutina.put(codRutina, new Rutina(codRutina, nombre, nivel, descripcion));
            return true;
        }
        return false; // El código de rutina ya existe
    }

    // Asignación y Registro de Actividad
    public boolean asignarEntrenamiento(String dni, String codRutina, int peso, int series, int repeticiones, LocalDate fecha) {
        Cliente cliente = mapaClientes.get(dni);
        Rutina rutina = mapaRutina.get(codRutina);
        
        if (cliente != null && rutina != null) {
            Entrenamiento nuevoEntrenamiento = new Entrenamiento(fecha, rutina, peso, series, repeticiones);
            cliente.getEntrenamientos().add(nuevoEntrenamiento);
            return true;
        }
        return false; // Cliente o Rutina no encontrados
    }

    // --- FUNCIONES DEL GERENTE (Estadísticas) ---

    // Visualización de estadísticas: cuántos clientes hay actualmente en el centro
    public int getCantidadAforoActual() {
        return aforoActual.size();
    }
    
    // Conjunto de DNI de las personas dentro para mostrar en tablas si se requiere
    public Set<String> getClientesEnAforo() {
        return aforoActual;
    }

    // --- CARGA DE DATOS INICIALES ---
    
    public void cargarRutina() {
        mapaRutina.put("Abductores", new Rutina("A","Abductores","Intermedio","Trabajo tren inferior"));
        mapaRutina.put("Gemelos", new Rutina("B","Gemelos","Bajo","Trabajo tren inferior"));
        mapaRutina.put("Pecho", new Rutina("C","Pecho","Alto","Trabajo tren Superior"));
        mapaRutina.put("Cuello", new Rutina("D","Cuello","Intermedio","Trabajo tren Superior"));
    }

    public void cargarUsuarios() {
        // NOTA: El PDF indica que deben ser contraseñas hasheadas mediante MD5
        // Asegúrate de que Generador.getSHA() use MD5 internamente o renómbralo a getMD5()
        mapaUsuarios.put("Recep", new Usuario(Generador.getSHA("clave123"), 1));
        mapaUsuarios.put("Entrenador", new Usuario(Generador.getSHA("clave456"), 2));
        mapaUsuarios.put("Gerente", new Usuario(Generador.getSHA("clave789"), 3));
        mapaUsuarios.put("p", new Usuario(Generador.getSHA("p"), 3));
    }
}
