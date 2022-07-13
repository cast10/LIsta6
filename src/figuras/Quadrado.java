package src.figuras;

public class Quadrado implements Figuras{

    double base;
    double altura;
    double area = base*altura;

    public Quadrado(double base, double altura, double total) {
        this.base = base;
        this.altura = altura;
        this.area = area;
    }
    public double getBase() {
        return base;

    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getTotal() {
        return area;
    }
    public void setTotal(double area) {
        this.area = area;
    }
}
