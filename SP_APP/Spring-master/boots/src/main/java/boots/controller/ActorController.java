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

import boots.model.Actor;
import boots.model.Task;
import boots.service.ActorService;
import boots.service.TaskService;

@Controller
public class ActorController {


	@Autowired
	private ActorService actorService;
	

	@GetMapping("/all-actors")
	public String allActors(HttpServletRequest request){
		request.setAttribute("actors", actorService.findAll());
		request.setAttribute("mode", "MODE_ACTORS");
		return "actor";
	}
	
	@GetMapping("/new-actor")
	public String newActor(HttpServletRequest request){
		request.setAttribute("mode", "MODE_NEW");
		return "actor";
	}
	
	
	@PostMapping("/save-actor")
	public String saveActor(@ModelAttribute Actor actor, BindingResult bindingResult, HttpServletRequest request){
		actor.setDateStart(new Date());
		actorService.save(actor);
		request.setAttribute("actors", actorService.findAll());
		request.setAttribute("mode", "MODE_ACTORS");
		return "actor";
	}
	@GetMapping("/update-actor")
	public String updateActor(@RequestParam int id,HttpServletRequest request){
		request.setAttribute("actor", actorService.findOne(id));
		request.setAttribute("mode", "MODE_UPDATE");
		return "actor";
	}
	
	@GetMapping("/delete-actor")
	public String deleteActor(@RequestParam int id,HttpServletRequest request){
		actorService.delete(id);
		request.setAttribute("actors", actorService.findAll());
		request.setAttribute("mode", "MODE_ACTORS");
		return "actor";
	}
	
	
	
	
}
