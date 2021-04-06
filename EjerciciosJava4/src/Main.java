public class Main {
    public static void main(String[] args) {
        FiguraGeometrica arr[] = new FiguraGeometrica[3];

        arr[0] = new Circulo(5);
        arr[1] = new Triangulo(3,9);
        arr[2] = new Rectangulo(8,4);

        System.out.println("Area promedio es: " + areaPromedio(arr));

    }
    public static double areaPromedio(FiguraGeometrica arr[]) {
        double resultado = 0;
        for (FiguraGeometrica f: arr) { //por cada f del arr
            resultado += f.area();      //acumular el calculo del area de esa figura geometrica
        }
        return resultado / arr.length;  //devolver el promedio del area
    }


}
