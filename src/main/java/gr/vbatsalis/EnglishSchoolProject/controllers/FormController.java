package gr.vbatsalis.EnglishSchoolProject.controllers;

import gr.vbatsalis.EnglishSchoolProject.models.Employees;
import gr.vbatsalis.EnglishSchoolProject.services.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class FormController {

    @Autowired
    final EmployeeService employeeService;

    public FormController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/get")
    public String hanndleGetRequest() {
        return "form1";
    }

    @PostMapping("/post")
    public String handlePostRequest(Model model,
                                    @ModelAttribute("fname") String fname,
                                    @ModelAttribute("lname") String lname) {
        System.out.println(fname);
        System.out.println(lname);
        System.out.println(model.asMap());
        return "index";
    }

    @GetMapping("/save")
    private String indexGetFormHandler (){
        return "index";
    }

    @PostMapping("/save")
    public String indexPostFormHandler(@Valid Employees employees, BindingResult bindingResult, Model model,
                                  @ModelAttribute("fName") String fname,
                                  @ModelAttribute("lName") String lname) {

        if (bindingResult.hasErrors()) {
            System.out.println(bindingResult);
            return "index";
        }


        employeeService.saveEmployee(employees);

        return "index";
    }

}
