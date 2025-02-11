package kz.aitu.oop.secondrest_se2421.secondrest_se2421.services;

import kz.aitu.oop.secondrest_se2421.secondrest_se2421.repositories.ZooKeeperRepository;
import kz.aitu.oop.secondrest_se2421.secondrest_se2421.entities.ZooKeeper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZooKeeperService {
    @Autowired
    private ZooKeeperRepository zooKeeperRepository;

    public List<ZooKeeper> getAllZooKeepers() {
        return zooKeeperRepository.findAll();
    }

    public ZooKeeper saveZooKeeper(ZooKeeper zooKeeper) {
        return zooKeeperRepository.save(zooKeeper);
    }
}
