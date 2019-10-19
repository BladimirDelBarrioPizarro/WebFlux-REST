package com.webflux.rest.service;


import com.webflux.rest.model.documents.Patient;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


import java.util.List;

public interface PatientService{

    Flux<Patient> getPatients();
}
