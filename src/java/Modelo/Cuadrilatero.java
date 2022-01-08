package Modelo;

import Interface.IArea;

public class Cuadrilatero implements IArea{

    @Override
    public float calcularArea(float a, float b) {
        return a*b;
    }
    
}
