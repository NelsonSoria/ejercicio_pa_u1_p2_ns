package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Matricula;

public interface MatriculaRepository {
	
	public void insertarM(Matricula matricula);
	
	public List<Matricula> seleccionarTodo();
	
	
	


}
