
package Modelo;

import Interface.IArea;

public class Rombo implements IArea {

    @Override
    public float calcularArea(float a, float b) {
        return (a*b)/2;
    }
    
}
