import java.util.GregorianCalendar;

public class Ejercicio5Fecha {
    GregorianCalendar gc = new GregorianCalendar();
    private int dia;
    private int mes;
    private int anio;

    public Ejercicio5Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public Ejercicio5Fecha(){}

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    //metodo comprobar si la fecha es correcta
    public boolean fechaCorrecta()
    {
        boolean diaCorrecto, mesCorrecto, anioCorrecto;
        anioCorrecto = anio > 0;
        mesCorrecto = mes >= 1 && mes <= 12;
        switch (mes)
        {
            case 2:
                if(esBisiesto()){
                    diaCorrecto = dia >= 1 && dia <= 29;
                }
                else {
                    diaCorrecto = dia >= 1 && dia <= 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                diaCorrecto = dia >= 1 && dia <= 30;
                break;
            default:
                diaCorrecto = dia >= 1 && dia <= 31;

        }
        return diaCorrecto && mesCorrecto && anioCorrecto;
    }

    private boolean esBisiesto()
    {
        //return (año % 4 == 0 && año % 100 != 0 || año % 400 == 0);
        if(gc.isLeapYear(anio)) {
            System.out.println("El anio es bisiesto");
            return true;
        }
            System.out.println("El anio no es bisiesto");
            return false;
    }

    public void diaSiguiente()
    {
        dia++;
        if(!fechaCorrecta())
        {
            dia = 1;
            mes++;
            if(!fechaCorrecta()) {
                mes = 1;
                anio++;
            }
        }
    }

    @Override
    public String toString() {
        return "Fecha:" +
                ", dia=" + dia +
                ", mes=" + mes +
                ", año=" + anio +
                '}';
    }
}
