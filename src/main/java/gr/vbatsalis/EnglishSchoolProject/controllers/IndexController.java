package gr.vbatsalis.EnglishSchoolProject.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    public String IndexController() {
        return "index";
    }

}
