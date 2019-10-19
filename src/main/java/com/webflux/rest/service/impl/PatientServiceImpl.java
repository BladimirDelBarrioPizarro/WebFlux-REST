package com.webflux.rest.service.impl;

import com.webflux.rest.dao.PatientDao;
import com.webflux.rest.model.documents.Patient;
import com.webflux.rest.service.PatientService;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;


@Slf4j
public class PatientServiceImpl  implements PatientService {

    private PatientDao patientDao;

    public PatientServiceImpl(PatientDao patientDao) {
        this.patientDao = patientDao;
    }

    @Override
    public Flux<Patient> getPatients() {
        return patientDao.findAll().doOnNext(item -> log.info(item.getName()));

    }
}
