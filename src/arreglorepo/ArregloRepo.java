/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglorepo;

import java.util.Scanner;

/**
 *
 * @author Damian Amell
 */
public class ArregloRepo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Gestión de Arreglos");
        Scanner x = new Scanner(System.in);
        System.out.print("Digite el tamaño del arreglo: ");
        int tam = x.nextInt();
        int[] arreglo = new int[tam];
        
        for(int i = 0; i < arreglo.length; i++){
            System.out.print("Digite la posición " + (i + 1) + " del arreglo: ");
            int pos = x.nextInt();
            arreglo[i] = pos;
        }
        
        System.out.println("");
        
        for(int k : arreglo){
            System.out.print( k + " ");
        }
        
        System.out.println("");
            
    }
    
}
