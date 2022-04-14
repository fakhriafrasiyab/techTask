package com.example.taskforme.controller;

import com.example.taskforme.model.Car;
import com.example.taskforme.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/cars")
@RequiredArgsConstructor
public class CarController {

    private final CarService carService;

    @PostMapping
    public void addCar(@RequestBody List<Car> cars) {
        carService.addCar(cars);
    }

    @GetMapping("{id}")
    public Car getCar(@PathVariable Integer id, @RequestParam String type){
        return carService.getCar(id, type);
    }
}
