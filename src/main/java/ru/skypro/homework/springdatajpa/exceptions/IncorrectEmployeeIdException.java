package ru.skypro.homework.springdatajpa.exceptions;

import java.io.IOException;

public class IncorrectEmployeeIdException extends RuntimeException {
    public IncorrectEmployeeIdException(String message) {
        super(message);
    }
}
