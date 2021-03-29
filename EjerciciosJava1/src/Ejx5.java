import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejx5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese n: ");
        int n = scan.nextInt();
        System.out.print("Ingrese m: ");
        int m = scan.nextInt();
        System.out.print("Ingrese d: ");
        int d = scan.nextInt();
        numero(n, m, d);
        scan.close();
    }

    public static int conteoNumNaturales(int n, int d) {
        int contador = 0;
        while (n > 0) {
            contador = (n % 10 == d) ? contador + 1 : contador; //operador ternario '?:' : nos ayuda a implementar un if-then-else mas rapido y con menor codigo
            n = n / 10;
        }

        return contador;
    }

    public static void numero(int n, int m, int d) {
        int num = 0;
        int contador;
        for (int i = 0; num != n; i++) {
            contador = conteoNumNaturales(i, d);
            if (contador >= m) {
                num++;
                System.out.println(i);
            }
        }
    }


}
