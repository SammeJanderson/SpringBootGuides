package com.github.sammejanderson.Payroll;

public class OrderNotFoundException extends RuntimeException {
    public OrderNotFoundException(Long id) {
        super ("Order not found with id " + id);
    }
}
