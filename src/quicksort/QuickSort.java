
package quicksort;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author OscarNedzelsky   A00513376
 */
public class QuickSort {

    public static void main(String[] args) {
        int array [] = Algoritmo.setArray(); //Manda a llamar al metodo que crea el arreglo.
        System.out.println("Este es su arreglo:");
        System.out.println(Arrays.toString(array)); //Muestra el arreglo.
        array = Algoritmo.Ordenamiento(array); //Manda a llamar al método que ordena el arreglo.
        System.out.println("Este es su arreglo ordenado:"); 
        System.out.println(Arrays.toString(array)); //Muestra el arreglo ordenado.
    }
}
