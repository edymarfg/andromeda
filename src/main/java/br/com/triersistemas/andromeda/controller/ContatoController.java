package br.com.triersistemas.andromeda.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.triersistemas.andromeda.model.ContatoModel;

@RestController
@RequestMapping("/contato")
public class ContatoController {
	
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public ContatoModel greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new ContatoModel(counter.incrementAndGet(), String.format(template, name));
	}

}
