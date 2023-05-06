package Geometria;

import Geometria.FormaGeometrica;

public class Triangulo implements FormaGeometrica {
    @Override
    public double calcularArea(double base, double altura){
        return (base * altura)/2;
    }
}
