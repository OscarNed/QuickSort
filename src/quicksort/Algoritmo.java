package quicksort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author OscarNedzelsky   A00513376
 */
public class Algoritmo {
    public static int [] setArray(){//Este método crea el vector y le introduce los valores.
        Scanner scan = new Scanner(System.in);
        System.out.println("Teclee la longitud que desea que tenga su vector:"); //Se le pide al usuario que teclee la longitud del vector.
        int lgt = scan.nextInt();
        int array [] = new int [lgt]; //Se crea el vector con la longitud especificada.
        for (int i = 0; (i < lgt); i++){ //El ciclo permite que el usuario llene el vector.
            System.out.println("Teclee el valor que ocupará la posición " + (i + 1) + ":");
            int valor = scan.nextInt();
            array [i] = valor;
        }
        return array; //Una vez que el vector fue creado, es regresado para modificarlo.
    }
    
    public static int [] Ordenamiento (int [] array) {
        int i = 0, j = array.length - 1;
        int pivote = array [(array.length / 2)];
        while (i <= j) {
            while (array[i] < pivote){
                i++;
            }
            while (array[j] > pivote){
                j--;
            }
            if (i <= j) {
                int aux = array[i];
                array[i] = array [j];
                array[j] = aux;
                i++;
                j--;
            }
            //System.out.println("");
            //System.out.println(Arrays.toString(array));
            
        }
        if (0 < j){
            System.out.println("i: " + i);
            Ordenamiento(array);
            }
        if (i < array.length - 1){
            Ordenamiento(array);
        }
        return array;
    }
}
