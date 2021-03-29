import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numerador: ");
        int numerador = sc.nextInt();
        System.out.println("Ingrese el denominador: ");
        int denominador = sc.nextInt();

        Ejercicio4Fraccion f = new Ejercicio4Fraccion();
        System.out.println("Resultado: " + f.toString());
        JOptionPane.showMessageDialog(null,f.toString());

        //suma
        System.out.println("SUMA");
        Ejercicio4Fraccion x = new Ejercicio4Fraccion(1,2);
        Ejercicio4Fraccion y = new Ejercicio4Fraccion(3,2);
        System.out.println("Resultado de la suma: " + x.sumar(y).toString());








    }


}
