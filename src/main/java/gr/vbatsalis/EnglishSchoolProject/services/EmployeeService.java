package gr.vbatsalis.EnglishSchoolProject.services;

import gr.vbatsalis.EnglishSchoolProject.models.Employees;
import gr.vbatsalis.EnglishSchoolProject.repositories.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private final EmployeesRepository employeesRepository;

    public EmployeeService(EmployeesRepository employeesRepository){
        this.employeesRepository = employeesRepository;
    }

    public Optional<Employees> findById(int id){
        return employeesRepository.findById(id);
    }

    public Employees findByIdEmployees(int id){
        return employeesRepository.findAllById(id);
    }

    public void saveEmployee(Employees employees){
        employeesRepository.save(employees);
    }



}
