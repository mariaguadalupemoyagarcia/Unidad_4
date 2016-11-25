package boots.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import boots.dao.PatientRepository;
import boots.model.Patient;

@Service @Transactional
public class PatientService {
	
	private final PatientRepository patientRepository;
	
	public PatientService(PatientRepository patientRepository){
		super();
		this.patientRepository= patientRepository;
	}
	
	public List<Patient> findAll(){
		List<Patient> patients = new ArrayList<>();
		for (Patient patient : patientRepository.findAll()) {
			patients.add(patient);
		}
		return patients;
	}
	
	public void save(Patient patient){
		patientRepository.save(patient);
	}
	
	public void delete (int id){
		patientRepository.delete(id);
	}
	
	public Patient findOne (int id){
		return patientRepository.findOne(id);
	}

}
