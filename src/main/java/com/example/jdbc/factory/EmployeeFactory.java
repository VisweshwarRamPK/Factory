package com.example.jdbc.factory;

import com.example.jdbc.repository.EmployeeRepository;
import com.example.jdbc.service.EmployeeService;
import com.example.jdbc.util.JsonToXmlConverter;

public interface EmployeeFactory {
    EmployeeService createEmployeeService();
    EmployeeRepository createEmployeeRepository();
    JsonToXmlConverter createJsonToXmlConverter();
}
