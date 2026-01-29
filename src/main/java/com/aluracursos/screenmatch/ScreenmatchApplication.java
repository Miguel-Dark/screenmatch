package com.aluracursos.screenmatch;

import com.aluracursos.screenmatch.service.ConsumoApi;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        var consumoApi = new ConsumoApi();
        //var json = consumoApi.obtenerDatos("https://www.omdbapi.com/?t=game+of+thrones&apikey=32eabe1a");
        var json = consumoApi.obtenerDatos("https://coffee.alexflipnote.dev/random.json");
        System.out.println(json);
    }
}
