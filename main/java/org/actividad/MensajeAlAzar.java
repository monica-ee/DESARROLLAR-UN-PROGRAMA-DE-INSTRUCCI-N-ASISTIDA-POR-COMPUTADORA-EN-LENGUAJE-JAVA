package org.actividad;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MensajeAlAzar {
    private List<String> mensajesBuenos;
    private List<String> mensajesMalos;

    public MensajeAlAzar() {
        mensajesBuenos = new ArrayList<>();
        mensajesMalos = new ArrayList<>();

        // Agrega los mensajes buenos a la lista
        mensajesBuenos.add("¡Muy bien!");
        mensajesBuenos.add("¡Excelente!");
        mensajesBuenos.add("¡Buen trabajo!");
        mensajesBuenos.add("¡Sigue así!");

        // Agrega los mensajes malos a la lista
        mensajesMalos.add("No. Por favor intenta de nuevo.");
        mensajesMalos.add("Incorrecto. Intenta una vez más.");
        mensajesMalos.add("¡No te rindas!");
        mensajesMalos.add("No. Sigue intentando.");
    }

    public String obtenerMensajeBuenoAlAzar() {
        Random rand = new Random();
        int indiceAleatorio = rand.nextInt(mensajesBuenos.size());
        return mensajesBuenos.get(indiceAleatorio);
    }

    public String obtenerMensajeMaloAlAzar() {
        Random rand = new Random();
        int indiceAleatorio = rand.nextInt(mensajesMalos.size());
        return mensajesMalos.get(indiceAleatorio);
    }
}
