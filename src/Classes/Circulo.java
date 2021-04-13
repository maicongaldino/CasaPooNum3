package Classes;

import Interfaces.FormaGeometrica;

public class Circulo implements FormaGeometrica {

    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * (raio * raio);
    }

    @Override
    public String explicarCalculo() {
        return "Para calcular a área do círculo devemos utilizar a seguinte fórmula: A = π . r2";
    }
}