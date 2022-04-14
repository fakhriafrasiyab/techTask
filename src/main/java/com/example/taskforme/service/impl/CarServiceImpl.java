package com.example.taskforme.service.impl;

import com.example.taskforme.model.Car;
import com.example.taskforme.repository.CarRepository;
import com.example.taskforme.service.CarService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;

    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public void addCar(List<Car> cars) {
        carRepository.saveAll(cars);
    }

    @Override
    public Car getCar(Integer id, String type) {
        return carRepository.findByIdAndType(id, type);
    }
}
