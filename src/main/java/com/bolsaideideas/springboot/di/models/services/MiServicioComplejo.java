package com.bolsaideideas.springboot.di.models.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//@Service("miServicioComplejo")
public class MiServicioComplejo implements IMiServicio {

	@Override
	public String operacion() {
		return "ejecutando alguna operación importante complicado...";
	}


}
