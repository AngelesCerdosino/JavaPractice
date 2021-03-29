import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.spi.CalendarDataProvider;

public class FechaSinGregorian {


    //clase fecha, con un metodo para comprobar si la fecha es correcta y otro par sumarle un dia al valor actual de la fecha.
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance(); //calendar es una clase que se intancia  asi

        System.out.println("1. Fecha actual: " + c.getTime().toLocaleString());
        c.set(2021, Calendar.MARCH,19);
        System.out.println("2. Fecha 19 de Marzo de 2021: " + c.getTime().toLocaleString());
        c.set(Calendar.MONTH, 13);
        System.out.println("3. Fecha 13 meses mas: " + c.getTime().toLocaleString()); //no imprime la fecha correcta, escribi una incoherencia
        c.set(2021, Calendar.MARCH, 19);
        c.add(Calendar.MONTH, 13); //añadimos 13 meses //volvemos a la fecha anterior usando set y empleamos el metodo add
        System.out.println("4. Fecha 13 meses mas: " + c.getTime().toLocaleString()); //ahora si es correcto
        c.roll(Calendar.HOUR, 25); //añado 25 horas
        System.out.println("5. Fecha 25 horas mas: " + c.getTime().toLocaleString()); //usamos el roll
        System.out.println();
        SimpleDateFormat df = new SimpleDateFormat("dd/MMMMM/yyyy hh:mm aaa");
        Date actual = new Date(); //con este trae la fecha actual, si no le pongo esto trae sumando un mes
        System.out.println("6. Fecha formateada: " + df.format(actual));

    }









}
