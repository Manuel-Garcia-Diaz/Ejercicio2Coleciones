/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
public class Empresa {
    private Map<String, Usuario> mapaUsuarios = new HashMap<>();
    private Map<String, Cliente> mapaClientes = new HashMap<>();
    private Map<String, Rutina> mapaRutinas = new HashMap<>();
    private Set<String> aforoActual = new HashSet<>();
    private Usuario usuarioLogueado;

    public void cargarUsuarios() {
       
    // Al usar generarMD5("1234"), el sistema calcula el hash y lo guarda
    mapaUsuarios.put("recepcion", new Usuario("recepcion", generarMD5("1234"), 1));
    mapaUsuarios.put("entrenador", new Usuario("entrenador", generarMD5("1234"), 2));
    mapaUsuarios.put("admin", new Usuario("admin", generarMD5("1234"), 3));

    }

    public void cargarRutina() {
        mapaRutinas.put("A", new Rutina("A", "Hipertrofia Pierna", "Intermedio", "Día de pierna"));
    }

    // --- Alta Clientes ---
    public boolean altaCliente(String dni, String nombre, String suscripcion) {
        if (!mapaClientes.containsKey(dni)) {
            mapaClientes.put(dni, new Cliente(dni, nombre, suscripcion));
            return true;
        }
        return false;
    }
// Método para buscar un usuario por su nombre de usuario en el mapa
public Usuario getUsuario(String User) {
    return mapaUsuarios.get(User);
}
private String generarMD5(String password) {
    try {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(password.getBytes());
        byte[] digest = md.digest();
        StringBuilder sb = new StringBuilder();
        for (byte b : digest) {
            sb.append(String.format("%02x", b & 0xff));
        }
        return sb.toString();
    } catch (NoSuchAlgorithmException e) {
        e.printStackTrace();
        return null;
    }
}
    // --- Control Aforo ---
    public boolean checkIn(String dni) {
        if (mapaClientes.containsKey(dni) && !aforoActual.contains(dni)) {
            aforoActual.add(dni);
            return true;
        }
        return false;
    }
    public boolean checkOut(String dni) { return aforoActual.remove(dni); }
    public int getCantidadAforoActual() { return aforoActual.size(); }

    // --- Rutinas ---
    public void addRutina(Rutina r) { mapaRutinas.put(r.getCodRutina(), r); }
    public Rutina getRutina(String cod) { return mapaRutinas.get(cod); }

    // --- Getters generales ---
    public Cliente getCliente(String dni) { return mapaClientes.get(dni); }
    public Map<String, Rutina> getMapaRutinas() { return mapaRutinas; }
    
    // --- Login ---
    public void setUsuarioLogueado(Usuario u) { this.usuarioLogueado = u; }
    public Usuario getUsuarioLogueado() { return usuarioLogueado; }
}

