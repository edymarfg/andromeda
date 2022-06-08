package br.com.triersistemas.andromeda.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.*;

import br.com.triersistemas.andromeda.domain.Farmaceutico;
import br.com.triersistemas.andromeda.model.FarmaceuticoModel;

@RestController
@RequestMapping("/farmaceutico")
public class FarmaceuticoController {

	private static final List<Farmaceutico> FARMACEUTICOS = new ArrayList<>();

	@GetMapping("/consultar")
	public List<Farmaceutico> consultar() {
		return FARMACEUTICOS;
	}

	@PostMapping("/cadastrar")
	public List<Farmaceutico> cadastrar(@RequestBody FarmaceuticoModel model) {
		FARMACEUTICOS.add(new Farmaceutico(model.getNome(), model.getNiver(), model.getCpf(), model.getId()));
		return FARMACEUTICOS;
	}

	@PostMapping("/cadastro")
	public List<Farmaceutico> cadastro() {
		FARMACEUTICOS.add(new Farmaceutico());
		return FARMACEUTICOS;
	}

	@PutMapping("/alterar/{id}")
	public List<Farmaceutico> alterar(@PathVariable UUID id, @RequestBody FarmaceuticoModel model) {
		FARMACEUTICOS.remove(id);
		FARMACEUTICOS.add(new Farmaceutico(model.getNome(), model.getNiver(), model.getCpf(), model.getId()));
		return FARMACEUTICOS;
	}

	@DeleteMapping("/remover/{id}")
	public List<Farmaceutico> remover(@PathVariable UUID id) {
		FARMACEUTICOS.remove(id);
		return FARMACEUTICOS;
	}

}
