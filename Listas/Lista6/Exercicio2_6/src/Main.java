import Geometria.Quadrado;
import Geometria.Triangulo;

public class Main {
    public static void main(String[] args) {
        double areaTriangulo = 0.0;
        double areaQuadrado = 0.0;

        Quadrado quadrado = new Quadrado();
        Triangulo triangulo = new Triangulo();

        areaTriangulo = quadrado.calcularArea(3,5);
        areaQuadrado = triangulo.calcularArea(3,2);

        System.out.println("Área do triângulo = " + areaTriangulo);
        System.out.println("Área do quadrado = " + areaQuadrado);

    }
}