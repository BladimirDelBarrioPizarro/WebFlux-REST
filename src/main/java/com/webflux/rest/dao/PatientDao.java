package com.webflux.rest.dao;

import com.webflux.rest.model.documents.Patient;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface PatientDao extends ReactiveMongoRepository<Patient,String> {
}
