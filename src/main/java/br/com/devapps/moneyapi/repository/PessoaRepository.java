package br.com.devapps.moneyapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.devapps.moneyapi.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{
 
	
}
