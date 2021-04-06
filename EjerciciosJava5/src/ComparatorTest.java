import java.util.Comparator;

public class ComparatorTest {
    public static void main(String[] args) {
        Persona p1 = new Persona ("Camila", 10);
        Persona p2 = new Persona ("Eduardo", 32);
        Persona p3 = new Persona ("Maria", 45);
        Persona p4 = new Persona ("Fernando", 57);
        Persona p5 = new Persona ("Samanta", 68);
        Persona p6 = new Persona ("Luis", 93);
        Persona p7 = new Persona ("Gabriel", 134);

        Persona[] pers = new Persona[7];
        pers[0] = p1;
        pers[1] = p2;
        pers[2] = p3;
        pers[3] = p4;
        pers[4] = p5;
        pers[5] = p6;
        pers[6] = p7;


        //Comparator<Persona> orderDni = Comparator.comparing(Persona::getDni);
        Comparator<Persona> orderDni = (a,b) -> a.getDni() - b.getDni();
        SortUtil.sort(pers);
        for (int i = 0; i < pers.length; i++) {
            System.out.println(pers[i].getDni() + " " + pers[i].getNombre());

        }

    }
}
