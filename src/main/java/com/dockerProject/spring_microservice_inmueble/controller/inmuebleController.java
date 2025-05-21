package com.dockerProject.spring_microservice_inmueble.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dockerProject.spring_microservice_inmueble.model.inmueble;
import com.dockerProject.spring_microservice_inmueble.service.inmuebleService;

@RestController
@RequestMapping("api/inmueble")
public class inmuebleController {
    
    @Autowired
    private inmuebleService inmuebleService;

    @PostMapping
    public ResponseEntity<?> saveInmueble(@RequestBody inmueble inmueble) {
        
        return new ResponseEntity<>(
            inmuebleService.saveInmueble(inmueble), 
            HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteInmueble(@PathVariable Long id) {
        
        inmuebleService.deleteInmueble(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> getAllInmuebles() {
        
        return ResponseEntity.ok(inmuebleService.findAllInmuebles());
    }
    
}