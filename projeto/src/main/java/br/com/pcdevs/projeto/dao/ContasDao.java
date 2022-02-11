package br.com.pcdevs.projeto.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.pcdevs.projeto.model.Conta;

	public interface ContasDao extends CrudRepository<Conta,Integer>{
	}
