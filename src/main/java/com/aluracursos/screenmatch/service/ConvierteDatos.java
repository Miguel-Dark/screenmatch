package com.aluracursos.screenmatch.service;

import com.aluracursos.screenmatch.model.DatosSerie;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvierteDatos implements IConvierteDatos {
    // INSTANCIA (Atributo): Objeto de Jackson encargado de la lógica de mapeo
    //Instancia de ObjectMapper que permite leer esos valores(mapear esos valores)
    // que vienen de la API:
    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    // MÉTODO IMPLEMENTADO: Ejecuta la conversión real usando tipos genéricos
    public <T> T obtenerDatos(String json, Class<T> clase) {
        try {
            //Retorna un objeto del tipo ObjectMapper, va a leer ese valor y va a transformar ese
            //json que trae; lo va a transformar en esa clase que vamos a pasarle
            // RETORNO: Convierte el String JSON a la clase destino especificada
            return objectMapper.readValue(json,clase);
        } catch (JsonProcessingException e) {
            // MANEJO DE EXCEPCIÓN: Captura errores de procesamiento de JSON
            throw new RuntimeException(e);
        }
    }

}
