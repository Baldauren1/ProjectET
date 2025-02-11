package kz.aitu.oop.secondrest_se2421.secondrest_se2421.repositories;

import kz.aitu.oop.secondrest_se2421.secondrest_se2421.entities.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long>{
}
