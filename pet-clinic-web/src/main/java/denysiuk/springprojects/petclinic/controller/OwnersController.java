package denysiuk.springprojects.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OwnersController {
    @GetMapping("/owners")
    public String listOwners(){
        return "owners/index";
    }
}
