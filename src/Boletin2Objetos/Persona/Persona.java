package Boletin2Objetos.Persona;

import java.time.LocalDate;

public class Persona {

    private String nombre;
    private String dni;
    private char sexo;
    private float altura, peso;
    private LocalDate fechaDeNacimiento;

    //generamos el constructor de persona.
    public Persona() {//el constructor está vacio porque le pido al usuario que introduzca los datos.
    }

    public void setFechaDeNacimiento(int year, int month, int day) {
        this.fechaDeNacimiento = LocalDate.of(year, month, day);
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) throws PersonaException {
        if (peso <= 0) {
            throw new PersonaException("el peso no puede ser menor o igual a 0");
        }

        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) throws PersonaException {
        if (altura <= 0) {
            throw new PersonaException("la altura no puede ser menor o igual a 0");
        }

        this.altura = altura;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) throws PersonaException {
        if (dni.length() != 8) {
            throw new PersonaException("el DNI debe tener 8 números");
        }
        this.dni = dni;
    }

    public double getIMC() {
        return peso / Math.pow(altura, 2);
    }

    public char letraDNI() {
        int letraDNI = Integer.parseInt(dni) % 23;
        char letra;

        if (letraDNI == 0) {
            letra = 'T';
        } else if (letraDNI == 1) {
            letra = 'R';
        } else if (letraDNI == 2) {
            letra = 'W';
        } else if (letraDNI == 3) {
            letra = 'A';
        } else if (letraDNI == 4) {
            letra = 'G';
        } else if (letraDNI == 5) {
            letra = 'M';
        } else if (letraDNI == 6) {
            letra = 'Y';
        } else if (letraDNI == 7) {
            letra = 'F';
        } else if (letraDNI == 8) {
            letra = 'P';
        } else if (letraDNI == 9) {
            letra = 'D';
        } else if (letraDNI == 10) {
            letra = 'X';
        } else if (letraDNI == 11) {
            letra = 'B';
        } else if (letraDNI == 12) {
            letra = 'N';
        } else if (letraDNI == 13) {
            letra = 'J';
        } else if (letraDNI == 14) {
            letra = 'Z';
        } else if (letraDNI == 15) {
            letra = 'S';
        } else if (letraDNI == 16) {
            letra = 'Q';
        } else if (letraDNI == 17) {
            letra = 'V';
        } else if (letraDNI == 18) {
            letra = 'H';
        } else if (letraDNI == 19) {
            letra = 'L';
        } else if (letraDNI == 20) {
            letra = 'L';
        } else if (letraDNI == 21) {
            letra = 'K';
        } else {
            letra = 'E';
        }
        return letra;
    }

}

