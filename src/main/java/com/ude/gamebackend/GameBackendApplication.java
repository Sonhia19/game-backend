package com.ude.gamebackend;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GameBackendApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(GameBackendApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(GameBackendApplication.class, args);
		LOGGER.info("Se ha iniciado GameBackend correctamente");
	}

}
