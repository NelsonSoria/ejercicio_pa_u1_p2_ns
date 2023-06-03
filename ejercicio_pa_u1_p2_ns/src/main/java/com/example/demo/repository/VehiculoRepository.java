package com.example.demo.repository;

import com.example.demo.repository.modelo.Vehiculo;

public interface VehiculoRepository {
	public void insertarV(Vehiculo vehiculo);

	public void actualizarV(Vehiculo vehiculo);

	public Vehiculo seleccionarPorPlacaV(String placa);

	public void eliminarPorPlacaV(String placa);
	

}
