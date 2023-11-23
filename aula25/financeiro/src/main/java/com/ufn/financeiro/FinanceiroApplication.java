package com.ufn.financeiro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.NoArgsConstructor;

@SpringBootApplication
@RestController
@NoArgsConstructor
public class FinanceiroApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinanceiroApplication.class, args);
	}

	@Autowired
	private ContaRepository contaRepository;

	@PostMapping("/adicionarContas")
	public Conta adicionar(@RequestBody Conta conta) {
		return contaRepository.save(conta);
	}

	@GetMapping("/listarContas")
	public List<Conta> listar() {
		return contaRepository.findAll();
	}

}
