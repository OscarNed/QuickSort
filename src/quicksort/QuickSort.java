
package quicksort;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author OscarNedzelsky   A00513376
 */
public class QuickSort {

    public static void main(String[] args) {
        int array [] = Algoritmo.setArray();
        System.out.println("Este es su arreglo:");
        System.out.println(Arrays.toString(array));
        array = Algoritmo.Ordenamiento(array);
        System.out.println("Este es su arreglo ordenado:");
        System.out.println(Arrays.toString(array));
    }
}
