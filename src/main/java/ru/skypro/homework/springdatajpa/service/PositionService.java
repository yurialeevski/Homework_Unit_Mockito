package ru.skypro.homework.springdatajpa.service;

import org.springframework.stereotype.Service;
import ru.skypro.homework.springdatajpa.model.Position;
import ru.skypro.homework.springdatajpa.repository.PositionRepository;

import java.util.List;

@Service
public class PositionService {
    private final PositionRepository positionRepository;

    public PositionService(PositionRepository positionRepository) {
        this.positionRepository = positionRepository;
    }
    public List<Position> getPositions() {
        return positionRepository.findAll();
    }
}
