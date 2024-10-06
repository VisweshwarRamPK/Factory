package com.example.jdbc.factory;

import com.example.jdbc.repository.EmployeeRepository;
import com.example.jdbc.service.EmployeeService;
import com.example.jdbc.util.JsonToXmlConverter;
import org.springframework.stereotype.Component;

@Component
public class DefaultEmployeeFactory implements EmployeeFactory {

    @Override
    public EmployeeService createEmployeeService() {
        return new EmployeeService(createEmployeeRepository());
    }

    @Override
    public EmployeeRepository createEmployeeRepository() {
        return new EmployeeRepository();
    }

    @Override
    public JsonToXmlConverter createJsonToXmlConverter() {
        return new JsonToXmlConverter();
    }
}
