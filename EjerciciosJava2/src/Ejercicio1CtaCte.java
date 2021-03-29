public class Ejercicio1CtaCte
{
private int id;
private int saldo;

public Ejercicio1CtaCte() {}

public Ejercicio1CtaCte(int saldo, int id)
{
    this.id=id;
    this.saldo=saldo;
}

public Ejercicio1CtaCte(Ejercicio1CtaCte copy)
{
    this.setId(copy.getId());
    this.setSaldo(copy.getSaldo());
}

    public int getId() {
        return id;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void ingreso (int monto) {
        this.setSaldo(this.getSaldo() + monto);
    }

    public void egreso (int monto) {
        this.setSaldo(this.getSaldo() - monto);
    }

    public void transferencia (Ejercicio1CtaCte cuentaDestino, int monto) {
        cuentaDestino.ingreso(monto);
        this.egreso(monto);
    }


    public void reintegro (int monto) {
        this.ingreso(monto);
        System.out.println("Ingresan: " + monto + "por reintegro");
    }






}
