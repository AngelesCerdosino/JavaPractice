import java.util.Scanner;

public class Ejercicio2EsMultiplo {
    //ejercicio 2: programa para mostrar los primeros n numeros multiplos de m, siendo n y m valores
    //que el usuario ingresará por consola. recorda que un num a es multiplo de b si a es divisible por b

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N,M;
        System.out.println("Ingrese primer numero:");
        N = sc.nextInt();
        System.out.println("Ingrese segundo numero:");
        M = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            if (i % M == 0) {
                System.out.println(i + " es multiplo");
            }
        }
    }
}
