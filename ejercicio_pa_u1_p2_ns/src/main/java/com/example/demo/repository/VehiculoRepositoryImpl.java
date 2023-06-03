package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Vehiculo;

@Repository
public class VehiculoRepositoryImpl implements VehiculoRepository{
	
	private static List<Vehiculo> baseVehiculo= new ArrayList<>(); 

	@Override
	public void insertarV(Vehiculo vehiculo) {
		baseVehiculo.add(vehiculo);
		
	}

	@Override
	public void actualizarV(Vehiculo vehiculo) {
		this.eliminarPorPlacaV(vehiculo.getPlaca());
		this.insertarV(vehiculo);
		
	}

	@Override
	public Vehiculo seleccionarPorPlacaV(String placa) {
		Vehiculo vEncontrado = new Vehiculo();
		for(Vehiculo v : baseVehiculo) {
			if(placa.equals(vEncontrado.getPlaca()))
				vEncontrado= v;
		}
		return  vEncontrado;
	}

	@Override
	public void eliminarPorPlacaV(String placa) {
		Vehiculo v= this.seleccionarPorPlacaV(placa);
		baseVehiculo.remove(v);
		
	}

}
