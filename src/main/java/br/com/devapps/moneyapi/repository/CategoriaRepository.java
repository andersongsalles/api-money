package br.com.devapps.moneyapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.devapps.moneyapi.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
 
	
}
