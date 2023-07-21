package ru.skypro.homework.springdatajpa.service;

import ru.skypro.homework.springdatajpa.model.Position;

public interface EmployeeView {
    String getName();
    Integer getSalary();
    Position getPosition();
}
