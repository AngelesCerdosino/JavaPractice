public class Ejercicio4Fraccion {

    //atributos
    private int numerador; // es el num de partes que tomamos
    private int denominador; //debe ser distinto de cero y es aquel que tb se llama divisor, en cuantas partes dividimos la unidad

    //constructor
    public Ejercicio4Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }
    public Ejercicio4Fraccion() {}
    //get y set
    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    //maximo comun divisor
    public int mcd()
    {
        int n = numerador, d = denominador;
        if(n == 0){
            return 1; //con esto decimos que no es simplificable y queda igual al simplificar
        }
        else {
            if(n < 0){ //si el numerador es negativo, luego
                n = n * -1; // lo multiplicamos por -1 para pasarlo a positivo. ej: -2 pasa a +2
            }
            if(d < 0) {
                d = d * -1; //-2 2
            }

            if(d > n){ //se hace el intercambio con una variable auxiliar, xq el denominador siempre tiene que ser menor que el numerador en el momento de simplificar
                int aux = n; //le asignamos el valor del numerador
                n = d;
                d = aux;
            }

            int mcd = 1; //guarda el valor del resultado del ciclo. ej: 4/8 pasa a ser 8/4
            while(d != 0){
                mcd = d; //4
                d = n % d; //%: modulo o resto
                n = mcd;//4
            }
            return mcd;
        }

    }

    //las fracciones equivalentes muestran la misma cantidad, en esta situacion es posible simplificar > previo ello necesitamos el mayor comun divisor
    public void simplificar()
    {
    int mcd= mcd(); //llamamos a la funcion mcd

    numerador = numerador / mcd;
    denominador = denominador / mcd;

    if(numerador < 0 && denominador < 0){ //si num y denominador son menores a 0 hay que convertirlos a positivo
        numerador = numerador * -1; //entonces los multiplicamos por -1 para pasarlos a positivo
        denominador = denominador * -1;
    }
    else if (numerador > 0 && denominador < 0){ //en este caso el num pasaria a ser negativo y el denominador positivo. ejemplo: 1/-1
        numerador = numerador * -1;
        denominador = denominador * -1;
    }

    }

    //suma
    public Ejercicio4Fraccion sumar(Ejercicio4Fraccion a){
        Ejercicio4Fraccion f = new Ejercicio4Fraccion( a.getNumerador() * this.getDenominador() + this.getNumerador() * a.getDenominador(), a.getDenominador() * this.getDenominador());
        f.simplificar();
        return f;
    }
    //resta
    public Ejercicio4Fraccion resta(Ejercicio4Fraccion a){
        return new Ejercicio4Fraccion(this.getNumerador() * a.getDenominador() - a.getNumerador() * this.getDenominador(),a.getDenominador()*this.getDenominador());
    }
    //multiplicacion
    public Ejercicio4Fraccion multiplicar(Ejercicio4Fraccion a ){
        return new Ejercicio4Fraccion(a.getNumerador() * this.getNumerador(), a.getDenominador() * this.getDenominador());
    }
    //div
    public Ejercicio4Fraccion dividir(Ejercicio4Fraccion a) {
        return new Ejercicio4Fraccion(a.getNumerador()*this.getDenominador(), a.getDenominador()*this.getNumerador());
    }

    @Override
    public String toString() {
        if(denominador != 0) {
            simplificar(); //antes q se imprima se simplifica
            return numerador + " / " + denominador;
        }
        else
            return "El denominador tiene que ser distinto de cero";

    }
}

