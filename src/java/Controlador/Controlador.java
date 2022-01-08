package Controlador;

import Modelo.Cuadrilatero;
import Modelo.Rombo;
import Modelo.Triangulo;

public class Controlador {

    Cuadrilatero cuadrilatero = new Cuadrilatero();
    Triangulo triangulo = new Triangulo();
    Rombo rombo = new Rombo();

    public float calcularCuadrilatero(float ladoA, float ladoB) {
        return cuadrilatero.calcularArea(ladoA, ladoB);
    }

    public float calcularTriangulo(float base, float altura) {
        return triangulo.calcularArea(base, altura);
    }
    
     private float calcularRombo(float dmenor, float dmayor) {
          return rombo.calcularArea(dmenor, dmayor);
    }

    public float seleccionarFigura(String valor, float x, float y) {
        float resultado = 0;
        switch (valor) {
            case "tr":
                resultado = this.calcularTriangulo(x, y);
                break;
            case "cu":
                resultado = this.calcularCuadrilatero(x, y);
                break;
            case "re":
                resultado = this.calcularCuadrilatero(x, y);
                break;
                case "ro":
                resultado = this.calcularRombo(x, y);
                break;
        }
        return resultado;
    }
}
