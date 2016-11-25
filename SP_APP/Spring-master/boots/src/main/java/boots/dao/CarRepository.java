package boots.dao;

import org.springframework.data.repository.CrudRepository;

import boots.model.Car;

public interface CarRepository extends CrudRepository<Car, Integer>{

}
