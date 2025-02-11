package kz.aitu.oop.secondrest_se2421.secondrest_se2421.repositories;

import kz.aitu.oop.secondrest_se2421.secondrest_se2421.entities.ZooKeeper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZooKeeperRepository extends JpaRepository<ZooKeeper, Long>{
}
