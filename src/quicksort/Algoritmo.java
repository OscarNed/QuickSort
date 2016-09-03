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
        int i = 0, j = array.length - 1; //i y j son los punteros de inicio y final.
        int pivote = array [(array.length / 2)]; //El puntero pivote del centro.
        while (i <= j) { //El ciclo se ejecuta hasta que llega a la mitad, de ahí que la condición sea tal.
            while (array[i] < pivote){ //Este ciclo verifica si el dato a la izquierda del pivote es menor que este, y en caso de que lo sea avanza a la siguiente posición. Se repite hasta que la condición deje de cumplirse.
                i++;
            }
            while (array[j] > pivote){ //Este ciclo verifica si el dato a la derecha del pivote es mayor que este y si lo es, disminute una posición y se repite hasta que esta condición deje de cumplirse.
                j--;
            }
            if (i <= j) { //En caso de que no se haya cumplido niguna de las condiciones anteriores y por tanto no haya entrado al ciclo se cambian los datos de posición.
                int aux = array[i];
                array[i] = array [j];
                array[j] = aux;
                i++;
                j--;
            }
        }
        if (0 < j){ //Si j es mas grande que el inicio, o sea 0, por medio de la recursividad ejecuta el método de nuevo.
            Ordenamiento(array);
            }
        if (i < array.length - 1){
            Ordenamiento(array); //Si i es menor al final del arreglo, o sea la longitud - 1, por medio de la recursividad ejecuta el método de nuevo.
        }
        return array;
    }
}
