/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author oquintansocampo
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Condicional par1 = new Condicional();
        String nombre1 = par1.nombre();
        double peso1 = par1.peso();
        String nombre2 = par1.nombre();
        double peso2 = par1.peso();
        par1.comparar(peso1, peso2, nombre1, nombre2);
    }

}
