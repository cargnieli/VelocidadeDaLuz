package com.local;

public class VelocidadeDaLuz {

    public static void main(String[] args) {

                int velocidadeDaLuz;
                long dias;
                long segundos;
                long distancia;

                velocidadeDaLuz = 300000;
                dias = 1000;
                segundos = dias * 24 * 60 * 60;
                distancia = velocidadeDaLuz * segundos;

                System.out.print("Em " + dias);
                System.out.print(" dias a luz viajará aproximadamente ");
                System.out.println(distancia + " <> Kilomêtros. E isso é lindo, né?");

            }

        }



