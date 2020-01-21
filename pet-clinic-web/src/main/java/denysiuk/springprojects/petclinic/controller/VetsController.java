package denysiuk.springprojects.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VetsController {

    @GetMapping("/vets")
    public String listVets(){
        return "vets/index";
    }
}
