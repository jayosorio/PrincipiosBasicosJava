/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo;

import java.util.ArrayList;

/**
 *
 * @author jayos
 */
public class Main {
    
    public static void main(String[] args) {
        
        Persona persona1 = new Persona();
        persona1.nombre = "yair";
        persona1.apellido = "osorio";
        persona1.edad = 31;
        persona1.estado = "union libre";
        persona1.estudio = true; 
        
        Persona persona2 = new Persona();
        persona2.nombre = "maria";
        persona2.apellido = "zapata";
        persona2.edad = 26;
        persona2.estado = "union libre";
        persona2.estudio = false;
        
        System.out.println("persona1 = " + persona1.nombre);
        System.out.println("persona2 = " + persona2.apellido);
        
        persona1.apellido = "osorio meza";
        System.out.println("persona1 = " + persona1.apellido);
        
        System.out.println("La edad de Maria es " + persona2.edad);
        persona2.cumple();
        
        System.out.println(persona2.cumple());
        
        System.out.println(persona2.estado);
        persona2.cambioEstado("casado");
        System.out.println(persona2.estado);
        
        ArrayList<String> Lista = new ArrayList<String>();
        
        Lista.add("manzana");
        Lista.add("pera");
        Lista.add("uvas");
        Lista.add("banano");
        
        System.out.println(Lista);
        
        Lista.add("guayaba");
        System.out.println(Lista);
        
        Lista.remove("pera");
        System.out.println(Lista);
        
        Lista.clear();
        System.out.println(Lista);
            
    }
}
