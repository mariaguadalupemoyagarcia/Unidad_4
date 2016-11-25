package boots.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import boots.model.Music;
import boots.service.MusicService;

@Controller
public class MusicController {
	
	@Autowired
	private MusicService musicService;
	
	@GetMapping("/all-musics")
	public String allMusics(HttpServletRequest request){
		request.setAttribute("musics", musicService.findAll());
		request.setAttribute("mode", "MODE_MUSICS");
		return "music";
	}
	
	@GetMapping("/new-music")
	public String newMusic(HttpServletRequest request){
		request.setAttribute("mode", "MODE_NEW");
		return "music";
	}
	
	@PostMapping("/save-music")
	public String newFilm(@ModelAttribute Music film,BindingResult bindingResult,HttpServletRequest request){
		musicService.save(film);
		request.setAttribute("musics", musicService.findAll());
		request.setAttribute("mode", "MODE_MUSICS");
		return "music";
	}
	
	@GetMapping("/update-music")
	public String updateMusic(@RequestParam int id,HttpServletRequest request){
		request.setAttribute("music", musicService.findMusic(id));
		request.setAttribute("mode", "MODE_UPDATE");
		return "music";
	}
	
	@GetMapping("/delete-music")
	public String deleteMusic(@RequestParam int id,HttpServletRequest request){
		musicService.delete(id);
		request.setAttribute("musics", musicService.findAll());
		request.setAttribute("mode", "MODE_MUSICS");
		return "music";
	}
}
