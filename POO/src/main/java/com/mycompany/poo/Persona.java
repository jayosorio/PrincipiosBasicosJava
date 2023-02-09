/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo;

/**
 *
 * @author jayos
 */
public class Persona {
        
        String nombre;
        String apellido;
        int edad;
        String estado;
        boolean estudio;
        
        //void cumple(){
        //    System.out.println("La persona llamada " + nombre + " ha cumplido " + (edad + 1));
        //}
        
        int cumple(){
            return edad + 1;
        }
        
        void cambioEstado(String nuevoEstado){
            estado = nuevoEstado;
            System.out.println("El nuevo estado es: " + nuevoEstado);
        }
    }
