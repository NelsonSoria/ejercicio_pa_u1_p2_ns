package com.example.demo.repository;

import com.example.demo.repository.modelo.Propietario;


public interface PropietarioRepository {
	
	public void insertarP(Propietario vehiculo);

	public void eliminarP(String identificacion);
	public Propietario seleccionarPorID(String identificacion);

}
