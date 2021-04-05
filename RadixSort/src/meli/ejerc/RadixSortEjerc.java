package meli.ejerc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RadixSortEjerc {
    public static void radixSort(int[] arr) {               //array de int pasarlo a String
        String cadena[] = StringUtil.toStringArray(arr);    //variable string que es array y lo igual a la doc StringUtil y convertirla en StringArray(arr)
        StringUtil.lNormalize(cadena,'0');               //a lnormalize de stringutil le pasamos por parametro el string y el caracter a iniciar
        int maximo = StringUtil.maxLength(cadena);
        int position = maximo-1;

        sort(position, cadena);
        arr = StringUtil.toIntArray(cadena);
    }

    private static void sort(int position, String[] cadena) {
        ArrayList<String> primero = new ArrayList<>();
        ArrayList<String> L0 = new ArrayList<>();
        ArrayList<String> L1 = new ArrayList<>();
        ArrayList<String> L2 = new ArrayList<>();
        ArrayList<String> L3 = new ArrayList<>();
        ArrayList<String> L4 = new ArrayList<>();
        ArrayList<String> L5 = new ArrayList<>();
        ArrayList<String> L6 = new ArrayList<>();
        ArrayList<String> L7 = new ArrayList<>();
        ArrayList<String> L8 = new ArrayList<>();
        ArrayList<String> L9 = new ArrayList<>();
        Map<Character, ArrayList<String>> lista = new HashMap<Character, ArrayList<String>>();
        lista.put('0', L0);
        lista.put('1', L1);
        lista.put('2', L2);
        lista.put('3', L3);
        lista.put('4', L4);
        lista.put('5', L5);
        lista.put('6', L6);
        lista.put('7', L7);
        lista.put('8', L8);
        lista.put('9', L9);

        for (int i = 0; i < cadena.length; i++) {
            String s = cadena[i];
            Character c = s.charAt(position);
            lista.get(c).add(s);
        }

        for (Map.Entry<Character, ArrayList<String>> entry : lista.entrySet()) {
            ArrayList<String> v = entry.getValue();
            if (v.size() > 0)
                primero.addAll(v);
        }


        cadena = primero.toArray(new String[0]);
        position = position - 1;
        if(position > 0)
            sort(position, cadena);

    }








    public static void main(String[] args) {
        int arr[] = {16223, 898, 13, 906, 235, 23, 9, 1532, 6388, 2511, 8};
        radixSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i < arr.length - 1 ? "," : ""));
        }
    }
}
