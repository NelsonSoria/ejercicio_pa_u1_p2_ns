package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Matricula;


@Repository
public class MatriculaRepositoryImpl implements MatriculaRepository{
	
	private static List<Matricula> baseMatricula= new ArrayList<>(); 

	@Override
	public void insertarM(Matricula matricula) {
		baseMatricula.add(matricula);
		
	}

	@Override
	public List<Matricula> seleccionarTodo() {
		
		return baseMatricula;
	}

	
	

}
