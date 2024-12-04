package boletin1Objetos.Rectangulo;

import java.util.Scanner;

public class RectanguloAPP {

    public static void main(String[] args) {

        int longitud;
        int ancho;

        Rectangulo rectangulo = new Rectangulo();// creamos el objeto rectangulo

        Scanner entrada = new Scanner(System.in);


        boolean parametroCorrecto = false;

        do {
            try {
                System.out.println("indica la longitud ");//pedimos una longitud que pasamos por parametros a rectangulo

                longitud = entrada.nextInt();
                rectangulo.setLongitud(longitud);
                parametroCorrecto = true;
            } catch (RectanguloException e) {
                System.out.println(e.getMessage());
            }
        } while (!parametroCorrecto);

        parametroCorrecto = false;
        do {
            try {
                System.out.println("indica la anchura ");//pedimos una anchura que pasamos por parametros a rectangulo
                ancho = entrada.nextInt();
                rectangulo.setAncho(ancho);
                parametroCorrecto = true;
            } catch (RectanguloException e) {
                System.out.println(e.getMessage());
            }
        } while (!parametroCorrecto);

        //imprimimos por pantalla el metodo area del objeto rectangulo.

        System.out.println("el area es de " + rectangulo.area());

        //imprimimos por pantalla el metodo perimetro del objeto rectangulo.

        System.out.println("el perimetro es de " + rectangulo.perimetro());
    }
}
