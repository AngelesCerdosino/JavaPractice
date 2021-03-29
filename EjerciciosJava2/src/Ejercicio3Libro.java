public class Ejercicio3Libro {
    private int id;
    private String nombre;
    private String autor;
    private boolean prestado;

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Ejercicio3Libro(int id, String nombre, String autor) {
        this.id = id;
        this.nombre = nombre;
        this.autor = autor;
        this.prestado = false;
    }

    public Ejercicio3Libro() {
    }

    public void prestamo() {
        this.setPrestado(true);
        System.out.println("Esta alquilado el libro: " + this.getNombre());


    }

    public void devolucion() {
        this.setPrestado(false);
        System.out.println("Esta devuelto el libro: " + this.getNombre());
    }

    @Override
    public String toString() { //si cambiamos a minuscula no sobreescribe ninguna informacion
        return this.getNombre() + " " + this.getAutor() + " " + this.getId();
    }
}
