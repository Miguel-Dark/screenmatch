package com.aluracursos.screenmatch.service;

public interface IConvierteDatos {
    // MÉTODO GENÉRICO: Define la estructura para recibir un JSON y devolver un objeto de tipo T
    <T> T obtenerDatos(String json, Class<T> clase);
}
