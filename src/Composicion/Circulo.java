package Composicion;

/**
 * Esta clase denominada Circulo modela este tipo de figura geometrica
 * que se caracteriza por tener un centro y un radio como atributos
 */

public class Circulo {
    Punto centro;
    int radio;

    public Circulo(int x, int y, int radio) {
        centro = new Punto(x, y);
        this.radio = radio;
    }

    int getRadio() {
        return radio;
    }

    void setRadio(int radio) {
        this.radio = radio;
    }

    void imprimir() {
        System.out.println("El centro del circulo es la coordenada" +
            "(" + centro.getX() + ", " + centro.getY() + ") y tiene un radio = " + radio);
    }
    
}
