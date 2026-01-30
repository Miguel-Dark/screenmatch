package com.aluracursos.screenmatch;

import com.aluracursos.screenmatch.model.DatosSerie;
import com.aluracursos.screenmatch.service.ConsumoApi;
import com.aluracursos.screenmatch.service.ConvierteDatos;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

    @Override
    // MÉTODO RUN: Punto de entrada para ejecutar lógica de consola en Spring Boot
    public void run(String... args) throws Exception {
        // INSTANCIA: Crea el objeto para conectar con la API
        var consumoApi = new ConsumoApi();
        // VARIABLE (String): Almacena la respuesta cruda (JSON) de la petición
        var json = consumoApi.obtenerDatos("https://www.omdbapi.com/?t=game+of+thrones&apikey=32eabe1a");
        //var json = consumoApi.obtenerDatos("https://coffee.alexflipnote.dev/random.json");
        System.out.println(json);
        // INSTANCIA: Crea el objeto conversor basado en nuestra clase de servicio
        //Instancia que convierte datos
        ConvierteDatos conversor = new ConvierteDatos();

        // VARIABLE (Objeto): Almacena el resultado final de la conversión a DatosSerie
        var datos = conversor.obtenerDatos(json, DatosSerie.class);
        System.out.println(datos);
    }
}
