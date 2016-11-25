package boots.dao;

import org.springframework.data.repository.CrudRepository;

import boots.model.Patient;


public interface PatientRepository extends CrudRepository <Patient, Integer>{

}
