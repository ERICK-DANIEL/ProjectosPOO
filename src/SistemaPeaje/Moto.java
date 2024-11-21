package SistemaPeaje;

/**
 * Esta clase denominada Moto modela un tipo especifico
 * de vehiculo que llega a un peaje. Tiene un atributo para representar el valor del
 * peaje de la moto en $5000
 * @version 1.0/2020
 */

public class Moto extends Vehiculo {
    //atributo estatico que representa el valor del peaje a pagar por una moto
    static int valorPeaje = 50;

    /**
     * Constructor de la clase Moto
     * @param placa Parametro que define la placa de una moto
     */

    Moto(String placa) {
        super(placa); // invoca al constructor de la clase padre
    }

    /**
     * Metodo que devuelve el valor del peaje de la moto
     * @return El valor del peaje de una moto
     */

    public int getValorPeaje() {
        return valorPeaje;
    }

    /**
     * Metodo que establece el valor del peaje de la moto
     * @param valorPeaje Parametro que define el valor del peaje de la moto
     */

    static void setValorPeaje(int valorPeaje) {
        Moto.valorPeaje = valorPeaje;
    }

    /**
     * Metodo que muestra en pantalla la placa y el valor del peaje de
     * una moto
     */

    public void imprimir() {
        System.out.println("Placa = " + placa);
        System.out.println("Valor del peaje = " + valorPeaje);
    }

}