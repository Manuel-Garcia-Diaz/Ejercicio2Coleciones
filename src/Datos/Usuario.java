/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

/**
 *
 * @author dam
 */
public class Usuario {
    String contra;
    int perfil;
   
   

    public Usuario(String contra, int perfil) {
        this.contra = contra;
        this.perfil = perfil;
    }

    public String getContra() {
        return contra;
    }

    public int getPerfil() {
        return perfil;
    }
    
}

