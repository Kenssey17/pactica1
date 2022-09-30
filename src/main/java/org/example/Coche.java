package org.example;

public class Coche {
    int numeroPuertas;



    public void aumentarPuertas(){
        this.numeroPuertas++;
    }

    public static void main (String[] args){
        Coche miCoche = new Coche();
        miCoche.aumentarPuertas();

        System.out.println(miCoche.numeroPuertas);
    }
}
