/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin10;

import javax.swing.JOptionPane;

/**
 *
 * @author erodriguez-lepinamartinez
 */
public class Boletin10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ejercicio 1
        
        int secreto=0, oportunidades=0, secreto2=0;
        boolean juego=false;
        
        
        for(int i=0; ;i++){
            secreto = Integer.parseInt(JOptionPane.showInputDialog("J1. Introduzca o número a adiviñar:"));
        
           if(secreto>=1 && secreto<=50){
            oportunidades = Integer.parseInt(JOptionPane.showInputDialog("J1. Introduzca o número de intentos:"));
            break;
            }
        }
        
        for(int i=0; ;i++){
            secreto2 = Integer.parseInt(JOptionPane.showInputDialog("J2. Introduzca un número:"));
            if(secreto2 == secreto){
                juego=true;
                break;
            }
            else{
                if(secreto2>secreto){
                JOptionPane.showMessageDialog(null, "Te has pasado! Te quedan " + oportunidades + " oportunidades.");    
                }
                else
                JOptionPane.showMessageDialog(null, "Te has quedado corto.  Te quedan " + oportunidades + " oportunidades.");
                oportunidades--;
            }
                
            if(oportunidades==-1){
                    juego=false;
                    break;
                }
        }
        if(juego==true){
             JOptionPane.showMessageDialog(null, "Enhorabuena");
        }
             else
             JOptionPane.showMessageDialog(null, "Has perdido");
        
    }
    
}
