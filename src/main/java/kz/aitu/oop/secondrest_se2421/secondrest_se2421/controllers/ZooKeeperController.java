package kz.aitu.oop.secondrest_se2421.secondrest_se2421.controllers;

import kz.aitu.oop.secondrest_se2421.secondrest_se2421.entities.ZooKeeper;
import kz.aitu.oop.secondrest_se2421.secondrest_se2421.services.ZooKeeperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //HTTP
@RequestMapping("/zookeepers")
public class ZooKeeperController {
    @Autowired
    private ZooKeeperService zooKeeperService;

    @GetMapping("/readall")
    public List<ZooKeeper> getAllZooKeepers() {
        return zooKeeperService.getAllZooKeepers();
    }

    @PostMapping("/add")
    public ResponseEntity<ZooKeeper> createZooKeeper(@RequestBody ZooKeeper zooKeeper) {
        return ResponseEntity.ok(zooKeeperService.saveZooKeeper(zooKeeper));
    }
}
