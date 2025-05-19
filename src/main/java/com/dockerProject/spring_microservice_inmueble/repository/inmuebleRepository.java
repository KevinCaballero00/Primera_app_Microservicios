package com.dockerProject.spring_microservice_inmueble.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dockerProject.spring_microservice_inmueble.model.inmueble;

public interface inmuebleRepository extends JpaRepository<inmueble, Long> {

}
