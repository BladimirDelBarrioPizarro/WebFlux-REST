package com.webflux.rest.boot;

import com.webflux.rest.controller.PatientController;
import com.webflux.rest.controller.impl.PatientControllerImpl;
import com.webflux.rest.dao.PatientDao;
import com.webflux.rest.service.PatientService;
import com.webflux.rest.service.impl.PatientServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiConfig {


    @Bean
    public PatientService patientService(PatientDao patientDao){
        return new PatientServiceImpl(patientDao);
    }

    @Bean
    public PatientController patientController(final PatientService patientService){
        return new PatientControllerImpl(patientService);
    }
}


