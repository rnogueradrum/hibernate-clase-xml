package com.example.model;


import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name="employees")
public class Employee {

    // atributos - columnas de base de datos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name", length = 300)
    private String name;

    private Integer age;

    private Boolean married;

    private Double salary;

    private Instant createdDate;

    // Dirección vivienda

    // fk
    @OneToOne
    @JoinColumn(name = "id_direction") // nueva columna
    private Direction direction;

    public Employee() {
    }

    public Employee(String name, Integer age, Boolean married, Double salary, Instant createdDate) {
        this.name = name;
        this.age = age;
        this.married = married;
        this.salary = salary;
        this.createdDate = createdDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getMarried() {
        return married;
    }

    public void setMarried(Boolean married) {
        this.married = married;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Instant getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Instant createdDate) {
        this.createdDate = createdDate;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", married=" + married +
                ", salary=" + salary +
                ", createdDate=" + createdDate +
                '}';
    }
}
