package com.webflux.rest.service.impl;

import com.webflux.rest.dao.PatientDao;
import com.webflux.rest.service.PatientService;

public class PatientServiceImpl  implements PatientService {

     private PatientDao patientDao;

    public PatientServiceImpl(PatientDao patientDao) {
        this.patientDao = patientDao;
    }
}
