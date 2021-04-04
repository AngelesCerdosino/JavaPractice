package meli.ejerc;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class StringUtil {
    //Retorna una cadena compuesta por n caracteres c. Ejemplo: replicate('x',5) ==> 'xxxxx'
    public static String replicate(char c, int n) {
        String l = "";                      //declaro variable string
        for (int i = 0; i < n; i++) {       //recorro el parametro n
            l = l + c;                      //indico la variable declarada y la igualo sumando el caracter c, lo que cuenta cuantas veces se repite el caracter
        }
        return l;                           //retorno la variable
    }


    //Retorna una cadena de longitud n, compuesta por s y precedida de tantos caracteres c como sea necesario para completar la longitud mencionada.
    //Ejemplo lpad("5",3,'0') ==> "005"
    public static String lpad(String s, int n, char c) {
        int m = n - s.length();                             //declaro variable m y lo igualo a la diferencia con n, que lo que hace s.length es agregar espacios hasta que el string es del tamaño deseado
        String letra = replicate(c, m);                     //declaro variable String letra le asigno el valor que de como resultado del metodo replicate con los param c y m
        String total = s + letra;                           //declaro otra variable total, le asigno el valor como resultado de s + la variable letra
        return total;                                       // retorno la variab total
    }

    // Retorna un String[] conteniendo los elementos de arr representados como cadenas de caracteres
    public static String[] toStringArray(int arr[]) {

        String[] listaString = new String[arr.length];  //declaro variable de array string como una nueva lista de array con el tamaño que viene de parametro
        ArrayList<Integer> ArrayI = new ArrayList<>();   //declaro un ArrayList del tipo wrapper Integer
        for (int i = 0; i < arr.length; i++) {         // recorro de acuerdo al tamaño del arr
            listaString[i] = Integer.toString(arr[i]);  //entonces de la listaString en la posicion [i], le asigno el valor en int del arr de esa posicion i
        }
        return listaString;                             //devuelvo la lista string
    }

    // Retorna un String[] conteniendo los elementos de arr representados como cadenas de caracteres
    public static int[] toIntArray(String arr[]) {

        int[] listaInt = new int [arr.length];
        for (int i = 0; i < arr.length; i++) {
            listaInt[i] = Integer.parseInt(arr[i]);
        }
        return listaInt;
    }

    // Retorna la longitud del elemento con mayor cantidad de caracteres del array arr
    public static int maxLength(String arr[]) {

        int max = 0;
        for (String s : arr ) {
            int num = s.length();
            if(num > max)
                max = num;
        }
        return max;
    }

    // Completa los elemento del arr agregando caracteres c a la izquierda, dejando a todos con la longitud del mayor
    public static void lNormalize(String arr[], char c) {

            int maxL = maxLength(arr);                   //declaro variable max y le asigno el valor del metodo anterior maxLength con el parametro que ya trae dentro
            for (int i = 0; i < arr.length ; i++) {     //recorro las posiciones declarando mientras que i valga cero, si i es menor a la longitud del arr y aumento i
                if(arr[i].length() < maxL){              //condiciono si arr en la posicion i de acuerdo a su tamaño si es menor a la bandera max, entonces
                    String s = lpad(arr[i], maxL, c);    //declaro variable string y le asigno el valor del metodo lpad con el parametro del arr en la posicion i, mi variable max y caracter c
                    arr[i] = s;                         //será el arr en la posicion i igual a la variable string s
                }
            }

    }
}
