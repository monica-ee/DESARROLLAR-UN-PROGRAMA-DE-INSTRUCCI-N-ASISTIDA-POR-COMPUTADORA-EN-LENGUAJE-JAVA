package org.actividad;

public class Respuesta {

    public int obtenerRespuesta(String pregunta){
        String[] parts = pregunta.split("[+\\-*/]"); // Separar la operación en operandos
        if (parts.length != 2) {
            throw new IllegalArgumentException("Operación inválida");
        }

        double operand1 = Double.parseDouble(parts[0].trim()); // Primer operando
        double operand2 = Double.parseDouble(parts[1].trim()); // Segundo operando

        char operator = pregunta.replaceAll("[^+\\-*/]", "").charAt(0); // Obtener el operador

        double result;
        switch (operator) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                result = operand1 / operand2;
                break;
            default:
                throw new IllegalArgumentException("Operador inválido");
        }

        return (int) result;
    }
}
