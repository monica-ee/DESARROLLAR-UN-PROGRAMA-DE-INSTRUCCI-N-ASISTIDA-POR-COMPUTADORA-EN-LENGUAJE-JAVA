package org.actividad;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pregunta pr = new Pregunta();
        Respuesta res = new Respuesta();
        Menu mn = new Menu();
        Scanner sc = new Scanner(System.in);
        int pasadas = 0, correctas = 0, incorrectas = 0;
        while (true) {
            int dificultad = mn.menuDificultad();
            int operacion = mn.menuOperacion();
            for (int i = 0; i < 10; i++) {
                String pregunta = pr.generarPregunta(dificultad, operacion);
                System.out.println(pregunta);
                int respuesta = sc.nextInt();
                if (respuesta == res.obtenerRespuesta(pregunta)) {
                    correctas += 1;
                    System.out.println(new MensajeAlAzar().obtenerMensajeBuenoAlAzar());
                } else {
                    do {
                        incorrectas += 1;
                        System.out.println(new MensajeAlAzar().obtenerMensajeMaloAlAzar());
                        System.out.println(pregunta);
                        respuesta = sc.nextInt();
                    } while (respuesta != res.obtenerRespuesta(pregunta));
                }
                pasadas += 1;
                System.out.println("pasadas = " + pasadas);
                if (pasadas >= 10) {
                    int totalRespuestas = correctas + incorrectas;

                    double porcentajeCorrectas = (correctas / (double) totalRespuestas) * 100;

                    if (porcentajeCorrectas < 75) {
                        System.out.println("Por favor pide ayuda adicional a tu instructor.");
                    } else {
                        System.out.println("¡Felicidades, estás listo para pasar al siguiente nivel!");
                    }
                }
            }
        }
    }
}