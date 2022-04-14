package com.example.taskforme.repository;

import com.example.taskforme.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Integer> {
    Car findByIdAndType(Integer id, String type);
}
