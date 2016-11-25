package boots.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import boots.dao.MusicRepository;
import boots.model.Music;

@Service @Transactional
public class MusicService {
	private final MusicRepository musicRepository;

	public MusicService(MusicRepository musicRepository) {
		super();
		this.musicRepository = musicRepository;
	}
	
	public List<Music> findAll(){
		List<Music> musics = new ArrayList<>();
		for (Music music : musicRepository.findAll()) {
			musics.add(music);
		}
		return musics;
	}
	
	public void save(Music music){
		musicRepository.save(music);
	}
	
	public void delete(int id){
		musicRepository.delete(id);
	}
	
	public Music findMusic(int id){
		return musicRepository.findOne(id);
	}
}
