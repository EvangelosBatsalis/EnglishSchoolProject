package gr.vbatsalis.EnglishSchoolProject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class IndexController {

    public String IndexController() {
        return "index";
    }

    @RequestMapping("/e")
    @GetMapping
    public String emptyHandler(){
        return "empty";
    }

    @RequestMapping("/test")
    @GetMapping
    public String testHandler(){
        return "test";
    }

}
