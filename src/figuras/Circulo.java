package src.figuras;

public class Circulo implements Figuras  {

   int raio;




    public double areaRaio(){

        this.raio = raio;



      double area = Math.PI * Math.pow (raio, 2);
      return area;
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }
}
