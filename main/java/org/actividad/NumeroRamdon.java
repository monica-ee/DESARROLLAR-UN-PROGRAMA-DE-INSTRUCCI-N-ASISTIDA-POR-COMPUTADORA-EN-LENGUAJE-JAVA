package org.actividad;

import java.security.SecureRandom;


public class NumeroRamdon {
     SecureRandom random = new SecureRandom();
    public int generarNumero(int nivelDificultad) {
        switch (nivelDificultad) {
            case 1: // Fácil (números del 1 al 10)
                return random.nextInt(9) + 1;
            case 2: // Medio (números del 1 al 100)
                return random.nextInt(90) + 10;
            case 3: // Difícil (números del 1 al 1000)
                return random.nextInt(900) + 100;
            default:
                return 0;
        }
    }

    public String operacion(int modo) {
        String operador;
        switch (modo) {
            case 1:
                operador = "+";
                break;
            case 2:
                operador = "-";
                break;
            case 3:
                operador = "*";
                break;
            case 4:
                operador = "/";
                break;
            case 5:
                int numeroAleatorio = random.nextInt(4) + 1;
                operador = operacion(numeroAleatorio);
                break;
            default:
                throw new IllegalStateException("Fallo todo");
        }
        return operador;
    }
}