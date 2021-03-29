public class Ejercicio2Contador {

    private int contador;

    public Ejercicio2Contador(int contador) {
        this.contador = contador;
    }

    public Ejercicio2Contador() {}

    public Ejercicio2Contador(Ejercicio2Contador ContadorCopy) {
        this.setContador(ContadorCopy.getContador());
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public void incrementar () {
        this.setContador(this.getContador() +1);
    }

    public void decrementar () {
        this.setContador(this.getContador() -1);
    }


}
