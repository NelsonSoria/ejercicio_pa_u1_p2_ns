package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Matricula;
import com.example.demo.repository.modelo.Propietario;
import com.example.demo.repository.modelo.Vehiculo;

public interface MatriculaService {
	
	public void guardarMatricula(Matricula matricula);

	public List<Matricula> seleccionarTodo();
	
	public void matricularVehiculo(String propID,String placa);
	
}
