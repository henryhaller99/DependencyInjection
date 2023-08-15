package com.bolsaideideas.springboot.di.models.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

// interactua con los DAO, o se comunican con las APIs REST para obtener los datos de algún otro microservicio
//@Service("miServicioSimple")
//@Primary
public class MiServicio implements IMiServicio {

	@Override
	public String operacion() {
		return "ejecutando alguna operación importante simple...";
	}


}
