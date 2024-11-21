package SistemaPeaje;

/**
 * Esta clase denominada Carro modela un tipo especifico
 * de vehiculo que llega a un peaje. Tiene un atributo estatico para representar su valor
 * del peaje en $10000
 * @version 1.0/2020
 */

public class Carro extends Vehiculo {
    //atributo estatico que representa el valor del peaje a pagar por un carro
    static int valorPeaje = 100;

    Carro(String placa) {
        super(placa); // invoca al constructor de la clase padre
    }

    /**
     * Metodo que devuelve el valor del peaje del carro
     * @return El valor del peaje de un carro
     */

    public int getValorPeaje() {
        return valorPeaje;
    }

    /**
     * Metodo que establece el valor del peaje del carro
     * @param valorPeaje Parametro que define el valor del peaje del carro
     */

    static void setValorPeaje(int valorPeaje) {
        Carro.valorPeaje = valorPeaje;
    }

    /**
     * Metodo que muestra en pantalla la placa y el valor del peaje de
     * un carro
     */
    
    public void imprimir() {
        System.out.println("Placa = " + placa);
        System.out.println("Valor del peaje = " + valorPeaje);
    }
}