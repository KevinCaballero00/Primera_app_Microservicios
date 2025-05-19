package com.dockerProject.spring_microservice_inmueble.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.dockerProject.spring_microservice_inmueble.model.inmueble;
import com.dockerProject.spring_microservice_inmueble.repository.inmuebleRepository;

@Service
public class inmuebleServiceImp implements inmuebleService {

    private final inmuebleRepository inmuebleRepository;

    public inmuebleServiceImp(inmuebleRepository inmuebleRepository) {
        this.inmuebleRepository = inmuebleRepository;
    }

    @Override
    public inmueble saveInmueble(inmueble inmueble) {
        inmueble.setFechaCreacion(LocalDateTime.now());
        return inmuebleRepository.save(inmueble);
    }

    @Override
    public void deleteInmueble(Long id) {
        inmuebleRepository.deleteById(id);
    }

    @Override
    public List<inmueble> findAllInmuebles() {
        return inmuebleRepository.findAll();
    }
}
