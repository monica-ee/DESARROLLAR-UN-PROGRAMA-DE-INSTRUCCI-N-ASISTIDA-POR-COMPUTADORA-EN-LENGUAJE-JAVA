package org.actividad;

public class Pregunta {
    public String generarPregunta(int dificultad, int Operacion){
        NumeroRamdon nr = new NumeroRamdon();
        int num1 = nr.generarNumero(dificultad);
        int num2 = nr.generarNumero(dificultad);
        String operador = nr.operacion(Operacion);
        return num1+" "+ operador+ " "+num2;
    }
}
