package Boletin1Objetos.Rectangulo;

/**  Crear una clase Rectangulo con los atributos longitud y ancho, cada uno con un
 * valor predeterminado igual a 1. Proporcionar los métodos set y get para los
 * atributos longitud y ancho respectivamente. El método set debe verificar que
 * longitud y ancho contengan números reales mayores que cero y menores que
 * 20. Además, proporcionar métodos que calculen el perímetro y el área del
 * rectángulo.
 * Escribir un método main que solicite los datos de un rectángulo y muestre cual es
 * su área y su perímetro. Probar a introducir un dato incorrecto (mayor o igual que
 * 20) */

// Creamos la clase rectángulo.
public class Rectangulo {

    // Creamos los atributos de la clase rectángulo.

    private int longitud;// longitud es un atributo de tipo entero que pertenece a clase

    private int ancho;// longitud es un atributo de tipo entero que pertenece a clase.

    public Rectangulo() { // se crea el constructor de la clase rectángulo

        this.longitud = 1;

        this.ancho = 1;
    }

    // se crean los métodos get y set para el atributo longitud

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) throws RectanguloException {


        if (longitud <= 0 || longitud > 20) {

            throw new RectanguloException("la longitud no es correcta");
        }
        this.longitud= longitud;
    }

    // se crean los métodos get y set para el atributo ancho

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) throws RectanguloException {


        if (ancho <=0 || ancho > 20) {
            throw new RectanguloException("la anchura no es correcta ");
        }
        this.ancho = ancho;
    }

    public int area() {



        return longitud*ancho;
    }

    public int perimetro() {
        return  (longitud * 2) + (ancho * 2);
    }


}
