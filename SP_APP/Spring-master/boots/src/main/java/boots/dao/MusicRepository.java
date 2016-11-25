package boots.dao;

import org.springframework.data.repository.CrudRepository;

import boots.model.Music;

public interface MusicRepository extends CrudRepository<Music, Integer> {

}
