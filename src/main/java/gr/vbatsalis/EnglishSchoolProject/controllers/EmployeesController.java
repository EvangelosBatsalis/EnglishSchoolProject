package gr.vbatsalis.EnglishSchoolProject.controllers;

import gr.vbatsalis.EnglishSchoolProject.models.Employees;
import gr.vbatsalis.EnglishSchoolProject.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
//@RequestMapping("/employees")
public class EmployeesController {

    @Autowired
    private final EmployeeService employeeService;

    public EmployeesController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/get")
    private String getEmployeeById(Model model) {
        Optional<Employees> emp = employeeService.findById(2);

        model.addAttribute("emp", emp);

        return "index_new";
    }

    @GetMapping("/update/{id}/{fname}")
    private String SaveEmployeeById(Model model, @PathVariable int id, @PathVariable(value = "fname", required = false) String fName) {
        Optional<Employees> emp = employeeService.findById(id);

        emp.ifPresent(empl -> {
            empl.setFName(fName);
            employeeService.saveEmployee(empl);
        });

        model.addAttribute("emp", emp);
//        return null
        return "index_new";
    }



}
