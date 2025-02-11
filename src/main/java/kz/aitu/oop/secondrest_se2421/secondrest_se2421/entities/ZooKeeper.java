package kz.aitu.oop.secondrest_se2421.secondrest_se2421.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "zookeepers")
public class ZooKeeper {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int employeeId;

    public ZooKeeper() {}

    public ZooKeeper(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getEmployeeId() { return employeeId; }
    public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }
}