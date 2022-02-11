package br.com.pcdevs.projeto.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.pcdevs.projeto.dao.ContasDao;
import br.com.pcdevs.projeto.model.Conta;

@CrossOrigin
@RestController
public class ContasController {
	
	@Autowired
	private ContasDao dao;
	@GetMapping("/contas")
	public ArrayList<Conta> recuperarTudo(){
		ArrayList<Conta> lista;
		lista = (ArrayList<Conta>)dao.findAll();
		return lista;
		}
	
	@GetMapping("/contas/{numero}")
	public Conta recuperarContas(@PathVariable int numero) {
		return dao.findById(numero).orElse(null);
	}
}
