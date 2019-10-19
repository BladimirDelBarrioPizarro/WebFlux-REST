package com.webflux.rest.service.impl;

import com.webflux.rest.dao.PatientDao;
import com.webflux.rest.model.documents.Patient;
import com.webflux.rest.service.PatientService;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import java.time.Duration;


@Slf4j
public class PatientServiceImpl  implements PatientService {

    private PatientDao patientDao;

    public PatientServiceImpl(PatientDao patientDao) {
        this.patientDao = patientDao;
    }

    @Override
    public Flux<Patient> getPatients() {
        return patientDao.findAll().flatMap(Mono::just).delayElements(Duration.ofSeconds(3))
                .doOnNext(item -> log.info(" -- GET /patients  name: {}",item.getName()));

    }
}
