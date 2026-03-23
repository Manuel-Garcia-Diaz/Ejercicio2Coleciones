/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;



public class Usuario {
    private String nombreUsuario; // Añadido para mejor identificación
    private String contraHash; // Contraseña en MD5
    private int perfil; // 1: Recepcionista, 2: Entrenador, 3: Gerente

    public Usuario(String nombreUsuario, String contraHash, int perfil) {
        this.nombreUsuario = nombreUsuario;
        this.contraHash = contraHash;
        this.perfil = perfil;
    }

    public int getPerfil() { return perfil; }
    public String getContraHash() { return contraHash; }
    public String getNombreUsuario() { return nombreUsuario; }
}
