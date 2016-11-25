package boots.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;



import boots.service.CarService;


@Controller
public class MainController {
	
	

	@GetMapping("/")
	public String home(HttpServletRequest request){
		request.setAttribute("mode", "MODE_HOME");
		return "index";
	}
	
	
	@GetMapping("task")
	public String task(HttpServletRequest request){
		request.setAttribute("mode", "MODE_HOME_TASK");
		return "task";
		
		
	}
	@GetMapping("homework")
	public String homework(HttpServletRequest request){
		request.setAttribute("mode", "MODE_HOME_HOMEWORK");
		return "homework";
		
			
		}
	@GetMapping("music")
		public String music(HttpServletRequest request){
			request.setAttribute("mode", "MODE_HOME_MUSIC");
			return "music";
	}
	
	@GetMapping("patient")
	public String patient(HttpServletRequest request){
		request.setAttribute("mode", "MODE_HOME_PATIENT");
		return "patient";
}
	
	@GetMapping("actor")
	public String actor(HttpServletRequest request){
		request.setAttribute("mode", "MODE_HOME_ACTOR");
		return "actor";
	}
	
	

	@GetMapping("car")
	public String car(HttpServletRequest request){
		request.setAttribute("mode", "MODE_HOME_CAR");
		return "car";
	}
	


	

}
