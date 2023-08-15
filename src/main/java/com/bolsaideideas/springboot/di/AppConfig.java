package com.bolsaideideas.springboot.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.bolsaideideas.springboot.di.models.services.IMiServicio;
import com.bolsaideideas.springboot.di.models.services.MiServicio;
import com.bolsaideideas.springboot.di.models.services.MiServicioComplejo;

@Configuration
public class AppConfig {

	@Bean("miServicioSimple")
	@Primary
	public IMiServicio registrarMiServicio() {
		return new MiServicio();
	}
	
	@Bean("miServicioComplejo")
	public IMiServicio registrarMiServicioComplejo() {
		return new MiServicioComplejo();
	}
}
