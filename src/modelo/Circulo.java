package modelo;
public class Circulo {
    private double raio;
    private double pi = 3.14;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }
    
    public double calcularArea(){
        return Math.PI * Math.pow(raio,2);
    }
}
