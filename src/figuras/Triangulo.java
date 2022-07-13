package src.figuras;

public class Triangulo implements Figuras {

    double altura;
    double base;
    double areaTriangulo = ((base * altura) / 2);

    public Triangulo(double altura, double base, double areaTriangulo) {
        this.altura = altura;
        this.base = base;
        this.areaTriangulo = areaTriangulo;
    }

    public void setTotal(double areaTriangulo) {
        this.areaTriangulo = areaTriangulo;
    }

}
