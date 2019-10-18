package com.webflux.rest.controller.impl;

import com.webflux.rest.controller.PatientController;
import com.webflux.rest.service.PatientService;

public class PatientControllerImpl implements PatientController {

    private PatientService patientService;

    public PatientControllerImpl(PatientService patientService){
        this.patientService = patientService;
    }
}
