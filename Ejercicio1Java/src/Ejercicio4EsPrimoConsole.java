import javax.swing.*;
import java.util.Scanner;

//programa para mostrar por consola los primeros n numeros primos, siendo n un valor que el usuario colocará por consola
public class Ejercicio4EsPrimoConsole {
    public static void main(String[] args) {
        int inicio, fin, contador = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        inicio = sc.nextInt();
        for (int i = 2; i < inicio; i++) {
            if(ListaNumPrimo(i)){
                contador ++;
                System.out.println(i);

            }
        }
        sc.close();

    }

    public static boolean ListaNumPrimo (int num) {
        if(num == 0 || num == 1 || num == 4) {
            return false;
        }
        for (int i = 2; i < num / 2 ; i++) {
            if(num % i == 0)
                return false;
        }
        return true;
    }



}
