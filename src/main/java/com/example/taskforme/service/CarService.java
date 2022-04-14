package com.example.taskforme.service;

import com.example.taskforme.model.Car;

import java.util.List;

public interface CarService {

    void addCar(List<Car> cars);

    Car getCar(Integer id, String type);
}
