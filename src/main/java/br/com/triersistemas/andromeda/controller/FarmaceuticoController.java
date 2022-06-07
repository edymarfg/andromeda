package br.com.triersistemas.andromeda.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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
		FARMACEUTICOS.add(new Farmaceutico(model.getNome(), model.getNiver(), model.getCpf()));
		return FARMACEUTICOS;
	}

	@PostMapping("/cadastro")
	public List<Farmaceutico> cadastro() {
		FARMACEUTICOS.add(new Farmaceutico());
		return FARMACEUTICOS;
	}

	@PutMapping("/alterar/{index}")
	public List<Farmaceutico> alterar(@PathVariable int index, @RequestBody FarmaceuticoModel model) {
		FARMACEUTICOS.remove(index);
		FARMACEUTICOS.add(new Farmaceutico(model.getNome(), model.getNiver(), model.getCpf()));
		return FARMACEUTICOS;
	}

	@DeleteMapping("/remover/{index}")
	public List<Farmaceutico> remover(@PathVariable int index) {
		FARMACEUTICOS.remove(index);
		return FARMACEUTICOS;
	}

}
