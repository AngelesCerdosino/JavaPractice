import java.util.Scanner;

public class Ejercicio3EsPrimo
{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont, num;
        System.out.println("Ingrese numero:");
        num = sc.nextInt();

        cont = 0;
        for (int i = 1; i <= num; i++) {
            if ((num % i) == 0) {
                cont++;
            }
        }
        if((cont<=2)&&(cont!=1))
        {
            System.out.println("El numero " + num + " es primo");
        }
        else
        {
            System.out.println("El numero " + num + " no es primo");
        }

    }
}
