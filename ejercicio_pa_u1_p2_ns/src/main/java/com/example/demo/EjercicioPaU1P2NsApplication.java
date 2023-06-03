package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Propietario;
import com.example.demo.repository.modelo.Vehiculo;
import com.example.demo.service.MatriculaService;
import com.example.demo.service.PropietarioService;
import com.example.demo.service.VehiculoService;

@SpringBootApplication
public class EjercicioPaU1P2NsApplication implements CommandLineRunner{

	@Autowired
	private MatriculaService matriculaService;
	
	@Autowired
	private PropietarioService propietarioService;
	@Autowired
	private VehiculoService vehiculoService;
	
	public static void main(String[] args) {
		SpringApplication.run(EjercicioPaU1P2NsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Vehiculo v= new Vehiculo();
		v.setMarca("Mazada");
		v.setPlaca("ec23");
		v.setModelo("65d");
		v.setPrecio(new BigDecimal(45465));
		v.setTipo("manual");
		
		
		
		
		Propietario p= new Propietario(); 
		p.setApellido("Soria");
		p.setFechaNacimiento(LocalDate.of(2001, 02, 01));
		p.setNombre("Nelson");
		p.setIdentificacion("1750982546");
	
		
		
	}

}
