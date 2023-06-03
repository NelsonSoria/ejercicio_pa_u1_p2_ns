package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Propietario;


@Repository
public class PropietarioRepositoryImpl implements PropietarioRepository{
	
	private static List<Propietario> basePropietario= new ArrayList<>(); 

	@Override
	public void insertarP(Propietario vehiculo) {
		basePropietario.add(vehiculo);
		
	}

	@Override
	public void eliminarP(String identificacion) {
		
		Propietario p= this.seleccionarPorID(identificacion);
	    basePropietario.remove(p);

		
		
	}

	@Override
	public Propietario seleccionarPorID(String identificacion) {
		Propietario proEncontrado= new Propietario();
		
		for(Propietario p : basePropietario) {
			if(identificacion.equals(p.getIdentificacion())) {
				proEncontrado=p;	
			}		
		}
		return proEncontrado;
	}

}
