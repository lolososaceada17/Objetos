package boletin1Objetos.boletin1ObjetosTema4Ejercicio3MaquinaDeCafe;

/**
 * Realizar una programa en Java que sirva para simular una máquina de café.
 * La máquina tiene varios depósitos:
 *  Un depósito de café con capacidad para 50 dosis.
 *  Un depósito de leche con capacidad para 50 dosis.
 *  Un depósito de vasos con capacidad para 80 vasos.
 * También dispone de monedero con una cantidad de euros. Cuando se cree una
 * nueva máquina se hará con un monedero inicial y con los depósitos llenos. El café
 * cuesta 1 euro, la leche 0.8 euros y el café con leche 1.5 euros. Al servir cada
 * bebida debe descontarse una dosis de los depósitos correspondientes, un vaso y
 * añadir al monedero lo recaudado.
 * Debe implementarse un menú con 5 opciones:
 * 1. Servir café solo (1 euro)
 * 2. Servir leche (0,8 euros)
 * 3. Servir café con leche (1,5 euros)
 * 4. Consultar estado máquina. Aparecen los datos de los depósitos y
 * del monedero
 * 5. Apagar máquina y salir
 * Cuando se sirva una bebida habrá que solicitar el dinero que va a introducir el
 * usuario. Si introduce una cantidad inferior al precio o no hay existencias debe
 * informarse con el error correspondiente. También debe producirse un error si la
 * máquina no tiene cambio de esa cantidad. Si puede dar cambio informará con el
 * mensaje “Recoge tu cambio de XX euros”.
 * La clase Maquina debe disponer al menos de los siguientes métodos.
 *  Método para llenar depósitos. No pueden llenarse los depósitos por
 * separado.
 *  Método para vaciar monedero.
 *  Método para consultar el estado de la máquina.
 *  Método para servir café sólo, leche o café con leche. Este método mostrará
 * los mensajes de error correspondientes o el mensaje "Producto servido"
 */

public class MaquinaDeCafe {
    private static final int MAX_Deposito_Cafe = 50;
    private static final int MAX_Deposito_Leche = 50;
    private static final int MAX_Deposito_Vasos = 80;
    private int capacidadDepositoDeCafe;
    public int capacidadDepositoDeLeche; //Almacena la capacidad del depósito de leche
    public int capacidadDepositoDeVasos; //Almacena la capacidad del depósito de vasos.
    public double monedero; //Almacena el dinero que contiene el monedero.
    private static final double PRECIO_CAFE = 1;
    private static final double PRECIO_LECHE = 0.8;
    private static final double PRECIO_CAFE_CON_LECHE = 1.5;

    //Generamos el constructor.
    public MaquinaDeCafe() {
        rellenarDeposito();// para inicializar todos los depósitos al máximo.
        this.monedero = 0; // valor inicial del monedero.
    }

    public void rellenarDeposito() {
        capacidadDepositoDeCafe = MAX_Deposito_Cafe;
        capacidadDepositoDeVasos = MAX_Deposito_Vasos;
        capacidadDepositoDeLeche = MAX_Deposito_Leche;
    }

    public void servirCafeSolo(double dineroAMeter) throws MaquinaDeCafeException {

        cambioMaquina(dineroAMeter,PRECIO_CAFE);

        if (capacidadDepositoDeCafe <= 0) {
            throw new MaquinaDeCafeException("no hay más café");
        } else if (capacidadDepositoDeVasos <= 0) {
            throw new MaquinaDeCafeException("no quedan más vasos");
        }
        cambioMaquina(dineroAMeter,PRECIO_CAFE);
        capacidadDepositoDeCafe--;
        capacidadDepositoDeVasos--;
    }

    public void servirLecheSolo(double dineroAMeter) throws MaquinaDeCafeException {

        if (capacidadDepositoDeLeche <= 0) {
            throw new MaquinaDeCafeException("no hay mas leche");
        } else if (capacidadDepositoDeVasos <= 0) {
            throw new MaquinaDeCafeException("no quedan mas vasos");
        }
        cambioMaquina(dineroAMeter, PRECIO_LECHE);
        capacidadDepositoDeLeche--;
        capacidadDepositoDeVasos--;
    }

    public void servirCafeConLeche(double dineroAMeter) throws MaquinaDeCafeException {

        if (capacidadDepositoDeLeche <= 0) {
            throw new MaquinaDeCafeException("lo siento, no queda más leche");
        } else if (capacidadDepositoDeCafe <= 0) {
            throw new MaquinaDeCafeException("lo siento, no queda más café");
        } else if (capacidadDepositoDeVasos <= 0) {
            throw new MaquinaDeCafeException("no quedan mas vasos");
        }
        cambioMaquina(dineroAMeter, PRECIO_CAFE_CON_LECHE);
        capacidadDepositoDeCafe--;
        capacidadDepositoDeLeche--;
        capacidadDepositoDeVasos--;
    }
    /*
    el metodo cambioMaquina resta el dinero a meter menos el precio. Si el cambio es mayor que el monedero, la
    maquina no tiene cambio.
    Al monedero se le suma el dinero a meter y se le resta el cambio.
     */
    public void cambioMaquina(double dineroAMeter, double precio)throws MaquinaDeCafeException {
        double cambio = dineroAMeter - precio;
        if (cambio > monedero ){
            throw new MaquinaDeCafeException("no hay cambio en la máquina");
        }
        this.monedero += dineroAMeter;
        this.monedero -= cambio;
    }
    // en el método vaciar monedero, para que el monedero esté vacio debe ser igual a 0
    public void vaciarMonedero(){

        this.monedero=0;
    }

    public int getCapacidadDepositoDeCafe() {
        return capacidadDepositoDeCafe;
    }

    public int getCapacidadDepositoDeLeche() {
        return capacidadDepositoDeLeche;
    }

    public int getCapacidadDepositoDeVasos() {
        return capacidadDepositoDeVasos;
    }

    public double getMonedero() {
        return monedero;
    }
}



