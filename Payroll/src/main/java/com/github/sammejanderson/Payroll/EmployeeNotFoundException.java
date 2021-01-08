package com.github.sammejanderson.Payroll;


public class EmployeeNotFoundException extends RuntimeException {

    public EmployeeNotFoundException(Long id) {
        super("não foi possivel encontrar o funcionario" + id);
    }
}
