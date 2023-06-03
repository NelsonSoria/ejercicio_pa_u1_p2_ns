package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.parsing.ProblemReporter;
import org.springframework.stereotype.Service;

import com.example.demo.repository.MatriculaRepository;
import com.example.demo.repository.PropietarioRepository;
import com.example.demo.repository.VehiculoRepository;
import com.example.demo.repository.modelo.Matricula;
import com.example.demo.repository.modelo.Propietario;
import com.example.demo.repository.modelo.Vehiculo;


@Service
public class MatriculaServiceImpl implements MatriculaService{
	
	@Autowired
	private MatriculaRepository matriculaRepository;
	
	@Autowired
	private VehiculoRepository vehiculorepository;
	
	@Autowired 
	private PropietarioRepository propietarioRepository;
	

	@Override
	public void guardarMatricula(Matricula matricula) {
		this.matriculaRepository.insertarM(matricula);
		
	}

	@Override
	public List<Matricula> seleccionarTodo() {
		// TODO Auto-generated method stub
		return this.matriculaRepository.seleccionarTodo();
	}

	@Override
	public void matricularVehiculo(String propID,String placa) {
		Matricula generarMatricula = new Matricula();
		
		generarMatricula.setFechaMatricula(LocalDate.now());
		Vehiculo vehiculo = this.vehiculorepository.seleccionarPorPlacaV(placa);
		BigDecimal valorMatricula = new BigDecimal(0);
		if(vehiculo.getTipo().equals("manual")) {
			valorMatricula = vehiculo.getPrecio().multiply(new BigDecimal(0.1));
			
		}else if(vehiculo.getTipo().equals("automatico")) {
			valorMatricula = vehiculo.getPrecio().multiply(new BigDecimal(0.1));
		}
		
		if(valorMatricula.compareTo(new BigDecimal(3000))>=0) {
			BigDecimal descuento = valorMatricula.multiply(new BigDecimal(0.09));
			valorMatricula= valorMatricula.subtract(descuento);
			
		}
		
		generarMatricula.setValorMatricula(valorMatricula);
		
		Propietario pro = this.propietarioRepository.seleccionarPorID(propID);
		
		generarMatricula.setPropietario(pro.getNombre());
		generarMatricula.setVehiculo(vehiculo);
		
		this.matriculaRepository.insertarM(generarMatricula);
		
		
	}

	

}
