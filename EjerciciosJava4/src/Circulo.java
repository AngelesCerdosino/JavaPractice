public class Circulo extends FiguraGeometrica{
    private int radio;

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public Circulo(int radio){
        this.radio=radio;
    }

    public double area(){
        return Math.PI * Math.pow(radio,2);
    }



}
