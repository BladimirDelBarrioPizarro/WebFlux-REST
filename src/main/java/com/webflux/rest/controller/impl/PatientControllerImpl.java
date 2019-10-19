package com.webflux.rest.controller.impl;

import com.webflux.rest.controller.PatientController;
import com.webflux.rest.model.documents.Patient;
import com.webflux.rest.service.PatientService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public class PatientControllerImpl implements PatientController {

    private PatientService patientService;

    public PatientControllerImpl(PatientService patientService){
        this.patientService = patientService;
    }


    @Override
    public ResponseEntity<Flux<Patient>> getPatients() {
        return new ResponseEntity<>(patientService.getPatients(), HttpStatus.OK);
    }
}
