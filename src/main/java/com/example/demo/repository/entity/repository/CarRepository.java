package com.example.demo.repository.entity.repository;

import com.example.demo.repository.entity.CarEntity;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends R2dbcRepository<CarEntity, Integer> {
}
