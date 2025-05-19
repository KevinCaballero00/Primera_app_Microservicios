package com.dockerProject.spring_microservice_inmueble.service;

import java.util.List;

import com.dockerProject.spring_microservice_inmueble.model.inmueble;

public interface inmuebleService {

    inmueble saveInmueble(inmueble inmueble);
    void deleteInmueble(Long id);
    List<inmueble> findAllInmuebles();
}
