package Classes;

import Interfaces.FormaGeometrica;

public class Quadrado implements FormaGeometrica {

    private double base, altura;

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

    @Override
    public double calcularArea() {
        return this.base * this.altura;
    }

    @Override
    public String explicarCalculo() {
        return "Para calcular a área de um quadrado, usamos a fórmula da área A = b. h, assim um de seus lados será a base (b) e o outro a altura (h)";
    }
}