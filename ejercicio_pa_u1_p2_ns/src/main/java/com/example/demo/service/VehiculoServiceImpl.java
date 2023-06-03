package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.repository.VehiculoRepository;
import com.example.demo.repository.modelo.Vehiculo;

public class VehiculoServiceImpl implements VehiculoService {
	
	@Autowired
	private VehiculoRepository repository;

	@Override
	public void guardarV(Vehiculo v) {
		repository.insertarV(v);
		
	}

}
