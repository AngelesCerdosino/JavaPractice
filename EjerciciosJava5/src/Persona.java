public class Persona implements Precedable<Persona> {
    private String nombre;
    private Integer dni;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Persona(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public Persona() {}

    @Override
    public int precedeA(Persona p){
        return this.dni.compareTo(p.dni);
    }
}
