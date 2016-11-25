package boots.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import boots.model.Homework;

import boots.service.HomeworkService;


@Controller
public class HomeworkController {
	
	@Autowired
	private HomeworkService homeworkService;

	
	
	@GetMapping("/all-homeworks")
	public String allHomeworks(HttpServletRequest request){
		request.setAttribute("homeworks", homeworkService.findAll());
		request.setAttribute("mode", "MODE_HOMEWORKS");
		return "homework";
	}
	
	@GetMapping("/new-homework")
	public String newHomework(HttpServletRequest request){
		request.setAttribute("mode", "MODE_NEW");
		return "homework";
	}
	
	@PostMapping("/save-homework")
	public String saveHomework(@ModelAttribute Homework homework, BindingResult bindingResult, HttpServletRequest request){
		homework.setDateCreated(new Date());
		homeworkService.save(homework);
		request.setAttribute("homework", homeworkService.findAll());
		request.setAttribute("mode", "MODE_HOMEWORKS");
		return "homework";
	}
	
	@GetMapping("/update-homework")
	public String updateHomework(@RequestParam int id, HttpServletRequest request){
		request.setAttribute("homework", homeworkService.findHomework(id));
		request.setAttribute("mode", "MODE_UPDATE");
		return "homerwork";
	}
	
	@GetMapping("/delete-homework")
	public String deleteHomework(@RequestParam int id, HttpServletRequest request){
		homeworkService.delete(id);
		request.setAttribute("homeworks", homeworkService.findAll());
		request.setAttribute("mode", "MODE_HOMEWORKS");
		return "homework";
	}
	
	
	
	
	
	

}

