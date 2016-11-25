package boots.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import boots.dao.HomeworkRepository;
import boots.model.Homework;

@Service @Transactional
public class HomeworkService {

	private final HomeworkRepository homeworkRepository;

	public HomeworkService(HomeworkRepository homeworkRepository) {
		super();
		this.homeworkRepository = homeworkRepository;
	}
	
	public List <Homework> findAll(){
		List <Homework> homeworks= new ArrayList<>();
		for(Homework homework: homeworkRepository.findAll()){
			homeworks.add(homework);
			
		}
		return homeworks;
	}
	
	public Homework findHomework(int id){
		return homeworkRepository.findOne(id);
	}

	public void save(Homework homework){
		homeworkRepository.save(homework);
	}
	
	public void delete(int id){
		homeworkRepository.delete(id);
	}
	
}
