package boots.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import boots.dao.ActorRepository;
import boots.model.Actor;

@Service @Transactional
public class ActorService {

	private final ActorRepository actorRepository;
	
	public ActorService(ActorRepository actorRepository){
		super();
		this.actorRepository = actorRepository;
	}
	
	public List<Actor> findAll(){
		List<Actor> actors = new ArrayList<Actor>();
		for(Actor actor : actorRepository.findAll()){
			actors.add(actor);
		}
		return actors;
	}
	
	public void save(Actor actor){
		actorRepository.save(actor);
	}
	
	public void delete(int id){
		actorRepository.delete(id);
	}
	
	public Actor findOne(int id){
		return actorRepository.findOne(id);
	}
	
	
	
}
