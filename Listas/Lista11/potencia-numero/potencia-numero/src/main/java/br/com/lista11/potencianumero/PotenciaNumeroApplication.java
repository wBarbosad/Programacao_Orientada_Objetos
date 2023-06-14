package br.com.lista11.potencianumero;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping("/eleva-ao-quadrado")

public class PotenciaNumeroApplication {

	@GetMapping("/{numero}")
	public int retornaNumero(@PathVariable int numero){
		return numero * numero;
	}
	public static void main(String[] args) {
		SpringApplication.run(PotenciaNumeroApplication.class, args);
	}

}
