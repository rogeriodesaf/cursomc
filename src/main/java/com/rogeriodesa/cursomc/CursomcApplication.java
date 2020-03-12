package com.rogeriodesa.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rogeriodesa.cursomc.domain.Categoria;
import com.rogeriodesa.cursomc.repositories.CategoriaRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {  //	O commandLineRunner 
	//TODO permite criar tabelas no banco de dados

	
	@Autowired
	private CategoriaRepository categoriaRepository; // chamando a classe que grava no banco
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null,"Informática");
		Categoria cat2 = new Categoria(null, "Escritório");
		
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2)); //isso vai salvar as categorias no banco
	}

	
}
