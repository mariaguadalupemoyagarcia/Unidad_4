package boots.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import boots.model.Patient;
import boots.service.PatientService;

@Controller
public class PatientController {

	@Autowired
	private PatientService patientService;

	@GetMapping("/all-patients")
	public String allPatients(HttpServletRequest request){
		request.setAttribute("patients", patientService.findAll());
		request.setAttribute("mode", "MODE_PATIENTS");
		return "patient";
	}
	
	@GetMapping("/new-patient")
	public String newPatient(HttpServletRequest request){
		request.setAttribute("mode", "MODE_NEW");
		return "patient";
	}
	
	@GetMapping("/update-patient")
	public String updatePatient(@RequestParam int id, HttpServletRequest request){
		request.setAttribute("patient", patientService.findOne(id));
		request.setAttribute("mode", "MODE_UPDATE");
		return "patient";
	}
	
	@GetMapping("/delete-patient")
	public String deletePatient(@RequestParam int id, HttpServletRequest request){
		patientService.delete(id);
		request.setAttribute("patients", patientService.findAll());
		request.setAttribute("mode", "MODE_PATIENTS");
		return "patient";
	}
	
	@PostMapping("/save-patient")
	public String savePatient(@ModelAttribute Patient patient, 
		BindingResult bindingResult, HttpServletRequest request){
		patientService.save(patient);
		request.setAttribute("patients", patientService.findAll());
		request.setAttribute("mode", "MODE_PATIENTS");
		return "patient";
	}

}
